package com.lms.ui.stepDefinitions;

import org.junit.Assert;

import com.lms.ui.driver.DriverFactory;
import com.lms.ui.pageObject.UserPageValidation_Pages;
import com.lms.ui.util.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserPageValidation_StepDef {
	
	 private DriverFactory drf= new DriverFactory();
		 UserPageValidation_Pages UVP= new UserPageValidation_Pages(DriverFactory.getDriver());
		
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		UVP.DashBoard();
	}

	@When("Admin clicks User from navigation bar")
	public void admin_clicks_user_from_navigation_bar() {
		UVP.User();
	}

	@Then("Admin should see the Manage User in the URL")
	public void admin_should_see_the_manage_user_in_the_url() {
	String manageuserTitle=	UVP.verifyManageUserTitle();
		  LoggerLoad.info(manageuserTitle);
	        String expectedManagePageTitle="Manage user";
	       Assert.assertEquals(manageuserTitle,expectedManagePageTitle);
	      
	       LoggerLoad.info("---------Manage user Title verified-------");
	}

	@Then("Admin should see the Manage User in the header")
	public void admin_should_see_the_manage_user_in_the_header() {
		UVP.verifyUserTableHeader();
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		UVP.paginationchk();
	}

	@Then("Admin Should see the data table with headers Id, Name, location, Phone Number, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_headers_id_name_location_phone_number_edit_delete() {
		UVP.verifyUserTableHeader();
	}

	@Then("Admin should be able to see the Delete icon button that is disabled")
	public void admin_should_be_able_to_see_the_delete_icon_button_that_is_disabled() {
		UVP.verifyDeletebutton();
	}

	@Given("Admin is on dashboard page after Loginv")
	public void admin_is_on_dashboard_page_after_loginv() {
		boolean status =UVP.DashBoard();
		Assert.assertTrue(status);
	}

	@Then("Admin should be able to see the + A New User button")
	public void admin_should_be_able_to_see_the_a_new_user_button() {
		UVP.verifyNewUser();
		
	}

	@Then("Admin should be able to see the + Assign staff button")
	public void admin_should_be_able_to_see_the_assign_staff_button() {
		UVP.verifyAssignstaff();
	}

	@Then("Admin should be able to see the search text box")
	public void admin_should_be_able_to_see_the_search_text_box() {
		UVP.verifysearchTextbox();
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
		UVP.verifyCheckBox();
	}

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
		UVP.verifyEditIcon();
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
		UVP.verifyDeleteIcon();
	}

	@Given("Admin is on dashboard page after Login and Admin clicks User from navigation bar")
	public void admin_is_on_dashboard_page_after_login_and_admin_clicks_user_from_navigation_bar() {
		UVP.User();
	}

	@When("Admin clicks + A New User button")
	public void admin_clicks_a_new_user_button() {
		UVP.newuser();
	}

	@Then("A new pop up with User details appears")
	public void a_new_pop_up_with_user_details_appears() {
		boolean status=UVP.PopUp();
		Assert.assertTrue(status);
	}


}
