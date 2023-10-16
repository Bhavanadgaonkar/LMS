Feature: Add new assignment

Background: 
       Click on +Add new assignment button
        Navigate to Manage Assignment page

  @AddValidDatainMandatoryFields
  Scenario: Add new assignment with valid data in mandatory fields
    Given Admin is in assignment details popup window
    When Enters all mandatory field values with valid data
    And Clicks on save button
    Then Navigates to Manage assignment page
    And new assignment details displays in data table

 
  @AddInvalidDatainMandatoryFields
  Scenario: Add new assignment with invalid data in mandatory fields
    Given Admin is in assignment details popup window
    When Enters all mandatory field values with invalid data
    And Clicks on save button
    Then Error alert window displays 
    
@AddValidDataInAllFields
  Scenario: Add new assignment with valid data in all fields
    Given Admin is in assignment details popup window
    When Enters all fields values with valid data
    And Clicks on save button
    Then Navigates to Manage assignment page
    And new assignment details displays in data table
    
    
    @AddInvalidDatainOptionalFields
  Scenario: Add new assignment with invalid data in Optional fields
    Given Admin is in assignment details popup window
    When Enters all Optional field values with invalid data
    And Clicks on save button
    Then Error alert window displays 
    
    @MissingValueInProgramName
    Scenario: Add new assignment with missing value in Program Name
    Given Admin is in assignment details popup window
    When Enters all fileds values without program name
    And Clicks on save button
    Then Error message dispalys Program Name is missing
    
    @MissingValueInBatchNumber
    Scenario: Add new assignment with missing value in Batch Number
    Given Admin is in assignment details popup window
    When Enters all fileds values without Batch Number
    And Clicks on save button
    Then Error message dispalys Batch Number is missing
    
    @MissingValueInAssignmentName
    Scenario: Add new assignment with missing value in Assignment name
    Given Admin is in assignment details popup window
    When Enters all fileds values without Assignment name
    And Clicks on save button
    Then Error message dispalys Assignment name is missing
    
    @MissingValueInDuedate
    Scenario: Add new assignment with missing value in Assignment Duedate
    Given Admin is in assignment details popup window
    When Enters all fileds values withoutAssignment Duedate
    And Clicks on save button
    Then Error message dispalys Assignment Duedate is missing
    
    
      @MissingValueInGradeBy
    Scenario: Add new assignment with missing value in grade by
    Given Admin is in assignment details popup window
    When Enters all fileds values without grade by
    And Clicks on save button
    Then Error message dispalys Grade by is missing
    
    @PassedDate
    Scenario: Add new assignment with passed date
    Given Admin is in assignment details popup window
    When Enters all fileds values with passed date
    And Clicks on save button
    Then Error message dispalys Assignment can not created for the passed date
    
     @validateDatePicker
    Scenario: Validate date picker
    Given Admin is in assignment details popup window
    When Clicks on date from date picker
    Then verify class date and selected date are same
    
    @validateDateFormat
     Scenario: Validate date mm/dd/yyyy format
    Given Admin is in assignment details popup window
    When Clicks on date from date picker
    Then verify date format mm/dd/yyyy
    
    @validateNextArrowInDatePicker
    Scenario: Validate next arrow in date picker
    Given Admin is in assignment details popup window
    When Clicks on next arrow in date picker
    Then Next month calendar displays
    
     @validatePreviousArrowInDatePicker
    Scenario: Validate previous arrow in date picker
    Given Admin is in assignment details popup window
    When Clicks on previous arrow in date picker
    Then Previous month calendar displays
    
    @HighlightCurrentDate
    Scenario: Validate highlighted date in date picker
    Given Admin is in assignment details popup window
    When Clicks on date from date picker
    Then Displays current date
    
    @HighlightSelectedDate
    Scenario: Validate highlighted date in date picker
    Given Admin is in assignment details popup window
    When Clicks on date from date picker
    Then Displays selected date in date picker
    
     @ClicksOnCancelButtonWithValue
    Scenario: Validate cancel button with entering values in fields
    Given Admin is in assignment details popup window
    When Clicks on cancel button with entering values in fields
    Then Navigates to Manage assignment page
    And Verify new assignment created in the data table
    
    @ClicksOnCancelButtonWithoutValue
    Scenario: Validate cancel button without entering values in fields
    Given Admin is in assignment details popup window
    When Clicks on cancel button without entering values in fields
    Then Navigates to Manage assignment page
    
