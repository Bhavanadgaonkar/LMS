package com.lms.ui.stepDefinitions;



import com.lms.ui.pageObject.validationSortFunct_obj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateSortFunct_SD {
	validationSortFunct_obj sortobj=new validationSortFunct_obj();
	
	@When("Clicks on assignment name column header to sort")
	public void clicks_on_assignment_name_column_header_to_sort() {
		sortobj.clicks_on_assignment_name_column_header_to_sort();
	   
	}
	@Then("Displays data tables sorts in ascending order")
	public void displays_data_tables_sorts_in_ascending_order() {
		//  List<String> AssignmentNameList = null;
		sortobj.displays_data_tables_sorts_in_ascending_order();
	//	Assert.assertTrue(status);
	}

	@Then("Displays data tables sorts in descending order")
	public void displays_data_tables_sorts_in_descending_order() {
		sortobj.displays_data_tables_sorts_in_descending_order();
		   
	}

	@Given("Admin is on Manage Class Page")
	public void admin_is_on_manage_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
