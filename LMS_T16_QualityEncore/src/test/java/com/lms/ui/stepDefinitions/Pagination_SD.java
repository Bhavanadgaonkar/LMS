package com.lms.ui.stepDefinitions;

import org.junit.Assert;

import com.lms.ui.driver.DriverFactory;
import com.lms.ui.pageObject.Program_obj;

import io.cucumber.java.en.*;

public class Pagination_SD extends DriverFactory {
	
	public static Program_obj pgm =new Program_obj(dr);
	@When("Admin clicks Next page link on the program table")
	public void admin_clicks_next_page_link_on_the_program_table() throws InterruptedException {
		
		pgm.paginationValidation();
		pgm.clkNextLink();
	}

	@Then("Admin should see the Pagination has {string} link")
	public void admin_should_see_the_pagination_has_link(String next_Text) {
		String next = pgm.clkNextLinkValidation();
		Assert.assertTrue(next.contains(next_Text));
	}
	
	@When("Admin clicks Last page link")
	public void admin_clicks_last_page_link() {
	    pgm.clkLastPageIcon();
	}

	@Then("Admin should see the last page record on the table with Next page link are disabled")
	public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled() {
	    pgm.disabledNextLink();
	}

	@Given("Admin is on last page of Program table")
	public void admin_is_on_last_page_of_program_table() {
		pgm.clkLastPageIcon();
	}

	@When("Admin clicks First page link")
	public void admin_clicks_first_page_link() {
	    pgm.clkFirstPageIcon();
	}

		
	@Then("Admin should see the previous page record on the table with pagination has {string} page link")
	public void admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_page_link(String previousText) {
		String previous = pgm.previousLinkValidation();
		Assert.assertTrue(previous.contains(previousText));
	}


	@Given("Admin is on Previous Program page")
	public void admin_is_on_previous_program_page() {
	    pgm.previousLinkValidation();
	}

	@When("Admin clicks Start page link")
	public void admin_clicks_start_page_link() {
		pgm.clkStartPage();
	   	}

	@Then("Admin should see the very first page record on the table with Previous page link are disabled")
	public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled() {
		pgm.disabledNextLink();
	}



}
