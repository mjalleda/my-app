package com.selng.demo.configs;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import java.io.FileInputStream;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.selng.demo.utils.WebDriverEventsListener;

public class BaseClass {
	   
	public static WebDriver driver;
	public static Properties prop;
	public static String homedir = System.getProperty("user.dir");
	public static String chromepath = System.getProperty("user.dir") + "/src/main/resources/browserprofiles/chromedriver";
	public static WebDriverEventsListener wdeventListener;
	public  static EventFiringWebDriver eventfiringwebdriver;
	
	
	@BeforeSuite
	public void testBESuite(){
		try {
			prop = new Properties();
			FileInputStream loadfile = new FileInputStream(homedir + "/src/main/resources/config.properties");			
			prop.load(loadfile);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	
	public void executeDriver(){
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver = new ChromeDriver(); 
		}
		
		eventfiringwebdriver = new EventFiringWebDriver(driver); //object of EventFiring Webdriver
		wdeventListener = new WebDriverEventsListener();  //object of WebDriverEvents listerner.  
		eventfiringwebdriver.register(wdeventListener); // WebDriver EventListernerhandler object is registering it with EventFiringWebDriver
		driver = eventfiringwebdriver;
		
		driver.manage().window().maximize();
		driver.get(url);	
		
	}
	
  
	

}
