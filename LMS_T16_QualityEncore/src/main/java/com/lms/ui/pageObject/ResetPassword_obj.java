package com.lms.ui.pageObject;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lms.ui.driver.DriverFactory;
import com.lms.ui.util.LoggerLoad;
import java.util.logging.Logger;
import org.openqa.selenium.WebElement;


public class ResetPassword_obj {
	
	private WebDriver dr;
	private DriverFactory drf= new DriverFactory();
	
	
	@FindBy(id ="resetpassword") WebElement Reset_Password;
	@FindBy(className ="navbar-text") WebElement ResetnavigationBar;
	@FindBy(id ="submit") WebElement Submit;
	@FindBy(id = "text-new") WebElement txt1;
	@FindBy(id = "text-retype") WebElement txt2;
	@FindBy(xpath = "//div[@label1 = 'Type in new password']") WebElement label1;
	@FindBy(xpath = "//div[@label2 = 'ReType password']") WebElement label2;
	@FindBy(xpath= "//button[@type='button'][text()='Cancel']") WebElement submit;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")WebElement Login;
	@FindBy(id ="typepassword1") WebElement TypePassword;
	@FindBy(id ="typepassword2") WebElement RetypePassword;
	@FindBy(xpath ="/html/body/div[3]")WebElement message;
	@FindBy (xpath="/html/body") WebElement Screenshotmess;



public ResetPassword_obj(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}

public void resetpass_click()
{
	Reset_Password.click();	
}

public String getCurrentPageTitle() {

	 return dr.getTitle().trim();

	}

public boolean submitField_verify()
{
	return Submit.isDisplayed();
} 

public String SubmitAlignment() {
	
	  return Submit.getAttribute("align");
	}

public boolean testField1_verify()
{
	return txt1.isDisplayed();
} 

public boolean testField2_verify()
{
	return txt1.isDisplayed();
} 


public String label1_Text()
{
	return label1.getText();
	
}

public String label2_Text()
{
	return label2.getText();
	
}

public boolean testField1_verify_disabled()
{
	return txt1.isEnabled();
} 

public void textfield1_click()
{
	txt1.click();
}

public void textfield2_click()
{
	txt2.click();
}

public void enter_password()
{
	txt1.sendKeys(drf.property.getProperty("RESETPASSWORD"));
	txt2.sendKeys(drf.property.getProperty("RETYPEPASSWORD"));

	submit.click();
}
public String mess_capture() throws IOException
{
String mess= message.getText();
	
	
	//String mesg = msgs.getText();
	//Assert.assertEquals(mesg, msg);
	TakesScreenshot ts = (TakesScreenshot) Screenshotmess;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File src1 = ((TakesScreenshot) Screenshotmess).getScreenshotAs(OutputType.FILE);
	Date dt = new Date();
	DateFormat dft = new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
	File trg = new File(".\\Screenshots\\image.png");
	FileUtils.copyFile(src1, new File("./Screenshots/imag1" + dft.format(dt) + ".png"));
	return mess;
}
public void invalid_enter_password()
{
	txt1.sendKeys(drf.property.getProperty("INVALIDPASSWORD"));
	txt2.sendKeys(drf.property.getProperty("INVALIDPASSWORD"));

	submit.click();
}
public void empty_enter_password()
{
	txt1.sendKeys(" ");
	txt2.sendKeys(" ");

	submit.click();
}
public void mismatch_enter_password()
{
	txt1.sendKeys(drf.property.getProperty("RESETPASSWORD"));
	txt2.sendKeys(drf.property.getProperty("INVALIDPASSWORD"));

	submit.click();
}
}
