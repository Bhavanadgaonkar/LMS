Feature: Add New Class

  Background: Admin click +Add New Class button after reaching to Manage class page
    Given Admin is in  class detail popup window

  @ValidatebatchID
  Scenario: Validate all batch id is reflecting in the dropdown
    When Admin clicks  Batch ID dropdown
    Then Batch id in the drop down should match with Batch id manage batch page table

  @ValidateaddnewclassvalidMandatefields
  Scenario Outline: Validate admin able to add new class with valid data in mandatory fields
    When Admin enters all mandatory field values with valid data and clicks save button "<KeyOption>" and "<Sheetname>"
    Then Admin should see new class details is added in the data table

    Examples: 
      | KeyOption                 | Sheetname        |
      | AllMandateFieldsValidData | classDetailsForm |

  @ValidateaddnewclassinvalidMandatefields
  Scenario Outline: Validate admin able to add new class with invalid data in mandatory fields
    When Admin enters all mandatory field values with invalid data and clicks save button "<KeyOption>" and "<Sheetname>"
    Then Error message should appear in alert

    Examples: 
      | KeyOption                   | Sheetname        |
      | AllMandateFieldsInValidData | classDetailsForm |

  @Validateaddnewclassvalidinallfields
  Scenario Outline: Validate admin able to add new class with valid data  in all fields
    When Admin enters values in all fields with valid data and clicks save button "<KeyOption>" and "<Sheetname>"
    Then Admin should see new class details is added in the data table

    Examples: 
      | KeyOption          | Sheetname        |
      | AllFieldsValidData | classDetailsForm |

  @Validateaddnewclassinvalidinoptionalfields
  Scenario Outline: Validate admin able to add new class with invalid data  in optional fields
    When Admin enters with invalid data in optional fields and clicks save button "<KeyOption>" and "<Sheetname>"
    Then Error message should appear in alert

    Examples: 
      | KeyOption                 | Sheetname        |
      | OptionalFieldsInvalidData | classDetailsForm |

  @ValidateaddnewclassnoBatch
  Scenario Outline: Validate admin able to add new class missing Batch Id
    When Admin enters  data missing value in Batch ID and clicks save button "<KeyOption>" and "<Sheetname>"
    Then Batch Id is missing

    Examples: 
      | KeyOption        | Sheetname        |
      | Missing Batch Id | classDetailsForm |

  @ValidateaddnewclassnoClass
  Scenario Outline: Validate admin able to add new class missing No of Class
    When Admin enters data missing value in No of class and clicks save button "<KeyOption>" and "<Sheetname>"
    Then No of classes is missing

    Examples: 
      | KeyOption        | Sheetname        |
      | MissingNoofClass | classDetailsForm |

  @ValidateaddnewclassnoClassDate
  Scenario Outline: Validate admin able to add new class missing Class Date
    When Admin enters data missing value in  class date and clicks save button "<KeyOption>" and "<Sheetname>"
    Then class date is missing

    Examples: 
      | KeyOption        | Sheetname        |
      | MissingClassDate | classDetailsForm |

  @ValidateaddnewclassnoStaffID
  Scenario Outline: Validate admin able to add new class missing staff id
    When Admin enters data missing value in staff id and clicks save button "<KeyOption>" and "<Sheetname>"
    Then staff id is missing

    Examples: 
      | KeyOption      | Sheetname        |
      | MissingStaffId | classDetailsForm |

  @Validateaddnewclasspastdate
  Scenario Outline: Validate  admin able to add new class passing past date
    When Admin enters passed date in the class date field and clicks save button "<KeyOption>" and "<Sheetname>"
    Then class cannot be  created for the passed date

    Examples: 
      | KeyOption     | Sheetname        |
      | PastClassDate | classDetailsForm |

  @Validatedatepicker
  Scenario: Validate date picker
    When Admin clicks date from date picker
    Then selected date should be their in class date text box

  @Validatedatepickerformat
  Scenario: validate date picker should be correct format
    When Admin clicks date from date picker
    Then selected date should be in  mm/dd/yyyy format

  @Validaterightarrowdatapicker
  Scenario: Validate right arrow in data picker to navigate to next month
    When Admin clicks right arrow in the date picker near month
    Then Next month calender should visible

  @Validateleftarrowdatapicker
  Scenario: Validate left arrow in data picker to navigate to previous month
    When Admin clicks left arrow in the date picker near month
    Then previous month calender should visible

  @Validatecurrentdatedatapicker
  Scenario: Validate current date is highlighted in the date picker
    When Admin clicks date picker button
    Then Admin should see current date is highled in the date picker

  @Validateselecteddatedatapicker
  Scenario: Validate selected date is highlighted in the date picker
    When Admin clicks date picker button and selects future date
    Then Admin should see selected date is highled in the date picker

  @Validatecancelbuttondatepicker
  Scenario: Validate cancel button function in class details popup window
    When Admin clicks Cancel button without entering values in the fields
    Then Admin should land on Manage Class page

  @Validatecancelbuttonpopup
  Scenario: Validate cancel button function in class details popup window with values in field
    When Admin clicks Cancel button entering values in the fields
    Then Admin should land on Manage Class Page and validate new class is not created in the data table
