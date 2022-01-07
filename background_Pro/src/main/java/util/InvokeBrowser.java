package util;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeBrowser {
	private static Properties value;
	private static WebDriver driver;

	public WebDriver invokeBrowser() {
	 PropertyReader obj_PropertyReader=new PropertyReader();
		value=obj_PropertyReader.properyReader();
		if(value.getProperty("browser").equalsIgnoreCase("chrome")) {
			ChromeOptions obj_ChromeOptions=new ChromeOptions();
			obj_ChromeOptions.addArguments("Incognito");
			obj_ChromeOptions.addArguments("start-maximized");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(obj_ChromeOptions);
		}

		else
		{
			System.out.println("no appropiate driver found");
		}
		return driver;	
	}

	public WebDriver enterurl()
	{
		driver.get(value.getProperty("url"));
		return driver;
	}
	public WebDriver getDriver() {
		return driver;
	}

}
