package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class YourDetails extends Testbase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	//PageFactory	
	
			@FindBy(xpath = "//span[contains(text(),'Title*')]")
			WebElement title;
			@FindBy(xpath = "//span[contains(text(),'Mrs')]")
			WebElement mr;			
			@FindBy(xpath = "//input[@id='fname']")
			WebElement fname;
			@FindBy(xpath = "//input[@id='lname']")
			WebElement lname;
			@FindBy(xpath = "//input[@id='email']")
			WebElement email;
			@FindBy(xpath = "//input[@id='pnum']")
			WebElement phone;
			@FindBy(xpath = "//input[@id='altpnum']")
			WebElement alt_phone;
			@FindBy(xpath = "//input[@id='db']")
			WebElement db;			
			
			@FindBy(xpath = "//label[@for='alreadyaccountyes']")
			WebElement account_yes;
			@FindBy(xpath = "//label[@for='alreadyaccountno']")
			WebElement account_no;
			@FindBy(xpath = "//input[@id='accountno']")
			WebElement shareAccountNumber;
			@FindBy(xpath = "//label[@for='existingphoneyes']")
			WebElement existingphoneyes;
			@FindBy(xpath = "//input[@id='homeno']")
			WebElement homeNumber;
			@FindBy(xpath = "//input[@id='currentacount']")
			WebElement currentAccountNumber;
			
			
			
			@FindBy(xpath = "//label[contains(text(),'I have authority to transfer this service')]")
			WebElement authority_text;
			
			
			@FindBy(xpath = "//input[@id='drive']")
			WebElement driving_license;
			@FindBy(xpath = "//label[contains(text(),'Australian Passport')]")
			WebElement australia_passport;
			@FindBy(xpath = "//input[@id='med']")
			WebElement med_card;
			@FindBy(xpath = "//input[@id='foreign']")
			WebElement foreign_passport;
			
	
			@FindBy(xpath = "//input[@id='passport_number']")
			WebElement passport_number;
			@FindBy(xpath = "//input[@id='passport_exp']")
			WebElement passport_exp;
			
			@FindBy(xpath = "//select[@id='industry_type']")
			WebElement industry_type;
			@FindBy(xpath = "//span[contains(text(),'Building')]")
			WebElement Building;
			@FindBy(xpath = "//select[@id='occupation_type']")
			WebElement occupation_type;
			@FindBy(xpath = "//span[contains(text(),'Aged Retiree')]")
			WebElement occupation;
			@FindBy(xpath = "//select[@name='employement_status']")
			WebElement employement_status;
			@FindBy(xpath = "//span[contains(text(),'Full Time')]")
			WebElement duration;
			@FindBy(xpath = "//select[@name='employment_year']")
			WebElement employment_year;
			@FindBy(xpath = "//select[@name='employment_month']")
			WebElement employment_month;
	
			
			
			//Intilizing The Page Objects
			public YourDetails() {
				// TODO Auto-generated constructor stub
				PageFactory.initElements(driver, this);
			}
			//Actions
			
			public void validateYourDetails() throws Throwable
			{
				
				title.click();
				System.out.println("title");
				Thread.sleep(1000);
				mr.click();
				System.out.println("mr");
				lname.sendKeys("Singh");
				System.out.println("lname");
				alt_phone.sendKeys("0455555555");
				System.out.println("alt_phone");
				db.click();
				System.out.println("db");
				//db.clear();
				//db.sendKeys("02/02/1995");
			
			}
	
			public void connectionDetails() throws Throwable
			{
				 
				js.executeScript("arguments[0].scrollIntoView();", account_yes);
				account_yes.click();
				System.out.println("account_yes");
				shareAccountNumber.sendKeys("123456789147");
				System.out.println("shareAccountNumber");
				existingphoneyes.click();
				System.out.println("existingphoneyes");
				homeNumber.sendKeys("454546453454");
				System.out.println("homeNumber");
				currentAccountNumber.sendKeys("454546453454");
				System.out.println("currentAccountNumber");
				authority_text.click();
				System.out.println("authority_text");
			}
			public void validateidentificationDetails()
			{
				js.executeScript("arguments[0].scrollIntoView();", australia_passport);
				australia_passport.click();
				System.out.println("australia_passport");
				passport_number.sendKeys("123456789123");
				System.out.println("passport_number");
				passport_exp.click();
				System.out.println("passport_exp");
			}
			
			public void validateEmploymentDetails()
			{
				js.executeScript("arguments[0].scrollIntoView();", australia_passport);
				australia_passport.click();
				System.out.println("australia_passport");
				passport_number.sendKeys("123456789123");
				System.out.println("passport_number");
				passport_exp.click();
				System.out.println("passport_exp");
			}
	
	

}
