Feature: Edit class Validation

  Background: Admin clicks Edit button in manage class after reaching manage class page
    Given Admin is in  Edit class detail popup window

  @Validateupdatedvaliddatainmandatefields
  Scenario Outline: Validate admin able to update class with valid data in mandatory fields
    When Admin enters all mandatory field values with valid data and clicks save button "<KeyOption>" and "<Sheetname>"
    Then Admin should see particular class details is updated in the data table

    Examples: 
      | KeyOption                       | Sheetname        |
      | UpdateAllMandateFieldsValidData | classDetailsForm |

  @Validateupdateinvaliddatainmandatefields
  Scenario Outline: Validate admin able to  update class with invalid data in mandatory fields
    When Admin enters all mandatory field values with invalid data and clicks save button "<KeyOption>" and "<Sheetname>"
    Then Error message should appear in alert

    Examples: 
      | KeyOption                         | Sheetname        |
      | UpdateAllMandateFieldsInValidData | classDetailsForm |

  @Validateupdatevaliddatainallfields
  Scenario Outline: Validate admin able to  update class with valid data  in all fields
    When Admin enters values in all fields with valid data and clicks save button "<KeyOption>" and "<Sheetname>"
    Then Admin should see particular class details is updated in the data table

    Examples: 
      | KeyOption                | Sheetname        |
      | UpdateAllFieldsValidData | classDetailsForm |

  @Validateupdateclasswithinvaliddatainallfields
  Scenario Outline: Validate admin able to  update  class with invalid data  in all fields
    When Admin enters with invalid data in optional fields and clicks save button "<KeyOption>" and "<Sheetname>"
    Then Error message should appear in alert

    Examples: 
      | KeyOption                   | Sheetname        |
      | UpdateClassInvalidAllFields | classDetailsForm |

  @Validateupdateclasswithnobatchid
  Scenario Outline: Validate admin able to update class missing Batch Id
    When Admin enters  data missing value in Batch ID and clicks save button "<KeyOption>" and "<Sheetname>"
    Then Batch Id is missing

    Examples: 
      | KeyOption            | Sheetname        |
      | UpdateClassNoBatchID | classDetailsForm |

  @Validatewithnonoofclass
  Scenario Outline: Validate admin able to update class missing No of class
    When Admin enters data missing value in No of class and clicks save button "<KeyOption>" and "<Sheetname>"
    Then No of classes is missing

    Examples: 
      | KeyOption              | Sheetname        |
      | UpdateClassnoNoofClass | classDetailsForm |

  @Validatewithnoclassdate
  Scenario Outline: Validate admin able to update class missing Class Date
    When Admin enters data missing value in  class date and clicks save button "<KeyOption>" and "<Sheetname>"
    Then class date is missing

    Examples: 
      | KeyOption              | Sheetname        |
      | UpdateClassnoClassDate | classDetailsForm |

  @Validatewithnostaffid
  Scenario Outline: Validate admin able to update class missing staff id
    When Admin enters data missing value in staff id and clicks save button "<KeyOption>" and "<Sheetname>"
    Then staff id is missing

    Examples: 
      | KeyOption            | Sheetname        |
      | UpdateClassnoStaffID | classDetailsForm |

  @Validatewithpastdate
  Scenario Outline: Validate  admin able to update class passing past date
    When Admin enters passed date in the class date field and clicks save button "<KeyOption>" and "<Sheetname>"
    Then class cannot be updated for the passed date

    Examples: 
      | KeyOption               | Sheetname        |
      | UpdateClasswithPastDate | classDetailsForm |

  @Validatecancelbutton
  Scenario: Validate cancel button function in Edit class details popup window
    When Admin clicks Cancel button without entering values in the fields
    Then Admin should land on Manage Class page

  @Validatecancelbutton
  Scenario: Validate cancel button function in Edit class details popup window
    When Admin clicks Cancel button entering values in the fields
    Then Admin should land on Manage Class Page and validate particular class details are not changed  in the data table
