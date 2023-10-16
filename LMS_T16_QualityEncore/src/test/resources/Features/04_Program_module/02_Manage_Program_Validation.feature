Feature: Manage Program Validation

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar

Scenario: Search Program By Name
	Given Admin is on Manage Program Page
	When Admin enters <Program name phrase> into search box.
	Then Admin should see the Programs displayed based on the Program Name

Scenario: Search Program By Description
	Given Admin is on Manage Program Page
	When Admin enters <Program description phrase> into search box.
	Then Admin should see the Programs displayed based on the Program Description

Scenario: Search Program By Status
	Given Admin is on Manage Program Page
	When Admin enters <Program status phrase> into search box.
	Then Admin should see the Programs displayed based on the Program Status

Scenario: Validating the Search with unrelated keyword
	Given Admin is on Manage Program Page
	When Admin enters the keywords not present in the data table on the Search box 
	Then Admin should see "zero entries" on the data table


