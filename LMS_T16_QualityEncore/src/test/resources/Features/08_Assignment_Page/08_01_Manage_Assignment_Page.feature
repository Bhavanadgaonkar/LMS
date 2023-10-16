Feature: Manage assignment page verification
  
Background:
   Logged on the LMS portal as admin
  
  @validateManageAssignment
  Scenario: Verification of manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar
    Then See URL with Manage assignment
    And Gets response time for navigation from dashboard to assignment page
    
    @validateHeader
    Scenario: Validate assignment page header
    Given Admin is on dashboard page after Login
    When Admin clicks assignment button on the navigation bar
    Then Verifys the header with Manage assignment
    
    @validateText
     Scenario: Validate text in assignment page
    Given Admin is on dashboard page after Login
    When  Clicks assignment button on the navigation bar
    And Get all text from Manage assignment page
    Then Checks spellings for all the fields
    
    @deleteIconBelowHeader
     Scenario: Validate delete icon below the header
    Given Admin is on dashboard page after Login
    When Clicks assignment button on the navigation bar
    Then Verify delete icon is disable 
    
    @searchbar
     Scenario: Validate search bar on the manage assignment page
    Given Admin is on dashboard page after Login
    When Clicks assignment button on the navigation bar
    Then Verify search bar on the manage assignment page
    
    @validatecolumnheaderfunct
     Scenario: Validate add new assignment button
    Given Admin is on dashboard page after Login
    When Clicks assignment button on the navigation bar
    Then Verify Add New Assignment button 
    
    @validateColumnHeader
     Scenario: Validate data table column header
    Given Admin is on dashboard page after Login
    When Clicks assignment button on the navigation bar
    Then verify column headers
    
    @validateEditIcon
     Scenario: Validate edit icon
    Given Admin is on dashboard page after Login
    When Clicks assignment button on the navigation bar
    Then verify edit icon
    
    @validateDeleteIcon
    Scenario: Validate delete icon
    Given Admin is on dashboard page after Login
    When Clicks assignment button on the navigation bar
    Then verify delete icon
    
    @validatecolumnHeaderSorting
     Scenario: Validate sort icon and checkbox in the data table
    Given Admin is on dashboard page after Login
    When Clicks assignment button on the navigation bar
    Then Verify sort icon near column header
    And Verify checkbox in all rows of data table when entries are available
    
    @validateNumberEntries
     Scenario: Validate number entries 
    Given Admin is on dashboard page after Login
    When Clicks assignment button on the navigation bar
    Then validate the text above the footer Showing zero to zero of zero entries
    
    @validatePaginationControl
     Scenario: Validate pagination control below data table
    Given Admin is on dashboard page after Login
    When Clicks assignment button on the navigation bar
    Then get_the_text_above_the_footer
    
    @validateFooterText
     Scenario: Validate footer text
    Given Admin is on dashboard page after Login
    When Clicks assignment button on the navigation bar
    Then Verify footer text;
    
    