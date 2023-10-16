package com.lms.ui.stepDefinitions;

import org.openqa.selenium.Keys;

import com.lms.ui.pageObject.manageAssignmentPage_obj;
import com.lms.ui.util.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageAssignmentPage_SD {
	
	
	manageAssignmentPage_obj objmg = new manageAssignmentPage_obj();

@Given("Admin is on dashboard page after Login")
public void admin_is_on_dashboard_page_after_login() {
    objmg.dashboardpage();
}

@When("Admin clicks assignment button on the navigation bar")
public void admin_clicks_assignment_button_on_the_navigation_bar() {
   objmg.manageassignclickmethod();
}

@Then("See URL with Manage assignment")
public void see_url_with_manage_assignment() {
    objmg.urlwithmanageassignment();
}

@Then("Gets response time for navigation from dashboard to assignment page")
public void gets_response_time_for_navigation_from_dashboard_to_assignment_page() {
	objmg.gets_response_time_for_navigation_from_dashboard_to_assignment_page();
}

@Then("Verifys the header with Manage assignment")
public void verifys_the_header_with_manage_assignment() {
	objmg.verifystheheaderwithmanageassignment();
}

@When("Clicks assignment button on the navigation bar")
public void clicks_assignment_button_on_the_navigation_bar() {
	objmg.clicks_assignment_button_on_the_navigation_bar();
}

@When("Get all text from Manage assignment page")
public void get_all_text_from_manage_assignment_page() {
	objmg.get_all_text_from_manage_assignment_page();
}

@Then("Checks spellings for all the fields")
public void checks_spellings_for_all_the_fields() {
//	objmg.checks_spellings_for_all_the_fields();
}

@Then("Verify delete icon is disable")
public void verify_delete_icon_is_disable() {
	objmg.verify_delete_icon_is_disable();
}

@Then("Verify search bar on the manage assignment page")
public void verify_search_bar_on_the_manage_assignment_page() {
	objmg.verify_search_bar_on_the_manage_assignment_page();
}

@Then("Verify Add New Assignment button")
public void verify_add_new_assignment_button() {
	objmg.verify_add_new_assignment_button();
}

@Then("verify column headers")
public void verify_column_headers() {
	objmg.verify_column_headers();
}

@Then("Verify sort icon near column header")
public void verify_sort_icon_near_column_header() {
	objmg.verify_sort_icon_near_column_header();
}

@Then("Verify checkbox in all rows of data table when entries are available")
public void verify_checkbox_in_all_rows_of_data_table_when_entries_are_available() {
	objmg.verify_checkbox_in_all_rows_of_data_table_when_entries_are_available();
}

@Then("Get the text above the footer Showing  to of entries")
public void get_the_text_above_the_footer_showing_to_of_entries() {
//	objmg.validate_text_above_the_footer_Showing_zero_to_zero_of_zero_entries();
}

@Then("Get the text above the footer {string}")
public void get_the_text_above_the_footer(String string) {
	objmg.get_the_text_above_the_footer();
}

@Then("Verify the page numbers")
public void verify_the_page_numbers() {
	objmg.verify_the_page_numbers();
}
@When("enters assignment name")
public void enters_assignment_name()
{
	objmg.click_and_enters_assignment_name();
}

@When("enters assignment description")
public void enters_assignment_description()
{
	objmg.click_and_enters_assignment_description();
}

@When("enters assignment duedate")
	public void enters_assignment_duedate()
{
	objmg.click_and_enters_assignment_duedate();
	 
}
@When("enters grade value")
public void click_and_enters_grade()
{
	objmg.click_and_enters_grade();
	
}
@Then("Displays all assignemts details with assignment duedate" )
public void Display_all_assignemts_details_with_assignment_duedate() 
{
	objmg.Display_all_assignemts_details_with_assignment_duedate();
}

@Then("Displays all assignemts details with assignment name" )
public void Display_all_assignemts_details_with_assignment_name() 
{
	 
	objmg.Display_all_assignemts_details_with_assignment_name();
}
@Then("Displays all assignemts details with assignment grade" )
public void Display_all_assignemts_details_with_grade() 
{
	objmg.Display_all_assignemts_details_with_grade();
	 
}
@Then("Displays all assignemts details with assignment description" )
public void Display_all_assignemts_details_with_assignment_description() 
{
	
	objmg.Display_all_assignemts_details_with_assignment_description();
}
	 
}
