package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.CommonMethods;

public class SeleniumPage {
	
	CommonMethods obj_CommonMethods=new CommonMethods();

	public SeleniumPage(WebDriver wd) {
		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//input[@type='text' and @name='text']")
	WebElement sendDataOnFormElements;

	public void sendDataOn_FormELements(String text) {
		obj_CommonMethods.sendDataOnIt(sendDataOnFormElements, text);
	}
	@FindBy(xpath ="//textarea[@name='textarea']" )
	WebElement sendDataOn_TextArea;
	public void sendDataOnTextArea(String text) {
		obj_CommonMethods.sendDataOnIt(sendDataOn_TextArea, text);
	}
	@FindBy(xpath = "//input[@type='submit' and @ id='submitbtn']")
	WebElement clickOnTheSubmitBtn;
	public void clickOn_SubmitButton() {
		obj_CommonMethods.clickOnIt(clickOnTheSubmitBtn);	
	}
	@FindBy(xpath = "//select[@id='dropdown']")
	WebElement selectOnTheOption;
	
	public List<String>  select_CheckOptions() {
	return obj_CommonMethods.select_CheckOptions(selectOnTheOption);
	}
	
}