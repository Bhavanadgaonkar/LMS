package com.lms.ui.stepDefinitions;



import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.lms.ui.pageObject.paginationAssignment_obj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaginationAssignment_SD {
	paginationAssignment_obj pageobj=new paginationAssignment_obj();
	

	@Given("Admin is on Dashboard page")
	public void admin_is_on_dashboard_page() {
		
		pageobj.admin_is_on_dashboard_page();
	}
	
	
	   

	@When("Clicks on Assignment button on navigation bar")
	public void clicks_on_assignment_button_on_navigation_bar() {
		pageobj.clicks_on_assignment_button_on_navigation_bar();
	}
		
	

	@Then("Displays one page")
	public void displays_page() {
		pageobj.displays_page();
	    
	    
	}
/*
	@When("Entries are more than 5")
	public void entries_are_more_than() {
		pageobj.entries_are_more_than();
		
	}*/

	@Then("Enable the right arrow")
	public void enable_the_right_arrow() {
		pageobj.enable_the_right_arrow();
		
	}

	@When("Entries are more than 5 on page two")
	public void entries_are_more_than_on_page_two() {
		pageobj.entries_are_more_than_on_page_two();
		
		
		
		
		
	}

	@Then("enable the left arrow")
	public void enable_the_left_arrow() {
		pageobj.enable_the_left_arrow();
		
	}

	@When("Entries are more than 5 on page one")
	public void entries_are_more_than_on_page_one() {
		pageobj.entries_are_more_than_on_page_one();
		
	}
	
	@Then("disable the left arrow")
	public void disable_the_left_arrow() {
		pageobj.disable_the_left_arrow();
		
	}
	
	

	
	

	@Then("enable pagination control")
	public void enable_pagination_control() {
		pageobj.enable_pagination_control();
		
		
	}

//	@When("Entries are less than {int}")
//	public void entries_are_less_than(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Then("disable pagination control")
	public void disable_pagination_control() {
		pageobj.disable_pagination_control();
		
	}
	@Given("Admin is on Manage assignment page")
	public void admin_is_on_manage_assignment_page() {
		pageobj.admin_is_on_manage_assignment_page();
	   
	}

	@When("clicks on +Add new assignment button")
	public void clicks_on_add_new_assignment_button() {
		pageobj.clicks_on_add_new_assignment_button();
		
	}

	@Given("Admin is in add assignment details popup window")
	public void admin_is_in_add_assignment_details_popup_window() {
		pageobj.admin_is_in_add_assignment_details_popup_window();
		
	}

	@When("Creates six new assignments")
	public void creates_six_new_assignments() throws InterruptedException {
		pageobj.creates_six_new_assignments();
		
	}

	@When("Entries are more than 5")
	public void entries_are_more_than1 () {
		pageobj.entries_are_more_than1();
		
	}

	@Then("enable next page")
	public void enable_next_page() {
		pageobj.disable_next_page();
	   
	   
	}

	@When("Entries are less than 5 ")
	public void entries_are_less_than() 
	{
		pageobj.entries_are_less_than();
	}
	

	@Then("disable next page")
	public void disable_next_page() {
		pageobj.disable_next_page();
		
	}
}




