Feature: Pagination in manage class sc02
Background: Admin click +Add New Class button after reaching to Manage class page
Given Admin is in add class details popup window


Scenario: Verify next page is enabled

When Admin creates six new class
Then If total class entries above five next page is enabled


Scenario: Verify next page is disabled	

When Admin creates less than or equal to five new class
Then If total class entries  five or below next page is disabled