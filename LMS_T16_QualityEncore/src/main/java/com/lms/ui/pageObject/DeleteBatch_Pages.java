package com.lms.ui.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lms.ui.util.*;

public class DeleteBatch_Pages {
	private WebDriver dr;
	
	@FindBy(xpath="//input[@value='delete']") WebElement deleteBtn;
	@FindBy(xpath="//input[@id='alert']")
	WebElement alert;
	@FindBy(xpath="//*[id='Yes_button']") WebElement YesButton;
	@FindBy(xpath="//*[id='No_button']") WebElement NoButton;
	@FindBy(xpath = "//input[@type='Delete']")WebElement DeleteIcon;
	
	
	
	public DeleteBatch_Pages(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	public void Deleteicon() {
		deleteBtn.click();
	}
	
	public void alert() {
		dr.switchTo().alert().accept();
		 LoggerLoad.info("---------alert message verified-------");
		
	}
	
	public void verifyDeleteIcon() {
		Boolean Delete = DeleteIcon.isEnabled();
		if (Delete) {
			System.out.println("DeleteIcon is Enable");

		} else {
			System.out.println("DeleteIcon not is Enable");
		}
	}

	
	public void YesBtn() {
		YesButton.click();
	}
	public void NoBtn() {
		NoButton.click();
	}


}
