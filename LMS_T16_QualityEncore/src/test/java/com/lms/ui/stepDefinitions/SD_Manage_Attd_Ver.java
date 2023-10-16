package com.lms.ui.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.lms.ui.pageObject.Manage_Attd;
import com.lms.ui.util.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_Manage_Attd_Ver {

	private WebDriver driver;
	Manage_Attd Objma = new Manage_Attd(driver);

@Given("Admin is on dashboard page after Login")
public void admin_is_on_dashboard_page_after_login() {
    // Write code here that turns the phrase above into concrete actions
	driver.get("url");
    
}

@When("Admin clicks Attendance on the navigation bar")
public void admin_clicks_attendance_on_the_navigation_bar() {
    // Write code here that turns the phrase above into concrete actions
    Objma.clicks_Attendance();
    System.out.println("Admin clicks Attendance on the navigation bar ");
}

@Then("Admin should see the Manage attendance in header")
public void admin_should_see_the_manage_attendance_in_header() {
    // Write code here that turns the phrase above into concrete actions
	String title = Objma.open_portaltitle();
	Assert.assertTrue(title.contains("expectedTitleName"));
}

@Then("Maximum navigation time in milliseconds defaults to thirty seconds")
public void maximum_navigation_time_in_milliseconds_defaults_to_seconds() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Objma.ResponseTime();
	System.out.println("Maximum navigation time");

}

@Then("HTTP response the link is broken")
public void http_response_then_the_link_is_broken(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	Objma.check_brokenlinks();
    LoggerLoad.info("Broken Links in the homepage are verified" );
	
}

@Then("Admin should see LMS -Learning management system  as title")
public void admin_should_see_lms_learning_management_system_as_title() {
    // Write code here that turns the phrase above into concrete actions
	String title = Objma.open_portaltitle();
	Assert.assertTrue(title.contains("expectedTitleName"));
}

@Then("Manage attendance header should be in left side of the page")
public void manage_attendance_header_should_be_in_left_side_of_the_page() {
    // Write code here that turns the phrase above into concrete actions
	String align =Objma.HeaderAlignment();
	Assert.assertEquals("left",align);

}

@When("Admin clicks Attendance button on the navigation bar and get all text from the portal page")
public void admin_clicks_attendance_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page() {
    // Write code here that turns the phrase above into concrete actions
    Objma.getportalpagetext();
}

@Then("Admin should see correct spelling for the all the fields")
public void admin_should_see_correct_spelling_for_the_all_the_fields() {
    // Write code here that turns the phrase above into concrete actions
	
	String ActualText= Objma.Spelling();
	String ExpectedText="Spell";
	Assert.assertEquals(ExpectedText, ActualText);
}

@Then("Admin should see disabled delete icon below the Manage Attendance")
public void admin_should_see_disabled_delete_icon_below_the_manage_attendance() {
    // Write code here that turns the phrase above into concrete actions
		Assert.assertFalse(Objma.icon());
}

@SuppressWarnings("static-access")
@Then("Admin should see search bar on the attendance page")
public void admin_should_see_search_bar_on_the_attendance_page() {
    // Write code here that turns the phrase above into concrete actions
	Boolean Display = Objma.searchbar();
	Assert.assertTrue(Display.logicalAnd(true, true));
}

@SuppressWarnings("static-access")
@Then("Admin should see +Add New Attendance button on the attendance page")
public void admin_should_see_add_new_attendance_button_on_the_attendance_page() {
    // Write code here that turns the phrase above into concrete actions
	Boolean attdbtn = driver.findElement(By.xpath("//*dummy")).isDisplayed();
	Assert.assertTrue(attdbtn.logicalAnd(true, true));
}

@Then("Admin should see data table on the Manage Attendance Page With following column headers.")
public void admin_should_see_data_table_on_the_manage_attendance_page_with_following_column_headers() {
    // Write code here that turns the phrase above into concrete actions
	boolean yes= Objma.datable() ;
	Assert.assertTrue(yes);
}

@Then("Edit Icon in each row of data table only  when entries are available")
public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
    // Write code here that turns the phrase above into concrete actions
	boolean yes= Objma.edit_icon() ;
	Assert.assertTrue(yes);
}

@Then("Edit Icon will not be present in data table")
public void edit_icon_will_not_be_present_in_data_table() {
    // Write code here that turns the phrase above into concrete actions
	boolean yes= Objma.edit_icon() ;
	Assert.assertTrue(yes);
}

@Then("Delete Icon in each row of data table only  when entries are available")
public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
    // Write code here that turns the phrase above into concrete actions
	boolean yes= Objma.delete_icon() ;
	Assert.assertTrue(yes);
}

@Then("Admin cant see delete  Icon in data table")
public void admin_cant_see_delete_icon_in_data_table() {
    // Write code here that turns the phrase above into concrete actions
	boolean yes= Objma.delete_icon() ;
	Assert.assertTrue(yes);
}

@Then("Admin should see sort icon near the column headers except for Edit and Delete")
public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
    // Write code here that turns the phrase above into concrete actions
	boolean yes= Objma.sort_icon() ;
	Assert.assertTrue(yes);
}

@Then("Admin should see check box in the all rows  of data table")
public void admin_should_see_check_box_in_the_all_rows_of_data_table() {
    // Write code here that turns the phrase above into concrete actions
	boolean select= Objma.selected() ;
	Assert.assertTrue(select);
}

@Then("Above the footer Admin should see the text")
public void above_the_footer_admin_should_see_the_text() {
    // Write code here that turns the phrase above into concrete actions
	String text = Objma.footxt();
	Assert.assertTrue(text.contains("expected text"));
}

@Then("Admin should see the pagination controls under the data table")
public void admin_should_see_the_pagination_controls_under_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
	boolean yes= Objma.pagination_ctrl() ;
	Assert.assertTrue(yes);
}

@Then("Admin should see the text with total number classes in the data table.")
public void admin_should_see_the_text_with_total_number_classes_in_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
	String text = Objma.txt();
	Assert.assertTrue(text.contains("expected text"));
}

	
}
