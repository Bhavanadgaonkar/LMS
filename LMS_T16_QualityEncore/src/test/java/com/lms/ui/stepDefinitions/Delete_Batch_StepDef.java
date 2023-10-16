package com.lms.ui.stepDefinitions;

import com.lms.ui.driver.DriverFactory;
import com.lms.ui.pageObject.DeleteBatch_Pages;
import com.lms.ui.util.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Delete_Batch_StepDef {
	
	private DriverFactory drf= new DriverFactory();
	 DeleteBatch_Pages DBP= new DeleteBatch_Pages(DriverFactory.getDriver());

	@Given("The delete icon on row level in data table is enabled")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled() {
		DBP.verifyDeleteIcon();
	}

	@When("Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon() {
		DBP.Deleteicon();
	}

	@Then("Alert appears with yes and No option")
	public void alert_appears_with_yes_and_no_option() {
		DBP.alert();
	}

	

	@When("You click yes option")
	public void you_click_yes_option() {
		DBP.YesBtn();
	}

	@Then("Batch deleted alert pops and batch is no more available in data table")
	public void batch_deleted_alert_pops_and_batch_is_no_more_available_in_data_table() {
		 LoggerLoad.info("---------alert message batch is not available-------");
	}

	@When("you click No option")
	public void you_click_no_option() {
		DBP.NoBtn();
	}

	@Then("Batch is still listed in data table")
	public void batch_is_still_listed_in_data_table() {
		 LoggerLoad.info("---------alert message batch is  available-------");
	}
	
	

}
