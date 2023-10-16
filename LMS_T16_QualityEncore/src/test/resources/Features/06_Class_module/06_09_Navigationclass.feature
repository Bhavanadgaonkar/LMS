Feature: Navigation function validation from manage class page to other pages
Background: Admin is manage class page after logged in

#1 Verify admin is able to navigate from manage class to student page	Admin is in Manage class page	Admin clicks " Student" button in the navigation bar	Admin should able to land on student page

  Scenario: Verify admin is able to navigate from manage class to student page
    Given Admin is in Manage class page
    When Admin clicks Student button in the navigation bar
    Then Admin should able to land on student page
   

#2 Verify admin is able to navigate from manage class to program page	Admin is in Manage class page	Admin clicks " Program" button in the navigation bar	Admin should able to land on program page

  Scenario: Verify admin is able to navigate from manage class to program page
    Given Admin is in Manage class page	
    When Admin clicks Program button in the navigation bar
    Then Admin should able to land on program page
   
   
   
#3Verify admin is able to navigate from manage class to batch page	Admin is in Manage class page	Admin clicks " Batch" button in the navigation bar	Admin should able to land on batch page

  Scenario: Verify admin is able to navigate from manage class to batch page
    Given Admin is in Manage class
    When Admin clicks Batch button in the navigation bar
    Then Admin should able to land on batch page
   
   
   
#4 Verify admin is able to navigate from manage class to user page	Admin is in Manage class page	Admin clicks " User" button in the navigation bar	Admin should able to land on user page

  Scenario: Verify admin is able to navigate from manage class to user page
    Given Admin is in Manage class page
    When Admin clicks User button in the navigation bar
    Then Admin should able to land on user page
   
   
   
#5Verify admin is able to navigate from manage class to assignment page	Admin is in Manage class page	Admin clicks " Assignment" button in the navigation bar	Admin should able to land on Assignment page

  Scenario: Verify admin is able to navigate from manage class to assignment page
    Given Admin is in Manage class page
    When Admin clicks Assignment button in the navigation bar
    Then Admin should able to land on Assignment page
   
   
   
#6 Verify admin is able to navigate from manage class to attendance page	Admin is in Manage class page	Admin clicks " Attendance" button in the navigation bar	Admin should able to land on Attendance page

  Scenario: Verify admin is able to navigate from manage class to attendance page
    Given Admin is in Manage class
    When Admin clicks Attendance button in the navigation bar
    Then Admin should able to land on Attendance page
   
   
   
#7Verify adminshould able to do logout function from manage class	Admin is in Manage class page	Admin clicks "Logout" button in the navigation bar	Admin should able to land on login page

  Scenario: Verify adminshould able to do logout function from manage class
    Given Admin is in Manage class page
    When Admin clicks Logout button in the navigation bar
    Then Admin should able to land on login page
   
   