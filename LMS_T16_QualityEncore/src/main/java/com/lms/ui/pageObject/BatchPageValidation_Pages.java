package com.lms.ui.pageObject;
import java.util.List;

//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.lms.ui.util.*;

public class BatchPageValidation_Pages {
	
	private WebDriver dr;

	@FindBy(xpath = "//a[@href='batch']")WebElement batch;
	@FindBy(xpath = "//table[@id='Manage Batch']")WebElement TableHeader;
	@FindBy(xpath = "//input[@type='edittext']")WebElement EditIcon;
	@FindBy(xpath = "//input[@type='Delete']")WebElement DeleteIcon;
	@FindBy(xpath = "//input[@type='NewBatch']")WebElement NewBatch;
	@FindBy(xpath = "//input[@type='checkbox']")WebElement Checkbox;
	@FindBy(xpath = "//input[@type='BatchNavigation']")	WebElement BatchNavigation;
	  @FindBy(id = "Header") WebElement header;
	  @FindBy(xpath = "//a[@id ='dashboardsmsg']")
		WebElement dashboardlandmsg;
	  @FindBy(xpath ="//td[value() ='1']") 
		 WebElement data1;
	  Boolean status;
	 
		
		List<WebElement> tableHeaders = (List<WebElement>) dashboardlandmsg;


	public BatchPageValidation_Pages(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
 


	public void Batch() {
		batch.click();
	}

	public void Batchnavigation() {
		BatchNavigation.click();
	}

	public String getManageBatch() {
		return dr.getTitle();
	}
	

	public String currturl() {
		return dr.getCurrentUrl();
	}

	public String verifyManageBatchTitle() {

		String managebatchTitle = dr.getTitle();
	/*	LoggerLoad.info(managebatchTitle);
		String expectedManagePageTitle = "Manage Batch";
		Assert.assertEquals(managebatchTitle, expectedManagePageTitle);
		
		LoggerLoad.info("---------Manage batch Title verified-------");*/
		return managebatchTitle;
	}
	public String DashBoard() {

		String managebatchTitle = dr.getTitle();
	/*	LoggerLoad.info(managebatchTitle);
		String expectedManagePageTitle = "Manage Batch";
		Assert.assertEquals(managebatchTitle, expectedManagePageTitle);
		
		LoggerLoad.info("---------Manage batch Title verified-------");*/
		return managebatchTitle;
	}
	public void paginationchk()
	{
		 Object colName = null;
		 List<WebElement> result = null;
        for (int i = 0; i < tableHeaders.size(); i++) {
           
			if (tableHeaders.get(i).getText().equals(colName)) {
                break;
            }
        }
        
        boolean goNext = false;
        do { 
        	for (int i = 0; i < tableHeaders.size(); i++) {
                data1.getText();
                             
	        }
        	 boolean paginationNext = false;
			goNext = paginationNext;
             if (paginationNext) {
                 data1.click();
             }
           } while (goNext);
             return ;
        }
	
	

     
	

		

			public String verifyHeaderText() {
				LoggerLoad.info("Admin see the header Text");
					String HeaderText = header.getText();
				return HeaderText;

		}
	

	public void verifyEditIcon() {
		Boolean Edit = EditIcon.isEnabled();
		if (Edit) {
			System.out.println("EditIcon is Enable");

		} else {
			System.out.println("EditIcon not is Enable");
		}

	}

	public void verifyDeleteIcon() {
		Boolean Delete = DeleteIcon.isEnabled();
		if (Delete) {
			System.out.println("DeleteIcon is Enable");

		} else {
			System.out.println("DeleteIcon not is Enable");
		}

	}

	public void verifyNewBatch() {
		Boolean Batch = NewBatch.isDisplayed();
		if (Batch) {
			System.out.println("+A NewBatchIcon is Displayed");

		} else {
			System.out.println("+A NewBatchIcon not is Displayed");
		}

	}

	public void verifyCheckBox() {
		Boolean Check = Checkbox.isDisplayed();
		if (Check) {
			System.out.println("CheckBox is Displayed");

		} else {
			System.out.println("CheckBox not is Displayed");
		}
	}

	public void clicknewbatch() {
		NewBatch.click();
	}
	
	



}
