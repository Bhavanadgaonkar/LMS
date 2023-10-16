Feature: Dashboard Page
Background: Admin clicks Login butter after giving correct URL

Scenario: Verify after login  admin lands on manage program as dashboard page
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see manage program as header 


Scenario: Verify the response time
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then  Maximum navigation time in milliseconds defaults to thirty seconds


Scenario: Verify broken link
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then HTTP response >equalto400 the link is broken


Scenario: Verify LMS title 
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see LMS -Learning management system  as title 


Scenario: Verify  LMS title alignment
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then LMS title should be on the top left corner of page


Scenario: Validate navigation bar text
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see correct spelling in navigation bar text


Scenario: Validate LMS title has correct spelling ang space
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see correct spelling and space in LMS title


Scenario: Validate alignment for navigation bar
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see the navigation bar text on the top right side


Scenario: Validate navigation bar order first Student
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see student in the first place

Scenario: Validate navigation bar order second Program
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see program in the second place

Scenario: Validate navigation bar order  third Batch
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see batch in the third place 

Scenario: Validate navigation bar order fourth Class
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see class in the fourth place

Scenario: Validate navigation bar order fifth User
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see user in the  fifth user

Scenario: Validate navigation bar order sixth Assignment
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see Assignment in the  sixth assignment 

Scenario: Validate navigation bar order seventh Attendance
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see Attendance in the  seventh attendance

Scenario: Validate navigation bar order eighth Logout 
Given Admin is in login page
When Admin enter valid credentials  and clicks login button 
Then Admin should see logout in the eighth logout



