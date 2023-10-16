package com.lms.ui.pageObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lms.ui.util.LoggerLoad;

public class Manage_Attd {
	
	static WebDriver driver;
	
	@SuppressWarnings("static-access")
	public Manage_Attd(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	WebElement click_Attd = driver.findElement(By.xpath("//div[@class='Attd']/span"));
	WebElement actualString = driver.findElement(By.xpath("xpath")) ;
	WebElement mah = driver.findElement(By.id("Manage attendance header"));
	WebElement pptxt = driver.findElement(By.xpath("sampletext"));
	WebElement deleteicon =driver.findElement(By.id("elementID"));
	WebElement srchbar =driver.findElement(By.xpath("srchbar"));
	WebElement datable =driver.findElement(By.xpath("data table"));
	WebElement editicon =driver.findElement(By.xpath("edit icon"));
	WebElement dlticon =driver.findElement(By.xpath("delete icon"));
	WebElement sorticon =driver.findElement(By.xpath("sort icon"));
	WebElement chkbox =driver.findElement(By.xpath("check box"));
	WebElement footertxt =driver.findElement(By.xpath("check box"));
	WebElement txt =driver.findElement(By.xpath("check box"));
	WebElement pgctrl =driver.findElement(By.xpath(" pagination control"));
	
	public void clicks_Attendance() {
		System.out.println("clicks Attendance on the navigation bar is successful");
		click_Attd.click();
	}

	public void getportalpagetext() {
		pptxt.getText();
		System.out.println("Admin clicks Attendance button on the navigation bar and get all text from the portal page is successful");
		
	}
	
	public String Spelling() {
		return actualString.getText();
	}
	
	public String open_portaltitle()

	{
		return driver.getTitle();
				
	} 
	
	public void ResponseTime() throws InterruptedException {
		driver.navigate().back();
	    Thread.sleep(1000);
	    long startTime = System.currentTimeMillis();
	    WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	    WebElement manageDashboard= new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='accordion']/div[2]/div/h4/a")));
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
	
	public void check_brokenlinks()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));

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
	
	
	 public String HeaderAlignment() {			

		 return mah.getAttribute("align");

		}
	 public boolean icon() {
		boolean dicon = deleteicon.isEnabled();
		return dicon;
	 }
	 
	 public boolean searchbar() {
			boolean srcbars = srchbar.isDisplayed();
			return srcbars;
			
		 }
	 
	 public boolean datable() {
			boolean table = datable.isDisplayed();
			return table;
	}
	 public boolean edit_icon() {
			boolean icon = editicon.isDisplayed();
			return icon;
	}
	 public boolean delete_icon() {
			boolean icon = dlticon.isDisplayed();
			return icon;
	}
	 
	 public boolean sort_icon() {
			boolean icon = sorticon.isDisplayed();
			return icon;
	}
	 
	 public boolean selected() {
			boolean isSelected = chkbox.isSelected();
			return isSelected;
		}
	 
	 public String footxt() {
		 return footertxt.getText();
		}
	 
	 public boolean pagination_ctrl() {
			boolean icon = pgctrl.isDisplayed();
			return icon;
	}
	 
	 public String txt() {
		 return txt.getText();
		}
}
