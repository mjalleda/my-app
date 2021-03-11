package com.selng.demo.utils;
import org.openqa.selenium.support.events.WebDriverEventListener;
import com.selng.demo.configs.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

public class WebDriverEventsListener extends BaseClass implements WebDriverEventListener {

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Before Navigating back to previous page");
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Navigated back to previous page");
	}

	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Before Navigating forward to next page");
	}

	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Navigated forward to next page");
	}
	
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before navigating to a URL: '" + url + "'");
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigated to a URL:'" + url + "'");
	}
	
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("Value of the element is :" + element.toString() + " before any changes made");
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("Element value changed to: " + element.toString());
	}
	
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before finding element By : " + by.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Found Element By : " + by.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Trying to click on the element: " + element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicked on the element : " + element.toString());
	}

	/* public void onException(Throwable error, WebDriver driver) {
		System.out.println("Exception occured: " + error);
		try {
			TestUtil.takeScreenshotAtEndOfTest();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	*/
	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Exception occured: " + error);
		try {
			System.out.println("Print");
			//TestUtil.takeScreenshotAtEndOfTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}
	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub

	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub

	}
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("Info: Before accepting alert ");
	}

	public void afterAlertAccept(WebDriver driver) {
		System.out.println("Info: After accepting alert ");
	}

	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("Info: Before dismissing alert ");
	}
	
	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("Info: After dismissing alert ");
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}
	public void beforeScript(String script, WebDriver driver) {
		System.out.println("Before Script is: " + script);
	}

	public void afterScript(String script, WebDriver driver) {
		System.out.println("After Script is: " + script);
	}

	

	

}