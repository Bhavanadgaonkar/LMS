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

public class HomePage_obj {
	
	private WebDriver dr;
	
	@FindBy (xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]") WebElement Login;
	

	@FindBy (xpath="/html/body/div[1]/div[2]/div/img") WebElement Logo;
	
	
public HomePage_obj(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}


public String open_portallink()

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



public  String verifyLoginText()
{
	return Login.getText();
	

}

public void Verify_Logo()
{
	Boolean p = (Boolean) ((JavascriptExecutor)dr)
			.executeScript("return arguments[0].complete "
			+ "&& typeof arguments[0].naturalWidth != \"undefined\" "
			+ "&& arguments[0].naturalWidth > 0", Logo);
	if (p) {
        LoggerLoad.info("Logo present");
     } else {
    	 LoggerLoad.info("Logo not present");
     }
}

public int verify_logo_alignment_X()
{
	return Logo.getLocation().getX();
	
	
}
public int verify_logo_alignment_Y()
{
	return Logo.getLocation().getY();
	
	
}

public int verify_logo_X()
{
	return Logo.getRect().getX();
	 
	
	
	
}
public int verify_logo_Y()
{
	return Logo.getRect().getY();
	 
	
	
	
}

public boolean login_visible()
{
	return Login.isDisplayed();
}

public void button_click()
{
	if(Login.isEnabled())
	{
		Login.click();
	}
	else
	{
		LoggerLoad.info("Button Disabled");
	}
}

	

	
}
