Feature: Validating salesforce login page
  @TC01 @Regression @Smoke
  Scenario: To validate the login with valid username
    Given User launch browser and navigate to the login page
    When User enter valid username "Test" and valid password "Test@123"
    And User click login button
    Then User navigate to Salesforce HomePage

  @TC02
  Scenario: To validate the login with invalid username
    Given User launch browser and navigate to the login page
    When User enter invalid username "invalidtest" and invalid password "test12"
    And User click login button
    Then Validate error message

  @Multilogin
  Scenario Outline: To validate the Multi login with valid username
    Given User launch browser and navigate to the login page
    When User enter valid username "<username>" and valid password "<password>"
    And User click login button
    Then User navigate to Salesforce HomePage
    Examples:
      | username | password |
      | Us1      | 123      |
      | Us2      | abc      |
      | Us3      | xy3      |
