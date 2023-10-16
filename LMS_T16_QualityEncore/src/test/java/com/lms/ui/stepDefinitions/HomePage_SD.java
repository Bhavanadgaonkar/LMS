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

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Logger;
import com.lms.ui.util.LoggerLoad;

public class HomePage_SD {
	private DriverFactory drf= new DriverFactory();
	private HomePage_obj hmpg= new HomePage_obj(DriverFactory.getDriver());


	@Given("Admin launch the browser")
	public void admin_launch_the_browser() {
		
		drf.getDriver();
	   
	}

	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() {
		DriverFactory.getDriver().get(drf.property.getProperty("APP_URL"));
	  
	   
	}

	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {
		
		 String title=hmpg.open_portallink();
		    LoggerLoad.info(title);
		    System.out.println("The title of launch portal is:"+title);
		    String expectedtitle="Home Page" ;
			Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("Admin gives the invalid LMS portal URL")
	public void admin_gives_the_invalid_lms_portal_url() {
		
		DriverFactory.getDriver().get(drf.property.getProperty("APP_URL_INVALID"));

	}

	@Then("Admin should recieve https404 page not found error")
	public void admin_should_recieve_https404_page_not_found_error() {
		String title=hmpg.open_portallink();
	    LoggerLoad.info(title);
	    System.out.println("The title of launch portal is:"+title);
	    Assert.assertTrue(title.contains("404"));
	   
	}

	@Then("HTTP response >equalto400 the link is broken")
	public void http_response_equalto400_the_link_is_broken() {
	    hmpg.check_brokenlinks();
	    LoggerLoad.info("Broken Links in the homepage are verified" );
	}



	@Then("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() {
		String ActualText= hmpg.verifyLoginText();
		String ExpectedText="Login";
		Assert.assertEquals(ExpectedText, ActualText);
		
		
		
	   
	}

	@Then("Admin should see correct logo of the LMS")
	public void admin_should_see_correct_logo_of_the_lms() {
		hmpg.Verify_Logo();
	   
	}

	@Then("Admin should see logo is properly aligned")
	public void admin_should_see_logo_is_properly_aligned() {
		int X =hmpg.verify_logo_alignment_X();
		int Y=hmpg.verify_logo_alignment_Y();
		LoggerLoad.info("X,Y - coordinates: " +  X + ", "+ Y);
		String XY= "("+ X + ", "+ Y+")";
		int GetX= hmpg.verify_logo_X();
		int GetY=hmpg.verify_logo_Y();
		LoggerLoad.info("X,Y - coordinates: " + GetX + ", "+ GetY);
		String GetXY= "("+ GetX + ", "+ GetY+")";
        Assert.assertEquals(XY, GetXY);		
		
		
		
	   
	}

	@Then("Admin should see login button")
	public void admin_should_see_login_button() {
		Boolean display= hmpg.login_visible();
		LoggerLoad.info("Element is Displayed: " + display);

	    
	}

	@Then("Admin should able to click the Login button")
	public void admin_should_able_to_click_the_login_button() {
		hmpg.button_click();
	   
	}

}
