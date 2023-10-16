package com.lms.ui.pageObject;

//import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.net.HttpURLConnection;
import com.lms.ui.util.BaseClass;
import com.lms.ui.util.LoggerLoad;
import java.net.URL;

public class StudentVerification_obj extends BaseClass {

	public StudentVerification_obj(WebDriver driver) {
		super(driver);
	}

	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	boolean status;
	String url="";
	@FindBy(xpath = "//a[Text() ='student details']")
	WebElement studentDetailspage;
	@FindBy(xpath = "//a[@id ='student']")
	WebElement stdBtnclick;
	@FindBy(xpath = "//a[Text() ='LMS details']")
	WebElement lmstitlelink;
	@FindBy(xpath= "//a[@id='simplelink']")
	WebElement urllink;
	List<WebElement> links = (List<WebElement>) urllink;
	@FindBy(xpath = "//a[@id ='student name']")
	WebElement studentnamedrp;	
	@FindBy(xpath = "//a[@id ='student batch id']")
	WebElement studentbatchid;	
	@FindBy(xpath = "//a[@id ='student name']")
	WebElement searchdrp;	
	
	
	
	
	public void studentClickmet()
	{
		stdBtnclick.click();
	}
	
	public boolean studentdetailtitle()
	{
		try {
			status = studentDetailspage.isDisplayed();
		//	Assert.assertTrue(status);

			LoggerLoad.info("student detail page is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("student detail page is not displayed");
			System.out.println(e.getMessage());
		}return status;
	}	
	
	
		public void linktestmethod()
		{
			 Iterator<WebElement> iterator = links.iterator();
		      while (iterator.hasNext()) {
		    	  url = iterator.next().getText();
		    	  System.out.println(url);
		      }
		      
		      
		      for(int i=0;i<links.size();i++)
		        {
		            WebElement E1= links.get(i);
		            String url= E1.getAttribute("href");
		            try
			        {
			            URL liurl = new URL(url);

			            //Now we will be creating url connection and getting the response code
			            HttpURLConnection httpURLConnect= (HttpURLConnection) liurl.openConnection();
			            httpURLConnect.setConnectTimeout(5000);
			            httpURLConnect.connect();
			            if(httpURLConnect.getResponseCode()>=400)
			            {
			            	System.out.println(liurl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
			            }    
			       
			            //Fetching and Printing the response code obtained
			            else{
			                System.out.println(liurl+" - "+httpURLConnect.getResponseMessage());
			            }
			        }catch (Exception e) {
			      }
		        }
		}
		
		
		public boolean lmstitlechk()
		{
			try {
				status = lmstitlelink.isDisplayed();
				

				LoggerLoad.info("LMS title page is displayed");

			} catch (AssertionError e) {
				LoggerLoad.error("LMS title  page is not displayed");
				System.out.println(e.getMessage());
			}return status;
		}	
		
		
		public boolean studentnameDrpchk()
		{
			try {
				status = studentnamedrp.isDisplayed();
				

				LoggerLoad.info("student name dropdown is displayed");

			} catch (AssertionError e) {
				LoggerLoad.error("student name dropdown is not displayed");
				System.out.println(e.getMessage());
			}return status;
		}	
		
		public boolean studentbatchIdDrpchk()
		{
			try {
				status = studentbatchid.isDisplayed();
				

				LoggerLoad.info("student name dropdown is displayed");

			} catch (AssertionError e) {
				LoggerLoad.error("student name dropdown is not displayed");
				System.out.println(e.getMessage());
			}return status;
		}	
	
		public boolean studentnameDrpSearchchk()
		{
			studentnamedrp.click();
			try {
				status = searchdrp.isDisplayed();
				

				LoggerLoad.info("student name dropdown is displayed");

			} catch (AssertionError e) {
				LoggerLoad.error("student name dropdown is not displayed");
				System.out.println(e.getMessage());
			}return status;
		}	
		
		public boolean studentbatchIdSearchDrpchk()
		{
			studentbatchid.click();
			try {
				status = searchdrp.isDisplayed();
			
				LoggerLoad.info("student name dropdown is displayed");

			} catch (AssertionError e) {
				LoggerLoad.error("student name dropdown is not displayed");
				System.out.println(e.getMessage());
			}return status;
		}	
	
	
	public void responseTimChk() throws InterruptedException
	{
			long starttime = System.currentTimeMillis();
		stdBtnclick.click();
			long endtime = System.currentTimeMillis();
			long responsetime = endtime-starttime;

	LoggerLoad.info("Response time displayed" + responsetime + "milliseconds");
		
	if(responsetime>=30)
	{
		wait();
	}
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
