package com.lms.ui.stepDefinitions;

import com.lms.ui.driver.DriverFactory;
import com.lms.ui.pageObject.DeleteMultipleBatch_Pages;
import com.lms.ui.util.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Delete_Multiple_Batches_StepDef {
	
	private DriverFactory drf= new DriverFactory();
	DeleteMultipleBatch_Pages DMB= new DeleteMultipleBatch_Pages(DriverFactory.getDriver());
	
	@Given("None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected() {
		LoggerLoad.info("----none of the check box is selected ----");
	}

	@Then("The delete icon under the Manage Batch header should be disabled")
	public void the_delete_icon_under_the_manage_batch_header_should_be_disabled() {
		DMB.verifyDelete();
	}

	@Given("One of the checkbox\\/ row is selected")
	public void one_of_the_checkbox_row_is_selected() {
		DMB.singlecheckrow();
	}

	@When("Click delete icon below Manage Batch header")
	public void click_delete_icon_below_manage_batch_header() {
		DMB.Clickdeleteicon();
	}

	@Then("The respective row in the data table is deleted")
	public void the_respective_row_in_the_data_table_is_deleted() {
		DMB.Multiplecheckbox();
	}

	@Given("Two or more checkboxes\\/row is selected")
	public void two_or_more_checkboxes_row_is_selected() {
		DMB.Clickdeleteicon();
		LoggerLoad.info("----Row is deleted from the dataTable ----");
	}


}
