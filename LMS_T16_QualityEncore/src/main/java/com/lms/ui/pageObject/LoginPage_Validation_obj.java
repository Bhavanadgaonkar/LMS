package com.lms.ui.pageObject;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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


import com.lms.ui.driver.DriverFactory;
import com.lms.ui.util.LoggerLoad;
import java.util.logging.Logger;
import org.openqa.selenium.WebElement;


public class LoginPage_Validation_obj {
private WebDriver dr;
	
	@FindBy (xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]") WebElement Login;
	

	@FindBy (xpath="/html/body/div[1]/div[2]/div/img") WebElement Logo;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement Header;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement UserTxtBox;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement PassTextBox;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement userpasslink;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement resetpasslink;
	@FindBy (xpath="/html/body") WebElement Screenshotmess;
	@FindBy (xpath="/html/body/div[3]") WebElement errormess;



	
	
public LoginPage_Validation_obj(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}
public String open_loginpage()

{
	return dr.getTitle();
	
	
}

public void valid_login_details(String user1,String pass1)
{
	UserTxtBox.sendKeys(user1);
	PassTextBox.sendKeys(pass1);
	Login.click();
	
}

public String dashboard_Title()
{
	return dr.getTitle();
}
public void invalid_login_details(String user1,String pass1) 
{
	UserTxtBox.sendKeys(user1);
	PassTextBox.sendKeys(pass1);
	Login.click();
	
	
	
}

public String errormess_capture() throws IOException
{
String mess=errormess.getText();
	
	
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

public void valid_user_details(String user1) 
{
	UserTxtBox.sendKeys(user1);
	Login.click();
	
	
	
}

public void valid_pass_details(String pass1) 
{
	PassTextBox.sendKeys(pass1);
	Login.click();
	
	
	
}

public void valid_login_details_keyboardAction(String user1,String pass1)
{
	Actions act=new Actions(dr);
	
	act.moveToElement(UserTxtBox).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	act.sendKeys(UserTxtBox,user1).sendKeys(Keys.TAB).build().perform();
	act.moveToElement(PassTextBox).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(PassTextBox,pass1).sendKeys(Keys.TAB).build().perform();
	act.keyDown(Keys.ENTER);


	
}


}
