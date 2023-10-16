package com.lms.ui.stepDefinitions;



import com.lms.ui.pageObject.deleteMultipleClass_obj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteMultipleClass_SD {
	
	deleteMultipleClass_obj multiclassobj=new deleteMultipleClass_obj();
	
	@Given("Admin clicks on delete button under header")
	public void admin_clicks_on_delete_button_under_header() {
		multiclassobj.admin_clicks_on_delete_button_under_header();
	}

	
	@When("Selects multiple checkbox with multiple class in data table")
	public void selects_multiple_checkbox_with_multiple_class_in_data_table() {
		multiclassobj.selects_multiple_checkbox_with_multiple_class_in_data_table();
	}

	/*@Then("Enables yes button on delete alert dialog box")
	public void enables_yes_button_on_delete_alert_dialog_box() {
		multiclassobj.enables_yes_button_on_delete_alert_dialog_box();
	   
	}
	*/
	@Then("Redirect assignment page")
	public void redirect_assignment_page() {
		multiclassobj.redirect_assignment_page();
	    
	}
	
	@Then("Enables no button on delete alert dialog box")
	public void enables_no_button_on_delete_alert_dialog_box() {
		multiclassobj.enables_no_button_on_delete_alert_dialog_box();
	}
    
	@Given("Admin is in delete alert")
public void Admin_is_in_delete_alert() {
		
		multiclassobj.Admin_is_in_delete_alert();
	}  
}
