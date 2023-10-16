package com.lms.ui.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class deleteSingleClass_obj {
	
	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement pwd;
	
	@FindBy(className = "Login")
	WebElement loginbtn;
	@FindBy(css="input[id='isClassSelected']")
	List<WebElement> checkboxes;
	@FindBy(xpath="//button[contains(text),'header-delete-icon']")
	WebElement deleteicon;
	
	@FindBy(linkText = "Assignment")
	WebElement manageasiclick;
	public void clicks_on_single_row_level_checkbox_in_data_table() {
		
		
		   for(int i=0;i<checkboxes.size();i++)
		   {
			   if(checkboxes.toString().equalsIgnoreCase("17") &&  checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled())
				{
		                       System.out.println("Checkbox is displayed at index:"+i+" Clicking on it now..............");
		                       checkboxes.get(i).click();
				}
		   }
	}		   
		   public void click_logged_On()
		   {
				driver.get("www.Lms.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().getImplicitWaitTimeout();
				username.sendKeys("Admin");
				pwd.sendKeys("Admin");
				loginbtn.click();
				
			}
       
		   public void clickOnAssignment()
			{
				manageasiclick.click();
			}
		   public void navigateManageAssignmentpage()
			{
				driver.navigate().to("https://www.lms.com/assignment/manage-assignment-page");
			}
		   
		   public void admin_clicks_on_delete_button_under_header()
			{
				deleteicon.click();
			}	    
	
}
