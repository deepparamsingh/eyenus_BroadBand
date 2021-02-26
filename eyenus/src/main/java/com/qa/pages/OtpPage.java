package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class OtpPage extends Testbase {
	
	@FindBy(xpath = "//input[@id='digit-1']")
	WebElement otp1;
	@FindBy(xpath = "//input[@id='digit-2']")
	WebElement otp2;
	@FindBy(xpath = "//input[@id='digit-3']")
	WebElement otp3;
	@FindBy(xpath = "//input[@id='digit-4']")
	WebElement otp4;
	@FindBy(xpath = "//a[contains(text(),'Submit Application')]")
	WebElement SaleCreated;
	
	
	//Intilizing The Page Objects
		public OtpPage() {
			// TODO Auto-generated constructor stub
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public void  validateOtp()
		{
			otp1.sendKeys("2");
			otp2.sendKeys("6");
			otp3.sendKeys("0");
			otp4.sendKeys("8");
			
			
		}		
		public OtpPage  submitSale()
		{
			SaleCreated.click();
			return new OtpPage();
			
			
		}
		
		

}
