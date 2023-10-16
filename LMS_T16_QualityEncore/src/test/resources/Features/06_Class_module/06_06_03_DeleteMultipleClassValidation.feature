
Feature: Delete multiple class validation sc03
Background: Admin clicks delete button under header after selecting the multiple check box in the data table


#6Verify accept alert in delete multiple class function by selecting multiple checkbox	Admin is in delete alert	Admin clicks yes button	Admin should land on manage class page and validate particular class details are deleted from the data table
Scenario: Verify accept alert in delete multiple class function by selecting single checkbox
Given Admin is in delete alert
When Admin clicks yes button
Then Admin should land on manage class page and validate particular class details are deleted from the data table 

#7Verify reject alert in delete multiple class function by selecting multiple checkbox	Admin is in delete alert	Admin clicks no button	Admin should land on manage class page and validate particular class details are not deleted from the data table
Scenario: Verify reject alert in delete multiple class function by selecting multiple checkbox
Given Admin is in delete alert
When Admin clicks no button
Then Admin should land on manage class page and validate particular class details are not deleted from the data table