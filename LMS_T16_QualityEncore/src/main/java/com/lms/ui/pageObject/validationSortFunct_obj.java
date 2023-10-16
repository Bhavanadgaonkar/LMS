package com.lms.ui.pageObject;

import java.util.List;
import java.util.stream.Collectors;

//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class validationSortFunct_obj {
	
	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	@FindBy(xpath="//tr/th[1]")
	WebElement sortarrow;
//	boolean status;
	@FindBy(xpath="//tr/td[1]")
	List<WebElement> assignmentName	;
	
	public void clicks_on_assignment_name_column_header_to_sort() 
	{
		sortarrow.click();
	}
	public void displays_data_tables_sorts_in_ascending_order() {
		  
		   List<String> AssignmentNameList=assignmentName.stream().map(s->s.getText()).collect(Collectors.toList());
		  List<String> sortedAssigment=AssignmentNameList.stream().sorted().collect(Collectors.toList());
		//   Assert.assertTrue(AssignmentNameList.equals(sortedAssigment));
		  
		  // return sortedAssigment;
	} 
	
	public void displays_data_tables_sorts_in_descending_order() {
		
		   List<String> AssignmentNameList=assignmentName.stream().map(s->s.getText()).collect(Collectors.toList());
		   List<String> sortedAssigment=AssignmentNameList.stream().sorted().collect(Collectors.toList());
		  // Assert.assertTrue(AssignmentNameList.equals(sortedAssigment));
	}
	
}
