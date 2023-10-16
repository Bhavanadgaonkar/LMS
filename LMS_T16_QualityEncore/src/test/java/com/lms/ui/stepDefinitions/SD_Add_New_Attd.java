package com.lms.ui.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.lms.ui.pageObject.Add_New_Attd;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_Add_New_Attd {
	private WebDriver driver;
	Add_New_Attd Objnew = new Add_New_Attd(driver);

@When("Admin fills all the values and click save")
public void admin_fills_all_the_values_and_click_save() {
    // Write code here that turns the phrase above into concrete actions
	
	Objnew.clicks_save();
}

@Then("Admin should see success message in popup window and sees new attendance details in manage attendance details DB")
public void admin_should_see_success_message_in_popup_window_and_sees_new_attendance_details_in_manage_attendance_details_db() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objnew.popupmsg();
	String ExpectedText="successfully add";
	Assert.assertEquals(ExpectedText, ActualText);
}

@When("Admin fills values missing program name and click save")
public void admin_fills_values_missing_program_name_and_click_save() {
    // Write code here that turns the phrase above into concrete actions
	Objnew.pgmname.sendKeys("");
	Objnew.clicks_save();
}

@Then("Program name is missing")
public void program_name_is_missing() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objnew.popupmsg();
	String ExpectedText="Program name is missing";
	Assert.assertEquals(ExpectedText, ActualText);
}

@When("Admin fills values missing class name and click save")
public void admin_fills_values_missing_class_name_and_click_save() {
    // Write code here that turns the phrase above into concrete actions
	Objnew.clsname.sendKeys("");
	Objnew.clicks_save();
}

@Then("class name is missing")
public void class_name_is_missing() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objnew.popupmsg();
	String ExpectedText="class name is missing";
	Assert.assertEquals(ExpectedText, ActualText);
}

@When("Admin fills values missing student name and click save")
public void admin_fills_values_missing_student_name_and_click_save() {
    // Write code here that turns the phrase above into concrete actions
	Objnew.stdname.sendKeys("");
	Objnew.clicks_save();
}

@Then("student name is missing")
public void student_name_is_missing() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objnew.popupmsg();
	String ExpectedText="student name is missing";
	Assert.assertEquals(ExpectedText, ActualText);
}

@When("Admin fills values missing attendance and click save")
public void admin_fills_values_missing_attendance_and_click_save() {
    // Write code here that turns the phrase above into concrete actions
	Objnew.attd.sendKeys("");
	Objnew.clicks_save();
}

@Then("Attendance is missing")
public void attendance_is_missing() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objnew.popupmsg();
	String ExpectedText="Attendance is missing";
	Assert.assertEquals(ExpectedText, ActualText);
}

@When("Admin fills values missing attendance date  and click save")
public void admin_fills_values_missing_attendance_date_and_click_save() {
    // Write code here that turns the phrase above into concrete actions
	Objnew.clicks_save();
}

@Then("Attendance date is missing")
public void attendance_date_is_missing() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objnew.popupmsg();
	String ExpectedText="Attendance date is missing";
	Assert.assertEquals(ExpectedText, ActualText);
}

@When("Admin fills values with future date  and click save")
public void admin_fills_values_with_future_date_and_click_save() {
    // Write code here that turns the phrase above into concrete actions
	Objnew.clicks_save();
}

@Then("Invalidate attendance date")
public void invalidate_attendance_date() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objnew.popupmsg();
	String ExpectedText="Invalidate attendance date";
	Assert.assertEquals(ExpectedText, ActualText);
}



}
