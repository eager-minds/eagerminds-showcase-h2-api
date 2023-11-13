package tech.eagerminds.showcase.bdd.steps;

import io.cucumber.spring.ScenarioScope;
import io.restassured.response.Response;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.stereotype.Component;

@ScenarioScope
@Component
public class ScenarioContext {

  @LocalServerPort
  protected int port;
  private Response response;

  public int port() {
    return port;
  }

  public Response response() {
    return response;
  }

  public void setResponse(Response response) {
    this.response = response;
  }

}
