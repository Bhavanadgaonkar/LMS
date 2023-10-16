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
import com.lms.ui.pageObject.ForgotUserNamePassword_obj;
import com.lms.ui.pageObject.HomePage_obj;
import com.lms.ui.pageObject.LoginPage_Validation_obj;
import com.lms.ui.pageObject.LoginPage_Verification_obj;
import com.lms.ui.pageObject.ResetPassword_obj;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Logger;
import com.lms.ui.util.LoggerLoad;

public class ResetPassword_SD {
	private DriverFactory drf= new DriverFactory();
	private ResetPassword_obj resetpage= new ResetPassword_obj(DriverFactory.getDriver());

	@When("Admin clicks reset password link")
	public void admin_clicks_reset_password_link() {
		resetpage.resetpass_click();
	}

	@Then("Admin should land on reset password page")
	public void admin_should_land_on_reset_password_page() {
	    String title= resetpage.getCurrentPageTitle();
	    String Expected= "Reset Password";
	    Assert.assertEquals(Expected,title);
	}

	@Then("Admin should see submit  button")
	public void admin_should_see_submit_button() {
		Boolean display3=resetpage.submitField_verify();
		LoggerLoad.info("Element is Displayed: " +  display3);
	}

	@Then("Admin should see submit button in center of the page")
	public void admin_should_see_submit_button_in_center_of_the_page() {
	   String Align= resetpage.SubmitAlignment();
	   Assert.assertEquals("Center", Align);
	}

	@Then("Admin should see two text box")
	public void admin_should_see_two_text_box() {
		Boolean display=resetpage.testField1_verify();
		LoggerLoad.info("Element is Displayed: " +  display);
		Boolean display2=resetpage.testField2_verify();
		LoggerLoad.info("Element is Displayed: " +  display2);
	}

	@Then("Admin should see Type in new password in the first label text")
	public void admin_should_see_type_in_new_password_in_the_first_label_text() {
	   String label1Text= resetpage.label1_Text();
	   String expected="Type in new password";
	   Assert.assertEquals(expected,label1Text);
	}

	@Then("Admin should see Retype password in the second label text")
	public void admin_should_see_retype_password_in_the_second_label_text() {
		 String label2Text= resetpage.label2_Text();
		   String expected="Retype password";
		   Assert.assertEquals(expected,label2Text);
	}

	@Then("Admin should see text box in disabled state")
	public void admin_should_see_text_box_in_disabled_state() {
		Boolean enabled=resetpage.testField1_verify_disabled();
		LoggerLoad.info("Element is disabled: " +  enabled);
	}

	@Given("Admin reset password page")
	public void admin_reset_password_page() {
		 String title= resetpage.getCurrentPageTitle();
		    String Expected= "Reset Password";
		    Assert.assertEquals(Expected,title);
	   
	}

	@When("Admin clicks on type in new password field")
	public void admin_clicks_on_type_in_new_password_field() {
		resetpage.textfield1_click();
	}

	@Then("Admin should see text box is enabled state")
	public void admin_should_see_text_box_is_enabled_state() {
		Boolean enabled=resetpage.testField1_verify_disabled();
		LoggerLoad.info("Element is enabled: " +  enabled);
	   
	}

	@When("Admin clicks on retype password field")
	public void admin_clicks_on_retype_password_field() {
		resetpage.textfield2_click();
	}

	@When("Admin enters same password on both field and clicks submit button")
	public void admin_enters_same_password_on_both_field_and_clicks_submit_button() {
	   resetpage.enter_password();
	}

	@Then("Admin should recieve Your password has been reset Please click here to login")
	public void admin_should_recieve_your_password_has_been_reset_please_click_here_to_login() throws IOException {
		String actualmess=resetpage.mess_capture();
		String expectedmess="Your password has been reset Please click here to login";
		 Assert.assertEquals(expectedmess, actualmess);
		 LoggerLoad.info("Password Reset Successful ");
	}

	@When("Admin enters same password on both field with invalid details and clicks submit button")
	public void admin_enters_same_password_on_both_field_with_invalid_details_and_clicks_submit_button() {
		
		resetpage.invalid_enter_password();
	}
	

	@Then("Error message Please try again")
	public void error_message_please_try_again() throws IOException {
		String actualmess=resetpage.mess_capture();
		String expectedmess="Error message Please try again";
		 Assert.assertEquals(expectedmess, actualmess);
		 LoggerLoad.info("Password Reset Failed ");
	}

	@When("Admin enters  empty details on both fieldand clicks submit button")
	public void admin_enters_empty_details_on_both_fieldand_clicks_submit_button() {
	   resetpage.empty_enter_password();
	}

	@When("Admin enters  mismatch values and clicks submit button")
	public void admin_enters_mismatch_values_and_clicks_submit_button() {
		   resetpage.mismatch_enter_password();

	}




}
