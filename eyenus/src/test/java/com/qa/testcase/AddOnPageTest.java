package com.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pages.AddOnsPage;
import com.qa.pages.BasicInfoPage;
import com.qa.pages.HomePage;
import com.qa.pages.PopUpPage;
import com.qa.pages.YourDetails;

public class AddOnPageTest extends Testbase {
	
	HomePage homepage;
	BasicInfoPage basicInfoPage;
	PopUpPage popupPage;
	AddOnsPage addOnPage;
	YourDetails yourDetails;

	public AddOnPageTest() {
		// TODO Auto-generated constructor stub
			super();
	}
	
	@BeforeMethod
	   public void setup() throws Throwable
	   {
		   initialization();
		   homepage= new HomePage();
		   basicInfoPage= new BasicInfoPage();
		   popupPage = new PopUpPage();
		   yourDetails = new YourDetails();
		   addOnPage = new AddOnsPage();
		   basicInfoPage=homepage.clickBroadbandButton();
		   popupPage=basicInfoPage.validateNextButton();
		   popupPage=popupPage.validateCredentials();
		   addOnPage=popupPage.validateApplyButton();
		 
	   }
	
	@Test(enabled=false)
	public void validatehomeCallBoxTest() throws Throwable
	{
		addOnPage.validatehomeCallBox();
		
	}
	
	@Test(enabled=false)
	public void validateNeedModemBoxTest() throws Throwable
	{
	
		addOnPage.validateNeedModemBox();
	}
	
	@Test(enabled=false)
	public void validateOtherAddonBoxTest() throws Throwable
	{
		addOnPage.validateOtherAddonBox();
		
	}
	
	@Test(enabled=false)
	public void validateyourOrderBoxTest() throws Throwable
	{
		
		addOnPage.validateyourOrderBox();
	}
	
	
	
	@Test(enabled=false)
	public void validateHomeCallPlanSelectTest() throws Throwable
	{
		addOnPage.validateHomeCallPlanSelect();
		
	}
	@Test(enabled=false)
	public void validateNeedModemCheckBoxCheckedTest() throws Throwable
	{
		
		addOnPage.validateNeedModemCheckBoxChecked();
	}
	
	@Test(enabled=false)
	public void validateBYOCheckBoxCheckedTest() throws Throwable
	{
		
		addOnPage.validateBYOCheckBoxChecked();
	}
	
	
	@Test(enabled=false)
	public void validateOtherAddonChecksTest() throws Throwable
	{
		addOnPage.validateOtherAddonChecks();
		
	}
	@Test(priority=1)
	public void validatesubmitAddonsTest() throws Throwable
	{
		yourDetails=addOnPage.validatesubmitAddons();
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
