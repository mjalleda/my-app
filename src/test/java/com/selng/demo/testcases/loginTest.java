package com.selng.demo.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.selng.demo.configs.BaseClass;
import com.selng.demo.pages.dashboardPage;
import com.selng.demo.pages.loginPage;

public class loginTest extends BaseClass{ 
	loginPage loginPage;
	dashboardPage dashboardPage;
	

	@BeforeTest
	public void setUp(){
		executeDriver();
		loginPage = new loginPage();	 //created object for page > loginPage.
	}
	
	@Test(priority=1)
	public void loginTest(){
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=2)
	public void verifylogin() {
		dashboardPage.verifylogout();
	}
	
	@AfterTest
	public void exitdriver(){
		driver.quit();
	}

}
