package com.lms.ui.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Del_Multiple_Attd {
static WebDriver driver;
	
	@SuppressWarnings("static-access")
	public Del_Multiple_Attd(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	  
	WebElement checkbox = driver.findElement(By.linkText("Checkbox "));
	WebElement delicon =driver.findElement(By.xpath("delete icon"));
	Alert alert = driver.switchTo().alert(); // switch to alert
	
	public void click_chkbox() {
		// TODO Auto-generated method stub
		checkbox.click();
	}
	public boolean delicon() {
		boolean delicons = delicon.isEnabled();
		return delicons;
		}
	
	public boolean selected() {
		boolean isSelected = checkbox.isSelected();
		return isSelected;
	}
	
	public String popupmsg() {
		// TODO Auto-generated method stub
		String alertMessage= alert.getText(); // capture alert message
		return alertMessage;
	}
}
