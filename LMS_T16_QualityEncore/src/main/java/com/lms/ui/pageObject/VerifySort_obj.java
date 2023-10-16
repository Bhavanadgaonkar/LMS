package com.lms.ui.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lms.ui.util.BaseClass;
import com.lms.ui.util.LoggerLoad;

public class VerifySort_obj extends BaseClass{

	 public VerifySort_obj(WebDriver driver) {
		super(driver);
		
	}

	boolean status;
	   WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	 
	   @FindBy(xpath = "//button[contains(text(),'Sort')]]")
		WebElement batchidTab;
	 
	//   driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]"));
	   @FindBy(xpath = "//table[@id='myTable']/tbody/tr/td[1]")
	   WebElement tablsrt;
	   
	   @FindBy(xpath = "//button[contains(text(),'Sort_ProgramgmName')]]")
		WebElement sortPgmName;
	   
	   @FindBy(xpath = "//button[contains(text(),'Sort_ProgramgmDesc')]]")
		WebElement sortPgmDesc;
	   
	   @FindBy(xpath = "//button[contains(text(),'Sort_ProgramgmDesc')]]")
		WebElement sortPgmStatus;
	   
	   public void clickbatchid()
	   {
		   batchidTab.click();
	   }
	   
	   public void clkSortIconProgramNameColumn()
	   {
		   sortPgmName.click();
	   }
	   public void clkSortIconProgramDescColumn()
	   {
		   sortPgmDesc.click();
	   }
	   public void clkSortIconProgramStatusColumn()
	   {
		   sortPgmStatus.click();
	   }
	   
	   public void Sortingmethod()
	   {
	   
		  
	  // driver.findElement(By.xpath("//button[contains(text(),'Sort')]")).click();
		List<WebElement> tdList = (List<WebElement>) tablsrt;
		String strArry [] = new String[tdList.size()];
		for(int i=0;i < tdList.size();i++)
		{
			strArry[i]=tdList.get(i).getText();
		}
		/*
		 * Compare the values
		 */
		boolean sortFunctionality = true;
		outer: 
		for(int i=0;i < strArry.length;i++)
		{
			for(int j=i+1;j < i;j++)
			{
				int result = strArry[j].compareTo(strArry[i]);
				if(!(result > 0))
				{
					  LoggerLoad.info("Data in the Table is not SORTED");
//	System.out.println("Data in the Table is not SORTED::" +strArry[j]+":::"+ strArry[i]);
						sortFunctionality=false;
						break outer;
				}
				else
				{
					 LoggerLoad.info("Data in the Table is SORTED");
					// System.out.println("Data in the Table is SORTED::" +strArry[j]+":::"+ strArry[i]);
				}
			}
		}
		
		
		if(sortFunctionality)
		{
			 LoggerLoad.info("SORT Functionality is working");
			//System.out.println("SORT Functionality is working");
		}
		else
		{
			 LoggerLoad.info("SORT Functionality is not working");
			//System.out.println("SORT Functionality is not working");
		}
		
	}
	
	   
	   
	
}
