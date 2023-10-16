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




public class DashboardPage_obj {
	
	private WebDriver dr;
	
	@FindBy(id ="id_username") WebElement username;
	@FindBy(id ="id_password") WebElement password;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")WebElement Login;
    @FindBy(id = "Header") WebElement header;
	@FindBy(id = "LMS Title") WebElement LMSTitle;
	@FindBy(id = "Student") WebElement Student;
	@FindBy(id = "Program") WebElement Program;
	@FindBy(id = "Batch") WebElement Batch;
	@FindBy(id = "Class") WebElement Class;
	@FindBy(id = "User") WebElement User;
	@FindBy(id = "Assignment") WebElement Assignment;
	@FindBy(id = "Attendance") WebElement Attendance;
	@FindBy(id = "Logout") WebElement Logout;
	@FindBy(className ="navbar-text") WebElement navigationBar;
	@FindBy(className ="LMS-title") WebElement Title; 
	
	
public DashboardPage_obj(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}

public String verifyHeaderText() {
LoggerLoad.info("Admin see the header Text");
	String HeaderText = header.getText();
return HeaderText;

}

public void ResponseTime() throws InterruptedException {
	DriverFactory.getDriver().navigate().back();
    Thread.sleep(1000);
    long startTime = System.currentTimeMillis();
    WebDriverWait wait = new WebDriverWait(dr, java.time.Duration.ofSeconds(10));
    WebElement manageDashboard= new WebDriverWait(dr,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='accordion']/div[2]/div/h4/a")));
	 if(manageDashboard.isDisplayed())
	 {
		 LoggerLoad.info( "Login is not displayed");
	 }
	 long endTime = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println("Response Time: " + totalTime + " milliseconds");
    long expectedResponseTime = 30;
    if(totalTime <= expectedResponseTime)
    {
    	LoggerLoad.info("Response time is longer than expected");
    }
}

    public String verifyLMSTitle() {
		LoggerLoad.info("Admin see the LMS Title");
		String LMS_Title = LMSTitle.getText();
		return LMS_Title;
}
    
    public String LMSTitleAlignment() {

		

		 return LMSTitle.getAttribute("align");

		}

    public String getNavigationBarText() {

		return navigationBar.getText();



		}
    
    public String TitleText() {

		return Title.getText();

		} 
    
    
    
    public String NavigationAlignment() {

		  return Student.getAttribute("align");

		}
    
    public void Student_Positioning()

	{
	Point location1 = Student.getLocation();
	   int x1 = location1.getX();
	   int y1 = location1.getY();
 	   Point location2 = Program.getLocation();
	    int x2 = location2.getX();
		int y2 = location2.getY();
	if(y1<y2)
	    {
			System.out.println("The Student is in first position");}
		else {
			System.out.println("The Student is not in first position");}
  }

    public void Program_Positioning()

	{

		Point location2 = Program.getLocation();
	    int x2 = location2.getX();
		int y2 = location2.getY();
	Point location3 = Batch.getLocation();
	    int x3 = location3.getX();
		int y3 = location3.getY();
	if (y2<y3)
		{  
			System.out.println("The Program is in second position");

			}
else {
	System.out.println("The Program is not in first position");

			}
	}

		

	public void Batch_Positioning()
	{
	Point location3 = Batch.getLocation();
	    int x3 = location3.getX();
		int y3 = location3.getY();
	Point location4 = Batch.getLocation();
	    int x4 = location4.getX();
		int y4 = location4.getY();
	if (y3<y4)
		{  
			System.out.println("The Batch is in third position");
			}
	else {
		System.out.println("The Batch is not in third position");
			}
}



	public void Class_Positioning()

	{

		Point location4 = Batch.getLocation();

	    int x4 = location4.getX();

		int y4 = location4.getY();

		Point location5 = Class.getLocation();

	    int x5 = location5.getX();

		int y5 = location5.getY();

	    

		if (y4<y5)

		{  

			System.out.println("The Class is in fourth position");

			}

		

		else {

			

			System.out.println("The Class is not in fourth position");

			}



	}



	public void User_Positioning()

	{

		 

		Point location5 = Class.getLocation();

	    int x5 = location5.getX();

		int y5 = location5.getY();

		

		Point location6 = User.getLocation();

	    int x6 = location6.getX();

		int y6 = location6.getY();

	    

	    

		if (y5<y6)

		{  

			System.out.println("The User is in fifth position");

			}

		

		else {

			

			System.out.println("The User is not in fifth position");

			}



	}

	

	public void Assignment_Positioning()

	{

		

		Point location6 = User.getLocation();

	    int x6 = location6.getX();

		int y6 = location6.getY();

	    

		Point location7= Assignment.getLocation();

	    int x7 = location7.getX();

		int y7 = location7.getY();

	    

	    

		if (y6<y7)

		{  

			System.out.println("The Assignment is in sixth position");

			}

		

		else {

			

			System.out.println("The Assignmet is not in sixth position");

			}

	}

		public void Attendance_Positioning()

		{

			

			Point location7= Assignment.getLocation();

		    int x7 = location7.getX();

			int y7 = location7.getY();

		    

			Point location8 = Attendance.getLocation();

		    int x8 = location8.getX();

			int y8= location8.getY();

		    

			if (y7<y8)

			{  

				System.out.println("The Attendance is in seventh position");

				}

			

			else {

				

				System.out.println("The Attendance is not in seventh position");

				}



	}



		public void Logout_Positioning()

		{

			

			Point location8 = Attendance.getLocation();

		    int x8 = location8.getX();

			int y8= location8.getY();

		    



			Point location9 = Logout.getLocation();

		    int x9 = location9.getX();

			int y9 = location9.getY();

		    

			if (y8<y9)

			{  

				System.out.println("The Logout is in eigth position");

				}

			

			else {

				

				System.out.println("The Logout is not in eigth position");

				}



	}
		public String getCurrentPageTitle() {

			 return dr.getTitle().trim();

			}
		public void Logout()

		{

			Logout.click();

		}
}

