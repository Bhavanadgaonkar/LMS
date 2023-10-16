package com.lms.ui.stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.lms.ui.driver.DriverFactory;
import com.lms.ui.util.LoggerLoad;
import com.lms.ui.util.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_New_Batch_StepDef {
	
	  DriverFactory drf= new DriverFactory();
		com.lms.ui.pageObject.AddNewBatch_Pages ANB= new com.lms.ui.pageObject.AddNewBatch_Pages(DriverFactory.getDriver());
	
	  
	@Then("The pop up should include the fields Name, Number of classes and Description as text box,Program Name as drop down,Status as radio button,Number of classes as text box")
	public void the_pop_up_should_include_the_fields_name_number_of_classes_and_description_as_text_box_program_name_as_drop_down_status_as_radio_button_number_of_classes_as_text_box() throws InterruptedException {
		ANB.PopUp();
	}

	@When("Fill in all the fields except description with valid values and click save")
	public void fill_in_all_the_fields_except_description_with_valid_values_and_click_save(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader= new ExcelReader();
		List<Map<String,String>>testData =reader.getData("/Users/gutha/git/LMS_T16_QualityEncore/LMS_T16_QualityEncore/Data/Batch.xlsx\"", sheetName);
		String Name = testData.get(rowNumber).get("Name");
		String programName = testData.get(rowNumber).get("programName");
	
	}

	@Then("The newly added batch should be present in the data table in Manage Batch page")
	public void the_newly_added_batch_should_be_present_in_the_data_table_in_manage_batch_page() throws InvalidFormatException, IOException {
		 LoggerLoad.info("----Admin can able to see the newly added batch----");
	}

	@When("Fill in all the fields with valid values and click save")
	public void fill_in_all_the_fields_with_valid_values_and_click_save(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader= new ExcelReader();
		List<Map<String,String>>testData =reader.getData("/Users/gutha/git/LMS_T16_QualityEncore/LMS_T16_QualityEncore/Data/Batch.xlsx\"", sheetName);
		String Name = testData.get(rowNumber).get("Name");
		String programName = testData.get(rowNumber).get("programName");
		String Description = testData.get(rowNumber).get("Description");
		
	}

	@When("any of the fields have invalid values")
	public void any_of_the_fields_have_invalid_values() {
		 LoggerLoad.info("----invalid values----");
	}

/*	@Then("Error message should appear")
	public void error_message_should_appear() {
		ANB.invalidCredentialMessg();
	}

	@When("Any of the mandatory fields are blank")
	public void any_of_the_mandatory_fields_are_blank() {
		ANB.invalidCredentialMessg();
	}
*/



}
