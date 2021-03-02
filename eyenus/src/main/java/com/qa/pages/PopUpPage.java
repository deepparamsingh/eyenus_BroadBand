package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class PopUpPage extends Testbase {
	
	//PageFactory
	
		@FindBy(xpath = "//input[@id='customer_name']")
		WebElement cust_name;
		

		@FindBy(xpath = "//input[@id='customer_email']")
		WebElement cust_email;
		
		
		@FindBy(xpath = "//input[@id='customer_mob']")
		WebElement cust_phone;
		
		@FindBy(xpath = "//a[contains(text(),'View my plans')]")
		WebElement submitButton;
		
		@FindBy(xpath = "//p[contains(text(),'You are just one step away to view the best availa')]")
		WebElement smallContentpopup;
		
		@FindBy(xpath = "//h4[contains(text(),'Just One Step Away...')]")
		WebElement h4textpopup;
		
		@FindBy(xpath = "//a[@id='462']")
		WebElement applyButton;
	
		
		@FindBy(xpath = "//div[@class='section sec-one no-border']//p//strong[contains(text(),'Richard NBN Plan double')]")
		WebElement planName;
		
		@FindBy(xpath = "//strike[contains(text(),'$108')]")
		WebElement strikeCost;
		
		@FindBy(xpath = "//span[contains(text(),'$99.99')]")
		WebElement specialCost;
		
		@FindBy(xpath = "//ol[@class='spcial-offer-list']")
		WebElement specialTab;
		
		
		
		
		//Intilizing The Page Objects
		public PopUpPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public boolean validatesmallContentPopup() throws Throwable
		{
			return smallContentpopup.isDisplayed();
		}
		public boolean validateh4contentPopup() throws Throwable
		{
			return h4textpopup.isDisplayed();
		}
		public PopUpPage validateCredentials() throws Throwable
		{
			cust_name.sendKeys(prop.getProperty("username"));
			cust_email.sendKeys(prop.getProperty("email"));
			cust_phone.sendKeys(prop.getProperty("phone"));
		    submitButton.click();
		    return new PopUpPage();
			
		}
		public PopUpPage validatePlanName() throws Throwable
		{
			planName.isDisplayed();
			return new PopUpPage();
		}
		public PopUpPage validateStrikeCost() throws Throwable
		{
			strikeCost.isDisplayed();
			return new PopUpPage();
		}
		public PopUpPage validateOfferCost() throws Throwable
		{
			specialCost.isDisplayed();
			return new PopUpPage();
		}
		public PopUpPage validateSpecialTab() throws Throwable
		{
			specialTab.isDisplayed();
			return new PopUpPage();
		}
		public AddOnsPage validateApplyButton() throws Throwable
		{
			Thread.sleep(1000);
			applyButton.isDisplayed();
			applyButton.click();
			return new AddOnsPage();
			
		}


}
