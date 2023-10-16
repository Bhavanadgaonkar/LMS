package com.lms.ui.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.lms.ui.driver.DriverFactory;
import com.lms.ui.util.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Batch_Validation_StepDef {
	

	
	
	 private DriverFactory drf= new DriverFactory();
		 com.lms.ui.pageObject.BatchPageValidation_Pages Bvp= new com.lms.ui.pageObject.BatchPageValidation_Pages(DriverFactory.getDriver());
		
	
	@Given("Admin is on the dashboard page after Login")
	public void admin_is_on_the_dashboard_page_after_login() {
		
		String managebatchTitle =Bvp.DashBoard();
		LoggerLoad.info(managebatchTitle);
		String expectedManagePageTitle = "Manage Batch";
		Assert.assertEquals(managebatchTitle, expectedManagePageTitle);
		
		LoggerLoad.info("---------Manage batch Title verified-------");
		}
	    
	@When("Admin clicks Batch from navigation bar")
	public void admin_clicks_batch_from_navigation_bar() {
	
		Bvp.Batchnavigation();
	}

	@Then("Admin should see the Manage Batch in the URL")
	public void admin_should_see_the_manage_batch_in_the_url() {
		String managebatchTitle= Bvp.verifyManageBatchTitle();
		LoggerLoad.info(managebatchTitle);
		String expectedManagePageTitle = "Manage Batch";
		Assert.assertEquals(managebatchTitle, expectedManagePageTitle);
		
		LoggerLoad.info("---------Manage batch Title verified-------");
	}

	@Then("Admin should see the Manage Batch in the headers")
	public void admin_should_see_the_manage_batch_in_the_headers() {
		Bvp.verifyHeaderText();
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		Bvp.paginationchk();
	}

	@Then("Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete")
	public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {
		LoggerLoad.info("----Admin can able to see the details----");
	}

	@Then("Admin should be able to see the Delete icon button that is disabled")
	public void admin_should_be_able_to_see_the_delete_icon_button_that_is_disabled() {
		Bvp.verifyDeleteIcon();
	}

	@Then("Admin should be able to see the + A New batch button")
	public void admin_should_be_able_to_see_the_a_new_batch_button() {
		Bvp.verifyNewBatch();
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
		
		Bvp.verifyCheckBox();
	}

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
		Bvp.verifyEditIcon();
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
		Bvp.verifyDeleteIcon();
	}

	@When("Admin clicks + A New Batch button")
	public void admin_clicks_a_new_batch_button() {
		Bvp.clicknewbatch();
	}
/*
	@Then("A new pop up with Batch details appears")
	public void a_new_pop_up_with_batch_details_appears() {
		 LoggerLoad.info("----Popup details can able to see----");
	}
*/



}
