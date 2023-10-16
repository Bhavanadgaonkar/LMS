package com.lms.ui.stepDefinitions;

import com.lms.ui.pageObject.deleteSingleClass_obj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteSingleRowLevel_SD {
	
	deleteSingleClass_obj singleclassobj=new deleteSingleClass_obj();
	
	/*@Given("Admin is in manage assignment page")
	public void admin_is_in_manage_assignment_page() {
		singleclassobj.navigateManageAssignmentpage();
	}
*/
	@When("Clicks on single row level checkbox in data table")
	public void clicks_on_single_row_level_checkbox_in_data_table() {
		singleclassobj.clicks_on_single_row_level_checkbox_in_data_table();
	}

	@Then("deletes icon below header is enables")
	public void deletes_icon_below_header_is_enables() {
		singleclassobj.admin_clicks_on_delete_button_under_header();

}
}
