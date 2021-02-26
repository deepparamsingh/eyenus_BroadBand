package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class ConnectionAddress extends Testbase {
	
	
	@FindBy(xpath = "//span[contains(text(),'Status')]")
	WebElement Status;
	@FindBy(xpath = "//span[contains(text(),'Owner Fully Paid')]")
	WebElement ownerFullyPaid;
	@FindBy(xpath = "//label[contains(text(),'Asap')]")
	WebElement Asap;
	@FindBy(xpath = "//label[@for='billing_email']")
	WebElement billing_email;
	@FindBy(xpath = "//label[@for='cuurent_delivery_addr']")
	WebElement curentDeliveryAddress;
	@FindBy(xpath = "//a[@class='btn main-btn connection_next']")
	WebElement connectionNextBtn;
	
	//Intilizing The Page Objects
	public ConnectionAddress() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Actions

	public OtpPage validateStatusTest()
	{
		Status.click();
		ownerFullyPaid.click();
		Asap.click();
		billing_email.click();
		curentDeliveryAddress.click();
		connectionNextBtn.click();
		return new OtpPage();
		
	}
	       
	
	
}
