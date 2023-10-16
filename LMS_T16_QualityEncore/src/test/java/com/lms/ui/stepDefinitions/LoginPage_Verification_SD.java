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
import com.lms.ui.pageObject.LoginPage_Verification_obj;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Logger;
import com.lms.ui.util.LoggerLoad;

public class LoginPage_Verification_SD {
	
	private DriverFactory drf= new DriverFactory();
	private LoginPage_Verification_obj lpverify= new LoginPage_Verification_obj(DriverFactory.getDriver());

	@Given("Admin is in home page")
	public void admin_is_in_home_page() {
		
		DriverFactory.getDriver().get(drf.property.getProperty("APP_URL"));
		String hmpgTitle= lpverify.open_homepage();
		String ExpectedTitle="Home Page";
		Assert.assertEquals(ExpectedTitle, hmpgTitle);
	    
	}

	@When("Admin clicks Login button")
	public void admin_clicks_login_button() {
		lpverify.login_Click();
	    
	}

	@Then("Admin should land on the login page")
	public void admin_should_land_on_the_login_page() {
		String loginTitle= lpverify.verify_loginTitle();
		String ExpectedTitle="Login";
		Assert.assertEquals(ExpectedTitle, loginTitle);
	    
	}

	@Then("HTTP response > equalto400 the link is broken")
	public void http_response_equalto400_the_link_is_broken() {
		lpverify.check_brokenlinks();
	    LoggerLoad.info("Broken Links in the homepage are verified" );
	}


	@Then("Admin should see Please login to LMS application in the header")
	public void admin_should_see_please_login_to_lms_application_in_the_header() {
		Boolean display= lpverify.header_verify();
		LoggerLoad.info("Element is Displayed: " + display);

	  
	}

	@Then("Admin should see two text field")
	public void admin_should_see_two_text_field() {
		Boolean display1=lpverify.usertxtField_verify();
		Boolean display2=lpverify.passtxtField_verify();
		LoggerLoad.info("Elements are Displayed: " + display1 + "," + display2);

	   
	}

	@Then("Admin should user in the first text field")
	public void admin_should_user_in_the_first_text_field() {
		String st=lpverify.verify_defaultUsertxt();
		LoggerLoad.info("The default value of User TextBox is " + st);

	}
	@Then("Admin should see asterik symbol next to user text")
	public void admin_should_see_asterik_symbol_next_to_user_text() {
		Boolean display3=lpverify.userastSymbol_verify();
		LoggerLoad.info("Element is Displayed: " +  display3);
	   
	}

	@Then("Admin should password in the second text field")
	public void admin_should_password_in_the_second_text_field() {
		String st1=lpverify.verify_defaultPasstxt();
		LoggerLoad.info("The default value of Password TextBox is " + st1);
	   
	}

	@Then("Admin should see asterik symbol next to password text")
	public void admin_should_see_asterik_symbol_next_to_password_text() {
		Boolean display3=lpverify.passastSymbol_verify();
		LoggerLoad.info("Element is Displayed: " +  display3);
	    
	}

	@Then("Admin should see input field on the centre of the page")
	public void admin_should_see_input_field_on_the_centre_of_the_page() {
	  String align = lpverify.user_alignment();
	  Assert.assertEquals("center", align);
	LoggerLoad.info("The user text alignment " + align);
	String align1 = lpverify.pass_alignment();
	  Assert.assertEquals("center", align1);
	LoggerLoad.info("The password text alignment " + align1);
	

	}

	@Then("Admin should see login button on the centre of the page")
	public void admin_should_see_login_button_on_the_centre_of_the_page() {
		String align3 = lpverify.login_alignment();
		  Assert.assertEquals("center", align3);
		LoggerLoad.info("The button alignment " + align3);
	  
	}

	@Then("Admin should see forgot username or password link")
	public void admin_should_see_forgot_username_or_password_link() {
		Boolean display3=lpverify.forgot_user_pass_verify();
		LoggerLoad.info("Element is Displayed: " +  display3);
	   
	}

	@Then("Admin should see reset password link")
	public void admin_should_see_reset_password_link() {
		Boolean display4=lpverify.reset_pass_verify();
		LoggerLoad.info("Element is Displayed: " +  display4);
	   
	}

	@Then("Admin should see user in gray color")
	public void admin_should_see_user_in_gray_color() {
		
		String usercolor[]=lpverify.user_text_color();
		Assert.assertTrue(usercolor[1].equals("808080"));
		
	
	  
	}

	@Then("Admin should see password in gray color")
	public void admin_should_see_password_in_gray_color() {
		String usercolor1[]=lpverify.pass_text_color();
		Assert.assertTrue(usercolor1[1].equals("808080"));
}

}
