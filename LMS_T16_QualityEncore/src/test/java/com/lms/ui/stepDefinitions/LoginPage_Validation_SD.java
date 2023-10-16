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

public class LoginPage_Validation_SD {
	private DriverFactory drf= new DriverFactory();
	private LoginPage_Validation_obj lpvalidate= new LoginPage_Validation_obj(DriverFactory.getDriver());
	
	@Given("Admin is in login page")
	public void admin_is_in_login_page() {
		DriverFactory.getDriver().get(drf.property.getProperty("APP_URL"));
		String loginTitle= lpvalidate.open_loginpage();
		String ExpectedTitle="Login";
		Assert.assertEquals(ExpectedTitle, loginTitle);
	    
	}

	@When("Admin enter valid credentials  and clicks login button")
	public void admin_enter_valid_credentials_and_clicks_login_button() {
		String uname=drf.property.getProperty("UNAME");
		String pass = drf.property.getProperty("PASSWORD");
		lpvalidate.valid_login_details(uname, pass);
	}

	@Then("Admin should land on dashboard page")
	public void admin_should_land_on_dashboard_page() {
		String dbTitle= lpvalidate.dashboard_Title();
		String ExpectedTitle="Login";
		Assert.assertEquals(ExpectedTitle, dbTitle);
	}

	@When("Admin enter invalid credentials  and clicks login button")
	public void admin_enter_invalid_credentials_and_clicks_login_button() {
		String uname=drf.property.getProperty("INVALIDUNAME");
		String pass = drf.property.getProperty("IVALIDPASSWORD");
		lpvalidate.valid_login_details(uname, pass);
		
		
	}

	@Then("Error message please check username\\/password")
	public void error_message_please_check_username_password() throws IOException {
	   String error= lpvalidate.errormess_capture();
	   String Expectederror= "please check username/password";
	   Assert.assertEquals(Expectederror, error);
	}

	@When("Admin enter valid username  and clicks login button")
	public void admin_enter_valid_username_and_clicks_login_button() {
		String uname=drf.property.getProperty("UNAME");
		lpvalidate.valid_user_details(uname);
	    
	}

	@Then("Error message please check password")
	public void error_message_please_check_password() throws IOException {
		String error= lpvalidate.errormess_capture();
		   String Expectederror= "please check password";
		   Assert.assertEquals(Expectederror, error);
	}

	@When("Admin enter valid  password  and clicks login button")
	public void admin_enter_valid_password_and_clicks_login_button() {
		String pass = drf.property.getProperty("PASSWORD");
		lpvalidate.valid_pass_details(pass);
	}

	@Then("Error message please check username")
	public void error_message_please_check_username() throws IOException {
		String error= lpvalidate.errormess_capture();
		   String Expectederror= "please check username";
		   Assert.assertEquals(Expectederror, error);
	}

	@When("Admin enter blank in username and clicks login button")
	public void admin_enter_blank_in_username_and_clicks_login_button() {
		String uname=" ";
		String pass = drf.property.getProperty("PASSWORD");
		lpvalidate.valid_login_details(uname, pass);
	}

	@When("Admin enter blank in password  and clicks login button")
	public void admin_enter_blank_in_password_and_clicks_login_button() {
		String uname=drf.property.getProperty("UNAME");
		String pass = " ";
		lpvalidate.valid_login_details(uname, pass);
	}

	@When("Admin clicks Login button with empty values in both columns")
	public void admin_clicks_login_button_with_empty_values_in_both_columns() {
		String uname=" ";
		String pass = " ";
		lpvalidate.valid_login_details(uname, pass);
	}

	@When("Admin enter valid credentials and clicks login button through keyboard")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_keyboard() {
		String uname=drf.property.getProperty("UNAME");
		String pass = drf.property.getProperty("PASSWORD");
		lpvalidate.valid_login_details_keyboardAction(uname, pass);
	}

	@When("Admin enter valid credentials  and clicks login button through mouse")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_mouse() {
		String uname=drf.property.getProperty("UNAME");
		String pass = drf.property.getProperty("PASSWORD");
		lpvalidate.valid_login_details(uname, pass);
	}

	
	

}
