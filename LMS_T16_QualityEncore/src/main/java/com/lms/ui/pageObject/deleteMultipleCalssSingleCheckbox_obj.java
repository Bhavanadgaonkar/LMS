package com.lms.ui.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class deleteMultipleCalssSingleCheckbox_obj {
	
	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	@FindBy(css="input[id='isClassSelected']")
	List<WebElement> checkboxes;
	
	@FindBy(xpath="//button[contains(text),'header-delete-icon']")
	WebElement deleteicon;
	
	
	public void selects_single_checkbox_with_multipleclass_in_data_table() {
		
		
		   for(int i=0;i<checkboxes.size();i++)
		   {
			   if(checkboxes.toString().equalsIgnoreCase("17") && checkboxes.toString().equalsIgnoreCase("18"))
					   if(checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled())
				{
		                       System.out.println("Checkbox is displayed at index:"+i+" Clicking on it now..............");
		                       checkboxes.get(i).click();
				}
		   }
	}	

	
       public void Admin_is_in_delete_dialog_box_alert()
       {
		
	    driver.switchTo().alert();
	   } 
       public void navigateManageAssignmentpage()
		{
			driver.navigate().to("https://www.lms.com/assignment/manage-assignment-page");
		}
	   
       public void admin_clicks_on_delete_button_under_header()
   	{ 
    	   if(deleteicon.isEnabled())
   		   deleteicon.click();
   	}
       public void enables_yes_button_on_delete_alert_dialog_box() {
   	    driver.switchTo().alert().accept();
   	}
   	
   	
   	
   	
   	
   	public void enables_no_button_on_delete_alert_dialog_box() {
   	    driver.switchTo().alert().dismiss();
   	}
     
       
}
