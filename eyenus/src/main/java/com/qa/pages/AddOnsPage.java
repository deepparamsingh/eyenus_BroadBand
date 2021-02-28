package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class AddOnsPage extends Testbase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "//div[@class='sub-wrap dotted-area address-screen-adrs-area']")
	WebElement homeCall;
	
	@FindBy(xpath = "//div[@class='ques-wrap dotted-area modem-part']")
	WebElement needAmodem;
	
	@FindBy(xpath = "//div[@class='ques-wrap dotted-area addon-part']")
	WebElement otherAddon;
	
	@FindBy(xpath = "//input[@data-name='NEW HD ELITE']")
	WebElement homecallPlanSelect;
	
	@FindBy(xpath = "//label[@for='NeedModem']")
	WebElement needAmodemCheckBox;
	
	@FindBy(xpath = "//strong[contains(text(),'ADSL Modem 3')]")
	WebElement modemPlanSelect;
	
	@FindBy(xpath = "//div[@class='inner-right']")
	WebElement yourOrder;
	
	@FindBy(xpath = "//label[@for='BYOModem']")
	WebElement byoCheck;
	
	@FindBy(xpath = "//label[contains(text(),'Home Entertainment')]")
	WebElement homeEntertainment;
	
	@FindBy(xpath = "//label[contains(text(),'Game Path')]")
	WebElement gamePath;
	
	@FindBy(xpath = "//label[contains(text(),'Fetch Mini')]")
	WebElement fetchMini;	
	
	@FindBy(xpath = "//label[contains(text(),'Static IP')]")
	WebElement staticIp;
	
	@FindBy(xpath = "//label[contains(text(),'Fetch Mighty')]")
	WebElement fetchMighty;
	
	@FindBy(xpath = "//a[@class='btn main-btn addon_next']")
	WebElement submitButton;
	
	
	//Intilizing The Page Objects
			public AddOnsPage() {
				// TODO Auto-generated constructor stub
				PageFactory.initElements(driver, this);
			}
			
			//Actions
			public boolean validatehomeCallBox() throws Throwable
			{
				return homeCall.isDisplayed();
			}
			
			public boolean validateNeedModemBox()
			{
				return needAmodem.isDisplayed();
				
			}
			
			public boolean validateOtherAddonBox()
			{
				return otherAddon.isDisplayed();
			}
			
			public boolean validateyourOrderBox()
			{
				return yourOrder.isDisplayed();
			}
			
			public void validateHomeCallPlanSelect()
			{
				homecallPlanSelect.click();
			}
			
			public void validateNeedModemCheckBoxChecked()
			{
				js.executeScript("arguments[0].scrollIntoView();", needAmodemCheckBox);
				needAmodemCheckBox.click();
				modemPlanSelect.click();
			}
			public void validateBYOCheckBoxChecked()
			{
				byoCheck.click();
			}
			
			
			public void validateOtherAddonChecks()
			{
				//homeEntertainment.click();
				//gamePath.click();
				js.executeScript("arguments[0].scrollIntoView();", fetchMini);
				fetchMini.click();
				staticIp.click();
				fetchMighty.click();
			}
			
			public YourDetails validatesubmitAddons() throws Throwable
			{
				validateHomeCallPlanSelect();
				validateNeedModemCheckBoxChecked();
				validateOtherAddonChecks();
				submitButton.click();
				return new YourDetails(); 
				
			}
	
	
	
	
}
