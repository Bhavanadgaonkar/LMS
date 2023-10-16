package com.lms.ui.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.lms.ui.driver.DriverFactory;
import com.lms.ui.pageObject.StudentVerification_obj;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class All_student_SD {
	WebDriver driver =DriverFactory.getDriver();
	StudentVerification_obj  stdobj = new StudentVerification_obj(driver);
	
	@When("Admin clicks Student on the navigation bar")
	public void admin_clicks_student_on_the_navigation_bar() {
		stdobj.studentClickmet();
	    
	}

	@Then("Admin should see the Student details Page Title")
	public void admin_should_see_the_student_details_page_title() {
		stdobj.studentdetailtitle();
	    
	}

	@Then("Maximum navigation time in milliseconds, defaults to thirty seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_thirty_seconds() throws InterruptedException {
	stdobj.responseTimChk();    
	    
	}

	@Then("HTTP response >= {int} the link is broken")
	public void http_response_the_link_is_broken(Integer int1) {
	   stdobj.linktestmethod();
	    
	}

	/*@Then("Admin should see LMS -Learning management system  as title")
	public void admin_should_see_lms_learning_management_system_as_title() {
	    boolean status =stdobj.lmstitlechk();
	    Assert.assertTrue(status);   
	}*/

	@Then("Student Detail title should be in centre of the page")
	public void student_detail_title_should_be_in_centre_of_the_page() {
		boolean status =stdobj.studentdetailtitle();
		Assert.assertTrue(status);
	}

	@Then("two dropdowns should be present in the page")
	public void two_dropdowns_should_be_present_in_the_page() {
	  boolean status=  stdobj.studentnameDrpchk();
	    
	    Assert.assertTrue(status);
	    boolean status1=stdobj.studentbatchIdDrpchk();
	    Assert.assertTrue(status1);
	}

	@Then("Admin should see search box inside the drop down")
	public void admin_should_see_search_box_inside_the_drop_down() {
	  boolean status=  stdobj.studentnameDrpSearchchk();
	  Assert.assertTrue(status);
	}

	@Then("Admin should see search box inside  batch id drop down")
	public void admin_should_see_search_box_inside_batch_id_drop_down() {
	  boolean status=  stdobj.studentbatchIdSearchDrpchk();
		Assert.assertTrue(status);

	}
	

	@Then("Admin should see correct spelling select student name")
	public void admin_should_see_correct_spelling_select_student_name() {
	    
	    
	}

	@When("Admin select student name from the drop down")
	public void admin_select_student_name_from_the_drop_down() {
	    
	    
	}

	@Then("Admin shouldn not see select student name text")
	public void admin_shouldn_not_see_select_student_name_text() {
	    
	    
	}

	@When("Admin select batch id from the drop down")
	public void admin_select_batch_id_from_the_drop_down() {
	    
	    
	}

	@Then("Admin should see select batch id text")
	public void admin_should_see_select_batch_id_text() {
	    
	    
	}

	@When("Admin clicks select student name and  enters x alphabet in the search box")
	public void admin_clicks_select_student_name_and_enters_x_alphabet_in_the_search_box() {
	    
	    
	}

	@Then("Admin should see student name start with x is listed below")
	public void admin_should_see_student_name_start_with_x_is_listed_below() {
	    
	    
	}

	@When("Admin  clicks select batch id and enter x number in the search box")
	public void admin_clicks_select_batch_id_and_enter_x_number_in_the_search_box() {
	    
	    
	}

	@Then("Admin should see batch id start with x is listed below")
	public void admin_should_see_batch_id_start_with_x_is_listed_below() {
	    
	    
	}

	@When("Admin selects only student name")
	public void admin_selects_only_student_name() {
	    
	    
	}

	@Then("Student details should be displayed")
	public void student_details_should_be_displayed() {
	    stdobj.studentnameDrpchk();
	    
	}

	@When("Admin selects only  batch id")
	public void admin_selects_only_batch_id() {
	    
	    
	}

	@Then("Student details shouldn nott be displayed")
	public void student_details_shouldn_nott_be_displayed() {
	    
	    
	}

	@When("Admin selects  student name and batch id")
	public void admin_selects_student_name_and_batch_id() {
	    
	    
	}

	@Then("Particular student informations should be display")
	public void particular_student_informations_should_be_display() {
	    
	    
	}

}
