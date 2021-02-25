package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class BasicInfoPage extends Testbase {
	
	//Page factory
	@FindBy(xpath = "//h4[@class='d-inline']")
	WebElement basicInfo;
	

	@FindBy(xpath = "//input[@id='broadband_postcode']")
	WebElement addressAPI;
	
	@FindBy(xpath = "//li[contains(text(),'Barangaroo Alexander, 27 Barangaroo Ave, BARANGARO')]")
	WebElement particularAddress;
	
	
	//input[@id='internet_connection_type2']
//	
//	@FindBy(xpath = "//select[@id='internet_connection_type']")
//    WebElement connectionType;
	@FindBy(xpath = "//span[contains(text(),'Internet connection type')]")
	WebElement connectionType;
//	//span[@class='jcf-option jcf-hover']
	
	@FindBy(xpath = "//span[contains(text(),'ADSL')]")
	WebElement selectConnectType;
	
	@FindBy(xpath = "//label[@for='movey']")
	WebElement moveYes;
	
	@FindBy(xpath = "//label[@for='moven']")
	WebElement moveNo;
	
	@FindBy(xpath = "//td[contains(text(),'24')]")
	WebElement dateSelect;
	
	@FindBy(xpath = "//a[@id='home_page_next']")
	WebElement nextButton;
	
	
	//Intilizing The Page Objects
	public BasicInfoPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Actions
	public void validateAddressAPI() throws Throwable
	{
		addressAPI.sendKeys("Barangaroo");
		particularAddress.click();
		
		
	}
	
	public void validateConnectionType() throws Throwable
	{
		
		connectionType.click();
		selectConnectType.click();

	}
	
	public void validateMovecalander() throws Throwable
	{
		moveNo.click();
		
		
	}
	
	public PopUpPage validateNextButton() throws Throwable
	{
		validateAddressAPI();
		validateConnectionType();
		validateMovecalander();
		nextButton.click();
		return new PopUpPage();
	}

}
