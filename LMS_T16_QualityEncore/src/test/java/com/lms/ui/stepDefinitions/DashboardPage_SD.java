package com.lms.ui.stepDefinitions;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;

import com.lms.ui.util.ExcelReader;
import com.lms.ui.driver.DriverFactory;
import com.lms.ui.pageObject.DashboardPage_obj;
import com.lms.ui.pageObject.HomePage_obj;
import com.lms.ui.pageObject.LoginPage_Validation_obj;
import com.lms.ui.pageObject.LoginPage_Verification_obj;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Logger;
import com.lms.ui.util.LoggerLoad;

public class DashboardPage_SD {
	
	private DriverFactory drf= new DriverFactory();
	private DashboardPage_obj dbpage= new DashboardPage_obj(DriverFactory.getDriver());
	
	@Then("Admin should see manage program as header")
	public void admin_should_see_manage_program_as_header() {
		
		String DashPageHeader = dbpage.verifyHeaderText() ;
String header= "Manage Program";
		Assert.assertEquals(DashPageHeader, header);
	   
	}

	@Then("Maximum navigation time in milliseconds defaults to thirty seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_thirty_seconds() throws InterruptedException {
		dbpage.ResponseTime();
	    
	}

	@Then("Admin should see LMS -Learning management system  as title")
	public void admin_should_see_lms_learning_management_system_as_title() {
		String DashPageTitle = dbpage.verifyLMSTitle() ;
		String title= "LMS -Learning management system";
				Assert.assertEquals(DashPageTitle, title);
	   
	}

	@Then("LMS title should be on the top left corner of page")
	public void lms_title_should_be_on_the_top_left_corner_of_page() {
		String align =dbpage.LMSTitleAlignment();
		Assert.assertEquals("left",align);
	   
	}

	@Then("Admin should see correct spelling in navigation bar text")
	public void admin_should_see_correct_spelling_in_navigation_bar_text() {
		String[] correctSpellings = {"Student","Program","Batch","Class","User","Assignment","Attendance","Logout"};
		for (String spelling : correctSpellings)
		{
		Assert.assertTrue(dbpage.getNavigationBarText().contains(spelling));
		}
	   
	}

	@Then("Admin should see correct spelling and space in LMS title")
	public void admin_should_see_correct_spelling_and_space_in_lms_title() {
		String expectedLmsTitle = "LMS-Learning Management System";
		Assert.assertEquals(expectedLmsTitle, dbpage.TitleText());
	}

	@Then("Admin should see the navigation bar text on the top right side")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
		String align= dbpage.NavigationAlignment();
		Assert.assertEquals("Right",align);
		   
	}

	@Then("Admin should see student in the first place")
	public void admin_should_see_student_in_the_first_place() {
	    dbpage.Student_Positioning();
	}

	@Then("Admin should see program in the second place")
	public void admin_should_see_program_in_the_second_place() {
	   dbpage.Program_Positioning();
	}

	@Then("Admin should see batch in the third place")
	public void admin_should_see_batch_in_the_third_place() {
		dbpage.Batch_Positioning();
	}

	@Then("Admin should see class in the fourth place")
	public void admin_should_see_class_in_the_fourth_place() {
		dbpage.Class_Positioning();
	}

	@Then("Admin should see user in the  fifth user")
	public void admin_should_see_student_in_the_fifth_user() {
		dbpage.User_Positioning();
	}

	@Then("Admin should see Assignment in the  sixth assignment")
	public void admin_should_see_student_in_the_sixth_assignment() {
	   dbpage.Assignment_Positioning();
	}

	@Then("Admin should see Attendance in the  seventh attendance")
	public void admin_should_see_student_in_the_seventh_attendance() {
	   dbpage.Attendance_Positioning();
	}

	@Then("Admin should see logout in the eighth logout")
	public void admin_should_see_student_in_the_eighth_logout() {
	   dbpage.Logout_Positioning();
	}

	@Given("Admin is in dashboard page")
	public void admin_is_in_dashboard_page() {
		Assert.assertEquals("Dashboard Page", dbpage.getCurrentPageTitle());
	}

	@When("Admin click Logout button on navigation bar")
	public void admin_click_logout_button_on_navigation_bar() {
		dbpage.Logout();
	}

	@Then("Admin should land on login in page")
	public void admin_should_land_on_login_in_page() {
		Assert.assertEquals("Login Page", dbpage.getCurrentPageTitle());
	}


}
