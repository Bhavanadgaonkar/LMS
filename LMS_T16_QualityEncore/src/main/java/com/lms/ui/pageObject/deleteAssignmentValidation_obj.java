package com.lms.ui.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class deleteAssignmentValidation_obj {
	
	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	
	
	
	@FindBy(xpath="//input[contains(text),'column-delete']")
	WebElement deletebtn;
	@FindBy(id="yes-button")
	WebElement yesbtn;
	@FindBy(id="no-button")
	WebElement nobtn;
	
	
	
	public void clicks_on_delete_button_in_data_table() 
	{
		   deletebtn.click();
	}
	
	public void enables_delete_dialog_box() {
		
	    driver.switchTo().alert();
	}
	
	public void enables_yes_button_on_delete_alert_dialog_box() {
	    driver.switchTo().alert();
	    yesbtn.isEnabled();
	}
	
	public void enables_no_button_on_delete_alert_dialog_box() {
	    driver.switchTo().alert();
	    nobtn.isEnabled();
	}
	public void clicks_on_yes_button() {
	    driver.switchTo().alert().accept();
	}

	public void dispalys_assignment_page() {
	    driver.switchTo().window("Manage assignment page");
	}
	public void selected_assignment_details_are_deleted_from_data_table() {
		
	}
	public void clicks_on_no_button() {
    driver.switchTo().alert().dismiss();
}

}
