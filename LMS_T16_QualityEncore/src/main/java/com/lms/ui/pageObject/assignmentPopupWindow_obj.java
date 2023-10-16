package com.lms.ui.pageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class assignmentPopupWindow_obj {
    
	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement pwd;
	
	@FindBy(className = "Login")
	WebElement loginbtn;
	
	@FindBy(linkText = "Assignment")
	WebElement manageasiclick;
	
	@FindBy(xpath="input[value='Add assignment']")
	WebElement assignmentbtn;
	
	@FindBy(css="div[class='assignment-container']h2")
	WebElement assignmentHeading;
	
	@FindBy(id="selectbatchnumber")
	WebElement drpdn;
	
	@FindBy(id="selectprogramName")
	WebElement drpdnprognm;
	
	@FindBy(xpath="//*[@id='ctl00_cntMainContent_imgStartDate']")
	WebElement calenderIcon;
	
	@FindBy(xpath="//button[@id='reg-submit-button']")
    WebElement savebtn;
	
	@FindBy(xpath="//button[contains(text(),'Cancel']")
	WebElement cancelbtn;
	
	@FindBy(css=("button.closebtn"))
	WebElement closebtn;
	
	public void loggedOnLMSWebsite()
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
	public void adminOnManageAassignmentPpage() {
	    driver.getCurrentUrl();
	    driver.getTitle().contains("Manage Assignment Page");
	}
	public void ClickOnAddAssignmentbtn()
	{
		boolean addnewassignmentBtn= assignmentbtn.isEnabled();
		   if(addnewassignmentBtn)
		   {
			   assignmentbtn.click();
		   }
		   else
		   {
			   System.out.println("Add New Assignment button is Disable....");
		   }
		   
	}
	public void textFieldsToCheck()
	{
		String []field= {"Program name","batch number","assignment name","assignment description","grade by","assignment due date","Assignment File 1",
				"Assignment File 2","Assignment File 3","Assignment File 4","Assignment File 5"};
		
		for(int i=0;i<field.length;i++)
		{
			if (driver.getPageSource().contains(field[i]))
			{
	            System.out.println("Field Text: " +field[i]+ " is present. ");
	        }
		
			else
		{
            System.out.println("Field Text: " +field[i]+" is not present.... ");
		}   
      }
	}
	public void navigateaddEditAssignmentpage()
	{
		driver.navigate().to("https://www.lms.com/assignment/manage-assignment-page%add-edit-assignment");
	    String getheading=(assignmentHeading).getText();
	    System.out.println(getheading);
	}
	public void textboxToCheck()
	{
		for(int i=0;i<8;i++)
		{
			
			if(driver.findElement(By.xpath("//input[@type='text'][i]")).isDisplayed())
			{
	            System.out.println("Textbox is present. ");
			}
	        
			else
		
            System.out.println("Textbox is not present.... ");
		   
      }
	}
	
	public void dropdownOptionBatchNum()
	{
		drpdn.click();
    	System.out.println("Clicking on the drop down");
    	Select se = new Select(drpdn);
    	List<WebElement> opt = se.getOptions();
    	System.out.println("Dropdown options for batch number are:"+opt);
	}
	
	public void dropdownOptionProgramNm()
	{
		Select select = new Select(drpdnprognm);
		List<WebElement> lst = select.getOptions();
		System.out.println("Dropdown options for Program name are:"+lst);
	}
	public void DuedatecalenderIcon()
	{
		
	    if(calenderIcon.isDisplayed())
	    	System.out.println("Calender Icon is Display in assignment due date field");
	    else
	    	System.out.println("Calender Icon is not Display in assignment due date field");
	
	}
	public void savebtn()
	{
		if(savebtn.isDisplayed())
		{
			System.out.println("Save Button is present");
		}
		else
		{
			System.out.println("Save Button is not present");
		}
	}
	public void cancelbtn()
	{
	if(cancelbtn.isDisplayed())
	{
		System.out.println("Cancel Button is present");
	}
	else
	{
		System.out.println("Cancel Button is not present");
	}
	
}
	public void closebtn()
	{
	if(cancelbtn.isDisplayed())
	{
		System.out.println("Cancel Button is present");
	}
	else
	{
		System.out.println("Cancel Button is not present");
	}
}
}
