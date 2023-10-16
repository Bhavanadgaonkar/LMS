package com.lms.ui.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lms.ui.util.*;

public class AddNewBatch_Pages {
	private WebDriver dr;

	@FindBy(xpath = "//input[@id='PopUp']")
	WebElement popup;
	@FindBy(xpath = "//input[@id=status")WebElement status;

	@FindBy(xpath = "//input[@name='Name']")
	WebElement Name;
	@FindBy(xpath = "//input[@text=noclasses")
	WebElement NoOfClasses;
	@FindBy(xpath = "//input[@id='Description']")
	WebElement description;
	@FindBy(xpath = "//input[@id='ProgramName']")
	WebElement ProgramName;
	@FindBy(xpath = "//a[@id='ProgramName']")
	WebElement DropBox;
	@FindBy(xpath = "button[text()='Radio']")
	WebElement RadioButton;
	@FindBy(xpath = "button[id=save']")
	WebElement savebutton;
	@FindBy(xpath = "	//div[@role='alert']")
	WebElement invalidMessg;

	public AddNewBatch_Pages(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	public void PopUp() throws InterruptedException {
		Thread.sleep(3000);
		 WebElement popUp = dr.findElement(By.id("popup-id")); 
	        if (!popUp.isDisplayed()) {
	            throw new AssertionError("Pop-up is not displayed.");
	        }

	        
	        List<WebElement> textFields = popUp.findElements(By.tagName("Name"));
	        List<WebElement> textFields1 = popUp.findElements(By.tagName("Noof classes"));
	        WebElement programNameDropDown = popUp.findElement(By.id("program-name-edsropdown")); 
	        List<WebElement> radioButtons = popUp.findElements(By.cssSelector("input[type='radio']"));
	        

	        if (textFields.size() != 3 || programNameDropDown == null || radioButtons.size() != 1) {
	            throw new AssertionError("Expected fields not found in the pop-up.");
	        }
	    }
	
	
		// popup.click();

	

	public void VerifyFields() {
		Boolean FieldsName = Name.isDisplayed();
		if (FieldsName) {
			System.out.println("Name is Displayed");

		} else {
			System.out.println("Name not is Displayed");
		}
	}

	public void VerifyNoOFClasses() {
		Boolean NoOFClasses = NoOfClasses.isDisplayed();
		if (NoOFClasses) {
			System.out.println("NoOfClasses is Displayed");

		} else {
			System.out.println("NoOfClasses not is Displayed");
		}
	}

	public void VerifyDescription() {
		Boolean Description = NoOfClasses.isDisplayed();
		if (Description) {
			System.out.println("Description is Displayed");

		} else {
			System.out.println("Description not is Displayed");
		}
	}

	public void VerifyRadioButton() {
		Boolean RadioBTN = NoOfClasses.isDisplayed();
		if (RadioBTN) {
			System.out.println("Radio Button is Displayed");

		} else {
			System.out.println("Radio Button not is Displayed");
		}
	}
	
	

	public void enterfields(String name,String progname) {
		Name.sendKeys(name);
		ProgramName.sendKeys(progname);
		status.click();
		savebutton.click();
	}
	public void fillfields(String name,String progname,String desc) {
		Name.sendKeys(name);
		ProgramName.sendKeys(progname);
		description.sendKeys(desc);
		
		
	}

	public String invalidCredentialMessg() {
		return invalidMessg.getText();
	}
	public void enterFields() {

}

}
