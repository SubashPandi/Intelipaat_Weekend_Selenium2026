Feature: Validate Amazon login page

  @TCID001
  Scenario: Validate sign in with username and password
    Given Launch Browser and navigate to signInpage
    When Enter Username "8508532405" and password "subash12345"
    Then Validate user able to login

  @TCID002
  Scenario: Validate search function
    Given User search the specific product in search box as product "Electric cooker"
    Then Validate should display for the search result