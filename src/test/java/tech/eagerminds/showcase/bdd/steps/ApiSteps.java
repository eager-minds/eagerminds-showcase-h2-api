package tech.eagerminds.showcase.bdd.steps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.time.LocalDateTime;
import org.assertj.core.api.AssertionsForClassTypes;
import org.springframework.beans.factory.annotation.Autowired;
import tech.eagerminds.showcase.bdd.configuration.CucumberSpringConfiguration;

public class ApiSteps extends CucumberSpringConfiguration {

  @Autowired
  ScenarioContext scenarioContext;
  private RequestSpecification requestSpecification;

  @AfterAll
  public static void tearDown() {
    RestAssured.reset();
  }

  private void setRequestSpecification() {
    requestSpecification = given().port(scenarioContext.port())
        .log().all();
  }

  @Given("^(?:[a-z]+ )?api service is running$")
  public void api_service_is_running() {
    setRequestSpecification();
    // This get will throw an exception if the service is not running
    requestSpecification.get();
  }

  @Given("^content type is \"([^\"]*)\"$")
  public void content_type_is(ContentType contentType) {
    requestSpecification.when().contentType(contentType);
  }

  @And("request parameter {string} with value {string}")
  public void requestParameters(String parameterName, String parameterValue) {
    requestSpecification.queryParam(parameterName, parameterValue);
  }

  @When("^GET ([\\/0-9a-zA-Z_-]+)$")
  public void call_rest_api_by_http_method(String path) {
    scenarioContext.setResponse(requestSpecification.when().get(path));
  }

  @Then("^I get response HTTP code ([0-9]+)(?: [a-zA-Z]+)?")
  public void response_http_code(Integer httpCode) {
    scenarioContext.response().then().assertThat().statusCode(httpCode);
  }

  @Then("^(?:I get a )response json that has field ([a-zA-Z]+) with float value(?: equals to) \"(.*)\"")
  public void responseJsonWithBuildInformation(String jsonField, float value) {
    scenarioContext.response().then().body(jsonField, equalTo(value));
  }

  @Then("^(?:I get a )response json that has field ([a-zA-Z]+) with int value(?: equals to) \"(.*)\"")
  public void responseJsonWithBuildInformation(String jsonField, Integer value) {
    scenarioContext.response().then().body(jsonField, equalTo(value));
  }

  @Then("^(?:I get a )response json that has field ([a-zA-Z]+) with string value(?: equals to) \"(.*)\"")
  public void responseJsonWithBuildInformation(String jsonField, String value) {
    scenarioContext.response().then().body(jsonField, equalTo(value));
  }

}