package com.selng.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

import com.selng.demo.configs.BaseClass;


public class loginPage extends BaseClass{
	
	@FindBy(xpath="//img[@title='Software Testing and Quality Assurance Forums - Powered by vBulletin']")
	WebElement forumtitle;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
		
	@FindBy(xpath="//div[starts-with(text(),'Login')]")
	WebElement loginButton;
	
	//Initializing above Objects:
	public loginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public dashboardPage login(String user, String pwd){
		username.sendKeys(user);
		password.sendKeys(pwd);
		loginButton.click();
		return new dashboardPage();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
