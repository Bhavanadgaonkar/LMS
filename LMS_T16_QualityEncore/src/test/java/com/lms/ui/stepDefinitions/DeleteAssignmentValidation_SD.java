package com.lms.ui.stepDefinitions;





import com.lms.ui.pageObject.deleteAssignmentValidation_obj;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAssignmentValidation_SD {
	
	deleteAssignmentValidation_obj deleteassignobj=new deleteAssignmentValidation_obj();
	
	@When("Clicks on delete button in data table")
	public void clicks_on_delete_button_in_data_table() {
		deleteassignobj.clicks_on_delete_button_in_data_table();
	}

	@Then("Enables delete Dialog box")
	public void enables_delete_dialog_box() {
		deleteassignobj.enables_delete_dialog_box();
	}

	/*@Then("Enables yes button on delete alert dialog box")
	public void enables_button_on_delete_alert_dialog_box() {
		deleteassignobj.enables_yes_button_on_delete_alert_dialog_box();
	}
	*/
	

	@When("Clicks on yes button")
	public void clicks_on_yes_button() {
		deleteassignobj.clicks_on_yes_button();
	}

	@Then("Dispalys assignment page")
	public void dispalys_assignment_page() {
		deleteassignobj.dispalys_assignment_page();
	}

	@Then("Selected assignment details are deleted from data table")
	public void selected_assignment_details_are_deleted_from_data_table() {
		deleteassignobj.selected_assignment_details_are_deleted_from_data_table();
		
	}
	/*
	@Then("Enables no button on delete alert dialog box")
	public void enables_no_button_on_delete_alert_dialog_box() {
		deleteassignobj.enables_delete_dialog_box();
	   
	}*/

	@When("Clicks on no button")
	public void clicks_on_no_button() {
		deleteassignobj.enables_no_button_on_delete_alert_dialog_box();
	}


}
