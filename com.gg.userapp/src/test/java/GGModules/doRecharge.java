package GGModules;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.velocity.runtime.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;


public class doRecharge extends Login{

	

@Test 
  public void MobileRecharge() throws IOException, Exception {	
	
	 Logger log = Logger.getLogger(doRecharge.class.getName());
     driver.get("https://recharge.globalgarner.com");
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("window.scrollBy(0,800)", ""); 
	 click_element(driver, "xpath", "//*[@id=\"bill\"]/p[1]/img");
	 log.info("Clicked on Mobile Postpaid");
     sendKeys(driver,"id", "operator", "IDEA Postpaid" );
     log.info("Selected IDEA Postpaid");
     sendKeys(driver,"id", "number", "9824422402" );
     log.info("Entered Mobile Number");
     sendKeys(driver,"id", "amount", "100" );
     log.info("Entered Amount for Recharge");
     click_element(driver, "name", "recharge");
     log.info("Clicked on Recharge Button");
     click_element(driver, "id", "launchPayU");
     log.info("PayU is Launched for Payment");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     sendKeys(driver,"id", "ccard_number", "5123456789012346" );
     log.info("Entered Card Number for payment");
     sendKeys(driver,"id", "cname_on_card", "Irfan" );
     log.info("Entered Card Holder's Name");
     sendKeys(driver,"id", "ccvv_number", "123" );
     log.info("Entered CVV Number");
	 select(driver,"xpath","//select[@id='cexpiry_date_month']", 6);
	 log.info("Selected Card Expiry Month");
	 select(driver,"xpath","//select[@id='cexpiry_date_year']", 6);
	 log.info("Selected Expiry Year");
     click_element(driver, "id", "pay_button");
     log.info("Click on Pay Button for Payment");
     log.info("Payment is successfully done");
     driver.get("https://recharge.globalgarner.com");
     log.info("Redirected to Recharge Screen");
	 
  }

@AfterTest
public void afterTest() {
	  
	  
	  driver.quit();
}

}
