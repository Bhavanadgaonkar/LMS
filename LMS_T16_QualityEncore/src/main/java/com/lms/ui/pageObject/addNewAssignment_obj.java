package com.lms.ui.pageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class addNewAssignment_obj {
	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	
	
	String month="September 2023";
	int day=20;
	@FindBy(xpath="input[value='Add assignment']")
	WebElement assignmentbtn;
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

	
	
	public void addNewAssignmentbtn()
	{
		boolean addnewassignmentBtn= assignmentbtn.isEnabled();
		   if(addnewassignmentBtn)
		   {
			   assignmentbtn.click();
		   }
		   else
		   {
			   System.out.println("Add New Assignment button is Disable....");
		   }
		   
	}
	public void adminOnManageAassignmentPpage() {
		driver.navigate().to("www.lms.com/assignment/manage-assignment-page");
	}
	
	public void assignmentDetailsPopupWindow()
	{
		Set<String> s = driver.getWindowHandles();
	      // iterate handles
	      Iterator<String> i = s.iterator();
	      //child window handle id
	      String c = i.next();
	      //parent window handle id
	      @SuppressWarnings("unused")
		String p = i.next();
	      // child window switch
	      driver.switchTo().window(c);
	      System.out.println("Page title of assisgnment details popup window is: "+ driver.getTitle());
	}
	public void enters_all_mandatory_field_values_with_valid_data() throws InterruptedException
	{
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
	
	
	

	public void savebtn()
	{
	assignsavebtn.click();
	

	}
	public void new_assignment_details_displays_in_data_table()
	{
		
	}
	
	public void enters_all_mandatory_field_values_with_invalid_data() throws InterruptedException
	{
		Select select = new Select(pgmdrpdn);
		select.selectByVisibleText("net Developer");
		
		//Select se = new Select(driver.findElement(By.id("Selectbatchnumber")));
		//se.selectByIndex(5);
		
		batchnm.sendKeys("Dev001");
		assignNm.sendKeys("UI Design");
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
		
	
	

	public void error_alert_window_displays() throws InterruptedException
	{
		 Alert alert=driver.switchTo().alert();
		    String alertmsg=driver.switchTo().alert().getText();
		    Thread.sleep(1000);
		    System.out.println(alertmsg);
		    alert.dismiss();
	}
	public void enters_all_fields_values_with_valid_data() throws InterruptedException
	{
		Select select = new Select(pgmdrpdn);
		select.selectByVisibleText("SDET");
		
		Select se = new Select(batchNo);
		se.selectByIndex(5);
		
		batchnm.sendKeys("SDET94");
		assignNm.sendKeys("LMS UI Screens");
		grade.sendKeys("A+");
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
		
	 
	   //click on ‘Choose file’ to upload the desired file
	 browse.sendKeys("C:\\Users\\bhava\\Desktop\\Files\\LMS UI Screens Test Case.docx"); 
	//Uploading the file using sendKeys
	
	   System.out.println("File is Uploaded Successfully");
		
	}
	public void enters_all_optional_field_values_with_invalid_data()
	{
		Select se = new Select(batchNo);
		se.selectByValue("SDET001");;
		Assigndescrip.sendKeys("Appium Framework");
		grade.sendKeys("F");
		//click on ‘Choose file’ to upload the desired file
		   browse.sendKeys("C:\\Users\\bhava\\Desktop\\Files\\UI Screens.docx"); //Uploading the file using sendKeys
		   System.out.println("File is Uploaded Unsuccessfully");
	}
	
	public void all_fields_without_pgm_nm() throws InterruptedException
	{

		//Select select = new Select(pgmdrpdn);
		//select.selectByVisibleText("SDET");
		
		Select se = new Select(batchNo);
		se.selectByIndex(5);
		Assigndescrip.sendKeys("Cucumber BDD Framework");
		batchnm.sendKeys("SDET94");
		assignNm.sendKeys("LMS UI Screens");
		grade.sendKeys("A+");
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
		
	 
	   //click on ‘Choose file’ to upload the desired file
	 browse.sendKeys("C:\\Users\\bhava\\Desktop\\Files\\LMS UI Screens Test Case.docx"); 
	//Uploading the file using sendKeys
	
	   System.out.println("File is Uploaded Successfully");
	}
public void error_message_dispalys_program_name_is_missing() {
		
		String actual_msg=pgmerr.getText();
	    String expect="Program name is missing";
	    if(actual_msg.equalsIgnoreCase(expect))
	   //   Assert.assertTrue(true);
	    System.out.println("Program name is missing ...........");
}
public void enters_all_fileds_values_without_batch_number() throws InterruptedException
{
			Select select = new Select(pgmdrpdn);
			select.selectByVisibleText("SDET");
			
			//Select se = new Select(batchNo);
			//se.selectByIndex(5);
			Assigndescrip.sendKeys("Cucumber BDD Framework");
			batchnm.sendKeys("SDET94");
			assignNm.sendKeys("LMS UI Screens");
			grade.sendKeys("A+");
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
			
		 
		   //click on ‘Choose file’ to upload the desired file
		 browse.sendKeys("C:\\Users\\bhava\\Desktop\\Files\\LMS UI Screens Test Case.docx"); 
		//Uploading the file using sendKeys
		
		   System.out.println("File is Uploaded Successfully");
		}

public void error_message_dispalys_batch_number_is_missing() {
	
	String actual_msg=batcherr.getText();
    String expect="Batch Number  is missing";
    if(actual_msg.equalsIgnoreCase(expect))
  //    Assert.assertTrue(true);
    System.out.println("Batch Number is missing...........");
}
public void enters_all_fileds_values_without_assignment_name() throws InterruptedException
{
	Select select = new Select(pgmdrpdn);
	select.selectByVisibleText("SDET");
	
	Select se = new Select(batchNo);
	se.selectByIndex(5);
	Assigndescrip.sendKeys("Cucumber BDD Framework");
	batchnm.sendKeys("SDET94");
	//assignNm.sendKeys("LMS UI Screens");
	grade.sendKeys("A+");
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
	
 
   //click on ‘Choose file’ to upload the desired file
 browse.sendKeys("C:\\Users\\bhava\\Desktop\\Files\\LMS UI Screens Test Case.docx"); 
//Uploading the file using sendKeys

   System.out.println("File is Uploaded Successfully");
}
public void error_message_dispalys_assign_name_is_missing()
{
	driver.getWindowHandle();
	String actual_msg=assignmerr.getText();
    String expect="Assignment name is missing";
    if(actual_msg.equalsIgnoreCase(expect))
  //    Assert.assertTrue(true);
    System.out.println("Assignment name is missing.......");
}
public void enters_all_fileds_values_without_assignment_duedate()
{
	Select select = new Select(pgmdrpdn);
	select.selectByVisibleText("SDET");
	
	Select se = new Select(batchNo);
	se.selectByIndex(5);
	Assigndescrip.sendKeys("Cucumber BDD Framework");
	batchnm.sendKeys("SDET94");
	assignNm.sendKeys("LMS UI Screens");
	grade.sendKeys("A+");
//	calendericon.click();
//	Thread.sleep(1000);
//	while(true)
//	{
//		String text=calmonth.getText();
//		if(text.equalsIgnoreCase(month))
//		{
//			break;
//			
//		}
//		else
//		{
//			calday.click();
//		}
//	}
//	driver.findElement(By.xpath("div[9]/div/table//tbody//tr//td[contains(text(),"+day+")]")).click();
	
 
   //click on ‘Choose file’ to upload the desired file
 browse.sendKeys("C:\\Users\\bhava\\Desktop\\Files\\LMS UI Screens Test Case.docx"); 
//Uploading the file using sendKeys

   System.out.println("File is Uploaded Successfully");
}
public void error_message_dispalys_assignment_duedate_is_missing()
{
	driver.getWindowHandle();
	String actual_msg=duedate.getText();
    String expect="Assignment duedate is missing";
    if(actual_msg.equalsIgnoreCase(expect))
      //Assert.assertTrue(true);
    System.out.println("Assignment duedate is missing.......");
}
public void enters_all_fileds_values_without_grade_by() throws InterruptedException
{
	Select select = new Select(pgmdrpdn);
	select.selectByVisibleText("SDET");
	
	Select se = new Select(batchNo);
	se.selectByIndex(5);
	Assigndescrip.sendKeys("Cucumber BDD Framework");
	batchnm.sendKeys("SDET94");
	assignNm.sendKeys("LMS UI Screens");
	//grade.sendKeys("A+");
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
	
 
   //click on ‘Choose file’ to upload the desired file
 browse.sendKeys("C:\\Users\\bhava\\Desktop\\Files\\LMS UI Screens Test Case.docx"); 
//Uploading the file using sendKeys

   System.out.println("File is Uploaded Successfully");
}
public void error_message_dispalys_grade_by_is_missing()
{
	driver.getWindowHandle();
	String actual_msg=grade_err.getText();
    String expect="Grade is missing";
    if(actual_msg.equalsIgnoreCase(expect))
      //Assert.assertTrue(true);
    System.out.println("Grade is missing.......");
}
public void enters_all_fileds_values_with_passed_date() throws InterruptedException
{
	String month="July 2023";
	int day=23;
	Select select = new Select(pgmdrpdn);
	select.selectByVisibleText("SDET");
	
	Select se = new Select(batchNo);
	se.selectByIndex(5);
	Assigndescrip.sendKeys("Cucumber BDD Framework");
	batchnm.sendKeys("SDET94");
	assignNm.sendKeys("LMS UI Screens");
	grade.sendKeys("A+");
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
	
 
   //click on ‘Choose file’ to upload the desired file
 browse.sendKeys("C:\\Users\\bhava\\Desktop\\Files\\LMS UI Screens Test Case.docx"); 
//Uploading the file using sendKeys

   System.out.println("File is Uploaded Successfully");

}
public void error_message_dispalys_assignment_can_not_created_for_the_passed_date() {
	
		driver.getWindowHandle();
		String actual_msg=pastdate.getText();
	    String expect="Passed dated assignment is not created..........";
	    if(actual_msg.equalsIgnoreCase(expect))
	   //   Assert.assertTrue(true);
	    System.out.println("Passed dated assignment is not created..........");
	}

public void clicks_on_date_from_date_picker() throws InterruptedException 
{
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
public void verify_class_date_and_selected_date_are_same()
{
}

	public void verify_date_format_mm_dd_yyyy() {
        Date date=new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
		String formattedDate=dateFormat.format(date);
		System.out.println(formattedDate);
}
	public void clicks_on_next_arrow_in_date_picker() {
		
		if(Calnext_arrow.isEnabled())
		{
			Calnext_arrow.click();
		}
	}
	public void next_month_calendar_displays() {
		
		next_month.click();
		String text=next_month.getText();
		System.out.println(text);
	}
	public void clicks_on_previous_arrow_in_date_picker() {
		
		if(calprev_arrow.isEnabled())
		{
			calprev_arrow.click();
		}
	}
	public void previous_month_calendar_displays() {
		prev_month.click();
		prev_month.getText();
		System.out.println(prev_month);
	}
	public void displays_current_date() {
		Calendar calendar=Calendar.getInstance();
		Date currentDate=(Date) calendar.getTime();
		System.out.println(currentDate);
	}
	public void displays_selected_date_in_date_picker() throws InterruptedException 
	{
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
	public void clicks_on_cancel_button_with_entering_values_in_fields() throws InterruptedException
	{
		Select select = new Select(pgmdrpdn);
		select.selectByVisibleText("SDET");
		
		Select se = new Select(batchNo);
		se.selectByIndex(5);
		Assigndescrip.sendKeys("Cucumber BDD Framework");
		batchnm.sendKeys("SDET94");
		assignNm.sendKeys("LMS UI Screens");
		grade.sendKeys("A+");
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
		
	 
	   //click on ‘Choose file’ to upload the desired file
	 browse.sendKeys("C:\\Users\\bhava\\Desktop\\Files\\LMS UI Screens Test Case.docx"); 
	//Uploading the file using sendKeys

	   System.out.println("File is Uploaded Successfully");
	   cancelbtn.click();
	   
	}
	
	public String verify_new_assignment_created_in_the_data_table(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./InputData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet("Sheet3").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

	
	public void clicks_on_cancel_button_without_entering_values_in_fields() {
		cancelbtn.click();
	}
}





