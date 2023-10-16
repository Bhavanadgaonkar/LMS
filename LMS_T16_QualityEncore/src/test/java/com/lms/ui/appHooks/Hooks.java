package com.lms.ui.appHooks;
import java.util.Properties;

import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.lms.ui.driver.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	private static DriverFactory driverFactory =new DriverFactory();
	static boolean firstSession=true;
	
	
	
	@Before
	public void bf()
	{
		if (firstSession)
		{
			
			driverFactory.setDriver();
			
			firstSession=false;
		}
	}
	
	@AfterAll
	public static void aftAll()
	{
		try {
			try {
				driverFactory.getDriver().quit();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

}
}
