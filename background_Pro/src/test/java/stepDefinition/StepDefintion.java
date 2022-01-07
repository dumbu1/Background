package stepDefinition;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SeleniumPage;
import util.InvokeBrowser;

public class StepDefintion {
	private static WebDriver wd;

	@Given("user is {string} page")
	public void user_is_page(String expTitle) {

		InvokeBrowser obj_InvokeBrowser=new InvokeBrowser();
		//WebDriver wd=obj_InvokeBrowser.invokeBrowser();
		wd=obj_InvokeBrowser.getDriver();
		Assert.assertEquals(wd.getTitle(), expTitle);
	}

	@When("user clicks on the Selenium Example Page link")
	public void user_clicks_on_the_selenium_example_page_link() {
		HomePage obj_HomePage= new HomePage(wd);
		obj_HomePage.link_Selenium_ExamplePage();
	}

	@Then("system should display {string} page")
	public void system_should_display_page(String expTitle) {
		Assert.assertEquals(wd.getTitle(), expTitle);  
	}

	@When("user enter {string} on Form Elements")
	public void user_enter_on_form_elements(String text) {
		SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
		obj_SeleniumPage.sendDataOn_FormELements(text);
	}

	@When("user enter {string} on textBox")
	public void user_enter_on_text_box(String text) {
		SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
		obj_SeleniumPage.sendDataOnTextArea(text);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
		obj_SeleniumPage.clickOn_SubmitButton();
	}

	@When("user clicks on Selenium Example Page")
	public void user_clicks_on_selenium_example_page() {
		HomePage obj_HomePage= new HomePage(wd);
		obj_HomePage.link_Selenium_ExamplePage();

	}

	@Then("user is in {string}")
	public void user_is_in(String  expTitle) {
		Assert.assertEquals(wd.getTitle(), expTitle);  
	}

	

	@Then("user click on the radio2 button")
	public void user_click_on_the_radio2_button() {
		
	}	

	@Then("user check the list box")
	public void user_check_the_list_box(List<Object> dataTable) {
		List<String> expOptions=new ArrayList<String>();
		for(Object a:dataTable) {
			
			expOptions.add(a.toString());
		}
		SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
		List<String> act_Options=obj_SeleniumPage.select_CheckOptions();
		
	
		
		Assert.assertEquals(act_Options, expOptions, "drop down options");
	
	}
	

}
