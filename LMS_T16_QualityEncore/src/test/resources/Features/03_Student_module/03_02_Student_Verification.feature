Feature: Student Page Verification_sc02

  Background: Admin is logged in and on the student Details page
    Given Admin is on student details page

  Scenario: Validate select student name is fading
   When Admin select student name from the drop down
    Then Admin shouldn not see select student name text

  Scenario: Validate select batch id  is fading
    When Admin select batch id from the drop down
    Then Admin should see select batch id text

  Scenario: Validate select student name using search box
    When Admin clicks select student name and  enters x alphabet in the search box
    Then Admin should see student name start with x is listed below

  Scenario: Validate select batch id using search box
    When Admin  clicks select batch id and enter x number in the search box
    Then Admin should see batch id start with x is listed below

  Scenario: Validate selecting only  student name  will not display any details
    When Admin selects only student name
    Then Student details should be displayed

  Scenario: Validate selecting only  batch id  will not display any details
    When Admin selects only  batch id
    Then Student details shouldn nott be displayed

  Scenario: Validate selecting student name and batch id
    When Admin selects  student name and batch id
   Then Particular student informations should be display
