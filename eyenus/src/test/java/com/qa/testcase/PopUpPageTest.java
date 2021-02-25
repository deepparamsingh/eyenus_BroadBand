package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.AddOnsPage;
import com.qa.pages.BasicInfoPage;
import com.qa.pages.HomePage;
import com.qa.pages.PopUpPage;

public class PopUpPageTest extends Testbase {
	
	
	HomePage homepage;
	BasicInfoPage basicInfoPage;
	PopUpPage popupPage;
	AddOnsPage addOnPage;

	public PopUpPageTest()
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
		   basicInfoPage=homepage.clickBroadbandButton();
		   popupPage=basicInfoPage.validateNextButton();
		 
	   }
	
	@Test(enabled=false)
	public void validatesmallContentTest() throws Throwable
	{
		popupPage.validatesmallContentPopup();
		
	}
	
	@Test(enabled=false)
	public void validateh4ContentTest() throws Throwable
	{
		popupPage.validateh4contentPopup();
		
	}
	
	@Test(enabled=false)
	public void validateCredentialsTest() throws Throwable
	{
		popupPage=popupPage.validateCredentials();
		
	}
	@Test(enabled=false)
	public void validateOfferCostTest() throws Throwable
	{
		popupPage=popupPage.validateCredentials();
		popupPage=popupPage.validateOfferCost();
		
	}
	@Test(enabled=false)
	public void validatePlanNameTest() throws Throwable
	{
		popupPage=popupPage.validateCredentials();
		popupPage=popupPage.validatePlanName();
		
	}
	@Test(enabled=false)
	public void validateStrikeCostTest() throws Throwable
	{
		popupPage=popupPage.validateCredentials();
		popupPage=popupPage.validateStrikeCost();
		
	}
	@Test(enabled=false)
	public void validateSpecialTabTest() throws Throwable
	{
		popupPage=popupPage.validateCredentials();
		popupPage=popupPage.validateSpecialTab();
		
	}
	
	@Test(priority=1)
	public void validatePlanTest() throws Throwable
	{
		popupPage.validateCredentials();
		addOnPage=popupPage.validateApplyButton();
			
	}
		
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
}
