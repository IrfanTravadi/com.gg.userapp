package GGModules;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Recharge {
	
	
	 //static String URL = "https://recharge.globalgarner.in/";
    static WebDriver driver;
    Properties prop ;
    
    @BeforeTest
    public void setup() {
    
    	
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   	 //driver = new ChromeDriver(options);
   	//Create prefs map to store all preferences 
   	 HashMap prefs = new HashMap();

   	 //Put this into prefs map to switch off browser notification
   	 prefs.put("profile.default_content_setting_values.notifications", 2);

   	 //Create chrome options to set this prefs
   	 ChromeOptions options = new ChromeOptions();
   	 options.setExperimentalOption("prefs", prefs);

   	 //Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
   	 WebDriver driver = new ChromeDriver(options);


   	 File file = new File("E:\\IrfanSelenium\\com.gg.userapp\\Configs\\Configuration.properties");
   	  
   		FileInputStream fileInput = null;
   		try {
   			fileInput = new FileInputStream(file);
   		} catch (FileNotFoundException e) {
   			e.printStackTrace();
   		}
   		prop = new Properties();
   		
   		//load properties file
   		try {
   			prop.load(fileInput);
   		} catch (IOException e) {
   			e.printStackTrace();
   		}

   	
   	 driver.manage().window().maximize();
   	 driver.get(prop.getProperty("URL"));

    	
    }
    
    @Test
    public void doRecharge(){
	
	// open browser
	 //ChromeOptions options = new ChromeOptions();
	 //options.addArguments("--enable-notifications");
	 	 driver.findElement (By.id("username")).sendKeys(prop.getProperty("Username"));
	 driver.findElement (By.name("password")).sendKeys(prop.getProperty("Password"));
	
	 driver.findElement (By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div[4]/button ")).click();
	 
	
	 

	 
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("window.scrollBy(0,800)", "");
	 

	 
	 
	 //Mobile PostPaid
	 driver.findElement (By.xpath("//*[@id=\"bill\"]/p[1]/img")).click();
	 

	 
	 Select oSelect = new Select(driver.findElement(By.id("operator")));

	 oSelect.selectByVisibleText("IDEA Postpaid");
	 
	 driver.findElement (By.id("number")).sendKeys("9824422402");
	 driver.findElement (By.id("amount")).sendKeys("100");
	 driver.findElement (By.id("btn_recharge")).click();

	 driver.findElement (By.id("launchPayU")).click();

	 
	 driver.findElement (By.id("ccard_number")).sendKeys("5123456789012346");
	 driver.findElement (By.id("cname_on_card")).sendKeys("irfan");
	 driver.findElement (By.id("ccvv_number")).sendKeys("123");
	 
	 Select month = new Select(driver.findElement(By.xpath("//select[@id='cexpiry_date_month']")));
	 month.selectByIndex(6);
	 
	 Select year = new Select(driver.findElement(By.xpath("//select[@id='cexpiry_date_year']")));
	 year.selectByIndex(6);
	 
	 driver.findElement(By.name("pay_button")).click();

	 driver.get("https://recharge.globalgarner.in/");
	 JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	 jse1.executeScript("window.scrollBy(0,800)", "");

    }
  
    public void teardown() {
    	driver.quit();
    }
    
}
