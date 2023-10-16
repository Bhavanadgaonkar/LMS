Feature: Navigation validation from manage assignment page to other pages

Background: 
      Given Admin is on manage assignment page
      When  Logged in LMS portal as a admin
      
      @NavigateStudentPage
      Scenario: Validation for Navigation to student page
      Given Admin is in manage assignment page
      When  Clicks on Student button in navigation bar 
      Then Navigate to student page
      
      @NavigateProgramPage
      Scenario: Validation for Navigation to program page
      Given Admin is in manage assignment page
      When  Clicks on Program button in navigation bar 
      Then Navigate to program page
      
      @NavigateBatchPage
      Scenario: Validation for Navigation to batch page
      Given Admin is in manage assignment page
      When  Clicks on Batch button in navigation bar 
      Then Navigate to batch page
      
      @NavigateUserPage
      Scenario: Validation for Navigation to user page
      Given Admin is in manage assignment page
      When  Clicks on User button in navigation bar 
      Then Navigate to user page
      
      @NavigateClassPage
      Scenario: Validation for Navigation to class page
      Given Admin is in manage assignment page
      When  Clicks on Class button in navigation bar 
      Then Navigate to class page
      
      @NavigateAttendancePage
      Scenario: Validation for Navigation to attendance page
      Given Admin is in manage assignment page
      When  Clicks on Attendance button in navigation bar 
      Then Navigate to attendance page
      
      @NavigateLoginPage
      Scenario: Validation for Navigation to login page
      Given Admin is in manage assignment page
      When  Clicks on Login button in navigation bar 
      Then Navigate to login page
   