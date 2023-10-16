package com.lms.ui.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.lms.ui.pageObject.Attd_Details;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_Attd_Details {
	private WebDriver driver;
	Attd_Details Objad = new Attd_Details(driver);

@Given("Admin is in manage attendance page")
public void admin_is_in_manage_attendance_page() {
    // Write code here that turns the phrase above into concrete actions
	driver.get("url");
}

@When("Admin clicks + a new attendance button")
public void admin_clicks_a_new_attendance_button() {
    // Write code here that turns the phrase above into concrete actions
	Objad.clicks_newAttendance();
}

@Then("Admin should see correct spellings in the label")
public void admin_should_see_correct_spellings_in_the_label() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objad.Spelling();
	String ExpectedText="Spell";
	Assert.assertEquals(ExpectedText, ActualText);
}

@Then("four dropdown should be present")
public void dropdown_should_be_present(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	int actual= Objad.dropdownct();
	int expected = 4 ;
	Assert.assertEquals(expected, actual);
}

@Then("Admin should see  close button on the attendance details popup window")
public void admin_should_see_close_button_on_the_attendance_details_popup_window() {
    // Write code here that turns the phrase above into concrete actions
	boolean popcls= Objad.popupclose() ;
	Assert.assertTrue(popcls);
}

@Then("Close button should on the top right corner")
public void close_button_should_on_the_top_right_corner() {
    // Write code here that turns the phrase above into concrete actions
	String align =Objad.clsbtnallignment();
	Assert.assertEquals("right",align);
}

@Then("First dropdown box select a program name text  should be present")
public void first_dropdown_box_select_a_program_name_text_should_be_present() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("Second dropdown box select class name text  should be present")
public void second_dropdown_box_select_class_name_text_should_be_present() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("Third dropdown box select students text  should be present")
public void third_dropdown_box_select_students_text_should_be_present() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("Fourth dropdown box select attendance text  should be present")
public void fourth_dropdown_box_select_attendance_text_should_be_present() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("Admin  should text in gray color")
public void admin_should_text_in_gray_color() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objad.textcolor();
	String ExpectedText="gray";
	Assert.assertEquals(ExpectedText, ActualText);
}

@Then("Admin should see  save button in the class detail popup window")
public void admin_should_see_save_button_in_the_class_detail_popup_window() {
    // Write code here that turns the phrase above into concrete actions
	boolean save= Objad.savebutn() ;
	Assert.assertTrue(save);
}

@Then("Admin should see  cancel button in the class detail popup window")
public void admin_should_see_cancel_button_in_the_class_detail_popup_window() {
    // Write code here that turns the phrase above into concrete actions
	boolean cancel= Objad.cancelbutn() ;
	Assert.assertTrue(cancel);
}

@Then("Order of the label should be Program name  Class Name  Student Name  Attendance Attendance Date.")
public void order_of_the_label_should_be_program_name_class_name_student_name_attendance_attendance_date() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("Admin is in  attendance details popup window")
public void admin_is_in_attendance_details_popup_window() {
    // Write code here that turns the phrase above into concrete actions
	driver.switchTo().alert();
}

@When("Admin clicks  program name dropdown")
public void admin_clicks_program_name_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    Objad.clickpgmname();
}

@Then("Program Name in the drop down should match with  program name in  manage program page table")
public void program_name_in_the_drop_down_should_match_with_program_name_in_manage_program_page_table() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objad.namea();
	String ExpectedText=Objad.namee();
	Assert.assertEquals(ExpectedText, ActualText);
}

@When("Admin clicks class name dropdown")
public void admin_clicks_class_name_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    Objad.clickclsname();
}

@Then("Class Name in the drop down should match with  class name in  manage class page table")
public void class_name_in_the_drop_down_should_match_with_class_name_in_manage_class_page_table() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objad.classa();
	String ExpectedText=Objad.classe();
	Assert.assertEquals(ExpectedText, ActualText);
}

@When("Admin clicks attendance dropdown")
public void admin_clicks_attendance_dropdown() {
    // Write code here that turns the phrase above into concrete actions
	Objad.clickattd();
}

@Then("Attendance field should have keywords such as - present absent late excused")
public void attendance_field_should_have_keywords_such_as_present_absent_late_excused() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objad.Spelling();
	String ExpectedText="keywords";
	Assert.assertEquals(ExpectedText, ActualText);
}

@Then("Admin should see correct spellings in dropdown text")
public void admin_should_see_correct_spellings_in_dropdown_text() {
    // Write code here that turns the phrase above into concrete actions
	String ActualText= Objad.drpdwnSpelling();
	String ExpectedText="Spell";
	Assert.assertEquals(ExpectedText, ActualText);
}

@When("Admin clicks date from date picker")
public void admin_clicks_date_from_date_picker() {
    // Write code here that turns the phrase above into concrete actions
    Objad.clicks_datepicker();
}

@Then("selected date should be their in class date text box")
public void selected_date_should_be_their_in_class_date_text_box() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("selected date should be their in class date text box");

}

@Then("selected date should be in  mm\\/dd\\/yyyy format")
public void selected_date_should_be_in_mm_dd_yyyy_format() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("selected date should be in  mm\\\\/dd\\\\/yyyy format");

}

@When("Admin clicks right arrow in the date picker near month")
public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
    // Write code here that turns the phrase above into concrete actions
	 Objad.clicks_datepicker();
}

@Then("Next month calender should visible")
public void next_month_calender_should_visible() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("selected date should be their in class date text box");
}

@When("Admin clicks left arrow in the date picker near month")
public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
    // Write code here that turns the phrase above into concrete actions
	 Objad.clicks_datepicker();
}

@Then("previous month calender should visible")
public void previous_month_calender_should_visible() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("previous month calender should visible");
}

@When("Admin clicks date picker button")
public void admin_clicks_date_picker_button() {
    // Write code here that turns the phrase above into concrete actions
	 Objad.clicks_datepicker();
}

@Then("Admin should see current date is highled in the date picker")
public void admin_should_see_current_date_is_highled_in_the_date_picker() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Admin should see current date is highled in the date picker");
}

@When("Admin clicks date picker button and selects future date")
public void admin_clicks_date_picker_button_and_selects_future_date() {
    // Write code here that turns the phrase above into concrete actions
	 Objad.clicks_datepicker();
}

@Then("Admin should see selected date is highled in the date picker")
public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Admin should see selected date is highled in the date picker");
}

}
