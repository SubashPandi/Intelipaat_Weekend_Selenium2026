Feature: Validate Amazon login page
  @TCID001
  Scenario Outline: Validate sign in with username and password
    Given Launch Browser and navigate to signInpage
    When Enter Username "<username>" and password "<pwd>"
    Then Validate user able to login

    Examples:
      | username   | pwd |
      | 8508532405 | 123 |
      | wqe233     | 233 |
