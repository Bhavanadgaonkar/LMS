Feature: Delete assignment validation

Background:
      Given Logged on the LMS portal as admin
      When Clicks on assignment button on the navigation bar 
      
     
       @VerifyDeleteAlertdialogBox
       Scenario: Verify Delete assignment Dialog Box
       Given Admin is in manage assignment page
       When  Clicks on delete button in data table
       Then Enables delete Dialog box
       
       
        @VerifyDeleteAlertdialogBoxWithYes
       Scenario: Verify accept enable in alert
       Given Admin is in manage assignment page
       When  Clicks on delete button in data table
       Then Enables yes button on delete alert dialog box
       
        @VerifyDeleteAlertdialogBoxWithNo
       Scenario: Verify reject enable in alert
       Given Admin is in manage assignment page
       When  Clicks on delete button in data table
       Then Enables no button on delete alert dialog box
       
