Feature: Table actions validation
  Background:
    Given User launch table actions practice url

  Scenario: Verify Table headers
    When I check if header is present in the  table
    Then Table hearders should be displayed