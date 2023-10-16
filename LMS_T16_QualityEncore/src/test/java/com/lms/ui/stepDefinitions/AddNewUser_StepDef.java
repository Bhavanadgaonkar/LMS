package com.lms.ui.stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.lms.ui.driver.DriverFactory;
import com.lms.ui.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewUser_StepDef {
	 private DriverFactory drf= new DriverFactory();
		 com.lms.ui.pageObject.AddNewUser_Pages ANU= new  com.lms.ui.pageObject.AddNewUser_Pages (DriverFactory.getDriver());

	/*	 
		 @Given("The edit icon on row level in data table is enabled")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled() {
		ANU.EditIcon();

	}

	@When("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() {
		ANU.clickEdit();
	}

	@Then("A new pop up with User details appears")
	public void a_new_pop_up_with_user_details_appears() throws InterruptedException {
		ANU.PopUp();

	}

	

	@When("Update the fields with valid values and click submit")
	public void update_the_fields_with_valid_values_and_click_submit(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
	    
		ExcelReader reader= new ExcelReader();
		List<Map<String,String>>testData =reader.getData("/Users/gutha/git/LMS_T16_QualityEncore/LMS_T16_QualityEncore/Data/User.xlsx", sheetName);
		String Name = testData.get(rowNumber).get("Firstname");
		String programName = testData.get(rowNumber).get("Lastname");
		String Location = testData.get(rowNumber).get("Location");
		String Linkedlnurl = testData.get(rowNumber).get("Linkedlnurl");
		ANU.addingNewUser();
	}

	@Then("The updated user details should appear on the data table")
	public void the_updated_user_details_should_appear_on_the_data_table() {
		ANU.Update();
	}

	@When("Update the fields with invalid values and click submit")
	public void update_the_fields_with_invalid_values_and_click_submit() {
		ANU.submit();

	}

	/*
	@When("Erase data from mandatory field")
	public void erase_data_from_mandatory_field() {
		ANU.mandatory();

	}

	@When("Erase data from description field")
	public void erase_data_from_description_field() {
		ANU.Cleardescription();
	}

*/

}
