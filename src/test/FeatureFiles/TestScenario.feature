@tag
Feature: scenarios for zomatowebsite

  Scenario Outline: Validation of the zomato front page

    Given user opens the browser
    When user navigates to zomato webpage
    Then user verifies the web elements "<webElement>"

    Examples:
      | webElement |
      | McDonald's |


  Scenario Outline: Validation of POST API using Rest Assured

    Given user has the api url
    When user executes the API with the given details
      | id   | petId   | quantity   | shipDate   | status   | complete   |
      | <id> | <petId> | <quantity> | <shipDate> | <status> | <complete> |
    Then user asserts the response status

    Examples:
      | id | petId | quantity | shipDate                 | status | complete |
      | 1  | 2     | 3        | 2022-04-18T03:52:18.503Z | placed | true     |