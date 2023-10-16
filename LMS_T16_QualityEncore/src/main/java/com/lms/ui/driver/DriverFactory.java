package com.lms.ui.driver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory {

	public static WebDriver dr;
	public static Properties property=new Properties();
	
	
	
	
	
	public static WebDriver getDriver()
	{
		return dr;
	}
	
	public void setDriver()
	{
		FileReader reader=null;
		String mybrowser;
	
		try {
			reader=new FileReader(".\\src\\test\\resources\\Config\\config.properties");
			
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try {
			property.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	mybrowser =property.getProperty("BROWSER");
	
	if (mybrowser.equalsIgnoreCase("chrome"))
	{
				//System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
				//DesiredCapabilities dc3 = new DesiredCapabilities();
				//dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		WebDriverManager.chromedriver().setup(); 
				dr=new ChromeDriver();
				dr.manage().window().maximize();
	}
	else if(mybrowser.equalsIgnoreCase("firefox"))
	{
		//System.setProperty("webdriver.firefox.driver", ".\\src\\test\\resources\\driver\\geckodriver.exe");
		//DesiredCapabilities dc3 = new DesiredCapabilities();
		//dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		WebDriverManager.firefoxdriver().setup();
		dr=new FirefoxDriver();
		dr.manage().window().maximize();
	}
	else if(mybrowser.equalsIgnoreCase("edge"))
	{
		//System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\driver\\msedgedriver.exe");
		//DesiredCapabilities dc3 = new DesiredCapabilities();
		//dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		WebDriverManager.edgedriver().setup();
		dr=new EdgeDriver();
		dr.manage().window().maximize();
	}
	else 
	{
		//System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
		//DesiredCapabilities dc3 = new DesiredCapabilities();
		//dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		WebDriverManager.chromedriver().setup();
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		
	
}
			
			
			
			
			
			
		}
		

}