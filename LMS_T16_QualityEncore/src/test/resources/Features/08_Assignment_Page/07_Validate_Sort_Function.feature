Feature: Validate sort function in manage assignment page 

Background:
       Logged on the LMS portal as admin
       Navigates to Manage assignment page
       
       @ValidateSortHeaderWithAscending
       Scenario: Verify sort data table for ascending order
       Given Admin is on manage assignment page
       When Clicks on assignment name column header to sort
       Then Displays data tables sorts in ascending order 
       
       @ValidateSortHeaderWithDescending
       Scenario: Verify sort data table for descending order
       Given Admin is on manage assignment page
       When Clicks on assignment name column header to sort
       Then Displays data tables sorts in descending order  
