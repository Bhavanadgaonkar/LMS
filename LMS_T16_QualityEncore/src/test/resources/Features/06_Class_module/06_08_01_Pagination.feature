Feature: Pagination in manage class sc01

  Background: Logged on the LMS portal as Admin
    Given Admin is on dashboard page after Login
    When Admin clicks class button on the navigation bar

  Scenario: Verify sheet one is displayed on default in data table
    Then Data table should display one page  when entries available

  Scenario: Verify  right arrow is enable when sheet one is displayed in data table
    Then Right arrow should be enabled in page one  when entries are more than five available

  Scenario: Verify  left arrow is disable when sheet one is displayed in data table
    Then Left arrow should be disabled in page one  when entries are more than five available

  Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than ten
    Then Right arrow should be enabled in page two when entries are more than ten available

  Scenario: Verify left arrow is enable when sheet two is displayed in data table
    Then Left arrow should be enabled in page two

  Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than ten
    Then Data table should display  pageone when entries available

  Scenario: Verify pagination controls enabled
    Then if entries are more than five in data table pagination controls enabled

  Scenario: Verify pagination controls disabled
    Then if entries are less than five in data table pagination controls disabled
