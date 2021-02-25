package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.BasicInfoPage;
import com.qa.pages.HomePage;

import junit.framework.Assert;

public class HomePageTest extends Testbase {

  
	HomePage homepage;
	BasicInfoPage basicInfoPage;
	public  HomePageTest() {
			
		super();
		
	}
	
	@BeforeMethod
   public void setup()
   {
	   initialization();
	   homepage= new HomePage();
   }
   
	@Test(enabled=false)
	public void homePageTitleTest()
	{
    String HomePageTitle=homepage.validateHomePageTitle();
    System.out.println("Title of Homme Page is :"+HomePageTitle);
	}
	
	@Test(enabled=false)
	public void validateBroadbandButtonTest()
	{
		boolean broad_flag=homepage.validateBroadbandButton();
		Assert.assertTrue(broad_flag);
	}
	
	@Test(enabled=false)
	public void validatePhoneNumberTest()
	{
		String phone=homepage.validatePhone();
		Assert.assertEquals(phone, "0420580919");
	}
	
	@Test(priority=1)
	public void clickBroadbandButtonTest()
	{
		basicInfoPage = homepage.clickBroadbandButton();
		String basicInfoTitle=driver.getCurrentUrl();
		System.out.println("title---->"+ basicInfoTitle);
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
     	
}
