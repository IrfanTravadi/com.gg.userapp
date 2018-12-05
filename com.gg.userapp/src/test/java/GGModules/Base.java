package GGModules;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Base extends CommanFunctions {
	
	WebDriver driver;
	Properties prop ;
	
@BeforeTest()
  public void Test() {
	  
	  DOMConfigurator.configure("log4j.xml");
      
      
      
		
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  HashMap prefs = new HashMap();
	  prefs.put("profile.default_content_setting_values.notifications", 2);
	  ChromeOptions options = new ChromeOptions();
	  options.setExperimentalOption("prefs", prefs);
	  driver = new ChromeDriver(options);
	   	
	    File file = new File(System.getProperty("user.dir")+"\\Configs\\Configuration.properties");
	 	  
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

		
  }

 

}
