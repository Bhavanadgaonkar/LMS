Feature: Delete class validation sc02
Background: Admin clicks row level delete button after landing to manage class page




#1Validate accept in alert	Admin is in delete alert	Admin clicks yes button	Success message and validate particular class details are deleted from the data table

Scenario: Validate accept in alert
Given Admin is in delete alert
When Admin clicks yes button
Then Success message and validate particular class details are deleted from the data table

#2Validate reject in alert	Admin is in delete alert	Admin clicks no button	Admin should land on manage class page and validate particular class details are not deleted from the data table

Scenario: Validate reject in alert
Given Admin is in delete alert
When Admin clicks no button
Then Admin should land on manage class page and validate particular class details are not deleted from the data table

