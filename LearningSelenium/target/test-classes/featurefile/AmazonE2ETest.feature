Feature: Validate Amazon login page

  @TCID001
  Scenario: Validate sign in with username and password
    Given Launch Browser and navigate to signInpage
    When Enter Username "9876543210" and password "12345"
    Then Validate user able to login

  @TCID002
  Scenario: Validate search function
    Given User search the specific product in search box as product
    Then Validate should display for the search result

  @TCID003
  Scenario Outline: Validate search function
    Given User search the specific product in search box as product "<product>"
    Then Validate should display for the search result "<ExpectedResult>"
    Examples:
      | product         | ExpectedResult              |
      | Electric cooker | Amazon.in : Electric cooker |
      | iphone          | Amazon.in : iphone          |


  @TCID004
  Scenario Outline: Validate search function
    Given User search the specific product in search box as product "<product>"
    Then Validate should display for the search result
    Examples:
      | product         |
      | Electric cooker |
      | iphone          |


  @Mouse

  Scenario: Mouse Action
    Given User Mouse hover and select babies wish list
    Then User select Baby wish List

    @Window

    Scenario: Window handling
      Given Open multiple windows
      Then Switch to windows
