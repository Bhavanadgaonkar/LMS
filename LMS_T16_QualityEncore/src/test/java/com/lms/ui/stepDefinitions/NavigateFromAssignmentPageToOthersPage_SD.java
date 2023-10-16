package com.lms.ui.stepDefinitions;



import com.lms.ui.pageObject.navigationFromAssignmentPageToOthersPage_obj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigateFromAssignmentPageToOthersPage_SD {
	
	navigationFromAssignmentPageToOthersPage_obj navigatepageobj=new navigationFromAssignmentPageToOthersPage_obj();
	@When("Logged in LMS portal as a admin")
	public void logged_in_lms_portal_as_a_admin() {
		navigatepageobj.logged_in_lms_portal_as_a_admin();
	}

	@Given("Admin is in manage assignment page")
	public void admin_is_in_manage_assignment_page() {
		navigatepageobj.admin_is_in_manage_assignment_page();
	    
	}

	@When("Clicks on Student button in navigation bar")
	public void clicks_on_student_button_in_navigation_bar() {
		navigatepageobj.clicks_on_student_button_in_navigation_bar();
	}

	@Then("Navigate to student page")
	public void navigate_to_student_page() {
		navigatepageobj.navigate_to_student_page();
		
	}

	@When("Clicks on Program button in navigation bar")
	public void clicks_on_program_button_in_navigation_bar() {
		navigatepageobj.clicks_on_program_button_in_navigation_bar();
	}

	@Then("Navigate to program page")
	public void navigate_to_program_page() {
		navigatepageobj.navigate_to_program_page();
	}

	@When("Clicks on Batch button in navigation bar")
	public void clicks_on_batch_button_in_navigation_bar() {
		navigatepageobj.clicks_on_batch_button_in_navigation_bar();
	}

	@Then("Navigate to batch page")
	public void navigate_to_batch_page() {
		navigatepageobj.navigate_to_batch_page();
	}

	@When("Clicks on User button in navigation bar")
	public void clicks_on_user_button_in_navigation_bar() {
		navigatepageobj.clicks_on_user_button_in_navigation_bar();
	}

	@Then("Navigate to user page")
	public void navigate_to_user_page() {
		navigatepageobj.navigate_to_user_page();
	}

	@When("Clicks on Class button in navigation bar")
	public void clicks_on_class_button_in_navigation_bar() {
		navigatepageobj.clicks_on_class_button_in_navigation_bar();
	}

	@Then("Navigate to class page")
	public void navigate_to_class_page() {
		navigatepageobj.navigate_to_class_page();
	}

	@When("Clicks on Attendance button in navigation bar")
	public void clicks_on_attendance_button_in_navigation_bar() {
		navigatepageobj.clicks_on_attendance_button_in_navigation_bar();
	}

	@Then("Navigate to attendance page")
	public void navigate_to_attendance_page() {
		navigatepageobj.navigate_to_attendance_page();
	}

	@When("Clicks on Login button in navigation bar")
	public void clicks_on_login_button_in_navigation_bar() {
		navigatepageobj.clicks_on_login_button_in_navigation_bar();
	}

	@Then("Navigate to login page")
	public void navigate_to_login_page() {
		navigatepageobj.navigate_to_login_page();
}
}