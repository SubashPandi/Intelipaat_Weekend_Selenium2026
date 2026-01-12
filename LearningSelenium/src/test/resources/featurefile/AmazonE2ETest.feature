Feature: Validate Amazon login page

  @TCID001
  Scenario: Validate sign in with username and password
    Given Launch Browser and navigate to signInpage
    When Enter Username "8508532405" and password "123456"
    Then Validate user able to login