package com.lms.ui.stepDefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidationOfEditAssignment {
	
	WebDriver driver;
	@When("Clicks on Edit button in data table")
	public void clicks_on_edit_button_in_data_table() {
		driver.findElement(By.xpath("//input[contains(text),'column-edit']")).click();
	}

	@Then("Appears edit popup window with heading Assignment Details")
	public void appears_edit_popup_window_with_heading_assignment_details() {
	   //driver.switchTo().window("Assignment Details");
		Set<String> s = driver.getWindowHandles();
	      // iterate handles
	      Iterator<String> i = s.iterator();
	      //child window handle id
	      String c = i.next();
	      //parent window handle id
	      String p = i.next();
	      // child window switch
	      driver.switchTo().window(c);
	      System.out.println("Page title of child window: "+ driver.getTitle());
		
	}

	@When("Clicks on Edit button from one row in data table")
	public void clicks_on_edit_button_from_one_row_in_data_table() {
		WebElement TogetRows = driver.findElement(By.xpath("//table[@id='users_table']/tbody"));
		List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
		System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
		
		//column
		WebElement ToGetColumns = driver.findElement(By.xpath("//table[@id='users_table']/tbody/tr"));

		List<WebElement> TotalColsList = ToGetColumns.findElements(By.tagName("td"));

		System.out.println("Total Number of Columns in the table are: "+TotalColsList.size());
		if(TotalRowsList.isEmpty());
		{
			System.out.println("There are 0 Assignments........can not able to edit............ ");
			
		}
	}
		
			
	@Then("Appears edit popup window with same row values in all fields")
	public void appears_edit_popup_window_with_same_row_values_in_all_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is in Edit assignment details popup window")
	public void admin_is_in_edit_assignment_details_popup_window() {
		 driver.switchTo().window("Assignment Details");
	}

	@When("Enters valid data in all mandatory fields")
	public void enters_valid_data_in_all_mandatory_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Updated assignment details added in data table")
	public void updated_assignment_details_added_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enters invalid data in all mandatory fields")
	public void enters_invalid_data_in_all_mandatory_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enters valid data in all fields")
	public void enters_valid_data_in_all_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Updated assignment details displays in data table")
	public void updated_assignment_details_displays_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enters invalid data in optional fields")
	public void enters_invalid_data_in_optional_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Error message dispalys Assignment can not updated for the passed date")
	public void error_message_dispalys_assignment_can_not_updated_for_the_passed_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify assignment updated in the data table")
	public void verify_assignment_updated_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
