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




public class validationOfEdit_obj {
	
	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	
	@FindBy(xpath="//input[contains(text),'column-edit']")
	WebElement editbtn;
	@FindBy(xpath="//table[@id='users_table']/tbody")
	WebElement TogetRows;
	@FindBy(xpath="//table[@id='users_table']/tbody/tr")
	WebElement ToGetColumns;
	@FindBy(xpath="//button[@id='reg-submit-button']")
	WebElement assignsavebtn;
	@FindBy(id="Selectbatchnumber")
	WebElement batchNo;
	@FindBy(className="grade")
	WebElement grade;
	@FindBy(xpath="//input[@id='file-upload']")
	WebElement browse;
	@FindBy(xpath="//input[contains(text(),'Assign_description'])")
	WebElement Assigndescrip;
	@FindBy(id="program_err")
	WebElement pgmerr;
	@FindBy(id="batch_err")
	WebElement batcherr;
	@FindBy(id="assignnm_err")
	WebElement assignmerr;
	@FindBy(id="duedate_err")
	WebElement duedate;
	@FindBy(id="grade")
	WebElement grade_err;
	@FindBy(id="passeddate_err")
	WebElement pastdate;
	@FindBy(xpath="//div[@id='datetimepicker_dateview']//a[contains(@class,'k-nav-next')]")
	WebElement Calnext_arrow;
	@FindBy(xpath="//div[9]/div/table/thead/tr[1]/th[2]")
    WebElement next_month;
	@FindBy(xpath="//div[@id='datetimepicker_dateview']//a[contains(@class,'k-nav-prev')]")
	WebElement calprev_arrow;
	@FindBy(xpath="//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-prev')")
	WebElement prev_month;
	@FindBy(xpath="//button[contains(text(),'Cancel']")
	WebElement cancelbtn;
	@FindBy(id="selectprogramName")
	WebElement pgmdrpdn;
	@FindBy(xpath="//input[contains(text(),'Batch Name')]")
	WebElement batchnm ;
	@FindBy(xpath="//input[contains(text(),'Assign_name'])")
	WebElement assignNm ;
	@FindBy(xpath="//div[9]/div/table/thead/tr[1]/th[2])")
	WebElement calmonth ;
	@FindBy(xpath="//div[9]/div[1]/table/tr[1]/tr[3]")
	WebElement calday;
	@FindBy(xpath="//*[@id=\"dpd1\"]/div/input")
	WebElement calendericon;
	
	
	
	public void clicks_on_edit_button_in_data_table() {
		
		 if(editbtn.isDisplayed() && editbtn.isEnabled())
		    {
		    	editbtn.click();
		    }
	}
	public void appears_edit_popup_window_with_heading_assignment_details() {
	   //driver.switchTo().window("Assignment Details");
		Set<String> s = driver.getWindowHandles();
	      // iterate handles
	      Iterator<String> i = s.iterator();
	      //child window handle id
	      String c = i.next();
	      //parent window handle id
	      String p = i.next();
	      // child window switch
	      driver.switchTo().window(c);
	      System.out.println("Page title of child window: "+ driver.getTitle());
		
	}
	public void clicks_on_edit_button_from_one_row_in_data_table() {
	
	List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
	System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
	
	//column
	

	List<WebElement> TotalColsList = ToGetColumns.findElements(By.tagName("td"));

	System.out.println("Total Number of Columns in the table are: "+TotalColsList.size());
	if(TotalRowsList.isEmpty());
	{
		System.out.println("There are 0 Assignments........can not able to edit............ ");
		
	}

}
	
	
	public void appears_edit_popup_window_with_same_row_values_in_all_fields() {
	//	Assert.assertTrue(false);
	}

	
	public void admin_is_in_edit_assignment_details_popup_window() {
		 driver.switchTo().window("Assignment Details");
	}

	
	public void enters_valid_data_in_all_mandatory_fields() throws InterruptedException {
		int day=20;
		String month="September 2023";
		Select select = new Select(pgmdrpdn);
		select.selectByVisibleText("SDET");
		
		//Select se = new Select(driver.findElement(By.id("Selectbatchnumber")));
		//se.selectByIndex(5);
		
		batchnm.sendKeys("SDET94");
		assignNm.sendKeys("LMS UI Screens");
		//driver.findElement(By.className("grade")).sendKeys("A+");
		calendericon.click();
		Thread.sleep(1000);
		while(true)
		{
			String text=calmonth.getText();
			if(text.equalsIgnoreCase(month))
			{
				break;
				
			}
			else
			{
				calday.click();
			}
		}
		driver.findElement(By.xpath("div[9]/div/table//tbody//tr//td[contains(text(),"+day+")]")).click();
		}
	
	    
	
public void updated_assignment_details_added_in_data_table() {
	
		
	    
	}
	
	

	
	public void enters_invalid_data_in_all_mandatory_fields() {
	   
	}

	
	public void enters_valid_data_in_all_fields() {
	    
	}

	
	public void updated_assignment_details_displays_in_data_table() {

	}

	
	public void enters_invalid_data_in_optional_fields() {
	    
	}

	
	public void error_message_dispalys_assignment_can_not_updated_for_the_passed_date() {
		
		System.out.println("Assignments details are not updated............");
	    
	}

	
	public void verify_assignment_updated_in_the_data_table() {
	   
	}

}
