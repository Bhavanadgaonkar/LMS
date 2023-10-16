package com.lms.ui.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class deleteMultipleClass_obj {
	
	
	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	@FindBy(xpath="//button[contains(text),'header-delete-icon']")
	WebElement deleteicon;
	@FindBy(css="input[id='isClassSelected']")
	List<WebElement> checkboxes;
	
	public void admin_clicks_on_delete_button_under_header()
	{
		deleteicon.click();
	}
	
	public void selects_multiple_checkbox_with_multiple_class_in_data_table() {
		
		
		   for(int i=0;i<checkboxes.size();i++)
		   {
			   if(checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled())
				{
		                       System.out.println("Checkbox is displayed at index:"+i+" Clicking on it now..............");
		                       checkboxes.get(i).click();
				}
		   }
			   
		}
	public void enables_yes_button_on_delete_alert_dialog_box() {
	    driver.switchTo().alert().accept();
	}
	
	
	public void redirect_assignment_page() {
	    driver.switchTo().window("Manage Assignment Page");
	    
	}
	
	
	public void enables_no_button_on_delete_alert_dialog_box() {
	    driver.switchTo().alert().dismiss();
	}
   public void Admin_is_in_delete_alert() {
		
	    driver.switchTo().alert();
	}  

}
