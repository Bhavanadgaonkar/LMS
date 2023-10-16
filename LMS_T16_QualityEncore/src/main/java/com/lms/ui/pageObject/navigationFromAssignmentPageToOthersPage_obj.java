package com.lms.ui.pageObject;


//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class navigationFromAssignmentPageToOthersPage_obj {
	
	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement pwd;
	
	@FindBy(className = "Login")
	WebElement loginbtn;
	
	
	public void logged_in_lms_portal_as_a_admin() {
		driver.get("www.Lms.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout();
		
		username.sendKeys("Admin");
		pwd.sendKeys("Admin");
		loginbtn.click();
	}
	public void admin_is_in_manage_assignment_page() 
	{
		driver.getTitle().equalsIgnoreCase("manage assignment page");
	}
	
	public void clicks_on_student_button_in_navigation_bar() 
	{
	    driver.findElement(By.linkText("Student")).click();
	}
	
	public void navigate_to_student_page() 
	{
		driver.navigate().to("https://www.lms.com/student-page");
	//	Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.lms.com/student-page"));
		
	}
	
	public void clicks_on_program_button_in_navigation_bar() 
	{
		driver.findElement(By.linkText("Program")).click();
	}

	
	public void navigate_to_program_page() {
		driver.navigate().to("https://www.lms.com/program-page");
		//Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.lms.com/program-page"));
	}

	
	public void clicks_on_batch_button_in_navigation_bar() {
		driver.findElement(By.linkText("Batch")).click();
	}

	
	public void navigate_to_batch_page() {
		driver.navigate().to("https://www.lms.com/batch-page");
		//Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.lms.com/batch-page"));
	}
	
	public void clicks_on_user_button_in_navigation_bar() {
		driver.findElement(By.linkText("User")).click();
	}

	
	public void navigate_to_user_page() {
		driver.navigate().to("https://www.lms.com/user-page");
	//	Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.lms.com/user-page"));
	}

	
	public void clicks_on_class_button_in_navigation_bar() {
		driver.findElement(By.linkText("Class")).click();
	}

	
	public void navigate_to_class_page() {
		driver.navigate().to("https://www.lms.com/class-page");
	//	Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.lms.com/class-page"));
	}

	
	public void clicks_on_attendance_button_in_navigation_bar() {
		driver.findElement(By.linkText("Attendance")).click();
	}

	
	public void navigate_to_attendance_page() {
		driver.navigate().to("https://www.lms.com/attendance-page");
		//Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.lms.com/attendance-page"));
	}

	
	public void clicks_on_login_button_in_navigation_bar() {
		driver.findElement(By.linkText("Login")).click();
	}

	
	public void navigate_to_login_page() {
		driver.navigate().to("https://www.lms.com/login-page");
		//Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.lms.com/login-page"));
}

}
