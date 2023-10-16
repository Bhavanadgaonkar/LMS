package com.lms.ui.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.lms.ui.pageObject.Del_Attd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_Del_Attd {
	private WebDriver driver;
	Del_Attd Objdel = new Del_Attd(driver);

@When("Admin clicks delete button in data table row level")
public void admin_clicks_delete_button_in_data_table_row_level() {
    // Write code here that turns the phrase above into concrete actions
	Objdel.click_del_btn();
}

@Then("Admin should see alert")
public void admin_should_see_alert() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objdel.popupmsg();
	String ExpectedText="successfully deleted";
	Assert.assertEquals(ExpectedText, ActualText);
}

@Then("Alert should have yes button to accept")
public void alert_should_have_yes_button_to_accept() {
    // Write code here that turns the phrase above into concrete actions
	boolean yes= Objdel.yesbutn() ;
	Assert.assertTrue(yes);
}

@Then("Alert should have No button to reject")
public void alert_should_have_no_button_to_reject() {
    // Write code here that turns the phrase above into concrete actions
	boolean no= Objdel.nobutn() ;
	Assert.assertTrue(no);
}

@Given("Admin is in delete alert")
public void admin_is_in_delete_alert() {
    // Write code here that turns the phrase above into concrete actions
	driver.switchTo().alert();
}

@When("Admin clicks yes button")
public void admin_clicks_yes_button() {
    // Write code here that turns the phrase above into concrete actions
	Objdel.click_yes_btn();
}

@Then("Success message and selected attendance details are deleted from the data table")
public void success_message_and_selected_attendance_details_are_deleted_from_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objdel.popupmsg();
	String ExpectedText="successfully deleted";
	Assert.assertEquals(ExpectedText, ActualText);
}

@When("Admin clicks no button")
public void admin_clicks_no_button() {
    // Write code here that turns the phrase above into concrete actions
	Objdel.click_no_btn();
}

@Then("Redirected attendance page and selected attendance details are not deleted from the data table")
public void redirected_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objdel.popupmsg();
	String ExpectedText="Not deleted";
	Assert.assertEquals(ExpectedText, ActualText);
}



}
