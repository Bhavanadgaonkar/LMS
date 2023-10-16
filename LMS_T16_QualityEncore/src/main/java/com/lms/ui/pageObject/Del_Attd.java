package com.lms.ui.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Del_Attd {
	static WebDriver driver;
	
	@SuppressWarnings("static-access")
	public Del_Attd(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	WebElement click_dltbtn = driver.findElement(By.xpath("//div[@class='deletebtn']/span"));
	Alert alert = driver.switchTo().alert(); // switch to alert
	WebElement yesbtn =driver.findElement(By.xpath("yes button"));
	WebElement nobtn =driver.findElement(By.xpath("no button"));


	public void click_del_btn() {
		// TODO Auto-generated method stub
		click_dltbtn.click();
	}
	
	public String popupmsg() {
		// TODO Auto-generated method stub
		String alertMessage= alert.getText(); // capture alert message
		return alertMessage;
	}
	
	public boolean nobutn() {
		boolean no = nobtn.isDisplayed();
		return no;
}
	public boolean yesbutn() {
		boolean yes = yesbtn.isDisplayed();
		return yes;
}
	
	public void click_yes_btn() {
		// TODO Auto-generated method stub
		yesbtn.click();
	}
	
	public void click_no_btn() {
		// TODO Auto-generated method stub
		nobtn.click();
	}
}
