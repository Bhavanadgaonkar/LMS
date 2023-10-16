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

public class LoginPage_Verification_obj {
	
private WebDriver dr;
	
	@FindBy (xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]") WebElement Login;
	

	@FindBy (xpath="/html/body/div[1]/div[2]/div/img") WebElement Logo;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement Header;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement UserTxtBox;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement PassTextBox;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement userpasslink;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement resetpasslink;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement userastsymbol;
	@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement passastsymbol;



	
	
public LoginPage_Verification_obj(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}


public String open_homepage()

{
	return dr.getTitle();
	
	
}
public void login_Click()
{
	Login.click();
}

public String verify_loginTitle()
{
	return dr.getTitle();
}

public void check_brokenlinks()
{
	List<WebElement> links = dr.findElements(By.tagName("a"));

    // This line will print the number of links and the count of links.
	LoggerLoad.info("No of links are "+ links.size());  
  
    //checking the links fetched.
    for(int i=0;i<links.size();i++)
    {
        WebElement E1= links.get(i);
        String url= E1.getAttribute("href");
        verifyLinks(url);
    }
}
public static void verifyLinks(String linkUrl)
{
    try
    {
        URL url = new URL(linkUrl);

        //Now we will be creating url connection and getting the response code
        HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
        httpURLConnect.setConnectTimeout(5000);
        httpURLConnect.connect();
        if(httpURLConnect.getResponseCode()>=400)
        {
        	LoggerLoad.info(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
        }    
   
        //Fetching and Printing the response code obtained
        else{
        	LoggerLoad.info(linkUrl+" - "+httpURLConnect.getResponseMessage());
        }
    }catch (Exception e) {
  }
}

public boolean header_verify()
{
	return Header.isDisplayed();
}

public boolean usertxtField_verify()
{
	return UserTxtBox.isDisplayed();
}

public boolean passtxtField_verify()
{
	return PassTextBox.isDisplayed();
}

public String verify_defaultUsertxt()
{
	String usettext=UserTxtBox.getAttribute("name");
	return usettext;
	
}
public String verify_defaultPasstxt()
{
	String passtext=PassTextBox.getAttribute("name");
	return passtext;
	
}

public boolean forgot_user_pass_verify()
{
	return userpasslink.isDisplayed();
}
public boolean reset_pass_verify()
{
	return resetpasslink.isDisplayed();
}

public String[] user_text_color()
{


String colorString = UserTxtBox.getAttribute("class");
String[] arrColor = colorString .split("#");
return arrColor;
}

public String[] pass_text_color()
{


String colorString1 = PassTextBox.getAttribute("class");
String[] arrColor1 = colorString1 .split("#");
return arrColor1;
}

public String user_alignment()
{
	return UserTxtBox.getAttribute("align");
}
public String pass_alignment()
{
	return PassTextBox.getAttribute("align");
}
public String login_alignment()
{
	return Login.getAttribute("style");
}

public boolean userastSymbol_verify()
{
	return userastsymbol.isDisplayed();
} 

public boolean passastSymbol_verify()
{
	return passastsymbol.isDisplayed();
} 





}
