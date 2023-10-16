package com.lms.ui.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteMultipleUser_Pages {
	
	
	private WebDriver dr;
	
	@FindBy(xpath="//input[@type='Delete']")
	WebElement  DeleteIcon;
	@FindBy(xpath="//input[@type='checkbox1']") WebElement SingleCheckRow;
	@FindBy(xpath="//input[@Type='checkbox1 and checkbox2") WebElement multipleCheckBox;
	
	
	public DeleteMultipleUser_Pages(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	 public void verifyDelete() {
		  if ( DeleteIcon !=null) {
			  System.out.println("Delete button is Disable");
		  }
		  else {
			  System.out.println("Delete button is not  Disable");
		  }

	 }
	 public void singlecheckrow() {
		  SingleCheckRow.click();
		  
	  }
	 public void Multiplecheckbox() {
		  multipleCheckBox.click();
	 }
	 
}
