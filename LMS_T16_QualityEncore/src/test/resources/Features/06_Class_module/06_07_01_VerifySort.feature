
Feature: Verify sort function in manage class page 

Background: Admin is manage class page after logged in

#1 Verify sort function in data table for descending order	Admin is in Manage class page	Admin click on Batch id column header to sort 	Admin should see data table sorted in descending order
Scenario:Verify sort function in data table for descending order
Given Admin is in Manage class page
When Admin click on Batch id column header to sort
Then Admin should see data table sorted in descending order

#2 Verify sort function in data table for ascending order	Admin is in Manage class page	Admin double click on Batch id column header to sort 	Admin should see data table sorted in ascending  order

Scenario: Verify sort function in data table for ascending order
Given Admin is in Manage class page
When Admin double click on Batch id column header to sort
Then Admin should see data table sorted in ascending  order

