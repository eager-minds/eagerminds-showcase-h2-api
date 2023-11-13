Feature: Service to [access h2 from api rest]
  In order to [retrieve h2 products]
  As [a user]
  I want to [query h2 from my api GET request]

  Background:
    Given api service is running

  Scenario: [Retrieve product with price from rest API query]
    Given content type is "JSON"
    And request parameter "productId" with value "35455"
    And request parameter "brandId" with value "1"
    And request parameter "dateTime" with value "2020-06-14T10:00:00"
    Then GET /price/find
    Then I get response HTTP code 200 OK
    And I get a response json that has field productId with int value equals to "35455"
    And I get a response json that has field brandId with int value equals to "1"
    And I get a response json that has field priceList with int value equals to "1"
    And I get a response json that has field startDate with string value equals to "2020-06-14T00:00:00"
    And I get a response json that has field endDate with string value equals to "2020-12-31T23:59:59"
    And I get a response json that has field price with float value equals to "35.5"

  Scenario: [Retrieve product with price from rest API query]
    Given content type is "JSON"
    And request parameter "productId" with value "35455"
    And request parameter "brandId" with value "1"
    And request parameter "dateTime" with value "2020-06-14T16:00:00"
    Then GET /price/find
    Then I get response HTTP code 200 OK
    And I get a response json that has field productId with int value equals to "35455"
    And I get a response json that has field brandId with int value equals to "1"
    And I get a response json that has field priceList with int value equals to "2"
    And I get a response json that has field startDate with string value equals to "2020-06-14T15:00:00"
    And I get a response json that has field endDate with string value equals to "2020-06-14T18:30:00"
    And I get a response json that has field price with float value equals to "25.45"

  Scenario: [Retrieve product with price from rest API query]
    Given content type is "JSON"
    And request parameter "productId" with value "35455"
    And request parameter "brandId" with value "1"
    And request parameter "dateTime" with value "2020-06-14T21:00:00"
    Then GET /price/find
    Then I get response HTTP code 200 OK
    And I get a response json that has field productId with int value equals to "35455"
    And I get a response json that has field brandId with int value equals to "1"
    And I get a response json that has field priceList with int value equals to "1"
    And I get a response json that has field startDate with string value equals to "2020-06-14T00:00:00"
    And I get a response json that has field endDate with string value equals to "2020-12-31T23:59:59"
    And I get a response json that has field price with float value equals to "35.5"

  Scenario: [Retrieve product with price from rest API query]
    Given content type is "JSON"
    And request parameter "productId" with value "35455"
    And request parameter "brandId" with value "1"
    And request parameter "dateTime" with value "2020-06-15T10:00:00"
    Then GET /price/find
    Then I get response HTTP code 200 OK
    And I get a response json that has field productId with int value equals to "35455"
    And I get a response json that has field brandId with int value equals to "1"
    And I get a response json that has field priceList with int value equals to "3"
    And I get a response json that has field startDate with string value equals to "2020-06-15T00:00:00"
    And I get a response json that has field endDate with string value equals to "2020-06-15T11:00:00"
    And I get a response json that has field price with float value equals to "30.5"

  Scenario: [Retrieve product with price from rest API query]
    Given content type is "JSON"
    And request parameter "productId" with value "35455"
    And request parameter "brandId" with value "1"
    And request parameter "dateTime" with value "2020-06-16T21:00:00"
    Then GET /price/find
    Then I get response HTTP code 200 OK
    And I get a response json that has field productId with int value equals to "35455"
    And I get a response json that has field brandId with int value equals to "1"
    And I get a response json that has field priceList with int value equals to "4"
    And I get a response json that has field startDate with string value equals to "2020-06-15T16:00:00"
    And I get a response json that has field endDate with string value equals to "2020-12-31T23:59:59"
    And I get a response json that has field price with float value equals to "38.95"