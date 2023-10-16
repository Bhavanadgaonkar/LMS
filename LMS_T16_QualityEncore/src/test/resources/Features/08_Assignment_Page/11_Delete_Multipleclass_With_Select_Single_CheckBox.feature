Feature: Delete multiple class validation

  Background: 
    Admin clicks on delete button under header
    Selects single checkbox with multiple class in data table

  @VerifyDeleteAlertSingleCheckbox
  Scenario: Verify delete single checkbox with multiple class
    Given Admin is in delete dialog box alert
    When Clicks on yes button
    And Selected assignment details are deleted from data table
    Then Redirect assignment page

  Scenario: Verify delete single checkbox with multiple class
    Given Admin is in delete dialog box alert
    When Clicks on no button
    Then Redirect assignment page
