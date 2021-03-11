package com.selng.demo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.selng.demo.configs.BaseClass;

public class contactsPage extends BaseClass {

	@FindBy(id="first_name")
	WebElement varfirstname;
	
	@FindBy(id="surname")
	WebElement varlastname;
	
	@FindBy(name="client_lookup")
	WebElement varcompany1;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	// Initializing above Objects:
	public contactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createcontact(String title, String firstname, String lastname, String company){
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		varfirstname.sendKeys(firstname);
		varlastname.sendKeys(lastname);
		varcompany1.sendKeys(company);
		saveBtn.click();		
	}
}
