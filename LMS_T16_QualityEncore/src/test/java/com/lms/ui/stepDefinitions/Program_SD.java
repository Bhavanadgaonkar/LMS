package com.lms.ui.stepDefinitions;



import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.lms.ui.driver.DriverFactory;
import com.lms.ui.pageObject.Program_obj;
import com.lms.ui.pageObject.VerifySort_obj;

import io.cucumber.java.en.*;


public class Program_SD extends DriverFactory{
	public static Program_obj pgm;
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		pgm = new Program_obj(dr);		    
		dr.get("https://www.google.com/");
	   
	}
	VerifySort_obj objsort = new VerifySort_obj(dr);
	
	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
	   pgm.clkProgramLink();
	}

	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String urlText) {
		String urlProgram = pgm.programPageValidation();
		Assert.assertTrue(urlProgram.contains(urlText));
		
	}


	@Then("Admin should see a heading with text {string} on the page")
	public void admin_should_see_a_heading_with_text_on_the_page(String headerProgram) {
	    String headerTextValidation = pgm.pgmHeaderValidation();
	    Assert.assertTrue(headerTextValidation.contains(headerProgram));
	}

	@Then("Admin should see the text as {string} along with Pagination icon below the table.")
	public void admin_should_see_the_text_as_along_with_pagination_icon_below_the_table(String paginatorText) {
	    String paginatorTextIconValidation=pgm.paginationTextWithIcon();
	    Assert.assertTrue(paginatorTextIconValidation.contains(paginatorText));
	}

	@Then("Admin should see the footer as {string}.")
	public void admin_should_see_the_footer_as(String footerText) {
		String footerTextValidation =pgm.pgmFooterValidation();
		Assert.assertTrue(footerTextValidation.contains(footerText));
	   
	}

	@Then("Admin should see a Delete button on the top left hand side as Disabled")
	public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() {
	   pgm.disabledDeleteIcon();
	}
	
	@Then("Admin should see a {string} button on the program page above the data table")
	public void admin_should_see_a_button_on_the_program_page_above_the_data_table(String newProgram) {
	   pgm.ValidateNewProgramBtnVisibility();
	}
	
	@Then("Admin should see the number of records \\(rows of data in the table) displayed on the page are {int}")
	public void admin_should_see_the_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer count) {
	   pgm.noOfRecordsValidation();
	}
	
	@Then("Admin should see data table on the Manage Program Page with following column headers \\(Program Name, Program Description, Program Status, Edit,Delete)")
	public void admin_should_see_data_table_on_the_manage_program_page_with_following_column_headers_program_name_program_description_program_status_edit_delete() {
	    pgm.columnHeaderValidation();
	}
	
	@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
	    pgm.sortArrowIconValidation();
	}
	
	@Then("Admin should see check box on the left side in all rows of the data table")
	public void admin_should_see_check_box_on_the_left_side_in_all_rows_of_the_data_table() {
	    pgm.displayedCheckBoxValidation();
	}
	
	@Then("Admin should see the Edit and Delete buttons on each row of the data table")
	public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
	    pgm.displayedEditDeleteBtnValidation();
	}
	
	@Then("Admin should see Search bar with text as {string}")
	public void admin_should_see_search_bar_with_text_as(String searchText) {
		String searchPlaceHolder =pgm.searchValidation();
		Assert.assertTrue(searchPlaceHolder.contains(searchText));
	}

	@Given("Admin is on Manage Program Page")
	public void admin_is_on_manage_program_Page() throws InterruptedException {
		pgm = new Program_obj(dr);
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   // dr.get("https://datatables.net/examples/advanced_init/dt_events.html");
	   // dr.get("https://editor.datatables.net/examples/simple/inTableControls.html");
	    dr.get("https://ManageProgram_Page.html");
	    JavascriptExecutor js = ((JavascriptExecutor) dr);
		js.executeScript("window.scrollBy(0,450)");
		
		
	}

	@When("Admin enters <Program name phrase> into search box.")
	public void admin_enters_program_name_phrase_into_search_box() {
	    pgm.inputSearchByProgramName();
	}

	@Then("Admin should see the Programs displayed based on the Program Name")
	public void admin_should_see_the_programs_displayed_based_on_the_program_name() {
	    pgm.displayedSearchByProgramNameValidation();
	}
	
	@When("Admin enters <Program description phrase> into search box.")
	public void admin_enters_program_description_phrase_into_search_box() {
	    pgm.inputSearchByProgramDesc();
	}

	@Then("Admin should see the Programs displayed based on the Program Description")
	public void admin_should_see_the_programs_displayed_based_on_the_program_description() {
	    pgm.displayedSearchByProgramDescValidation();
	}
	
	@When("Admin enters <Program status phrase> into search box.")
	public void admin_enters_program_status_phrase_into_search_box() {
		pgm.inputSearchByProgramStatus();
	}

	@Then("Admin should see the Programs displayed based on the Program Status")
	public void admin_should_see_the_programs_displayed_based_on_the_program_status() {
	    pgm.displayedSearchByProgramStatusValidation();
	}
	
	@When("Admin enters the keywords not present in the data table on the Search box")
	public void admin_enters_the_keywords_not_present_in_the_data_table_on_the_search_box() {
	    pgm.inputSearchByUnrelatedKeyword();
	}

	@Then("Admin should see {string} on the data table")
	public void admin_should_see_on_the_data_table(String paginationText) {
		String searchUnrelated =pgm.displayedSearchByUnrelatedKeywordValidation();
		Assert.assertTrue(searchUnrelated.contains(paginationText));
	}

	
//Feature 2. Add New Program	
	@When("Admin clicks <A New Program> button")
	public void admin_clicks_a_new_program_button() {
	    pgm.clkAddNewProgram();
	}

	@Then("Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close\\(X) Icon on the top right corner of the window")
	public void admin_should_see_a_popup_open_for_program_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window() {
	    pgm.displayedPopUpWindow();
	}
	
	@Then("Admin should see two input fields and their respective text boxes in the program details window")
	public void admin_should_see_two_input_fields_and_their_respective_text_boxes_in_the_program_details_window() {
	    pgm.displayInputField_TextBoxValidation();
	}
	
	@Then("Admin should see two radio button for Program Status")
	public void admin_should_see_two_radio_button_for_program_status() {
	    pgm.displayedStatusValidation();
	}
	
//Feature2 with another background
	
	@Given("Admin is on Program Details Popup window")
	public void admin_is_on_program_details_popup_window() {
	    pgm.displayedStatusValidation();
	}

	@When("Admin clicks <Save> button without entering any data")
	public void admin_clicks_save_button_without_entering_any_data() {
	    pgm.clkSaveBtn();
	}

	@Then("Admin gets a Error message alert")
	public void admin_gets_a_error_message_alert() {
	    pgm.errorMessageAlertValidation();
	}
	
	
	/*@When("Admin enters only {string} in text box and clicks Save button")
	public void admin_enters_only_in_text_box_and_clicks_save_button(String sheetname) throws InvalidFormatException, IOException {
		String excelPath  = System.getProperty("user.dir");
	    ExcelReader reader = new ExcelReader();	   
		List<Map<String, String>> testdata = reader.getData(excelPath+"/src/test/resources/ExcelData/Login1.xlsx", sheetname);
	     
	    String programname = testdata.get(2).get("programName");
	    pgm.enterProgramName(programname);
	}*/
	
	@When("Admin enters only name {string} in text box and clicks Save button")
	public void admin_enters_only_name_in_text_box_and_clicks_save_button(String sheetname) throws InvalidFormatException, IOException {
		String excelPath  = System.getProperty("user.dir");
	    ExcelReader reader = new ExcelReader();	   
		List<Map<String, String>> testdata = reader.getData(excelPath+"/src/test/resources/ExcelData/Login1.xlsx", sheetname);
	     
	    String programname = testdata.get(2).get("programName");
	    pgm.enterProgramName(programname);
	    pgm.clkSaveBtn();
	}

	@Then("Admin gets a message alert {string}")
	public void admin_gets_a_message_alert(String string) {
		pgm.MessageAlertValidation();
	}
	
	@When("Admin enters only description {string} in text box and clicks Save button")
	public void admin_enters_only_description_in_text_box_and_clicks_save_button(String sheetname) throws InvalidFormatException, IOException {
		String excelPath  = System.getProperty("user.dir");
	    ExcelReader reader = new ExcelReader();	   
		List<Map<String, String>> testdata = reader.getData(excelPath+"/src/test/resources/ExcelData/Login1.xlsx", sheetname);
	     
	    String programdesc = testdata.get(2).get("programDescription");
	    pgm.enterProgramDescription(programdesc);
	    pgm.clkSaveBtn();
	}
		
	
	@When("Admin selects only {string} and clicks Save button")
	public void admin_selects_only_and_clicks_save_button(String sheetname) throws InvalidFormatException, IOException {
		String excelPath  = System.getProperty("user.dir");
	    ExcelReader reader = new ExcelReader();	   
		List<Map<String, String>> testdata = reader.getData(excelPath+"/src/test/resources/ExcelData/Login1.xlsx", sheetname);
		
		String programstatus = testdata.get(2).get("programStatus");
		pgm.enterProgramStatus(programstatus);
		pgm.clkSaveBtn();
		
	}
	@When("Admin enters only {string} in name and desc column")
	public void admin_enters_only_in_name_and_desc_column(String sheetname) throws InvalidFormatException, IOException {
		String excelPath  = System.getProperty("user.dir");
	    ExcelReader reader = new ExcelReader();	   
		List<Map<String, String>> testdata = reader.getData(excelPath+"/src/test/resources/ExcelData/Login1.xlsx", sheetname);
		String programname = testdata.get(2).get("invalidProgramName");
		String programdesc = testdata.get(2).get("invalidProgramDesc");
	    pgm.enterProgramName(programname); 
	    pgm.enterProgramDescription(programdesc);
	}
			
	@When("Admin clicks Cancel or Close\\(X) Icon on Program Details form")
	public void admin_clicks_cancel_or_close_x_icon_on_program_details_form() {
	   pgm.closeIconValidation();
	}
	
	@Then("Program Details popup window should be closed without saving")
	public void program_details_popup_window_should_be_closed_without_saving() {
	    pgm.closeIconValidation();
	}
	
	
	@When("Enter all the required fields with valid values Program,Program,Program and click Save button")
	public void enter_all_the_required_fields_with_valid_values_program_program_program_and_click_save_button() throws InvalidFormatException, IOException {
		String excelPath  = System.getProperty("user.dir");
	    ExcelReader reader = new ExcelReader();	   
		String sheetname = null;
		List<Map<String, String>> testdata = reader.getData(excelPath+"/src/test/resources/ExcelData/Login1.xlsx",sheetname);
		String programname = testdata.get(2).get("programName");
		String programdesc = testdata.get(2).get("programDescription");
		String programstatus = testdata.get(2).get("programStatus");
	    pgm.enterProgramName(programname); 
	    pgm.enterProgramDescription(programdesc);
	    pgm.enterProgramStatus(programstatus);
	    pgm.clkSaveBtn();
	}



	@Then("Admin gets a message {string} alert and able to see the new program added in the data table")
	public void admin_gets_a_message_alert_and_able_to_see_the_new_program_added_in_the_data_table(String successMessageAlert) {
		String successMassage = pgm.successMessageAlertValidation();
		Assert.assertTrue(successMassage.contains(successMessageAlert));
	}
	
	@When("Admin clicks <Cancel> button")
	public void admin_clicks_cancel_button() {
	    pgm.clkCancelBtn();
	}

	@Then("Admin can see the Program details popup disappears without creating any program")
	public void admin_can_see_the_program_details_popup_disappears_without_creating_any_program() {
	    pgm.cancelBtnValidation();
	}
	
	//Feature 3 Edit
	@When("Admin clicks <Edit> button on the data table for any row")
	public void admin_clicks_edit_button_on_the_data_table_for_any_row() throws InterruptedException {
	    pgm.clkEachEditIcon();
	}

	@Then("Admin should see a popup open for Program details to edit")
	public void admin_should_see_a_popup_open_for_program_details_to_edit() {
	    pgm.displayedPopUpWindow();
	}
//Feature 3 with another background
	@Given("Admin is on Program Details Popup window to Edit")
	public void admin_is_on_program_details_popup_window_to_edit() {
		pgm.displayPopupWindowForEdit();
	}

	@When("Admin edits the Name column using excel {string} and clicks save button")
	public void admin_edits_the_name_column_using_excel_and_clicks_save_button(String sheetname) throws InvalidFormatException, IOException {
		String excelPath  = System.getProperty("user.dir");
	    ExcelReader reader = new ExcelReader();	   
		List<Map<String, String>> testdata = reader.getData(excelPath+"/src/test/resources/ExcelData/Login1.xlsx", sheetname);
	     
	    String programname = testdata.get(2).get("editProgramName");
	    pgm.enterProgramName(programname);
	    pgm.clkSaveBtn();
	}

	@Then("Admin gets a message {string} alert and able to see the updated name in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_name_in_the_table_for_the_particular_program(String successMessageAlert) {
		String successMassage = pgm.successMessageAlertValidation();
		Assert.assertTrue(successMassage.contains(successMessageAlert));
	}
	
	@When("Admin edits the Description column using excel {string} and clicks save button")
	public void admin_edits_the_description_column_using_excel_and_clicks_save_button(String sheetname) throws InvalidFormatException, IOException {
		String excelPath  = System.getProperty("user.dir");
	    ExcelReader reader = new ExcelReader();	   
		List<Map<String, String>> testdata = reader.getData(excelPath+"/src/test/resources/ExcelData/Login1.xlsx", sheetname);
	     
	    String programdesc = testdata.get(2).get("editProgramDesc");
	    pgm.enterProgramDescription(programdesc);
	    pgm.clkSaveBtn();
	}

	@Then("Admin gets a message {string} alert and able to see the updated description in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_description_in_the_table_for_the_particular_program(String successMessageAlert) {
		String successMassage = pgm.successMessageAlertValidation();
		Assert.assertTrue(successMassage.contains(successMessageAlert));
	}
	
	@When("Admin changes the Status using excel {string} and clicks save button")
	public void admin_changes_the_status_using_excel_and_clicks_save_button(String sheetname) throws InvalidFormatException, IOException {
		String excelPath  = System.getProperty("user.dir");
	    ExcelReader reader = new ExcelReader();	   
		List<Map<String, String>> testdata = reader.getData(excelPath+"/src/test/resources/ExcelData/Login1.xlsx", sheetname);
		
		String programstatus = testdata.get(2).get("editProgramStatus");
		pgm.enterProgramStatus(programstatus);
		pgm.clkSaveBtn();
	}

	@Then("Admin gets a message {string} alert and able to see the updated status in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_status_in_the_table_for_the_particular_program(String successMessageAlert) {
		String successMassage = pgm.successMessageAlertValidation();
		Assert.assertTrue(successMassage.contains(successMessageAlert));
	}
	

	
	@When("Admin clicks <Cancel> button on edit popup")
	public void admin_clicks_cancel_button_on_edit_popup() {
	   pgm.clkCancelBtn();
	}

	@Then("Admin can see the Program details popup disappears and can see nothing changed for particular program")
	public void admin_can_see_the_program_details_popup_disappears_and_can_see_nothing_changed_for_particular_program() {
	   pgm.cancelBtnValidationForEdit();
	}
	
	@When("Admin clicks <Save> button on edit popup")
	public void admin_clicks_save_button_on_edit_popup() {
	    pgm.clkSaveBtn();
	}

	@Then("Admin gets a message {string} alert and able to see the updated details in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_details_in_the_table_for_the_particular_program(String successMessageAlert) {
		String successMassage = pgm.successMessageAlertValidation();
		Assert.assertTrue(successMassage.contains(successMessageAlert));
	}
	
//Feature 4 Delete Program
	
	@When("Admin clicks <Delete> button on the data table for any row")
	public void admin_clicks_delete_button_on_the_data_table_for_any_row() {
		pgm.clkDeleteBtn();
	   
	}

	@Then("Admin should see a alert open with heading {string} along with <YES> and <NO> button for deletion")
	public void admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion(String string) {
	    pgm.isAlertPresentDelete();
	}
	
	@Then("Admin should see a message {string}")
	public void admin_should_see_a_message(String delMsgConfirm) {
		String successMassage = pgm.MessageAlertValidation();
		Assert.assertTrue(successMassage.contains(delMsgConfirm));
	}
//Feature 4 Delete Program with another background
	
	@Given("Admin is on Confirm Deletion alert")
	public void admin_is_on_confirm_deletion_alert() {
	    pgm.MessageAlertValidation();
	}

	@When("Admin clicks <YES> button on the alert")
	public void admin_clicks_yes_button_on_the_alert() {
	    pgm.clkYesBtn();
	}

	@Then("Admin gets a message {string} alert and able to see that program deleted in the data table")
	public void admin_gets_a_message_alert_and_able_to_see_that_program_deleted_in_the_data_table(String successMessageAlert) {
		String successMassage = pgm.successMessageAlertValidation();
		Assert.assertTrue(successMassage.contains(successMessageAlert));
	}
	
	@When("Admin clicks <NO> button on the alert")
	public void admin_clicks_no_button_on_the_alert() {
	    pgm.clkNoBtn();
	}

	@Then("Admin can see the deletion alert disappears without deleting")
	public void admin_can_see_the_deletion_alert_disappears_without_deleting() {
	   pgm.isAlertPresentDelete();
	}
	
	@When("Admin clicks Cancel\\/Close\\(X) Icon on Deletion alert window")
	public void admin_clicks_cancel_close_x_icon_on_deletion_alert_window() {
		pgm.clkCloseIconDelete();
	   
	}

	@Then("Admin can see the deletion alert disappears without any changes")
	public void admin_can_see_the_deletion_alert_disappears_without_any_changes() {
	    pgm.closeIconDeleteValidation();
	}
	
//Feature 5 Multiple Delete Program	
	@Given("Admin is on Manage Program page")
	public void admin_is_on_manage_program_page() {
		pgm = new Program_obj(dr);
		
		dr.manage().window().maximize();		
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("https://ManageProgram_Page.html");
	}

	@When("Admin clicks any checkbox in the data table")
	public void admin_clicks_any_checkbox_in_the_data_table() {
	    pgm.clkSingleCheckBox();
	    pgm.clkmultipleCheckBoxes();
	}

	@Then("Admin should see common delete option enabled under header Manage Program")
	public void admin_should_see_common_delete_option_enabled_under_header_manage_program() {
	    pgm.commonDeleteOption();
	}
	
//Feature 5 Multiple Delete Program	with another background
	
	@Then("Admin should land on Manage Program page and can see the selected program is deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_deleted_from_the_data_table() {
		
		pgm.getTitle_ManageProgram_Page();
	}
	
	@Then("Admin should land on Manage Program page and can see the selected program is not deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_not_deleted_from_the_data_table() {
		
		pgm.getTitle_ManageProgram_Page();
	}
	
//Feature 5 Multiple Delete Program	with another background	
	
	@Then("Admin should land on Manage Program page and can see the selected programs are deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_deleted_from_the_data_table() {
		pgm.getTitle_ManageProgram_Page();
	}
	
	@Then("Admin should land on Manage Program page and can see the selected programs are not deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_not_deleted_from_the_data_table() {
		pgm.getTitle_ManageProgram_Page();
	}

//Feature sorting	
	

	@When("Admin clicks the sort icon of program name column")
	public void admin_clicks_the_sort_icon_of_program_name_column() {
		objsort.clkSortIconProgramNameColumn();
	}

	@Then("The data get sorted on the table based on the program name column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_ascending_order() {
		objsort.clkSortIconProgramNameColumn();
		objsort.Sortingmethod();
	}
	
	@Given("The data is in the ascending order on the table based on Program Name column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_name_column() {
	    
	}

	@Then("The data get sorted on the table based on the program name column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_descending_order() {
		objsort.Sortingmethod();
	}
@When("Admin clicks the sort icon of program Desc column")
	public void admin_clicks_the_sort_icon_of_program_desc_column() {
	objsort.clkSortIconProgramDescColumn();
	}

	@Then("The data get sorted on the table based on the program description column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_ascending_order() {
		objsort.Sortingmethod();
	}
	
	@Given("The data is in the ascending order on the table based on Program Description column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_description_column() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The data get sorted on the table based on the program description column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_descending_order() {
		objsort.Sortingmethod();
	}
@When("Admin clicks the sort icon of program Status column")
	public void admin_clicks_the_sort_icon_of_program_status_column() {
	objsort.clkSortIconProgramStatusColumn();
	}

	@Then("The data get sorted on the table based on the program status column values in ascending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_ascending_order() {
		objsort.Sortingmethod();
	}
	
	@Given("The data is in the ascending order on the table based on Program Status column")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_status_column() {
	    
	}

	@Then("The data get sorted on the table based on the program status column values in descending order")
	public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_descending_order() {
		objsort.Sortingmethod();
	}


}
