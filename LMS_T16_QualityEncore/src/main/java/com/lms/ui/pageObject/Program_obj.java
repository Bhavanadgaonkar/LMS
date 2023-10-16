package com.lms.ui.pageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program_obj {
	WebDriver dr;
	String ChildWindow_ProgramDetails;
	String MainWindow;
	
	By linkProgram = By.linkText("Program");
	By lnkManagePgm = By.linkText("Manage Program");
	By txtPgmHeader = By.xpath("//div[@class='Manage Program']");
	By txtPaginationIcon = By.xpath("//a[@class='pagination']");
	By textPgmFooter = By.xpath("//div[@class='footertext']");
	By deleteIcon=By.id("delete");
	By addNewProgramBtn= By.xpath("//div/button");
	By noOfRecords = By.xpath("//table[@id='example']/tbody/tr");
	By columnHeader = By.xpath("//table[@id='example']/thead/tr/th");
	By sortArrowIcon= By.id("Sort Arrow icon");
	By checkBox = By.xpath("//div[@id='Program']/div/div/input");
	By editDeleteBtn = By.xpath("//div[@id='editDeleteButton']/div/div/input");
	By searchPlaceHolder = By.xpath("//input[@placeholder='Search . . .']");
	By inputSearch = By.xpath("//input[@type='search']");
//Add new Program
	By saveBtn = By.id("save") ;
	By cancelBtn = By.id("cancel");
	By closeIcon = By.id("close");
	By namePlaceHolder =By.xpath("//input[@placeholder='Name']");
	By descPlaceHolder =By.xpath("//input[@placeholder='Description']");
	By nameTextBox =   By.id("name");
	By descTextBox =By.name("description");
	By activeRadioBtn = By.id("active");
	By inActiveRadioBtn = By.id("inactive");
	By programName =By.id("program_name");
	By programDescription =By.id("program_description");
	By programStatus = By.id("program_status");
//Edit
	By editBtn =By.xpath("//table[@id='example']/tbody/tr/td[7]");
//Delete
	By deleteBtn = By.cssSelector(".DTED_Lightbox_Content");
	By closeIconDelete = By.cssSelector(".DTED_Lightbox_Close");
//Multiple Delete
	
			
//Pagination
	By nextLink = By.xpath("//div/a[@class='paginate_button next']");
	By lastPageIcon = By.xpath("//a[text()='»']");
	By firstPageIcon = By.xpath("//a[text()='<<']");
	By startPage =By.xpath("//div/a[@class='paginate_button start']");
	By previous = By.id("example_previous");
	By pagination= By.cssSelector("#example_paginate a");
	//By pagination= By.id("example_paginate");
	

	public Program_obj(WebDriver dr) {
		
			this.dr = dr;		
	}
//Manage Program Validation	
	public void clkProgramLink()
	{
		dr.findElement(linkProgram).click();
	}
	
	public String programPageValidation()
	{
		return dr.findElement(lnkManagePgm).getText();
	}
	public String pgmHeaderValidation()
	{
		return dr.findElement(txtPgmHeader).getText();
	}
	public String paginationTextWithIcon()
	{
		return dr.findElement(txtPaginationIcon).getText();
	}
	public String pgmFooterValidation()
	{
		return dr.findElement(textPgmFooter).getText();
	}
	public void disabledDeleteIcon()
	{
		String iconDelete = dr.findElement(deleteIcon).getAttribute("class");
		if(iconDelete.contains("disabled"))
    	{
    		System.out.println("Delete button Disabled");
    	}
	}
	
	/*public void disabledDeleteIcon()
	{
		
		String iconDelete= dr.findElement(deleteIcon).getText();
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("arguments[0].removeAttribute('disabled','disabled')",iconDelete);
	}*/
	
	public String ValidateNewProgramBtnVisibility()
	{
		return dr.findElement(addNewProgramBtn).getText();
	}
	public void noOfRecordsValidation()
	{
		int number = dr.findElements(noOfRecords).size();
		System.out.println("Total Number of Records :" +number);
	}
	public void columnHeaderValidation()
	{
		String headerText = null;
		List<WebElement> colHeaderElement =dr.findElements(columnHeader);
		for(int i=0;i<colHeaderElement.size();i++)
		{
			headerText =colHeaderElement.get(i).getText();
		}
		System.out.println(headerText);
	}
	public void sortArrowIconValidation()
	{
		WebElement element=dr.findElement(sortArrowIcon);
			if(element.isDisplayed())
			{
			System.out.println("Image displayed");
			}
			else
			{
			System.out.println("Image not displayed");
			}
	
	}
	public void displayedCheckBoxValidation()
	{
		
		List<WebElement> checkBoxElement =dr.findElements(checkBox);
		for(int i=0;i<checkBoxElement.size();i++)
		{
			Boolean condition =  checkBoxElement.get(i).isDisplayed();
			if(condition ==true)
			{
				System.out.println("Chekbox is displayed");
			}
		}
	}
	public void displayedEditDeleteBtnValidation()
	{
		
		List<WebElement> editDeleteBtnElement =dr.findElements(checkBox);
		for(int i=0;i<editDeleteBtnElement.size();i++)
		{
			Boolean condition =  editDeleteBtnElement.get(i).isDisplayed();
			if(condition ==true)
			{
				System.out.println("Edit and Delete button is displayed");
			}
		}
	}
	public String searchValidation()
	{
		return dr.findElement(searchPlaceHolder).getText();
	}
	public void inputSearchByProgramName()
	{
		dr.findElement(inputSearch).sendKeys("Jan23-TechWarrior");
	}
	public void displayedSearchByProgramNameValidation()
	{
		dr.findElement(inputSearch).isDisplayed();
		
		
	}
	public void inputSearchByProgramDesc()
	{
		dr.findElement(inputSearch).sendKeys("Desc");
	}
	public void displayedSearchByProgramDescValidation()
	{
		dr.findElement(inputSearch).isDisplayed();
		
		
	}
	public void inputSearchByProgramStatus()
	{
		dr.findElement(inputSearch).sendKeys("Active");
	}
	public void displayedSearchByProgramStatusValidation()
	{
		dr.findElement(inputSearch).isDisplayed();
		
		
	}
	public void inputSearchByUnrelatedKeyword()
	{
		dr.findElement(inputSearch).sendKeys("Active");
	}
	public String displayedSearchByUnrelatedKeywordValidation()
	{		
			return dr.findElement(txtPaginationIcon).getText();						
	}
	
//Add New Program
	public void clkAddNewProgram() {
		dr.findElement(addNewProgramBtn).click();
	}
	public void popupWindow()
	{
		MainWindow=dr.getWindowHandle();
		Set<String> s1=dr.getWindowHandles();
		Iterator<String> i1=s1.iterator();	
		while(i1.hasNext())			
	    {		
	        ChildWindow_ProgramDetails=i1.next();		
	        		
	        if(!MainWindow.equalsIgnoreCase(ChildWindow_ProgramDetails))			
	        { 
	        	dr.switchTo().window(ChildWindow_ProgramDetails);
	        	
	        }
	       // dr.close();
	    }
		//dr.switchTo().window(MainWindow);
	}
	public void displayedPopUpWindow()
	{
		
//Window handling code
		MainWindow=dr.getWindowHandle();	
// To handle all new opened window.				
        Set<String> s1=dr.getWindowHandles();		
    Iterator<String> i1=s1.iterator();		
    		
    while(i1.hasNext())			
    {		
        ChildWindow_ProgramDetails=i1.next();		
        		
        if(!MainWindow.equalsIgnoreCase(ChildWindow_ProgramDetails))			
        {    		
// Switching to Child window
             dr.switchTo().window(ChildWindow_ProgramDetails);	
             
             dr.findElement(cancelBtn).isDisplayed();
       		 dr.findElement(saveBtn).isDisplayed();
       		 dr.findElement(closeIcon).isDisplayed();                         			                		
                             
// Closing the Child Window.
             dr.close();		
        }		
    }		
// Switching to Parent window i.e Main Window.
        dr.switchTo().window(MainWindow);						
				 		 		
	}
	public void displayInputField_TextBoxValidation()
	{
		dr.switchTo().window(ChildWindow_ProgramDetails);
		dr.findElement(namePlaceHolder).isDisplayed();
		dr.findElement(descPlaceHolder).isDisplayed();
		dr.findElement(nameTextBox).isDisplayed();
		dr.findElement(descTextBox).isDisplayed();
		dr.close();
		dr.switchTo().window(MainWindow);
	}
	public void displayedStatusValidation()
	{
		dr.switchTo().window(ChildWindow_ProgramDetails);
		dr.findElement(activeRadioBtn).isDisplayed();
		dr.findElement(inActiveRadioBtn).isDisplayed();
				
	}
	public void clkSaveBtn() 
	{
		dr.findElement(saveBtn).click();
		
	}
	public void clkCancelBtn()
	{
		dr.findElement(cancelBtn).click();
		
	}
	public void cancelBtnValidation() {
		
		System.out.println("popup disappears without creating any program");
	}
    public void cancelBtnValidationForEdit() {
		
		System.out.println("popup disappears and can see nothing changed for particular program");
	}
	public void errorMessageAlertValidation()
	{
		Alert alert = dr.switchTo().alert();	
		String errortMsgAlert= alert.getText();
		System.out.println("Admin gets a error message alert " +errortMsgAlert);
		
	}
	public String MessageAlertValidation()
	{
		Alert alert = dr.switchTo().alert();	
		String MsgAlert= alert.getText();
		System.out.println("Admin gets a message alert " +MsgAlert);
		return MsgAlert;
		
	}
	
	public String successMessageAlertValidation()
	{
		return dr.switchTo().alert().getText();
	}
	public void enterProgramName(String pgmname)
	{
		dr.findElement(programName).sendKeys(pgmname);
	}
	public void enterProgramDescription(String pgmdesc)
	{
		dr.findElement(programDescription).sendKeys(pgmdesc);
	}
	public void enterProgramStatus(String pgmstatus)
	{
		dr.findElement(programStatus).click();
	}
	public void clkCloseIcon()
	{
		dr.findElement(closeIcon).click();
				
	}
	public void closeIconValidation()
	{
		Boolean condition= dr.findElement(closeIcon).isDisplayed();
		if(condition==false)
		{
		System.out.println("popup Window Closed");
		}
				
	}
//Edit
	public void clkEachEditIcon() throws InterruptedException
	{
		List<WebElement> editBtn_Ele = dr.findElements(editBtn);
		for(int i=1;i<editBtn_Ele.size();i++)
		{
		WebDriverWait w = new WebDriverWait(dr,Duration.ofSeconds(20));
		String editElement1 ="//table[@id='example']/tbody/tr["+i+"]/td[7]";
		
		System.out.println("EditIcon ----"+editElement1);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath(editElement1)));
		
		dr.findElement(By.xpath(editElement1)).click();
		Thread.sleep(1000);
		dr.close();
		//popupWindow();
		}
		
		
		/*for(int i=1;i<editElement.size();i++)
		{
			
			WebDriverWait w = new WebDriverWait(dr,Duration.ofSeconds(20));
			String editElement1 ="//table[@id='example']/tbody/tr[1]/td[7]";
			
			System.out.println("EditIcon ----"+editElement1);
			w.until(ExpectedConditions.elementToBeClickable(By.xpath(editElement1)));
			
			dr.findElement(By.xpath(editElement1)).click();
									 			
		}*/
		
	}
	public void displayPopupWindowForEdit()
	{
		dr.switchTo().window(ChildWindow_ProgramDetails);
		String title= dr.getTitle();
		System.out.println("Edit popup window displayed-- " +title);
		
		
	}
//Delete
	public void clkDeleteBtn()
	{
		List<WebElement> deleteBtn_Ele = dr.findElements(deleteBtn);
		for(int i=1;i<deleteBtn_Ele.size();i++)
		{
		WebDriverWait w = new WebDriverWait(dr,Duration.ofSeconds(20));
		String deleteElement1 ="//table[@id='example']/tbody/tr["+i+"]/td[8]";
		
		System.out.println("DeleteBtn ----"+deleteElement1);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath(deleteElement1)));
		
			
		dr.findElement(By.xpath(deleteElement1)).click();	
		}
	}
	public boolean isAlertPresentDelete(){
	    boolean foundAlert = false;
	    WebDriverWait wait = new WebDriverWait(dr,Duration.ofSeconds(10));
	    try {	    	
	        wait.until(ExpectedConditions.alertIsPresent());
	        foundAlert = true;
	    } catch (TimeoutException eTO) {
	        foundAlert = false;
	    }
	    return foundAlert;
	}
	
	/*public boolean isAlertPresent() 
	{ 
	    try 
	    { 
	        dr.switchTo().alert(); 
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	}   // isAlertPresent()*/
	
	public void alertDeleteBtnValidation()
	{
		dr.findElement(By.id("alertbtn")).click();
	    String alertDelMsg= dr.switchTo().alert().getText();
	    System.out.println("Delete Alert Message " +alertDelMsg);
	}
	public void clkYesBtn()
	{
		dr.switchTo().alert().accept();
	}
	public void clkNoBtn()
	{
		dr.switchTo().alert().dismiss();
	}
	public void clkCloseIconDelete()
	{
		dr.findElement(closeIconDelete).click();
	}
	public void closeIconDeleteValidation()
	{
		Boolean condition= dr.findElement(closeIconDelete).isDisplayed();
		if(condition==false)
		{
		System.out.println("deletion alert disappears without any changes");
		}
				
	}
//Multiple Delete
	public void clkSingleCheckBox()
	{
		WebElement checkBoxElement = dr.findElement(checkBox);
				
		boolean isSelected = checkBoxElement.isSelected();
		
		//performing click operation if element is not checked
		if(isSelected == false) {
			checkBoxElement.click();
		}
				
	}
	public void commonDeleteOption()
	{
		WebElement deleteEnable=dr.findElement(deleteIcon);
		boolean isEnabled = deleteEnable.isEnabled();
		// performing click operation if element is enabled
		if (isEnabled == true) {
			deleteEnable.click();
		}
		
	}
	public void  getTitle_ManageProgram_Page()
	{
		dr.get("https://ManageProgram_Page.html");
		String title = dr.getTitle();
		System.out.println("Manage Program Page" +title);
	}
	public void clkmultipleCheckBoxes()
	{
		List<WebElement> checkboxes = dr.findElements(By.className("cb-element mr-10"));
		for(int i=0; i<checkboxes.size(); i++)		
		{
		 if(checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled())
		 {
		 checkboxes.get(i).click();
		 }
		}
	}
//Sorting 
	public void sorting()
	{
	dr.get("http://www.javatpoint.com/wrapper-class-in-java");

	WebElement table=dr.findElement(By.xpath(".//*[@id='city']/table/tbody"));
	List<WebElement> lst=table.findElements(By.tagName("tr"));
	System.out.println(lst);

	List ls=new ArrayList<String>();
	for(int i=0;i<=6;i++)
	{
	    //ls=lst.addAll(get(i).getText());
	  
	}
	}
	

//Pagination	
	public void clkNextLink()
	{
		dr.findElement(nextLink).click();
		
	}
	public String clkNextLinkValidation()
	{
		return dr.findElement(nextLink).getText();
	}
	public void clkLastPageIcon()
	{
		dr.findElement(lastPageIcon).click();
		
	}
	public void disabledNextLink() 
	{
		String elementPaginator = dr.findElement(pagination).getAttribute("class");
			if(elementPaginator.contains("disabled"))
			{
				System.out.println("Paginator Buttons Disabled");
			}
	}
	
	public void clkFirstPageIcon()
	{
		dr.findElement(firstPageIcon).click();
		
	}
	public void clkStartPage()
	{
		dr.findElement(startPage).click();
	}
	
	public String previousLinkValidation()
	{
		return dr.findElement(previous).getText();
	}
	
	public void paginationValidation() throws InterruptedException
	{
		int paginationSize = dr.findElements(pagination).size();
		System.out.println("Page Size : "+paginationSize);
	
		for(int i = 1; i <= paginationSize; i++)
			
		{
			
			WebDriverWait w = new WebDriverWait(dr,Duration.ofSeconds(10));
			String paginationSelector ="#example_paginate a:nth-child("+i+")";
			System.out.println("Page Number----"+paginationSelector);
			w.until(ExpectedConditions.elementToBeClickable(By.cssSelector(paginationSelector)));
			dr.findElement(By.cssSelector(paginationSelector)).click();
			Thread.sleep(1000);
		}
	}
	

}
