Feature: Delete multiple class validation sc01
Background: Admin logged into LMS portal and clicks class button on the navigation bar 



#1Verify delete multiple class  button is enabled	Admin is in Manage class page	Admin clicks single  row level check box in the data table

Scenario: Verify delete multiple class  button is enabled
Given Admin is in Manage class page
When Admin clicks single  row level check box in the data table
Then Admin should see delete icon below the header is enabled

#2verify tick mark is visible after clicking on check box	Admin is in Manage class page	Admin clicks single  row level check box in the data table

Scenario: verify tick mark is visible after clicking on check box 
Given Admin is in Manage class page
When Admin clicks single  row level check box in the data table
Then Admin should see tick mark in check box 

#3verify admin able to click multiple check box	Admin is in Manage class page	Admin clicks multiple row level check box in the data table
Scenario: verify admin able to click multiple check box
Given Admin is in Manage class page
When Admin clicks multiple row level check box in the data table
Then Admin should see tick mark in check box  of the selected rows
