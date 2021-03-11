package com.selng.demo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selng.demo.configs.BaseClass;

public class dashboardPage extends BaseClass {
	
	//@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	@FindBy(xpath = "//span[text()='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;

	// Initializing above elements:
	public dashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public contactsPage clickonContactLink() {
		contactsLink.click();
		return new contactsPage();
	}
	
	public void verifylogout(){
		Assert.assertEquals(driver.getTitle(),"Cogmento CRM");		
	}
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}
	
	

}
