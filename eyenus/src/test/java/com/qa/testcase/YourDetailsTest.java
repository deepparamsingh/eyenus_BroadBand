package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.AddOnsPage;
import com.qa.pages.AddressDetails;
import com.qa.pages.BasicInfoPage;
import com.qa.pages.HomePage;
import com.qa.pages.PopUpPage;
import com.qa.pages.YourDetails;

public class YourDetailsTest extends Testbase {
	
	HomePage homepage;
	BasicInfoPage basicInfoPage;
	PopUpPage popupPage;
	AddOnsPage addOnPage;
	YourDetails yourDetails;
	AddressDetails addressDetails;

	public YourDetailsTest()
	{
		super();
	}
	
	@BeforeMethod
	   public void setup() throws Throwable
	   {
		   initialization();
		   homepage= new HomePage();
		   basicInfoPage= new BasicInfoPage();
		   popupPage = new PopUpPage();
		   addressDetails= new AddressDetails();
		   yourDetails=new YourDetails();
		   basicInfoPage=homepage.clickBroadbandButton();
		   popupPage=basicInfoPage.validateNextButton();
		   popupPage=popupPage.validateCredentials();
		   addOnPage=popupPage.validateApplyButton();
		   yourDetails=addOnPage.validatesubmitAddons();
		 
	   }
	
	
	@Test(priority=1)
	public void validateYourDetailsTest() throws Throwable
	{
		
		yourDetails.validateYourDetails();
		yourDetails.connectionDetails();
		yourDetails.validateidentificationDetails();
	  
	}
	
	@Test(enabled=false)
	public void validateConnectionDetailsTest() throws Throwable
	{
		yourDetails.validateYourDetails();
		
	  
	}
//		
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
	

}
