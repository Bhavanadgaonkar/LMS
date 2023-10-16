package com.lms.ui.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditNewUser_Pages {
	
	private WebDriver dr;
	
	@FindBy(xpath="button[id=edit']") WebElement EditBtn;
	@FindBy(xpath="//input[@id='PopUp']") WebElement popup;
	@FindBy(xpath="button[id=submit']") WebElement submitBtn;
	@FindBy(xpath="	//div[@role='alert']")WebElement ErrorMessg;
	@FindBy(name="firstname")WebElement FirstName;
	@FindBy(name="lastname")WebElement LastName;
	@FindBy(name="description")WebElement description;
	@FindBy(name="location")WebElement Location;
	@FindBy(xpath="//*[@id='dropBox']") WebElement DropBox;
	@FindBy(xpath="//input[@type='edittext']")
	WebElement  EditIcon;
	@FindBy(xpath="//input[button='save']")
	WebElement  save;
	
	
	public EditNewUser_Pages(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr,this);
	}
	
	 public void ClickEditIcon() {
		 
		   EditIcon.click();
		   
	   }
	 public void Clicksave() {
		 
		   save.click();
		   
	   }
	 public void PopUp() throws InterruptedException {
			Thread.sleep(3000);
			 WebElement popUp = dr.findElement(By.id("popup-id")); 
		        if (!popUp.isDisplayed()) {
		            throw new AssertionError("Pop-up is not displayed.");
		        }
	 }
	
	 public void verifyEditIcon() {
		   Boolean Edit = EditIcon.isEnabled();
		   if(Edit) {
			   System.out.println("EditIcon is Enable");
			   
		   }
		   else {
			   System.out.println("EditIcon not is Enable");
		   }
	 }
	 public void verifyEditButton() {
		   Boolean Edit = EditBtn.isEnabled();
		   if(Edit) {
			   System.out.println("EditIcon is Enable");
			   
		   }
		   else {
			   System.out.println("EditIcon not is Enable");
		   }
		 
	   }
	 public void updateFields(String fname,String lname) throws InterruptedException {
		  EditBtn.click();
		 Thread.sleep(3000);
		  FirstName.sendKeys(fname);
		  LastName.sendKeys(lname);
		 submitBtn.click();
				
			}
	 public String invalidCredentialMessg() {
			return ErrorMessg.getText();
		}
	 public void cleartext() {
		 FirstName.clear();
		 LastName.clear();
	 }
	 public void cleardescription() {
		 description.clear();
		 
		 
	 }
}
	 
	 
	 



