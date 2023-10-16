package com.lms.ui.pageObject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

//import org.junit.Assert;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class paginationAssignment_obj {
	
	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	@FindBy(xpath="//ul[@class='pagination']//li//span")
	WebElement activepage;
	@FindBy(xpath="//table[@id='users_table']/tbody")
	WebElement TogetRows;
	@FindBy(id="next_page")
	WebElement nextpage;
	@FindBy(xpath="input[value='Add assignment']")
	WebElement assignmentbtn;
	
	
	
	
	public void admin_is_on_dashboard_page() {
		   driver.navigate().to("www.LMS.com/dashboard");
		//   Assert.assertTrue(driver.getTitle().equalsIgnoreCase("LMS Dashboard"));
		   {
			   System.out.println("Admin is on Dashboard Page........");
		   }
		}

		
		public void clicks_on_assignment_button_on_navigation_bar() {
			String pagetitle;
			   pagetitle=driver.getTitle();
			   System.out.println("Current Page Title is :"+pagetitle);
		   driver.findElement(By.linkText("Assignment")).click();
		}
		
		public void displays_page() {
		    String active_page=activepage.getText();
		    System.out.println("Active page is"+active_page);
		    
		    
		}

		
		public void entries_are_more_than() {
			 
			List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
			System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
		}
		
		public void enable_the_right_arrow() {
			int TotalRowsList=0;
			if(TotalRowsList>5)
		    {
				nextpage.isEnabled();
		    }
		}

		@When("Entries are more than 5 on page two")
		public void entries_are_more_than_on_page_two() {
			
			List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
			System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
			String active_page=activepage.getText();
		    System.out.println("Active page is"+active_page);
		}
		@Then("enable the left arrow")
		public void enable_the_left_arrow() {
			List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
			if(TotalRowsList.size()>5)
			{
		//	Assert.assertTrue(driver.findElement(By.id("previous_page")).isEnabled());
			}
		}

		@When("Entries are more than 5 on page one")
		public void entries_are_more_than_on_page_one() {
			
			List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
			System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
			String active_page=activepage.getText();
		    System.out.println("Active page is"+active_page);
		}
		
		@Then("disable the left arrow")
		public void disable_the_left_arrow() {
			if(activepage.getText().equalsIgnoreCase("1"));
		//	Assert.assertFalse(driver.findElement(By.id("previous_page")).isEnabled());
		}
		@Then("enable pagination control")
		public void enable_pagination_control() {
			List<WebElement> pagination=driver.findElements(By.xpath("//div[@class='pagination-container']//a"));
		   int page_size=pagination.size();
			if(page_size >0)
			{
				driver.findElement(By.xpath("//ul[@class='pagination']//li//span")).click();
			}
			
		}

//		@When("Entries are less than {int}")
//		public void entries_are_less_than(Integer int1) {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}

		
		public void disable_pagination_control() {
			List<WebElement> pagination=driver.findElements(By.xpath("//div[@class='pagination-container']//a"));
			   int page_size=pagination.size();
				if(page_size <= 0)
				{
					System.out.println("No Pagination control present...........");
				}
		}
		
		public void admin_is_on_manage_assignment_page() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		public void clicks_on_add_new_assignment_button() {
			assignmentbtn.click();
		}

		
		public void admin_is_in_add_assignment_details_popup_window() {
			Set<String> s = driver.getWindowHandles();
		      // iterate handles
		      Iterator<String> i = s.iterator();
		      //child window handle id
		      String c = i.next();
		      //parent window handle id
		      String p = i.next();
		      // child window switch
		      driver.switchTo().window(c);
		      System.out.println("Page title of assisgnment details popup window is: "+ driver.getTitle());
		}

		
		public void creates_six_new_assignments() throws InterruptedException {
			String month="September 2023";
			int day=20;
		    for(int i=0;i<6;i++)
		    {
		    	Select select = new Select(driver.findElement(By.id("selectprogramName")));
				select.selectByVisibleText("SDET");
				
				Select se = new Select(driver.findElement(By.id("Selectbatchnumber")));
				se.selectByIndex(5);
				
				driver.findElement(By.xpath("//input[contains(text(),'Batch Name')])")).sendKeys("SDET94");
				driver.findElement(By.xpath("//input[contains(text(),'Assign_name'])")).sendKeys("LMS UI Screens");
				driver.findElement(By.xpath("//input[contains(text(),'Assign_description'])")).sendKeys("Cucumber BDD Framework");
				driver.findElement(By.className("grade")).sendKeys("A+");
				driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input")).click();
				Thread.sleep(1000);
				while(true)
				{
					String text=driver.findElement(By.xpath("//div[9]/div/table/thead/tr[1]/th[2]")).getText();
					if(text.equalsIgnoreCase(month))
					{
						break;
						
					}
					else
					{
						driver.findElement(By.xpath("//div[9]/div[1]/table/tr[1]/tr[3]")).click();
					}
				}
				driver.findElement(By.xpath("div[9]/div/table//tbody//tr//td[contains(text(),"+day+")]")).click();

				WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
				   //click on ‘Choose file’ to upload the desired file
				   browse.sendKeys("C:\\Users\\bhava\\Desktop\\Files\\Login Gherkins.docx"); //Uploading the file using sendKeys
				   System.out.println("File is Uploaded Successfully");
		    }
		}

		
		public void entries_are_more_than1 () {
			WebElement TogetRows = driver.findElement(By.xpath("//table[@id='users_table']/tbody"));
			List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
			System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
			
		}

		
		public void enable_next_page() {
		   
		    int TotalRowsList=0;
			if(TotalRowsList>5)
		    {
				driver.findElement(By.id("next_page")).isEnabled();
		    }
		}

		
		public void entries_are_less_than() 
		{
			WebElement TogetRows = driver.findElement(By.xpath("//table[@id='users_table']/tbody"));
			List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
			System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
		}
		

		
		public void disable_next_page() {
			int TotalRowsList=0;
			if(TotalRowsList>5)
			{
		//		Assert.assertFalse(driver.findElement(By.id("next_page")).isEnabled());
		    
		     }
		}
	}





		

	
	


