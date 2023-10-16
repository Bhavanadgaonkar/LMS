

Feature: Delete multiple class validation

 
       
       
 Background:
        Given Admin clicks on delete button under header
        When Selects multiple checkbox with multiple class in data table
        
        @VerifyDeleteAlertForMultipleCheckbox
        Scenario: Verify accept enable in alert
       Given Admin is in delete alert
       When Clicks on yes button
       Then Redirect assignment page
       And Selected assignment details are deleted from data table
       
       
       Scenario: Verify reject enable in alert
       Given Admin is in delete alert 
       When Clicks on no button
       Then Redirect assignment page         
        