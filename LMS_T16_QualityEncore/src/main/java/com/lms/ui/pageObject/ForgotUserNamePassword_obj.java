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

public class ForgotUserNamePassword_obj {
	private WebDriver dr;
	private DriverFactory drf= new DriverFactory();
	
	
@FindBy (xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]") WebElement Login;
	

	@FindBy (xpath="/html/body/div[1]/div[2]/div/img") WebElement Logo;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement Header;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement UserTxtBox;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement PassTextBox;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement userpasslink;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement resetpasslink;
	@FindBy (xpath="/html/body") WebElement Screenshotmess;
	@FindBy (xpath="/html/body/div[3]") WebElement mess;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement emailTxtBox;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement sendlink;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement astsymbol;
	@FindBy (xpath="/html/body/div[3]") WebElement errormess;


public ForgotUserNamePassword_obj(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}

public void userpasslink_click()
{
	userpasslink.click();
}

public String getCurrentPageTitle() {

	 return dr.getTitle().trim();

	}

public String[] email_text_color()
{


String colorString = emailTxtBox.getAttribute("class");
String[] arrColor = colorString .split("#");
return arrColor;
}

public String emailtext()
{
	return emailTxtBox.getText();
	
}
public boolean sendlinkField_verify()
{
	return sendlink.isDisplayed();
} 
public boolean astSymbol_verify()
{
	return astsymbol.isDisplayed();
} 

public String ResetPasswordLinkAlignment() {

	  return sendlink.getAttribute("align");

	}

public void  getEmailText()
{
	 emailTxtBox.sendKeys(drf.property.getProperty("VALIDEMAIL"));
	 sendlink.click();
	 
	 
}

public String mess_capture() throws IOException
{
String Successmess= mess.getText();
	
	
	//String mesg = msgs.getText();
	//Assert.assertEquals(mesg, msg);
	TakesScreenshot ts = (TakesScreenshot) Screenshotmess;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File src1 = ((TakesScreenshot) Screenshotmess).getScreenshotAs(OutputType.FILE);
	Date dt = new Date();
	DateFormat dft = new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
	File trg = new File(".\\Screenshots\\image.png");
	FileUtils.copyFile(src1, new File("./Screenshots/imag1" + dft.format(dt) + ".png"));
	return Successmess;
}

public void  getEmailText_invalid()
{
	 emailTxtBox.sendKeys(drf.property.getProperty("INVALIDEMAIL"));
	 sendlink.click();
	 
	 
}
}
