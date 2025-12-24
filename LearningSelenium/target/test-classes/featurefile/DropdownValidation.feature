Feature: To Validate Dropdown
  @Dropdownvalidation @course
  Scenario: Handle static Dropdown1
    Given User launch Example url navigate to currency Dropdown
    When Select any of one course name
@SelectIDE
  Scenario: Handle static Dropdown2
    Given User launch Example url navigate to currency Dropdown
    When Select any of one IDE
    And Get count of values in dropdown
