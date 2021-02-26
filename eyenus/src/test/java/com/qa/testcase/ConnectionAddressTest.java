package com.qa.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.AddOnsPage;
import com.qa.pages.AddressDetails;
import com.qa.pages.BasicInfoPage;
import com.qa.pages.ConnectionAddress;
import com.qa.pages.HomePage;
import com.qa.pages.OtpPage;
import com.qa.pages.PopUpPage;
import com.qa.pages.YourDetails;

public class ConnectionAddressTest extends Testbase {
	
	HomePage homepage;
	BasicInfoPage basicInfoPage;
	PopUpPage popupPage;
	AddOnsPage addOnPage;
	YourDetails yourDetails;
	AddressDetails addressDetails;
	ConnectionAddress connectionAddress;
	OtpPage otpPage;

	public ConnectionAddressTest()
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
		   connectionAddress= new ConnectionAddress();
		   otpPage= new OtpPage();
		   basicInfoPage=homepage.clickBroadbandButton();
		   popupPage=basicInfoPage.validateNextButton();
		   popupPage=popupPage.validateCredentials();
		   addOnPage=popupPage.validateApplyButton();
		   yourDetails=addOnPage.validatesubmitAddons();
		   connectionAddress=yourDetails.validateConnectionAddressBTN();
		   
		   
		 
	   }
	
	
	@Test(priority=1)
	public void validateConnectionAddressTest() throws Throwable
	{
		
	otpPage=connectionAddress.validateStatusTest();
	  
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
	

}
