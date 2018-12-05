package GGModules;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Flight extends Login {
	
	
@Test (priority =2)
  public void bookflight() throws InterruptedException {
	 
	     Logger log = Logger.getLogger(Flight.class.getName());
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.get("https://flight.globalgarner.com/");
	     log.info("Go to Flight URL");
		 WebElement flightFrom = driver.findElement(By.xpath("//span[@id='react-select-2--value']//div[@class='Select-placeholder'][contains(text(),'Select Airport')]")); 
	     Actions actions = new Actions(driver);
	     actions.moveToElement(flightFrom);
	     actions.click();
	     log.info("Clicked on From City");
	     actions.sendKeys(prop.getProperty("From"));
	     log.info("Get From City Name");
	     actions.build().perform(); 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	     WebElement flightFromSelect = driver.findElement(By.cssSelector(".Select-option"));
	     flightFromSelect.click();
	     log.info("Selected From City");
	     WebElement flightTo = driver.findElement(By.xpath("//span[@id='react-select-3--value']//div[@class='Select-placeholder'][contains(text(),'Select Airport')]")); 
	     Actions actions1 = new Actions(driver);
	     actions.moveToElement(flightTo);
	     actions.click();
	     log.info("Clicked on To City");
	     actions.sendKeys(prop.getProperty("To"));
	     log.info("Get To City Name");
	     actions.build().perform(); 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	     WebElement flightToSelect = driver.findElement(By.cssSelector(".Select-option"));
	     flightToSelect.click();
	     log.info("Selected To City");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	     WebDriverWait wait=new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"collapseExample\"]/div/div/div/div[2]/div[1]/div[3]/div/div/div/div/button")));
	     click_element(driver, "xpath", "//*[@id=\"collapseExample\"]/div/div/div/div[2]/div[1]/div[3]/div/div/div/div/button");
	     WebDriverWait wait1=new WebDriverWait(driver,5);
		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='react-datepicker__today-button']")));
	     log.info("Clicked on JourneyDate");
	     click_element(driver, "xpath", "//div[@class='react-datepicker__today-button']");
	     WebDriverWait wait2=new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"collapseExample\"]/div/div/div/div[2]/div[2]/div/button")));
	     log.info("Clicked on DatePicker");
	     click_element(driver, "xpath", "//*[@id=\"collapseExample\"]/div/div/div/div[2]/div[2]/div/button");
	     log.info("Selected Today's Date");
	     JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		 jse1.executeScript("window.scrollBy(0,600)", "");
		 WebDriverWait wait3=new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div")));
	     click_element(driver, "xpath", "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div");
	     WebDriverWait wait4=new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div/div/div/div[2]/div[2]/div/button")));
	     log.info("Selected Flight From Result");
	     click_element(driver, "xpath", "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div/div/div/div[2]/div[2]/div/button");
	     WebDriverWait wait5=new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div[6]/div[1]/div/button")));
	     log.info("Clicked On Book Now ");
	     JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		 jse2.executeScript("window.scrollBy(0,1000)", "");
		 WebDriverWait wait6=new WebDriverWait(driver,5);
		 WebElement element6=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div[6]/div[1]/div/button")));
	     click_element(driver, "xpath", "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div[6]/div[1]/div/button");
	     WebDriverWait wait7=new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
	     log.info("Clicked On Continue Booking after Reviewing Booking Details ");
	     sendKeys(driver,"name", "firstname", "Irfan" );
	     log.info("Entered First Name ");
	     sendKeys(driver,"name", "lastname", "Travadi" );
	     log.info("Entered Last Name ");
	     click_element(driver, "xpath", "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/button");
	     log.info("Clicked On Booking ");
	     JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		 jse3.executeScript("window.scrollBy(0,500)", "");
		 WebDriverWait wait8=new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div/div[2]/div[8]/div[1]/div/button")));
	     click_element(driver, "xpath", "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div/div[2]/div[8]/div[1]/div/button");
	     log.info("Clicked on Pay Now ");
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
		 driver.get("https://flight.globalgarner.com/");
		 log.info("Redirected to Recharge Screen");
	
	  
  }
@AfterTest
  public void afterTest() {
	  
	 driver.quit();
	  
  }

}
