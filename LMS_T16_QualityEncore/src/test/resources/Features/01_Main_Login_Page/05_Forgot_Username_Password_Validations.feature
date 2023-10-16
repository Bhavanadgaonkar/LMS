Feature: Forgot username /password Validations
Background: Admin Clicks forgot username and password after reaching login page

Scenario: Validate email sent for forgot password
Given Admin is in forgot username and password page
When Admin enters valid email id and clicks send link button
Then Admin should receive link in mail for reset username and password

Scenario: Validate email sent for forgot password with invalid email id
Given Admin is in forgot username and password page
When Admin enters invalid email id and clicks send link button
Then Admin should not receive link in mail for reset username and password












