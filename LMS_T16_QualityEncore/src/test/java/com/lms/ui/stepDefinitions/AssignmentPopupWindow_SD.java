package com.lms.ui.stepDefinitions;

import com.lms.ui.pageObject.assignmentPopupWindow_obj;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentPopupWindow_SD {
	assignmentPopupWindow_obj popupwindowobj = new assignmentPopupWindow_obj();
	
	@Given("Logged on the LMS portal as admin")
	public void logged_on_the_lms_portal_as_admin() {
		popupwindowobj.loggedOnLMSWebsite();
		
		
	    
	}

	@Given("Clicks on assignment button on the navigation bar")
	public void clicks_on_assignment_button_on_the_navigation_bar() {
		
		popupwindowobj.clickOnAssignment();
	   
	}

	
	@Given("Admin is on manage assignment page")
	public void admin_is_on_manage_assignment_page() {
		popupwindowobj.adminOnManageAassignmentPpage();
	    
	}

	@When("Clicks on +add new assignment button")
	public void clicks_on_add_new_assignment_button() {
		popupwindowobj.ClickOnAddAssignmentbtn();
	   
	    
	}

	@Then("Navigates to AddEdit Assignment Page with heading Assignment details")
	public void navigates_to_add_edit_assignment_page_with_heading_assignment_details() {
		popupwindowobj.navigateaddEditAssignmentpage();
	    
	}

	@Then("verify input fields Text")
	public void verify_input_fields_text() {
		popupwindowobj.textFieldsToCheck();
	}
	

	@Then("verify text box presence")
	public void verify_text_box_presence() {
		popupwindowobj.textboxToCheck();
		
	}

	@Then("Verify dropdown option for Batch Number")
	public void verify_dropdown_option_for_batch_number() {
		popupwindowobj.dropdownOptionBatchNum();
			
	}

	@Then("Verify dropdown option for Program name")
	public void verify_dropdown_option_for_program_name() {
		popupwindowobj.dropdownOptionProgramNm();
	}

	@Then("Verify calender icon in assignment due date")
	public void verify_calender_icon_in_assignment_due_date() {
		popupwindowobj.DuedatecalenderIcon();
	}

	@Then("Displays save button")
	public void displays_save_button() {
		popupwindowobj.savebtn();
	}

	@Then("Displays cancel button")
	public void displays_cancel_button() {
		popupwindowobj.cancelbtn();
		
	}

	@Then("Displays close button")
	public void displays_close_button() {
		popupwindowobj.closebtn();
	}
}
