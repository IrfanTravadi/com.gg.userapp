package GGModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommanFunctions  {
	
	
	public  String navigateto(WebDriver driver , String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
		return null;
	}
	
	public  String sendKeys(WebDriver driver,String strLocatorType,String strLocationvalue,String param1) throws InterruptedException
	{
		switch (strLocatorType)
		{
		case "id":
			driver.findElement(By.id(strLocationvalue)).sendKeys(param1);	
			break;
		case "xpath":
			driver.findElement(By.xpath(strLocationvalue)).sendKeys(param1);	
			break;
			
		case "name":
			driver.findElement(By.name(strLocationvalue)).sendKeys(param1);	
			break;	
			
		}
		Thread.sleep(1000);
		return null;
	}
	
	public  By click_element(WebDriver driver,String strLocatorType,String strLocationvalue)
	{
		switch (strLocatorType)
		{
		case "id":
			driver.findElement(By.id(strLocationvalue)).click();
			break;
		case "xpath":
			driver.findElement(By.xpath(strLocationvalue)).click();
			break;		
		case "linkText":
			driver.findElement(By.linkText(strLocationvalue)).click();
			break;
			
		case "name":
			driver.findElement(By.name(strLocationvalue)).click();
			break;	
			
			
		}
		return null;
	}
	
	
	public  String select(WebDriver driver,String strLocatorType,String strLocationvalue,  Integer i)
	{
	
		switch (strLocatorType)
		{
		case "id":
			
			Select a = new Select(driver.findElement(By.id(strLocationvalue)));
			a.selectByIndex( i);
			break;
			
		case "xpath":
			Select b = new Select(driver.findElement(By.xpath(strLocationvalue)));
			b.selectByIndex( i);
			break;	
			
		case "linkText":
			driver.findElement(By.linkText(strLocationvalue));
			break;
			
		case "name":
			
			Select c = new Select(driver.findElement(By.xpath(strLocationvalue)));
			c.selectByIndex( i);
			break;	
			
			
		}
		return null;
	}
	
	public  void quit_driver(WebDriver driver)
	{
		driver.quit();
	}

}
