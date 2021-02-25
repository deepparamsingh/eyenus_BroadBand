package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.TestUtil;
//import org.openqa.selenium.firefox.FirefoxDriver;    ----------- unable to get firefox driver

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public Testbase()
	{
		try {
			prop = new Properties();
			
			FileInputStream ip= new FileInputStream("C:\\Users\\MY LAPPY\\eclipse-workspace\\eyenus\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
		}
		catch (FileLockInterruptionException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static void initialization()
	{
		String browserName= prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.silentOutput", "true");
			System.setProperty("webdriver.chrome.driver", "F:\\selenium\\driver\\chromeDriver.exe");
			driver= new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","F:\\selenium\\driver\\geckodriver.exe" );
			//driver= new FirefoxDriver();    ---- unable to get firefox webdriver
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		
	}
	
	

}
 