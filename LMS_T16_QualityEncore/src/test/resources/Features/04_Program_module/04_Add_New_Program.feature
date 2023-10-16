Feature: Add New Program

Background: Admin is on Manage Program Page after clicks Program on the navigation bar

Scenario: Empty form submission
	Given Admin is on Program Details Popup window
	When Admin clicks <Save> button without entering any data
	Then Admin gets a Error message alert 
	
Scenario Outline: Enter only Program Name
	Given Admin is on Program Details Popup window
	When Admin enters only name "<Program Name>" in text box and clicks Save button
	Then Admin gets a message alert 'Description is required'
	Examples:
	|Program Name|
	|Program|
	
			
Scenario Outline: Enter only Program Description
	Given Admin is on Program Details Popup window
	When Admin enters only description "<Program Description>" in text box and clicks Save button
	Then Admin gets a message alert 'Name is required'
	Examples:
	|Program Description|
	|Program|
	
Scenario Outline: Select Status only
	Given Admin is on Program Details Popup window
	When Admin selects only "<Program Status>" and clicks Save button
	Then Admin gets a message alert 'Name and Description required'
	Examples:
	|Program Status|
	|Program|
	
Scenario Outline: Validate invalid values on the text column
	Given Admin is on Program Details Popup window
	When Admin enters only "<numbers or special char>" in name and desc column
	Then Admin gets a Error message alert 
	Examples:
	|numbers or special char|
	|Program|
	
Scenario: Validate Cancel/Close(X) icon on Program Details form
	Given Admin is on Program Details Popup window
	When Admin clicks Cancel or Close(X) Icon on Program Details form	
	Then Program Details popup window should be closed without saving
	
Scenario Outline: Validate Save button on Program Details form
	Given Admin is on Program Details Popup window
	When Enter all the required fields with valid values <Program Name>,<Program Description>,<Program Status> and click Save button
	Then Admin gets a message "Successful Program Created" alert and able to see the new program added in the data table
	Examples:
	|Program Name|Program Description|Program Status|
	|Program|Program|Program|
	
Scenario: Validate Cancel button on Program Details form
	Given Admin is on Program Details Popup window
	When Admin clicks <Cancel> button 
	Then Admin can see the Program details popup disappears without creating any program
	
	
	
	

	
	
	
	
	
	
	
	
