package com.selng.demo.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.selng.demo.pages.*;
import com.selng.demo.utils.*;
import com.selng.demo.configs.BaseClass;

public class contactsTest extends BaseClass {
	loginPage loginPage;
	dashboardPage dashboardPage;
	contactsPage contactsPage;
	TestUtil testUtil;

	
	String sheetName = "details";
	   
	public contactsTest(){
			super();
			
	}
	
	@BeforeTest
	public void setUp() {	
		executeDriver();
		testUtil = new TestUtil();
		contactsPage = new contactsPage();
		loginPage = new loginPage();
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.navigateToContacts();
	}
	
	@DataProvider
	public Object[][] getcontactTestdata(){
		Object mydata[][] = TestUtil.getData(sheetName);
		return mydata;
	}
	
	@Test(dataProvider="getCRMTestData")
	public void createnewcontact(String title, String firstName, String lastName, String company){
		contactsPage.createcontact(title, firstName, lastName, company);
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
}
