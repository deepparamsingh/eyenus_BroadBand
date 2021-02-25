package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class HomePage extends Testbase {

	//PageFactory
	@FindBy(xpath = "//label[@for='broadband']")
	WebElement broadband;
	

	@FindBy(xpath = "//label[@for='mobile']")
	WebElement mobile;
	
	
	@FindBy(xpath = "//label[@for='el']")
	WebElement electricity;
	
	@FindBy(xpath = "//span[contains(text(),'0420580919')]")
	WebElement phone;
	
	@FindBy(xpath = "//p[contains(text(),'Find a new plan in just a few clicks.')]")
	WebElement below_h4_text;
	
	@FindBy(xpath = "//h4[contains(text(),'Compare, Switch, Save')]")
	WebElement h4text;
	
	@FindBy(xpath = "//img[@src='https://mobile-compare.cimet.io/broadband_compare/wp-content/plugins/BroadbandComparison/assets/images/logo.png']")
	WebElement econnex_logo;
	
	@FindBy(xpath = "//button[contains(text(),'Compare Plans')]")
	WebElement compare_plan_utton;
	
	
	
	//Intilizing The Page Objects
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateImg()
	{
		return econnex_logo.isDisplayed();
	}
	
	public boolean validateBroadbandButton()
	{
		return broadband.isDisplayed();
	}
	public BasicInfoPage clickBroadbandButton()
	{
		broadband.click();
		return new BasicInfoPage();
		
	}
	
	public boolean validateMobileButton()
	{
		return mobile.isDisplayed();
	}
	public boolean validateCompareButton()
	{
		return compare_plan_utton.isDisplayed();
	}
	
	public boolean validateElecButton()
	{
		return electricity.isDisplayed();
	}
	public String validatePhone()
	{
		return phone.getText();
	}
	
	public String validateH4text()
	{
		return h4text.getText();
	}
	public String validateBelowH4text()
	{
		return below_h4_text.getText();
	}
	
	
	
	
	



}
