Feature: validate EY wiki-page tables
  Scenario: Iterate and print table values from EY wiki site
    Given User launch browser and navigate to the EY Wiki page
    When Extract data from table
    Then Iterate Revenue table data
