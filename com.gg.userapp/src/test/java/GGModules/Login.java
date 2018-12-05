package GGModules;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.By;

public class Login extends Base {

	@BeforeTest
	public void beforeLogin() {
	    
		driver.get("https://accounts.globalgarner.com");
		
		driver.findElement (By.id("username")).sendKeys("itravadi@gmail.com");
		driver.findElement (By.name("password")).sendKeys("global916");		 
		driver.findElement (By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div[4]/button")).click(); 		 
		 
	  
  }



}











