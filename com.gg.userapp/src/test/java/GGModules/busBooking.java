package GGModules;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class busBooking extends Login {
	
@Test 
  public void BUS() throws InterruptedException {
	  
	    
	     
	     Logger log = Logger.getLogger(busBooking.class.getName());
	     driver.get("https://bus.globalgarner.com/");	
	     log.info("Redirected to Bus URL");
	     click_element(driver, "id", "select2-from_city-container");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	     log.info("Clicked on From City Container"); 
		 sendKeys(driver,"xpath", "//input[@type='search']", "Ahmedabad" );
		 WebDriverWait wait=new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select2-from_city-results\"]/li[2]")));
		 log.info("Searched City Name from From City Container");	
		 click_element(driver, "xpath", "//*[@id=\"select2-from_city-results\"]/li[2]");
	     WebDriverWait wait1=new WebDriverWait(driver,5);
		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
	     log.info("Selected City from Search Results");
		 sendKeys(driver, "xpath", "/html/body/span/span/span[1]/input", "kodinar" );
		 WebDriverWait wait2=new WebDriverWait(driver,5);
		 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select2-to_city-results\"]/li")));
		 log.info("Searched Name from To city Container");
		 click_element(driver, "xpath", "//*[@id=\"select2-to_city-results\"]/li");
	     WebDriverWait wait3=new WebDriverWait(driver,5);
		 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("onward_date")));
	     log.info("Selected To city from Searched Results");
		 click_element(driver, "id", "onward_date");
	     WebDriverWait wait4=new WebDriverWait(driver,5);
		 wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[1]/div[2]/table/tbody/tr[5]/td[6]/div")));
	     log.info("Clicked On Onward Date Filed for Journery");
	     WebDriverWait wait5=new WebDriverWait(driver,5);
		 wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[1]/div[2]/table/tbody/tr[5]/td[6]/div")));
		 click_element(driver, "xpath", "/html/body/div[5]/div[1]/div[2]/table/tbody/tr[5]/td[6]/div");
	     WebDriverWait wait6=new WebDriverWait(driver,5);
		 wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ticket_search_form\"]/div/div[4]/div/input")));
	     log.info("Selected Date From Calender");	 
		 click_element(driver, "xpath", "//*[@id=\"ticket_search_form\"]/div/div[4]/div/input");
		 WebDriverWait wait7 = new WebDriverWait(driver,5);
		 wait7.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("vew_seat_btn1001161829182095383"))));
		 click_element(driver, "id", "vew_seat_btn1001161828902304428");
		 WebDriverWait wait8 = new WebDriverWait(driver,5);
		 wait8.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("upperTab"))));
		 log.info("Clicked On View Seats");
		 click_element(driver, "id", "upperTab");
		 WebDriverWait wait9=new WebDriverWait(driver,5);
		 wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"1104\"]")));
		 log.info("Clicked On Upper Tab");		 
		 click_element(driver, "xpath", "//*[@id=\"1104\"]");
		 WebDriverWait wait10=new WebDriverWait(driver,5);
		 wait10.until(ExpectedConditions.visibilityOfElementLocated(By.id("step2")));
		 log.info("Selected Seat for Booking");		 
		 click_element(driver, "id", "step2");
		 WebDriverWait wait11=new WebDriverWait(driver,5);
		 wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='bpdp_list']//li[6]//label[1]//span[1]")));
		 log.info("Go to Pickup Point Selection");
		 click_element(driver, "xpath", "//ul[@class='bpdp_list']//li[6]//label[1]//span[1]"); 
		 WebDriverWait wait12=new WebDriverWait(driver,10);
		 wait12.until(ExpectedConditions.visibilityOfElementLocated(By.id("step3")));
		 log.info("Selected Boarding Point");
		 click_element(driver, "id", "step3");
		 WebDriverWait wait13=new WebDriverWait(driver,10);
		 wait13.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='droping_point']//span")));
		 log.info("Go to Dropping Point Selection");
		 click_element(driver, "xpath", "//div[@id='droping_point']//span");
		 WebDriverWait wait14=new WebDriverWait(driver,10);
		 wait14.until(ExpectedConditions.visibilityOfElementLocated(By.id("Finish")));
		 log.info("Selected Dropping Point"); 
		 click_element(driver, "id", "Finish");
		 WebDriverWait wait15=new WebDriverWait(driver,10);
		 wait15.until(ExpectedConditions.visibilityOfElementLocated(By.id("idType")));
		 log.info("Go to Final Step");
		 select(driver,"id","idType", 2);
		 log.info("Selected ID Type as PAN Card");
		 sendKeys(driver,"id", "id", "AAAPL1234C" );
		 WebDriverWait wait16=new WebDriverWait(driver,10);
		 wait16.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"checkout_form\"]/div[2]/div/div/div/input")));
		 log.info("Entered PAN Card Number");
		 click_element(driver, "xpath", "//*[@id=\"checkout_form\"]/div[2]/div/div/div/input"); 
		 WebDriverWait wait17=new WebDriverWait(driver,10);
		 wait17.until(ExpectedConditions.visibilityOfElementLocated(By.id("pay_now")));
		 log.info("Clicked On Proceed To Pay");
		 click_element(driver, "id", "pay_now");
		 log.info("Clicked On pay now");
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
		 driver.get("https://bus.globalgarner.com/");
		 log.info("Redirected to Recharge Screen");

	  
  }
 
@AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
