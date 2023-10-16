package com.lms.ui.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.lms.ui.pageObject.Del_Multiple_Attd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_Del_Multiple_Attd {

	private WebDriver driver;
	Del_Multiple_Attd Objdelmul = new Del_Multiple_Attd(driver);

@When("Admin clicks single  row level check box in the data table")
public void admin_clicks_single_row_level_check_box_in_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
	Objdelmul.click_chkbox();
}

@Then("Admin should see delete icon below the header is enabled")
public void admin_should_see_delete_icon_below_the_header_is_enabled() {
    // Write code here that turns the phrase above into concrete actions
	boolean delicn= Objdelmul.delicon() ;
	Assert.assertTrue(delicn);
}

@Then("Admin should see tick mark in check box")
public void admin_should_see_tick_mark_in_check_box() {
    // Write code here that turns the phrase above into concrete actions
	boolean select= Objdelmul.selected() ;
	Assert.assertTrue(select);
}

@When("Admin clicks multiple row level check box in the data table")
public void admin_clicks_multiple_row_level_check_box_in_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
	Objdelmul.click_chkbox();
}

@Then("Admin should see tick mark in check box  of the selected rows")
public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows() {
    // Write code here that turns the phrase above into concrete actions
	boolean select= Objdelmul.selected() ;
	Assert.assertTrue(select);
}

@Given("Admin is in delete alert")
public void admin_is_in_delete_alert() {
    // Write code here that turns the phrase above into concrete actions
	driver.switchTo().alert();
}

@Then("Success message and selected attendance detail are deleted from the data table")
public void success_message_and_selected_attendance_detail_are_deleted_from_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objdelmul.popupmsg();
	String ExpectedText="successfully deleted";
	Assert.assertEquals(ExpectedText, ActualText);
}

@Then("Redirected to attendance page and selected attendance details are not deleted from the data table")
public void redirected_to_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objdelmul.popupmsg();
	String ExpectedText="not deleted";
	Assert.assertEquals(ExpectedText, ActualText);
}

@Then("Success message and validate particular attendance details are deleted from the data table")
public void success_message_and_validate_particular_attendance_details_are_deleted_from_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objdelmul.popupmsg();
	String ExpectedText="successfully deleted the ";
	Assert.assertEquals(ExpectedText, ActualText);
}



}
