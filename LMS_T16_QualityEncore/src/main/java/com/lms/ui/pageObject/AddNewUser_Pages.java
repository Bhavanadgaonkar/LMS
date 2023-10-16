package com.lms.ui.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lms.ui.util.LoggerLoad;

public class AddNewUser_Pages {

	private WebDriver dr;

	@FindBy(xpath = "//input[@type='NewUser']")
	WebElement NewUser;
	

	@FindBy(xpath = "//input[@id='PopUp']")
	WebElement popup;

	@FindBy(xpath = "//input[@name='FirstName']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@name='LastName']")
	WebElement LastName;

	@FindBy(xpath = "//input[@button=click']")
	WebElement clickedit;

	@FindBy(xpath = "//input[@text='Location']")
	WebElement Location;

	@FindBy(xpath = "//input[@text='noclasses']")
	WebElement NoOfClasses;
	@FindBy(xpath = "//input[@text='description']")
	WebElement Description;
	@FindBy(xpath = "//input[@text=email")
	WebElement Email;

	@FindBy(xpath = "//input[@text='RoleStatus'")
	WebElement RoleStatus;
	@FindBy(xpath = "//input[@type='edittext']")WebElement EditIcon;
	@FindBy(xpath = "//input[@text='VisaStatus'")
	WebElement VisaStatus;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement SubmitBtn;

//Method Creation

	public AddNewUser_Pages(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

//Addnewuser
	public void addingNewUser() {
		NewUser.click();
	}
	
	public void submit() {
		SubmitBtn.click();
	}


	public void EditIcon() {
		Boolean Edit = EditIcon.isEnabled();
		if (Edit) {
			System.out.println("EditIcon is Enable");

		} else {
			System.out.println("EditIcon not is Enable");
		}

	}
	public void PopUp() throws InterruptedException {
		Thread.sleep(3000);
		 WebElement popUp = dr.findElement(By.id("popup-id")); 
	        if (!popUp.isDisplayed()) {
	            throw new AssertionError("Pop-up is not displayed.");
	        }
	}
	public void clickEdit() {
		clickedit.click();
	}
	

	// Verifyall the fields in Add/User popup Page
	public void verifyfieldsvisibility() {
		WebElement Fields = dr.findElement(By.tagName("input"));
		if (Fields.isDisplayed()) {
			System.out.println("field is visible" + Fields);
		} else {
			System.out.println("field is not Visible" + Fields);
		}
	}

	public void VerifyFirstname() {
		Boolean firstName = FirstName.isDisplayed();
		if (firstName) {
			System.out.println("Name is Displayed" + FirstName);

		} else {
			System.out.println("FirstName not is Displayed");
		}
	}

	// verifylastname
	public void VerifyLastname() {
		Boolean lastName = FirstName.isDisplayed();
		if (lastName) {
			System.out.println("LastName is Displayed" + lastName);

		} else {
			System.out.println("LastName not is Displayed");
		}
	}

	// verify fields
	public void VerifyFields() {
		Boolean location = Location.isDisplayed();
		if (location) {
			System.out.println("Location is Displayed" + location);

		} else {
			System.out.println("Location not is Displayed");
		}
	}

	// User enters firstname in Mandatory fields
	public void Firstnamefields(String name) {
		FirstName.sendKeys(name);
		// savebutton.click();
	}

	// User enters Lastname in Mandatory fields

	public void Lastnamefields(String name) {
		LastName.sendKeys(name);
		// savebutton.click();
	}

//User enters firstname in Mandatory fields
	public void enterfields(String name) {
		FirstName.sendKeys(name);
		// savebutton.click()
	}

//User enters Location in Mandatory fields
	public void Loation(String name) {
		Location.sendKeys(name);
		// savebutton.click();
	}

//User enters firstname in Mandatory fields
	public void Rolestatus(String name) {
		RoleStatus.sendKeys(name);
		// Cursor.MOVE_CURSOR();
	}

//User enters Visastatus in Mandatory fields
	public void Visastatus(String name) {
		VisaStatus.sendKeys(name);
		// savebutton.click();
	}

//User clicks submit button after giving Mandatory fields
	public void submitbutton() {
		SubmitBtn.click();
		dr.navigate().back();
	}

//check the user is added on the table
	public void visibilityaddedUser() {

		WebDriverWait wait = new WebDriverWait(dr, java.time.Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmation")));
		WebElement table = dr.findElement(By.id("Name"));
		boolean Useradded = table.getText().contains("Michelle Leo") && table.getText().contains("Lasvegas");
		if (Useradded) {
			System.out.println("User is added to the table " + Useradded);

		} else {
			System.out.println("User is not added to the table ");
		}
	}

	// error messages for invalid fields
	public void Verifyinvalidfields() {

		boolean username = false;
		if (username) {
			System.out.println("User given invalid inputs");

		} else {
			System.out.println("User has given valid values");
		}
	}

	// Mandatory fields blank error message
	public void Manfieldserrormsg() {

		Boolean FieldsName = FirstName.isDisplayed();
		if (FieldsName) {
			System.out.println("Name is Displayed");

		} else {
			System.out.println("Name not is Displayed");
		}
	}
	public void Update() {
		LoggerLoad.info("Admin can see updated data");
	}
	public void mandatory() {
		FirstName.clear();
		LastName.clear();
		Location.clear();
		VisaStatus.clear();
	}
	public void Cleardescription() {
		Description.clear();
		
	}
}

