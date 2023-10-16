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

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Logger;
import com.lms.ui.util.LoggerLoad;

public class ForgotUsernamePassword_SD {
	private DriverFactory drf= new DriverFactory();
	private ForgotUserNamePassword_obj logpage= new ForgotUserNamePassword_obj(DriverFactory.getDriver());

	
	@When("Admin clicks forgot username or password link")
	public void admin_clicks_forgot_username_or_password_link() {
		logpage.userpasslink_click();
	}

	@Then("Admin should land on forgot username or password page")
	public void admin_should_land_on_forgot_username_or_password_page() {
		Assert.assertEquals("Forgot username or password page", logpage.getCurrentPageTitle());
	}

	@Then("Admin should see Email text in gray color")
	public void admin_should_see_email_text_in_gray_color() {
		String emailcolor[]=logpage.email_text_color();
		Assert.assertTrue(emailcolor[1].equals("808080"));
	}

	@Then("Admin should see Email in text field")
	public void admin_should_see_email_in_text_field() {
	   Assert.assertEquals("Email",logpage.emailtext());
	}

	@Then("Admin should see send Link  button")
	public void admin_should_see_send_link_button() {
		Boolean display3=logpage.sendlinkField_verify();
		LoggerLoad.info("Element is Displayed: " +  display3);
	}

	@Then("Admin should see asterik symbol need Email")
	public void admin_should_see_asterik_symbol_need_email() {
		Boolean display3=logpage.astSymbol_verify();
		LoggerLoad.info("Element is Displayed: " +  display3);
	}

	@Then("Admin should see send link button in center of the page")
	public void admin_should_see_send_link_button_in_center_of_the_page() {
		String align= logpage.ResetPasswordLinkAlignment();
		Assert.assertEquals("Center",align);
		   
	}
	
	@Given("Admin is in forgot username and password page")
	public void admin_is_in_forgot_username_and_password_page() {
	    String title = logpage.getCurrentPageTitle();
	    String Expectedtitle ="forgot username and password";
	    Assert.assertEquals(Expectedtitle, title);
	}

	@When("Admin enters valid email id and clicks send link button")
	public void admin_enters_valid_email_id_and_clicks_send_link_button() {
		logpage.getEmailText();
	}

	@Then("Admin should receive link in mail for reset username and password")
	public void admin_should_receive_link_in_mail_for_reset_username_password() throws IOException {
		String actualmess=logpage.mess_capture();
		String expectedmess="Email sent Successfully";
		 Assert.assertEquals(expectedmess, actualmess);
		 LoggerLoad.info("User Successfully received link in email ");
		
	}

	@When("Admin enters invalid email id and clicks send link button")
	public void admin_enters_invalid_email_id_and_clicks_send_link_button() {
	   logpage.getEmailText_invalid();
	}

	@Then("Admin should not receive link in mail for reset username and password")
	public void admin_should_not_receive_link_in_mail_for_reset_username_password() throws IOException {
		String actualmess=logpage.mess_capture();
		String expectedmess="Please Enter Valid Email Id";
		 Assert.assertEquals(expectedmess, actualmess);
		 LoggerLoad.info("Email Action Failed");
	}






}
