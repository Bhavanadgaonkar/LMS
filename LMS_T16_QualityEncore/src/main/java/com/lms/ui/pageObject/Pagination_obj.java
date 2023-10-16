package com.lms.ui.pageObject;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lms.ui.util.BaseClass;
import com.lms.ui.util.LoggerLoad;


public class Pagination_obj extends BaseClass {
	
	int columnIndex = 0;
	public Pagination_obj(WebDriver driver) {
		super(driver);
		
	}

	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();

	

	boolean status;

	@FindBy(xpath = "//a[@id ='dashboardsmsg']")
	WebElement dashboardlandmsg;
	
	@SuppressWarnings("unchecked")
	List<WebElement> tableHeaders = (List<WebElement>) dashboardlandmsg;
	
	@FindBy(xpath = "//a[@id ='paginationbutton']")
	WebElement Btnclick;
	@FindBy(xpath = "//pre[@id='datadisplay']")
	WebElement OutputChk;
	
	 @FindBy(xpath ="//td[value() ='1']") 
			 WebElement data1;
			
	
	@FindBy(xpath = "//a[title ='>']")
	WebElement rigtclick;
	
	@FindBy(xpath = "//a[title='<']")
	WebElement lftclick;
	
	@FindBy(xpath = "//a[title='>>']")
	WebElement rigtdblclick;
	@FindBy(xpath = "//a[title='<<']")
	WebElement lftdblclick;
	@FindBy(xpath = "//a[@id='isEnabled']")
	WebElement arrwenabled;
	@FindBy(xpath = "//a[@id='isDisabled']")
	WebElement arrwdisabled;
	
	public void paginationchk()
	{
		 Object colName = null;
		 List<WebElement> result = null;
        for (int i = 0; i < tableHeaders.size(); i++) {
           
			if (tableHeaders.get(i).getText().equals(colName)) {
                break;
            }
        }
        
        boolean goNext = false;
        do { 
        	for (int i = 0; i < tableHeaders.size(); i++) {
                data1.getText();
                             
	        }
        	 boolean paginationNext = false;
			goNext = paginationNext;
             if (paginationNext) {
                 data1.click();
             }
           } while (goNext);
             return ;
        }
	
	
/*	public boolean DashboardLandingPage() {
		try {
			status = dashboardlandmsg.isDisplayed();
			Assert.assertTrue(status);

			LoggerLoad.info("Dashboard page is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Dashboard page is not displayed");
			System.out.println(e.getMessage());
		}
		return status;
	}*/
	
	public void ClassbtnclickMethod()
	{
		Btnclick.click();
	}
	
	public boolean dataMessagedisplayed() {

		try {
			status = OutputChk.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("Alert is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Alert is not displayed");

		}
return status;
	}
	
	public boolean rightarrowchk()
	{
		try {
			status = rigtclick.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("Alert is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Alert is not displayed");

		}
		//rigtclick.click();
	return status;
	}
	
	public boolean leftarrowchk()
	{
		try {
			status = lftclick.isDisplayed();
		//	Assert.assertTrue(status);

			LoggerLoad.info("Alert is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Alert is not displayed");

		}
		//lftclick.click();
		return status;
	}
	
	public boolean rightdblClick()
	{
		
		try {
			status = lftdblclick.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("Alert is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Alert is not displayed");

		}
		//rigtdblclick.click();
		return status;
	}
	
	public boolean lftdblarr() {
		
		try {
			status = rigtdblclick.isDisplayed();
		//	Assert.assertTrue(status);

			LoggerLoad.info("Alert is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Alert is not displayed");

		}
		//lftdblclick.click();
		return status;
	}
	
	
	public boolean arrenabledmethd() {
		
		try {
			status = arrwenabled.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("Alert is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Alert is not displayed");

		}
		//lftdblclick.click();
		return status;
	}
public boolean arrdisbledmethd() {
		
		try {
			status = arrwdisabled.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("Alert is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Alert is not displayed");

		}
		//lftdblclick.click();
		return status;
	}
}
