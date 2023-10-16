Feature: Multiple Delete Program

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar

Scenario: Validate Common Delete button enabled after clicking on any checkbox
	Given Admin is on Manage Program page	
	When Admin clicks any checkbox in the data table
	Then Admin should see common delete option enabled under header Manage Program
	
