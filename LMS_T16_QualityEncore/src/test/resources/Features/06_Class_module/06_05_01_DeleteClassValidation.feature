Feature: Delete class validation sc01

  Background: Admin logged into LMS portal and clicks class button on the navigation bar

  #1Verify Delete class alert	Admin is in Manage class page	Admin clicks delete button in data table row level Admin should see alert
  Scenario: Verify Delete class alert
    Given Admin is in Manage class page
    When Admin clicks delete button in data table row level
    Then Admin should see alert

  #2Verify  accept enabled in alert	Admin is in Manage class page	Admin clicks delete button in data table row level	Alert should have "yes" button to accept
  Scenario: Verify  accept enabled in alert
    Given Admin is in Manage class page
    When Admin clicks delete button in data table row level
    Then Alert should have yes button to accept

  #3Verify reject enabled in alert	Admin is in Manage class page	Admin clicks delete button in data table row level	Alert should have "No" button to reject
  Scenario: Verify reject enabled in alert
    Given Admin is in Manage class page
    When Admin clicks delete button in data table row level
    Then Alert should have no button to reject
