Feature: Delete Program

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar

Scenario: Delete Feature
	Given Admin is on Manage Program Page 
	When Admin clicks <Delete> button on the data table for any row
	Then Admin should see a alert open with heading "Confirm" along with <YES> and <NO> button for deletion
	
Scenario: Validate details for Confirm Deletion form
	Given Admin is on Manage Program Page 
	When Admin clicks <Delete> button on the data table for any row
	Then Admin should see a message "Are you sure you want to delete <Program name>?"
	
