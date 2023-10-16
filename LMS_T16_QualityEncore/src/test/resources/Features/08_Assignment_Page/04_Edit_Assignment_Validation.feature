Feature: Edit assignment validation

Background:
      Given Logged on the LMS portal as admin
      And  Clicks on assignment button on the navigation bar 
      
      @VerifyEditPopUpWindow
      Scenario: Verify Edit assignment popup window
      Given Admin is in manage assignment page
      When  Clicks on Edit button in data table
      Then Appears edit popup window with heading Assignment Details
      
       @ValidateValuesInEditPopUpWindow
      Scenario: Verify Edit assignment popup window
      Given Admin is in manage assignment page
      When  Clicks on Edit button from one row in data table
      Then Appears edit popup window with same row values in all fields
      
      @UpdateValidDataInMandatoryFields
      Scenario: Update assignment with valid data in all mandatory fields
      Given Admin is in Edit assignment details popup window
      When Enters valid data in all mandatory fields
      And Clicks on save button 
      Then Navigates to Manage assignment page
      And Updated assignment details added in data table
    
     @UpdateInvalidDataInMandatoryFields
     Scenario: Update assignment with invalid data in all mandatory fields
     Given Admin is in Edit assignment details popup window
     When Enters invalid data in all mandatory fields
     Then Clicks on save button 
     And Error alert window displays
     
     
     @UpdateValidDataInAllFields
     Scenario: Update assignment with valid data in all fields
    Given Admin is in Edit assignment details popup window
    When Enters valid data in all fields 
    And Clicks on save button
    Then Navigates to Manage assignment page
    And Updated assignment details displays in data table
    
     @UpdateInvalidDataInOptionalFields
     Scenario: Update assignment with invalid data in optional fields
     Given Admin is in Edit assignment details popup window
     When Enters invalid data in optional fields
     Then Clicks on save button
     And Error alert window displays
     
     @MissingValueInProgramName
    Scenario: Edit assignment with missing value in Program Name
    Given Admin is in Edit assignment details popup window
    When Enters all fileds values without program name
    And Clicks on save button
    Then Error message dispalys Program Name is missing
    
    @MissingValueInBatchNumber
    Scenario: Edit assignment with missing value in Batch Number
    Given Admin is in Edit assignment details popup window
    When Enters all fileds values without Batch Number
    And Clicks on save button
    Then Error message dispalys Batch Number is missing
    
    @MissingValueInAssignmentName
    Scenario: Edit assignment with missing value in Assignment name
    Given Admin is in assignment details popup window
    When Enters all fileds values without Assignment name
    And Clicks on save button
    Then Error message dispalys Assignment name is missing
    
    @MissingValueInDuedate
    Scenario: Edit assignment with missing value in Assignment Duedate
    Given Admin is in Edit assignment details popup window
    When Enters all fileds values withoutAssignment Duedate
    And Clicks on save button
    Then Error message dispalys Assignment Duedate is missing
    
    
      @MissingValueInGradeBy
    Scenario: Edit assignment with missing value in grade by
    Given Admin is in Edit assignment details popup window
    When Enters all fileds values without grade by
    And Clicks on save button
    Then Error message dispalys Grade by is missing
    
    @PassedDate
    Scenario: Edit assignment with passed date
    Given Admin is in Edit assignment details popup window
    When Enters all fileds values with passed date
    And Clicks on save button
    Then Error message dispalys Assignment can not updated for the passed date
    
     
    @ClicksOnCancelButtonWithValue
    Scenario: Validate cancel button with entering values in fields
    Given Admin is in Edit assignment details popup window
    When Clicks on cancel button with entering values in fields
    Then Navigates to Manage assignment page
    And Verify assignment updated in the data table
    
    @ClicksOnCancelButtonWithoutValue
    Scenario: Validate cancel button without entering values in fields
    Given Admin is in Edit assignment details popup window
    When Clicks on cancel button without entering values in fields
    Then Navigates to Manage assignment page
   