package com.lms.ui.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteUser_Pages {
private WebDriver dr;
	
	@FindBy(xpath="//input[@value='delete']") WebElement deleteBtn;
	@FindBy(xpath="//input[@id='alert']")
	WebElement alert;
	@FindBy(xpath = "//button[text()='yes']")
	WebElement YesBtn;
	@FindBy(xpath = "//button[text()='no']")
	WebElement NoBtn;
	@FindBy(xpath = "//input[@type='Delete']")WebElement DeleteIcon;

	public DeleteUser_Pages(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	public void Deleteicon() {
		deleteBtn.click();
	}
	public void verifyDeleteIcon() {
		Boolean Delete = DeleteIcon.isEnabled();
		if (Delete) {
			System.out.println("DeleteIcon is Enable");

		} else {
			System.out.println("DeleteIcon not is Enable");
		}
	}
	public void alert() {
		dr.switchTo().alert().accept();
		
	}
	public void YesButton() throws InterruptedException {
		Thread.sleep(3000);
		YesBtn.click();
	}
	public void NoButton() throws InterruptedException {
		Thread.sleep(3000);
		NoBtn.click();
	}
	public void PopUp() throws InterruptedException {
		Thread.sleep(3000);
		 WebElement popUp = dr.findElement(By.id("popup-id")); 
	        if (!popUp.isDisplayed()) {
	            throw new AssertionError("Pop-up is not displayed.");
	        }

}
}



