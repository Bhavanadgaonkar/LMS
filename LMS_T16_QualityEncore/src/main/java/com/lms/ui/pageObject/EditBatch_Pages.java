package com.lms.ui.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditBatch_Pages {
private WebDriver dr;
	
	
	@FindBy(xpath="//input[@type='edittext']")
	WebElement  EditIcon;
	@FindBy(name="name")WebElement Name;
	@FindBy(xpath="//input[@id='Description']") WebElement description;
	@FindBy(xpath="button[id=save']") WebElement savebutton;
	@FindBy(xpath="	//div[@role='alert']")WebElement invalidMessg;
	@FindBy(xpath="//input[@id='MandatoryField']") WebElement MandatoryField;
	
	@FindBy(id="status-active")WebElement status;
	
	
	public EditBatch_Pages(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
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
	 public void ClickEditIcon() {
	 
		   EditIcon.click();
		   
	   }
	 public void statusclick() {
		 status.click();
	 }
	 public void enterName(String name) {
		 Name.sendKeys(name);
		}
       public void Desc(String Name) {
    	   description.sendKeys(Name);
       }
       
       public void Save() {
    	   savebutton.click();
       }
       
       public String invalidCredentialMessg() {
    	   
   		return invalidMessg.getText();
   	}
       public void deleteMandatory() {
    	   MandatoryField.clear();
       }
       public void deleteDescription() {
    	   description.clear();
       }
}
      

