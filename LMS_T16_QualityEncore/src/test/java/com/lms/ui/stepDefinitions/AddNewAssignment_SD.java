package com.lms.ui.stepDefinitions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.lms.ui.pageObject.addNewAssignment_obj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddNewAssignment_SD {
	addNewAssignment_obj addassignmentobj = new addNewAssignment_obj();
    String month="September 2023";
	int day=20;
	
	@Given("Click on +Add new assignment button")
	public void click_on_add_new_assignment_button() {
		addassignmentobj.addNewAssignmentbtn();
		
	}

	

	@Given("Admin is in assignment details popup window")
	public void admin_is_in_assignment_details_popup_window() {
		addassignmentobj.assignmentDetailsPopupWindow();
	}

	@When("Enters all mandatory field values with valid data")
	public void enters_all_mandatory_field_values_with_valid_data() throws InterruptedException {
		
		addassignmentobj.enters_all_mandatory_field_values_with_valid_data();
		}
		
		
		
		
	

	@When("Clicks on save button")
	public void clicks_on_save_button() {
		addassignmentobj.savebtn();
	}

	@Then("Navigates to Manage assignment page")
	public void navigates_to_manage_assignment_page() {
		addassignmentobj.adminOnManageAassignmentPpage();
	}

	@Then("new assignment details displays in data table")
	public void new_assignment_details_displays_in_data_table() {
		addassignmentobj.new_assignment_details_displays_in_data_table();
	}

	@When("Enters all mandatory field values with invalid data")
	public void enters_all_mandatory_field_values_with_invalid_data() throws InterruptedException {
		addassignmentobj.enters_all_mandatory_field_values_with_invalid_data();
	}
	@Then("Error alert window displays")
	public void error_alert_window_displays() throws InterruptedException {
		
		addassignmentobj.error_alert_window_displays();
	    
	}

	@When("Enters all fields values with valid data")
	public void enters_all_fields_values_with_valid_data() throws InterruptedException {
		addassignmentobj.enters_all_fields_values_with_valid_data();
	}
	
	@When("Enters all Optional field values with invalid data")
	public void enters_all_optional_field_values_with_invalid_data() {
		addassignmentobj.enters_all_optional_field_values_with_invalid_data();
	}

	@When("Enters all fileds values without program name")
	public void enters_all_fileds_values_without_program_name() throws InterruptedException {
		addassignmentobj.all_fields_without_pgm_nm();
		
	}
	@Then("Error message dispalys Program Name is missing")
	public void error_message_dispalys_program_name_is_missing() {
		
		addassignmentobj.error_message_dispalys_program_name_is_missing();
	}

	@When("Enters all fileds values without Batch Number")
	public void enters_all_fileds_values_without_batch_number() throws InterruptedException {
		addassignmentobj.enters_all_fileds_values_without_batch_number();
		
	}

	@Then("Error message dispalys Batch Number is missing")
	public void error_message_dispalys_batch_number_is_missing() {
		addassignmentobj.error_message_dispalys_batch_number_is_missing();
		
	}

	@When("Enters all fileds values without Assignment name")
	public void enters_all_fileds_values_without_assignment_name() throws InterruptedException {
		addassignmentobj.enters_all_fileds_values_without_assignment_name();
	}

	@Then("Error message dispalys Assignment name is missing")
	public void error_message_dispalys_assignment_name_is_missing() {
		addassignmentobj.error_message_dispalys_assign_name_is_missing();
		
	}

	@When("Enters all fileds values withoutAssignment Duedate")
	public void enters_all_fileds_values_without_assignment_duedate() throws InterruptedException {
	addassignmentobj.enters_all_fileds_values_without_assignment_duedate();
	}

	@Then("Error message dispalys Assignment Duedate is missing")
	public void error_message_dispalys_assignment_duedate_is_missing() {
		addassignmentobj.error_message_dispalys_assignment_duedate_is_missing();
	}

	@When("Enters all fileds values without grade by")
	public void enters_all_fileds_values_without_grade_by() throws InterruptedException {
		addassignmentobj.enters_all_fileds_values_without_grade_by();
	}

	@Then("Error message dispalys Grade by is missing")
	public void error_message_dispalys_grade_by_is_missing() {
		addassignmentobj.error_message_dispalys_grade_by_is_missing();
		
	}

	@When("Enters all fileds values with passed date")
	public void enters_all_fileds_values_with_passed_date() throws InterruptedException {
		addassignmentobj.enters_all_fileds_values_with_passed_date();
		
	}

	@Then("Error message dispalys Assignment can not created for the passed date")
	public void error_message_dispalys_assignment_can_not_created_for_the_passed_date() {
		addassignmentobj.error_message_dispalys_assignment_can_not_created_for_the_passed_date();
	}

	@When("Clicks on date from date picker")
	public void clicks_on_date_from_date_picker() throws InterruptedException {
		addassignmentobj.clicks_on_date_from_date_picker();
		
		

	}

	@Then("verify class date and selected date are same")
	public void verify_class_date_and_selected_date_are_same() {
		addassignmentobj.verify_class_date_and_selected_date_are_same();
	}

	@Then("verify date format mm\\/dd\\/yyyy")
	public void verify_date_format_mm_dd_yyyy() {
		addassignmentobj.verify_date_format_mm_dd_yyyy();
	}

	@When("Clicks on next arrow in date picker")
	public void clicks_on_next_arrow_in_date_picker() {
		addassignmentobj.clicks_on_next_arrow_in_date_picker();
	}

	@Then("Next month calendar displays")
	public void next_month_calendar_displays() {
		addassignmentobj.next_month_calendar_displays();
	}

	@When("Clicks on previous arrow in date picker")
	public void clicks_on_previous_arrow_in_date_picker() {
		addassignmentobj.clicks_on_previous_arrow_in_date_picker();
	}

	@Then("Previous month calendar displays")
	public void previous_month_calendar_displays() {
		addassignmentobj.previous_month_calendar_displays();
	}

	@Then("Displays current date")
	public void displays_current_date() {
		addassignmentobj.displays_current_date();
	    
	}

	@Then("Displays selected date in date picker")
	public void displays_selected_date_in_date_picker() throws InterruptedException {
		addassignmentobj.displays_selected_date_in_date_picker();
	}

	@When("Clicks on cancel button with entering values in fields")
	public void clicks_on_cancel_button_with_entering_values_in_fields() throws InterruptedException {
		addassignmentobj.clicks_on_cancel_button_with_entering_values_in_fields();
	}

	
	

	@Then("Verify new assignment created in the data table")
	public void verify_new_assignment_created_in_the_data_table(int row,int cell) throws EncryptedDocumentException, IOException {
		
		addassignmentobj.verify_new_assignment_created_in_the_data_table(row, cell);
	}

	@When("Clicks on cancel button without entering values in fields")
	public void clicks_on_cancel_button_without_entering_values_in_fields() {
		addassignmentobj.clicks_on_cancel_button_without_entering_values_in_fields();
	}

}
