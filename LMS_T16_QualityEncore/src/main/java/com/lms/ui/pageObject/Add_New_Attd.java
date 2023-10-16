package com.lms.ui.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_New_Attd {
	static WebDriver driver;
	
	@SuppressWarnings("static-access")
	public Add_New_Attd(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	WebElement savebtn =driver.findElement(By.xpath("save button"));
	Alert alert = driver.switchTo().alert(); // switch to alert
	public WebElement pgmname = driver.findElement(By.xpath("program name"));
	public WebElement clsname = driver.findElement(By.xpath("class name"));
	public WebElement stdname = driver.findElement(By.xpath("student name"));
	public WebElement attd = driver.findElement(By.xpath("attendance "));
	public WebElement date = driver.findElement(By.xpath("date"));

	
	

	public void clicks_save() {
		// TODO Auto-generated method stub
		savebtn.click();
	}
	public String popupmsg() {
		// TODO Auto-generated method stub
		String alertMessage= alert.getText(); // capture alert message
		return alertMessage;
	}
	
	
	
	
	
}
