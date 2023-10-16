package com.lms.ui.pageObject;

//import static org.junit.Assert.Assert.assertTrue;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lms.ui.util.BaseClass;
import com.lms.ui.util.LoggerLoad;

public class Navigation_obj extends BaseClass{

	public Navigation_obj(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	boolean status;
	
	
	@FindBy(xpath = "//a[@id ='Student']")
	WebElement StudntClick;
	@FindBy(xpath = "//a[@id ='Program']")
	WebElement prgmclick;
	@FindBy(xpath = "//a[@id ='Batch']")
	WebElement btchClick;
	@FindBy(xpath = "//a[@id ='User']")
	WebElement usrClick;
	@FindBy(xpath = "//a[@id ='Assignment']")
	WebElement assgnClick;
	@FindBy(xpath = "//a[@id ='Attendance']")
	WebElement attdnClick;
	@FindBy(xpath = "//a[@id ='Logout']")
	WebElement LogoutClick;
	@FindBy(xpath = "//a[@id ='Class']")
	WebElement classClick;
	@FindBy(xpath = "//pre[@id='message']")
	WebElement OutputChk;
	
	public void studntclickmethod()
	{
		StudntClick.click();
	}
	public void classclickmethod()
	{
		classClick.click();
	}
	public void prgmclickmethod()
	{
		prgmclick.click();
	}
	public void btchclickmethod()
	{
		btchClick.click();
	}
	public void usrclickmethod()
	{
		usrClick.click();
	}
	public void assgnclickmethod()
	{
		assgnClick.click();
	}
	public void attnclickmethod()
	{
		attdnClick.click();
	}
	public void logoutclickmethod()
	{
		LogoutClick.click();
	}
	
	public boolean msgchckstdnchk()
	{
		try {
			status = StudntClick.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("Student is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Student is not displayed");
			System.out.println(e.getMessage());
		}
		return status;
	}
	
	public boolean msgclasschk()
	{
		try {
			status = classClick.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("class is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("class is not displayed");
			System.out.println(e.getMessage());
		}
		return status;
	}
	public boolean msgchckprgmchk()
	{
		try {
			status = prgmclick.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("Program is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Program not displayed");
			System.out.println(e.getMessage());
		}
		return status;
	}
	
	
	public boolean msgchckbtchmchk()
	{
		try {
			status = btchClick.isDisplayed();
		//	Assert.assertTrue(status);

			LoggerLoad.info("Batch is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Batch is not displayed");
			System.out.println(e.getMessage());
		}
		return status;
	}
	
	public boolean msgchcusrmchk()
	{
		try {
			status = usrClick.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("User is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("User is not displayed");
			System.out.println(e.getMessage());
		}
		return status;
	}
	
	public boolean msgchckassignmchk()
	{
		try {
			status = assgnClick.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("Assignment is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Assignment is not displayed");
			System.out.println(e.getMessage());
		}
		return status;
	}
	public boolean msgchckattdnmchk()
	{
		try {
			status = attdnClick.isDisplayed();
		//	Assert.assertTrue(status);

			LoggerLoad.info("Attendance is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Attendance is not displayed");
			System.out.println(e.getMessage());
		}
		return status;
	}
		public boolean msgchlogoutchk()
		{
			try {
				status = LogoutClick.isDisplayed();
			//	Assert.assertTrue(status);

				LoggerLoad.info("Logout is displayed");

			} catch (AssertionError e) {
				LoggerLoad.error("Logout is not displayed");
				System.out.println(e.getMessage());
			}return status;
		}
		
	}
	
