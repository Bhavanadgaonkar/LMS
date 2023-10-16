package com.lms.ui.stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.lms.ui.driver.DriverFactory;
import com.lms.ui.pageObject.EditNewUser_Pages;
import com.lms.ui.util.ExcelReader;
import com.lms.ui.util.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditNewUser_StepDef {
	private DriverFactory drf= new DriverFactory();
	 EditNewUser_Pages ENU= new EditNewUser_Pages(DriverFactory.getDriver());
	
	@Given("The edit icon on row level in data table is enabled")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled() {
		ENU.verifyEditIcon();
	}

	@When("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() {
		ENU.ClickEditIcon();
	}

	@Then("A new pop up with Batch details appears")
	public void a_new_pop_up_with_batch_details_appears() throws InterruptedException {
		ENU.PopUp();

	}

	

	@When("Update the fields with valid values and click save")
	public void update_the_fields_with_valid_values_and_click_save(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader= new ExcelReader();
		List<Map<String,String>>testData =reader.getData("/Users/gutha/git/WeNinjas_RPMP/Data/DSAlgo_SignIn.xlsx", sheetName);
		String FirstName = testData.get(rowNumber).get("firstName");
		String Lastname = testData.get(rowNumber).get("lastName");
		String Location = testData.get(rowNumber).get("Location");
		ENU.Clicksave();
		
	}

	@Then("The updated user details should appear on the data table")
	public void the_updated_user_details_should_appear_on_the_data_table() {
		
		LoggerLoad.info("----Updated the batch details----");
	}

	@When("Update the fields with invalid values and click save")
	public void update_the_fields_with_invalid_values_and_click_save() {
		ENU.Clicksave();
	}

	@Then("Error message should appear")
	public void error_message_should_appear() {
		ENU.invalidCredentialMessg();

	}

	@When("Erase data from mandatory field")
	public void erase_data_from_mandatory_field() {
		ENU.cleartext();

	}

	@When("Erase data from description field")
	public void erase_data_from_description_field() {
		ENU.cleardescription();

	}


}
