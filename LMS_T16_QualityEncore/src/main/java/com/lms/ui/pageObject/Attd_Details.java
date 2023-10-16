package com.lms.ui.pageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Attd_Details {
	
	WebDriver driver;
	
	
	public Attd_Details(WebDriver driver) {
	
		this.driver=driver;
	}
	
	WebElement click_newAttd = driver.findElement(By.xpath("//div[@class='newAttd']/span"));
	WebElement actualString = driver.findElement(By.xpath("actualString"));
	WebElement dropdown =driver.findElement(By.xpath("//select[@name=�selType�]"));
	WebElement popupcl = driver.findElement(By.xpath("popup close button"));
	WebElement savebtn =driver.findElement(By.xpath("save button"));
	WebElement cancelbtn =driver.findElement(By.xpath("cancel button"));
	Select drpdwn = new Select(driver.findElement(By.name("dropdown")));
	WebElement drpdwnString =driver.findElement(By.xpath("dropdown spelling"));
	WebElement date = driver.findElement(By.xpath("date"));
	WebElement namea = driver.findElement(By.xpath("programname"));
	WebElement namee = driver.findElement(By.xpath("programname in table"));
	WebElement classa = driver.findElement(By.xpath("classname"));
	WebElement classe = driver.findElement(By.xpath("classname in table"));
	WebElement datepicker = driver.findElement(By.xpath("//div[@class='date picker']/span"));

	
	public void clicks_newAttendance() {
	
		click_newAttd.click();
	}
	
	public void clicks_datepicker() {
	
		datepicker.click();
	}
	
	public String Spelling() {
		return actualString.getText();
	}
	

	public int dropdownct() {
		Select s = new Select(dropdown);
	    // getting the list of options in the dropdown with getOptions()
	    List<WebElement> op = s.getOptions();
	    int size = op.size();
	    return size;
	}
	
	 public boolean popupclose() {
			boolean popupcls = popupcl.isDisplayed();
			return popupcls;
	}

	 public String clsbtnallignment() {			

		 return popupcl.getAttribute("align");

		}
	 	 		 	
	 public String textcolor() {
		 String TextColor = driver.findElement(By.name("submit")).getCssValue("color");
		 return TextColor;
		 
	 }
	 
	 public boolean savebutn() {
			boolean save = savebtn.isDisplayed();
			return save;
	}

	public boolean cancelbutn() {
		boolean cancel = cancelbtn.isDisplayed();
		return cancel;
	}
	
	public void clickpgmname() {
		drpdwn.selectByVisibleText("program name");
	}

	public void clickclsname() {
		drpdwn.selectByVisibleText("class name");
	}
	
	public void clickattd() {
		drpdwn.selectByVisibleText("attandance");
	}
	
	public String drpdwnSpelling() {
		return drpdwnString.getText();
	}
	public String namee() {
		return namee.getText();
	}
	public String namea() {
		return namea.getText();
	}
	public String classe() {
		return classe.getText();
	}
	public String classa() {
		return classa.getText();
	}
	
}

