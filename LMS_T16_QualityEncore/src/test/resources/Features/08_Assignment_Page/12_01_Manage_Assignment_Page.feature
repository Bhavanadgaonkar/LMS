Feature: Manage assignment page verification
Background:
    Given Logged on the LMS portal as admin
    And  Clicks on assignment button on the navigation bar
    
    @validatesearchbox
    Scenario: Validation of search box functionality
    Given Admin is on manage assignment page
    When enters assignment name
    Then Displays all assignemts details with assignment name 
    
   
   
     Scenario: Validation of search box functionality
     Given Admin is on manage assignment page
     When enters assignment description
     Then Displays all assignemts details with assignment description 
   
     
   
     Scenario: Validation of search box functionality
     Given Admin is on manage assignment page
     When  enters assignment duedate
     Then Displays all assignemts details with assignment duedate
   
    
   
   
    Scenario: Validation of search box functionality
     Given Admin is on manage assignment page
     When  enters grade value
     Then Displays all assignemts details with assignment grade
     
    