package com.lms.ui.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.junit.Assert;
import com.lms.ui.util.BaseClass;
import com.lms.ui.util.LoggerLoad;
//import static org.junit.Assert.Assert.assertTrue;

public class DeleteClassValidation_obj extends BaseClass{

	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	
	public DeleteClassValidation_obj(WebDriver driver)
	{
		super(driver);
	}
	

	boolean status;

	@FindBy(xpath = "//a[@id ='manageclassmsg']")
	WebElement manageclassmsg;
	@FindBy(xpath = "//a[@id ='DeleteButton']")
	WebElement deleteBtnclick;
	@FindBy(xpath = "//pre[@id='message']")
	WebElement OutputChk;

	@FindBy(xpath = "//pre[@id='yesmessage']")
	WebElement YesbtnChk;
	@FindBy(xpath = "//pre[@id='nomessage']")
	WebElement NobtnChk;

	@FindBy(xpath = "//a[@id ='hobbies-checkbox']")
	WebElement ChkboxClk;

	@FindBy(xpath = "//input[@type='checkbox' and starts-with(@id,'ex1-check')]")
	WebElement multichkbox;

	public boolean ManageclassLandingPage() {
		try {
			status = manageclassmsg.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("manage class landing is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("manage class landing is not displayed");
			System.out.println(e.getMessage());
		}
		return status;
	}

	public void DelBtnclick() {

		deleteBtnclick.click();

	}

	public void alertmsgyes() {

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();

		alert.accept();

	}

	public void alertmsgno() {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.dismiss();
	}

	public boolean Messagedisplayed() {

		try {
			status = OutputChk.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("Alert is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Alert is not displayed");

		} return status;

	}

	public boolean YesMessagedisplayed() {

		try {
			status = YesbtnChk.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("Yes button is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Yes button is not displayed");

		}
return status;
	}

	public boolean NoMessagedisplayed() {

		try {
			status = NobtnChk.isDisplayed();
			//Assert.assertTrue(status);

			LoggerLoad.info("No button is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("No button is not displayed");
			System.out.println(e.getMessage());
		}
		return status;

	}

	public boolean deletebtnenabledchk() {
		try {
			status = deleteBtnclick.isDisplayed();
		//	Assert.assertTrue(status);

			LoggerLoad.info("Delete button is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Delete button is not displayed");
			System.out.println(e.getMessage());
		}
return status;
	}

	public void checkboxclickmethd() {
		ChkboxClk.click();
	}

	public boolean chkboxselectCheckmsg() {
		try {
			status = ChkboxClk.isSelected();
			//Assert.assertTrue(status);

			LoggerLoad.info("Delete button is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Delete button is not displayed");
			System.out.println(e.getMessage());
		}return status;
	}

	public void multichkboxclickmethod() {
		multichkbox.click();
	}

	public boolean multichkboxselectCheckmsg() {
		try {
			status = multichkbox.isSelected();
			//Assert.assertTrue(status);

			LoggerLoad.info("Delete button is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("Delete button is not displayed");
			System.out.println(e.getMessage());
		}return status;
	}
	
	
	
	
}
