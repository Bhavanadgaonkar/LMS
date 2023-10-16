Feature: Pagination in manage assignment
Background:
       Given Logged on the LMS portal as admin
       
       @ValidateDefaultPageNumber
       Scenario: Verify dispalys default page number 
       Given Admin is on Dashboard page
       When Clicks on Assignment button on navigation bar
       Then Displays one page 
       
       
       
       @ValidateRightArrowIsEnable
       Scenario: Verify right arrow is enable when page one displays 
       Given Admin is on Dashboard page
       When Clicks on Assignment button on navigation bar
       When Entries are more than five
       Then Enable the right arrow  
       
       Scenario: Verify right arrow is enable when page two displays 
       Given Admin is on Dashboard page
       When Clicks on Assignment button on navigation bar
       When Entries are more than 5 on page two
       Then Enable the right arrow  
       
       @ValidateLeftArrowIsEnable
       Scenario: Verify left arrow is disable when page one displays 
       Given Admin is on Dashboard page
       When Clicks on Assignment button on navigation bar
       When Entries are more than 5 on page one
       Then disable the left arrow  
       
        
       Scenario: Verify left arrow is enable when page two displays 
       Given Admin is on Dashboard page
       When Clicks on Assignment button on navigation bar
       When Entries are more than 5 on page two
       Then enable the left arrow 
       
       @paginationControl
       Scenario: Verify data table pagination control  
       Given Admin is on Dashboard page
       When Clicks on Assignment button on navigation bar
       And Entries are more than five
       Then enable pagination control  
       
     
       Scenario: Verify data table pagination control 
       Given Admin is on Dashboard page
       When Clicks on Assignment button on navigation bar
       And Entries are less than five
       Then disable pagination control 
       
   
        @NextPage
        Scenario: Verify next page is enable 
        Given Admin is in add assignment details popup window 
        When Creates six new assignments
        And Entries are more than five
        Then enable next page  
       

       
          
