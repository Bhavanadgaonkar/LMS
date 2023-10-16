package com.lms.ui.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.lms.ui.driver.DriverFactory;
import com.lms.ui.pageObject.AddNewClass_obj;
import com.lms.ui.pageObject.ClassDetail_obj;
import com.lms.ui.pageObject.DeleteClassValidation_obj;
import com.lms.ui.pageObject.EditClass_obj;
import com.lms.ui.pageObject.ManageClassPage_obj;
import com.lms.ui.pageObject.Pagination_obj;
import com.lms.ui.pageObject.VerifySort_obj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllClass_SD {

	WebDriver driver =DriverFactory.getDriver();
	
	DeleteClassValidation_obj obj = new DeleteClassValidation_obj(driver);
	VerifySort_obj objvd = new VerifySort_obj(driver);
	Pagination_obj objpg = new Pagination_obj(driver);
	AddNewClass_obj objanw = new AddNewClass_obj(driver);
	EditClass_obj objedc = new EditClass_obj(driver);
	ManageClassPage_obj MCP = new ManageClassPage_obj(driver);
	ClassDetail_obj CD = new ClassDetail_obj(driver);
	/*
@Given("Admin is on dashboard page after Login")
public void admin_is_on_dashboard_page_after_login() {
    
    
}
*/
@When("Admin clicks {string} button on the navigation bar")
public void admin_clicks_button_on_the_navigation_bar(String string) {
	 MCP.Classbutton();
    
}

@Then("Admin should see URL with {string}")
public void admin_should_see_url_with(String string) {
	 MCP.verifyGetUrl();
    
}

@Then("Get the response time for navigation from dashboard page to manage class page")
public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_class_page() {
	 MCP.responseTimeChk();
    
}

@Then("Admin should see header with {string}")
public void admin_should_see_header_with(String string) {
	 boolean status =MCP.IconHeaderDisplay();
     Assert.assertTrue(status);
}

@When("Admin clicks {string} button on the navigation bar and get all text from the portal page")
public void admin_clicks_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page(String string) {
	boolean status= MCP.ManageClassDetail();
     Assert.assertTrue(status);
}

@Then("Admin should see correct spelling for the all the fields")
public void admin_should_see_correct_spelling_for_the_all_the_fields() {
    
    
}

@Then("Admin should see disabled delete icon below the {string}")
public void admin_should_see_disabled_delete_icon_below_the(String string) {
	boolean status= MCP.DeleteIconDisplay();
	  Assert.assertTrue(status);
}

@Then("Admin should see search bar on the class page")
public void admin_should_see_search_bar_on_the_class_page() {
    
boolean status =	MCP.SearchBarDisplay();
	Assert.assertTrue(status);
}

@Then("Admin should see +Add New Class button on the class page")
public void admin_should_see_add_new_class_button_on_the_class_page() {
	 boolean status= MCP.AddNewClassDisplay();
	 Assert.assertTrue(status);
}

@Then("Admin should see data table on the Manage Class Page With following column headers. \\(Check box symbol,Batch Id, Class No,Class Date, Class Topic, Staff Id, Description, Comments, Notes, Recording, Edit Delete)")
public void admin_should_see_data_table_on_the_manage_class_page_with_following_column_headers_check_box_symbol_batch_id_class_no_class_date_class_topic_staff_id_description_comments_notes_recording_edit_delete() {
    
    
}

@Then("Edit Icon in each row of data table only  when entries are available")
public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	MCP.EditIconchk();
    
}

@Then("Edit Icon will not be present in data table")
public void edit_icon_will_not_be_present_in_data_table() {
	MCP.EditIconchk();
    
}

@Then("Delete Icon in each row of data table only  when entries are available")
public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	MCP.DeleteIconchk();
    
}

@Then("Admin cant see delete  Icon in data table")
public void admin_cant_see_delete_icon_in_data_table() {
	 MCP.DeleteIconchk();
    
}

@Then("Admin should see sort icon near the column headers except for Edit and Delete")
public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
	MCP.IconHeaderDisplay();
    
}

@Then("Admin should see check box in the all rows  of data table")
public void admin_should_see_check_box_in_the_all_rows_of_data_table() {
    
    
}

@Then("Above the footer Admin should see the text as {string} below the table. x- starting record number on that pagey-ending record number on that pagez-Total number of records  Note: with or without entries")
public void above_the_footer_admin_should_see_the_text_as_below_the_table_x_starting_record_number_on_that_pagey_ending_record_number_on_that_pagez_total_number_of_records_note_with_or_without_entries(String string) {
    
    
}

/*@Then("Admin should see the pagination controls under the data table")
public void admin_should_see_the_pagination_controls_under_the_data_table() {
	boolean status = MCP.paginationcontrols();
	Assert.assertTrue(status);
}*/

@Then("Admin should see the text with total number classes in the data table. \\( {string})")
public void admin_should_see_the_text_with_total_number_classes_in_the_data_table(String string) {
	boolean status= MCP.NoOfClass();
	   Assert.assertTrue(status);
}


@Given("Admin is on Manage Class Page")
public void admin_is_on_manage_class_page() {
	obj.ManageclassLandingPage();
    
}

@When("Admin enters batch id into search box")
public void admin_enters_batch_id_into_search_box() {
    
    
}

@Then("Displays entries with that batch Id")
public void displays_entries_with_that_batch_id() {
MCP.PopUpBatchIDField();
	
	
    
}

@When("Admin enters batch id which is not existing the table into search box")
public void admin_enters_batch_id_which_is_not_existing_the_table_into_search_box() {
    
    
}

@Then("Displays empty details in the data table")
public void displays_empty_details_in_the_data_table() {
    
	  MCP.PopUpBatchIDField1(); 
}

@When("Admin enters class no into search box")
public void admin_enters_class_no_into_search_box() {
    
    
}

@Then("Displays entries with that class no")
public void displays_entries_with_that_class_no() {
	MCP.PopUpClassNumField();   
    
}

@When("Admin enters class no which is not existing the table into search box")
public void admin_enters_class_no_which_is_not_existing_the_table_into_search_box() {
    
	MCP.PopUpClassNumField1();
}

@When("Admin enters class topic into search box")
public void admin_enters_class_topic_into_search_box() {
    
    
}

@Then("Displays entries with that  class topic")
public void displays_entries_with_that_class_topic() {
	 MCP.PopUpClassTopicFeild() ;
    
}

@When("Admin enters class topic which is not existing the table into search box")
public void admin_enters_class_topic_which_is_not_existing_the_table_into_search_box() {
    
    
}

@When("Admin enters staff id into search box")
public void admin_enters_staff_id_into_search_box() {
	MCP. PopUpStaffIdField(); 
    
}

@Then("Displays entries with that  staff id")
public void displays_entries_with_that_staff_id() {
    
    
}

@When("Admin enters staff id which is not existing the table into search box")
public void admin_enters_staff_id_which_is_not_existing_the_table_into_search_box() {
    
    
}

@When("Admin enters class date into search box")
public void admin_enters_class_date_into_search_box() {
    
    
}

@Then("Displays entries with that  class date")
public void displays_entries_with_that_class_date() {
    
    
}

@When("Admin enters invalid class date into search box")
public void admin_enters_invalid_class_date_into_search_box() {
        
}

//EditClassdetails
@When("Admin click +Add New Class button")
public void admin_click_add_new_class_button() {
    
	CD.AddNewClassbutton();
}

@Then("Admin should see a popup  with  heading {string}")
public void admin_should_see_a_popup_with_heading(String string) {
	CD.AddClassPage();
    
}

@Then("Admin should see input fields Text \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)")
public void admin_should_see_input_fields_text_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings() {
	 boolean status= CD.AddClassDetail();
	Assert.assertTrue(status);
}

@Then("{int} textbox should be  present in Class details popup window")
public void textbox_should_be_present_in_class_details_popup_window(Integer int1) {
    
    
}

@Then("Admin should see  dropdown option for Batch ID")
public void admin_should_see_dropdown_option_for_batch_id() {
	 boolean status= CD.BatchIdDropDown();
	Assert.assertTrue(status);
    
}

@Then("Admin should see  dropdown option for Staff Id")
public void admin_should_see_dropdown_option_for_staff_id() {
    
	 boolean status=   CD.StaffIdDropDown();
	  Assert.assertTrue(status);
}

@Then("Admin should see  calendar icon for class date")
public void admin_should_see_calendar_icon_for_class_date() {
	 boolean status= CD.CalendarIcon();
	  Assert.assertTrue(status);
}

@Then("Admin should see  save button in the class detail popup window")
public void admin_should_see_save_button_in_the_class_detail_popup_window() {
	 boolean status= CD.SaveButton();
	Assert.assertTrue(status);
}

@Then("Admin should see  cancel button in the class detail popup window")
public void admin_should_see_cancel_button_in_the_class_detail_popup_window() {
	 boolean status= CD.CancelButton();
	 Assert.assertTrue(status);
    
}

@Then("Admin should see  close button on the class details popup window")
public void admin_should_see_close_button_on_the_class_details_popup_window() {
    
	boolean status =CD.CloseButton();
	Assert.assertTrue(status);
}

//Add new class

@Given("Admin is in  class detail popup window")
public void admin_is_in_class_detail_popup_window() {
	 boolean status=    objanw.checkpopmsg();
	 Assert.assertTrue(status);
}

@When("Admin clicks  Batch ID dropdown")
public void admin_clicks_batch_id_dropdown() {
	objanw.batchidDrpdwn();
    
}

@Then("Batch id in the drop down should match with Batch id manage batch page table")
public void batch_id_in_the_drop_down_should_match_with_batch_id_manage_batch_page_table() {
	boolean status=  objanw.checkbatchdrpmsg();
    Assert.assertTrue(status);
}

@When("Admin enters all mandatory field values with valid data and clicks save button {string} and {string}")
public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_and(String string, String string2) {
    
    objanw.allfields();
}

@Then("Admin should see new class details is added in the data table")
public void admin_should_see_new_class_details_is_added_in_the_data_table() {
	boolean status= objanw.checfieldsmsg();
	Assert.assertTrue(status);
}

@When("Admin enters all mandatory field values with invalid data and clicks save button {string} and {string}")
public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_and(String string, String string2) {
    objanw.savebtnclickmth();
    
}

@Then("Error message should appear in alert")
public void error_message_should_appear_in_alert() {
    
	 boolean status= objanw.alertmsg();
    Assert.assertTrue(status);
}

@When("Admin enters values in all fields with valid data and clicks save button {string} and {string}")
public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_and(String string, String string2) {
	   objanw.savebtnclickmth();
    
}

@When("Admin enters with invalid data in optional fields and clicks save button {string} and {string}")
public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_and(String string, String string2) {
	   objanw.savebtnclickmth();
    
}

@When("Admin enters  data missing value in Batch ID and clicks save button {string} and {string}")
public void admin_enters_data_missing_value_in_batch_id_and_clicks_save_button_and(String string, String string2) {
    
	   objanw.savebtnclickmth();
}

@Then("Batch Id is missing")
public void batch_id_is_missing() {
    objanw.checkbatchdrpmsg();
    
}

@When("Admin enters data missing value in No of class and clicks save button {string} and {string}")
public void admin_enters_data_missing_value_in_no_of_class_and_clicks_save_button_and(String string, String string2) {
	objanw.checkbatchdrpmsg();
    
}

@Then("No of classes is missing")
public void no_of_classes_is_missing() {
	boolean status=	objanw.checknoclasspmsg();
	Assert.assertTrue(status);
}

@When("Admin enters data missing value in  class date and clicks save button {string} and {string}")
public void admin_enters_data_missing_value_in_class_date_and_clicks_save_button_and(String string, String string2) {
	objanw.savebtnclickmth();
    
}

@Then("class date is missing")
public void class_date_is_missing() {
	boolean status=	objanw.checkclasdtmsg();
	Assert.assertTrue(status);
}

@When("Admin enters data missing value in staff id and clicks save button {string} and {string}")
public void admin_enters_data_missing_value_in_staff_id_and_clicks_save_button_and(String string, String string2) {
	objanw.savebtnclickmth();
    
}

@Then("staff id is missing")
public void staff_id_is_missing() {

	 boolean status= 	objanw.checkstaffidmsg();
	Assert.assertTrue(status);
}

@When("Admin enters passed date in the class date field and clicks save button {string} and {string}")
public void admin_enters_passed_date_in_the_class_date_field_and_clicks_save_button_and(String string, String string2) {
	objanw.savebtnclickmth();
    
}

@Then("class cannot be  created for the passed date")
public void class_cannot_be_created_for_the_passed_date() {
	objanw.checkclasdtmsg();
    
}

@When("Admin clicks date from date picker")
public void admin_clicks_date_from_date_picker() {
	objanw.checkclasdtmsg();
    
}

@Then("selected date should be their in class date text box")
public void selected_date_should_be_their_in_class_date_text_box() {
	objanw.checkclasdtmsg();
    
}

@Then("selected date should be in  mm\\/dd\\/yyyy format")
public void selected_date_should_be_in_mm_dd_yyyy_format() {
	objanw.checkclasdtmsg();
    
}

@When("Admin clicks right arrow in the date picker near month")
public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
	objanw.checkclasdtmsg();
    
}

@Then("Next month calender should visible")
public void next_month_calender_should_visible() {
	objanw.checkclasdtmsg();
    
}

@When("Admin clicks left arrow in the date picker near month")
public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
	objanw.checkclasdtmsg();
    
}

@Then("previous month calender should visible")
public void previous_month_calender_should_visible() {
    
	objanw.checkclasdtmsg();
}

@When("Admin clicks date picker button")
public void admin_clicks_date_picker_button() {
    objanw.datepickerclickmeth();
    
}

@Then("Admin should see current date is highled in the date picker")
public void admin_should_see_current_date_is_highled_in_the_date_picker() {
    
	objanw.checkclasdtmsg();
}

@When("Admin clicks date picker button and selects future date")
public void admin_clicks_date_picker_button_and_selects_future_date() {
	objanw.checkclasdtmsg();
    
}

@Then("Admin should see selected date is highled in the date picker")
public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
	objanw.checkclasdtmsg();
    
}

@When("Admin clicks Cancel button without entering values in the fields")
public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
    objanw.cancelclkmeth();
    
}

@Then("Admin should land on Manage Class page")
public void admin_should_land_on_manage_class_page() {
    
    
}

@When("Admin clicks Cancel button entering values in the fields")
public void admin_clicks_cancel_button_entering_values_in_the_fields() {
    
	objanw.cancelclkmeth();
    
}

@Then("Admin should land on Manage Class Page and validate new class is not created in the data table")
public void admin_should_land_on_manage_class_page_and_validate_new_class_is_not_created_in_the_data_table() {
	 boolean status= objanw.mangecalssnoentrychk();
	 Assert.assertTrue(status);
}
//edit new class

@Given("Admin is in Manage class page Admin is in Edit class detail popup window")
public void admin_is_in_manage_class_page_admin_is_in_edit_class_detail_popup_window() {
    
    
}

@When("Admin clicks Edit button in data table")
public void admin_clicks_edit_button_in_data_table() {
    objedc.editbtnclkmehtod();
    
}

@Then("Edit popup window appears with heading Class Details")
public void edit_popup_window_appears_with_heading_class_details() {
    objedc.chkEditpopage();
    
}

@When("Admin clicks Edit button from one of the row in data table")
public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
	  objedc.editbtnclkmehtod();
    
}

@Then("Edit popup window appears with same row values in the all fields")
public void edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
   boolean status= objedc.chkallrws();
   Assert.assertTrue(status);
}

@Given("Admin is in  Edit class detail popup window")
public void admin_is_in_edit_class_detail_popup_window() {
	boolean status= objedc.chkEditpopage();
	 Assert.assertTrue(status);  
}

@Then("Admin should see particular class details is updated in the data table")
public void admin_should_see_particular_class_details_is_updated_in_the_data_table() {
    
	objedc.chkallrws();
}

@Then("class cannot be updated for the passed date")
public void class_cannot_be_updated_for_the_passed_date() {
	objanw.checkclasdtmsg();
    
    
}

@Then("Admin should land on Manage Class Page and validate particular class details are not changed  in the data table")
public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_changed_in_the_data_table() {
    
    
}
//Delete class
@Given("Admin is in Manage class page")
public void admin_is_in_manage_class_page() {
    
    
}


@When("Admin clicks delete button in data table row level")
public void admin_clicks_delete_button_in_data_table_row_level() {
	obj.DelBtnclick();
    
}

@Then("Admin should see alert")
public void admin_should_see_alert() {
	boolean status =obj.Messagedisplayed();
	Assert.assertTrue(status);
}

@Then("Alert should have yes button to accept")
public void alert_should_have_yes_button_to_accept() {
	boolean status =obj.YesMessagedisplayed();
	Assert.assertTrue(status);
}

@Then("Alert should have no button to reject")
public void alert_should_have_no_button_to_reject() {
	obj.alertmsgno();
    
}
/*
@Given("Admin is in delete alert")
public void admin_is_in_delete_alert() {
	boolean status= obj.Messagedisplayed();
	Assert.assertTrue(status);
}*/
    


@When("Admin clicks yes button")
public void admin_clicks_yes_button() {
    
	obj.alertmsgyes();
	boolean status = obj.NoMessagedisplayed();    
	Assert.assertTrue(status);
}

@Then("Success message and validate particular class details are deleted from the data table")
public void success_message_and_validate_particular_class_details_are_deleted_from_the_data_table() {
	boolean status =obj.Messagedisplayed();
	Assert.assertTrue(status);
}

@When("Admin clicks no button")
public void admin_clicks_no_button() {
	obj.alertmsgno();
    
}

@Then("Admin should land on manage class page and validate particular class details are not deleted from the data table")
public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_deleted_from_the_data_table() {
    
    
}

@When("Admin clicks single  row level check box in the data table")
public void admin_clicks_single_row_level_check_box_in_the_data_table() {
	obj.checkboxclickmethd();
    
}

@Then("Admin should see delete icon below the header is enabled")
public void admin_should_see_delete_icon_below_the_header_is_enabled() {
	boolean status =obj.deletebtnenabledchk();
	Assert.assertTrue(status);
}

@Then("Admin should see tick mark in check box")
public void admin_should_see_tick_mark_in_check_box() {
	boolean status =obj.chkboxselectCheckmsg();   
	Assert.assertTrue(status);
}

@When("Admin clicks multiple row level check box in the data table")
public void admin_clicks_multiple_row_level_check_box_in_the_data_table() {
	obj.multichkboxclickmethod();
	
}

@Then("Admin should see tick mark in check box  of the selected rows")
public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows() {
    
	boolean status =obj.multichkboxselectCheckmsg();
	Assert.assertTrue(status);
}
@Then("Admin should land on manage class page and validate particular class details are deleted from the data table")
public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_deleted_from_the_data_table() {
	boolean status= obj.ManageclassLandingPage();
	Assert.assertTrue(status);
    
}

@When("Admin click on Batch id column header to sort")
public void admin_click_on_batch_id_column_header_to_sort() {
	objvd.clickbatchid();
    
}

@Then("Admin should see data table sorted in descending order")
public void admin_should_see_data_table_sorted_in_descending_order() {
	//user first clicks the sorting error and sorting happens 
	objvd.clickbatchid();
	objvd.Sortingmethod();
}

@When("Admin double click on Batch id column header to sort")
public void admin_double_click_on_batch_id_column_header_to_sort() {
    
	//assumption - double clicks and sorting happens in ascending order
			objvd.clickbatchid();
			objvd.Sortingmethod();
}

@Then("Admin should see data table sorted in ascending  order")
public void admin_should_see_data_table_sorted_in_ascending_order() {
	objvd.Sortingmethod();
    
}

//pagination

@When("Admin clicks class button on the navigation bar")
public void admin_clicks_class_button_on_the_navigation_bar() {
	objpg.ClassbtnclickMethod();
    
}

@Then("Data table should display one page  when entries available")
public void data_table_should_display_one_page_when_entries_available() {
    boolean status = objpg.dataMessagedisplayed();
    Assert.assertTrue(status);
}

@Then("Right arrow should be enabled in page one  when entries are more than five available")
public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_five_available() {
    
   boolean status= objpg.rightarrowchk();
   Assert.assertTrue(status);
}

@Then("Left arrow should be disabled in page one  when entries are more than five available")
public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_five_available() {
  boolean status=  objpg.leftarrowchk();
  Assert.assertTrue(status);
}

@Then("Right arrow should be enabled in page two when entries are more than ten available")
public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_ten_available() {
    
    boolean status = objpg.rightdblClick();
    Assert.assertTrue(status);
}

@Then("Left arrow should be enabled in page two")
public void left_arrow_should_be_enabled_in_page_two() {
   boolean status= objpg.leftarrowchk();
   Assert.assertTrue(status);
    
}

@Then("Data table should display  pageone when entries available")
public void data_table_should_display_pageone_when_entries_available() {
    
	  boolean status = objpg.dataMessagedisplayed();
	  Assert.assertTrue(status);
}

@Then("if entries are more than five in data table pagination controls enabled")
public void if_entries_are_more_than_five_in_data_table_pagination_controls_enabled() {
 boolean status =   objpg.arrenabledmethd();
 Assert.assertTrue(status);
}

@Then("if entries are less than five in data table pagination controls disabled")
public void if_entries_are_less_than_five_in_data_table_pagination_controls_disabled() {
    boolean status =objpg.arrdisbledmethd();
    Assert.assertTrue(status);
}
@Given("Admin is in add class details popup window")
public void admin_is_in_add_class_details_popup_window() {
    
    
}

@When("Admin creates six new class")
public void admin_creates_six_new_class() {
    
    
}

@Then("If total class entries above five next page is enabled")
public void if_total_class_entries_above_five_next_page_is_enabled() {
    
    
}

@When("Admin creates less than or equal to five new class")
public void admin_creates_less_than_or_equal_to_five_new_class() {
    
    
}

@Then("If total class entries  five or below next page is disabled")
public void if_total_class_entries_five_or_below_next_page_is_disabled() {
	objpg.arrdisbledmethd();
    
}






}