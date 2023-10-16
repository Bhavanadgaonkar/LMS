Feature: Verification of Assignment Pop up Window

 Background:
 Given Logged on the LMS portal as admin
 And  Clicks on assignment button on the navigation bar

  @validateAssignmentDetailsPopUpWindow
   Scenario: Validation of assignment popup window
     Given Admin is on manage assignment page
     When Clicks on +add new assignment button
     Then Navigates to AddEdit Assignment Page with heading Assignment details
     
      Scenario: Validation of input fields in Assignment details popup window
     Given Admin is on manage assignment page
     When Clicks on +add new assignment button
     Then verify input fields Text
     
     Scenario: Validation of text box present in Assignment details popup window
     Given Admin is on manage assignment page
     When Clicks on +add new assignment button
     Then verify text box presence
     
     Scenario: Validation of drop down in Batch Number in Assignment details popup window
     Given Admin is on manage assignment page
     When Clicks on +add new assignment button
     Then Verify dropdown option for Batch Number 
     
     Scenario: Validation of drop down for Program name in Assignment details popup window
     Given Admin is on manage assignment page
     When Clicks on +add new assignment button
     Then Verify dropdown option for Program name
     
     Scenario: Validation of calendar icon in Assignment due date  in Assignment details popup window
     Given Admin is on manage assignment page
     When Clicks on +add new assignment button
     Then Verify calender icon in assignment due date
     
     
     Scenario: Validation of save button in Assignment details popup window
     Given Admin is on manage assignment page
     When Clicks on +add new assignment button
     Then Displays save button
     
     Scenario: Validation of cancel button in Assignment details popup window
     Given Admin is on manage assignment page
     When Clicks on +add new assignment button
     Then Displays cancel button
     
     Scenario: Validation of close button in Assignment details popup window
     Given Admin is on manage assignment page
     When Clicks on +add new assignment button
     Then Displays close button
     
