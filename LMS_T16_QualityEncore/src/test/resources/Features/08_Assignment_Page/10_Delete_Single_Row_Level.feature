Feature: Delete multiple class validation

Background:
      Given Logged on the LMS portal as admin
      And  Clicks on assignment button on the navigation bar 
      
      @deleteButtonEnable
      Scenario:
      Given Admin is in manage assignment page
      When Clicks on single row level checkbox in data table  
      Then deletes icon below header is enables 