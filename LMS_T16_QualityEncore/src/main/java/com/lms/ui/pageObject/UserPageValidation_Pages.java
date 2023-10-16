package com.lms.ui.pageObject;

//import static org.junit.Assert.assertTrue;
import java.util.List;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.lms.ui.util.LoggerLoad;



public class UserPageValidation_Pages {
	
	private  WebDriver dr;
	boolean status;
	
	 @FindBy(xpath = "//a[@href='User']")WebElement UserNavigation;
	 
	
	 @FindBy(xpath="//table[@id='Manage user page']") WebElement UserTableHeader;
	
	 @FindBy(xpath="//input[@type='Delete']")WebElement  DeleteIcon;
	
	 @FindBy(xpath="//input[@type='NewUser']" )WebElement NewUser;
	
	 @FindBy(xpath="//input[@type='AssignStaff']" )WebElement Assignstaff;
	
	 @FindBy(xpath="//input[@id='searchtextbox']")WebElement SearchTextBox;
	
	 @FindBy(xpath="//input[@type='checkbox']")WebElement Checkbox;
	
	 @FindBy(xpath="//input[@type='edittext']") WebElement  EditIcon;
	
	 @FindBy(xpath="//input[@type='Delete']")WebElement  DeleteButton;
	 @FindBy(xpath="//input[@type='popup']")WebElement  popup;
	
	 @FindBy(xpath = "//a[@id ='dashboardsmsg']")
		WebElement dashboardlandmsg;
	 
	 List<WebElement> tableHeaders = (List<WebElement>) dashboardlandmsg;
	 @FindBy(xpath ="//td[value() ='1']") 
	 WebElement data1;
		
	// @FindBy(xpath= "//button[contains(text(),'next')]")WebElement NextpageButton;
	// @FindBy(xpath= "//ul[@class='pagination'/li/a]")WebElement Paginationelements;
	
	
	
	
	
	
	
	
	 public UserPageValidation_Pages(WebDriver dr) {
		  this.dr = dr;
		  PageFactory.initElements(dr, this);
		 }
		  public void User() {
			  UserNavigation.click();
		  }
		  public void newuser() {
			  NewUser.click();
		  }
	
		  public String getManageUser() {
			   return dr.getTitle();
		  }
		  public String currturl() {
			   return dr.getCurrentUrl();
			  
			  }
		 
		  public   String verifyManageUserTitle() {
		        String manageuserTitle= dr.getTitle();
		      
		       return manageuserTitle;
		      }
	
		 
	//VerifyUserTableHeader	 
		  public void verifyUserTableHeader() {
		         List<WebElement>rows=UserTableHeader.findElements(By.tagName("tr"));
		         for (WebElement r:rows) {
		          System.out.println(r.getText());
		          
		    //      LoggerLoad.info("Admin see the header Text");
		    //  	String HeaderText = header.getText();
		    //  return HeaderText;

		         }
		  }
		  public boolean DashBoard() {
			  try {
					status = dashboardlandmsg.isDisplayed();
				//	assertTrue(status);
		        LoggerLoad.info("Dashboard page is displayed");
		} catch (AssertionError e) {
					LoggerLoad.error("Dashboard page is not displayed");
					System.out.println(e.getMessage());
				}			return status;	
				}
				
		  public boolean PopUp() {
			  try {
					status = popup.isDisplayed();
					//assertTrue(status);
		        LoggerLoad.info("new user details  is displayed");
		} catch (AssertionError e) {
					LoggerLoad.error("new user details  is not displayed");
					System.out.println(e.getMessage());
				}			return status;	
				}
		  
		 
	//VerifyDeleteIcon
  public void verifyDeleteIcon() {
	Boolean Delete = DeleteIcon.isEnabled();
	if(Delete) {
	System.out.println("DeleteIcon is Enable");
	             
	 }
	 else {
	 System.out.println("DeleteIcon not is Enable");
	  }
	}
		 
	//VerifyNewUser
	  public void verifyNewUser() {
	  Boolean User=NewUser.isDisplayed();
	  if(User) {
	  System.out.println("+A NewUserIcon is Displayed");
		             
	  }
	  else {
	  System.out.println("+A NewUserIcon not is Displayed");
	  }
	  }
		
	 //VerifyAssignstaff
	  public void verifyAssignstaff() {
	  Boolean AssiStaff= Assignstaff.isDisplayed();
	 
	  if(AssiStaff) {
	  System.out.println("+Assignstaffis Displayed");
			             
	  }
	  else {
	  System.out.println("+Assignstaff not is Displayed");
	  }
	  }
	 
	  //VerifysearchTextBox
	public void verifysearchTextbox() {
	Boolean TextBox=SearchTextBox.isDisplayed();
	 if(TextBox) {
	System.out.println("SearhTextBox is Displayed");
				             
	}
  else {
 System.out.println("SearhTextBox not is Displayed");
  }
	  }
				            
	//Verify thecheckbox	
	public void verifyCheckBox() {
	Boolean Check=Checkbox.isDisplayed();
	if(Check) {
  System.out.println("CheckBox is Displayed");
					                
	}
	else {
	System.out.println("CheckBox is not Displayed");
	}
	}
	
	//VerifyEditIcon
	public void verifyEditIcon() {
	 Boolean Edit = EditIcon.isEnabled();
	 if(Edit) {
	System.out.println("EditIcon is Enable");
						         
	 }
	else {
 System.out.println("EditIcon not is Enable");
	 }
	}
						        
	//VerifyDeletebutton					        
	public void verifyDeletebutton() {
	Boolean Delete = DeleteButton.isEnabled();
	if(Delete) {
 System.out.println("DeleteButton is Enable");
						             
	 }
  else {
	System.out.println("DeleteButton not is Enable");
	  }
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
	
	


}
