package com.lms.ui.pageObject;


//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lms.ui.util.BaseClass;
import com.lms.ui.util.LoggerLoad;

public class EditClass_obj extends BaseClass {

	public EditClass_obj(WebDriver driver) {
		super(driver);
		
	}
WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	
	boolean status;
	
	@FindBy(xpath = "//a[@id ='Edit class']")
	WebElement editBtnclk;
	@FindBy(xpath = "//a[Text() ='class details']")
	WebElement editpopupchk;
	@FindBy(xpath = "//a[@id ='batchid']")
	WebElement Batchidval;
	@FindBy(xpath = "//a[@id ='noofclasses']")
	WebElement noclassval;
	@FindBy(xpath = "//a[@id ='classdate']")
	WebElement clasdtval;
	@FindBy(xpath = "//a[@id ='staffid']")
	WebElement staffval;
	
	public void editbtnclkmehtod()
	{
		editBtnclk.click();
	}


	public boolean chkEditpopage()
	{
		try {
			status = editpopupchk.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("edit page is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("edit page is not displayed");
			System.out.println(e.getMessage());
		}
		return status;
		
	}
	
	public boolean chkallrws()
	{
		
			Batchidval.getAttribute("value");
			noclassval.getText();
			clasdtval.getText();
			staffval.getText();
		
		try {
			status = editpopupchk.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("edit page is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("edit page is not displayed");
			System.out.println(e.getMessage());
		}return status;
	}
	
}
