package util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	public void clickOnIt(WebElement web) {
		web.click();
	}
	public void sendDataOnIt(WebElement web, String text) {
		web.sendKeys(text);
	}
	
	
	//dropdown
	
	public List<String> select_CheckOptions(WebElement web) {
		Select s =new Select(web);
		
		List<String> values=new ArrayList<String>();
		List<WebElement> Options=s.getOptions();
		
		for (WebElement option : Options) {
		values.add(option.getText());
		}
		
		return values;
	}
}
