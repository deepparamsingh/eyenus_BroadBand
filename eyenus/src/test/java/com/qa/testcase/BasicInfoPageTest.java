package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.BasicInfoPage;
import com.qa.pages.HomePage;
import com.qa.pages.PopUpPage;

public class BasicInfoPageTest extends Testbase {

	 
		HomePage homepage;
		BasicInfoPage basicInfoPage;
		PopUpPage popupPage;
		
		public  BasicInfoPageTest() {
				
			super();
			
		}
		
		@BeforeMethod
	   public void setup()
	   {
		   initialization();
		   homepage= new HomePage();
		   basicInfoPage= new BasicInfoPage();
		   popupPage = new PopUpPage();
		   basicInfoPage=homepage.clickBroadbandButton();
	   }
		
		
		@Test(enabled=false)
		public void validateAddressApiTest() throws Throwable
		{
			basicInfoPage.validateAddressAPI();
//			String basicInfoTitle=driver.getCurrentUrl();
//			System.out.println("title---->"+ basicInfoTitle);
		}
		
		@Test(priority=2)
		public void validateconnectionTypeTest() throws Throwable
		{
			basicInfoPage.validateAddressAPI();
			basicInfoPage.validateConnectionType();
			
		}
		
		@Test(enabled=false)
		public void validatemoveInTest() throws Throwable
		{
		
			basicInfoPage.validateMovecalander();
			
		}
		
		@Test(priority=4)
		public void validatenextButtonTest() throws Throwable
		{
//			basicInfoPage.validateAddressAPI();
//			basicInfoPage.validateMovecalander();
			popupPage = basicInfoPage.validateNextButton();
			
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
		
		
}
