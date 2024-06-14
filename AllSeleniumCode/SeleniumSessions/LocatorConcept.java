package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		
		//Approach2 : when you want design the proper framework and library use this approach
		By fn=By.name("firstname");//it was giving "no such element exception" bcoz url was till the login but this is on the register page.Changed url till register to work it
		By ln=By.id("input-lastname");
		
		//driver.findElement(fn).sendKeys("Savita");
		//use utility approach
		ElementUtil elementUtil=new ElementUtil(driver);
		elementUtil.doSendKeys(fn, "tom");
		elementUtil.doSendKeys(ln, "peter");
		
		//driver.findElement(By.name("firstname")).sendKeys("naveen");//Approach1: when you want to check the quick things use this approach 
		
		//	WebElement emailId=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
	
//		emailId.sendKeys("naveenanimation20@gmail.com");
//		password.sendKeys("Selenium12345");
	
		//3.By locator:
//	 By emailId=By.id("input-email");
//	 By password=By.id("input-password");

//	 driver.findElement(emailId).sendKeys("naveenanimation20@gmail.com");
//	 driver.findElement(password).sendKeys("Selenium12345");
	 
		//4.By locator:
	 
//	 By emailId=By.id("input-email");
//	 By password=By.id("input-password");
	 
//	 WebElement eid=driver.findElement(emailId);
//	 WebElement pwd=driver.findElement(password);
      
//	 eid.sendKeys("naveenanimation20@gmail.com");
//	 pwd.sendKeys("Selenium12345");
	 
	 
	 //5.Generic functions: getElement
//	 By emailId=By.id("input-email");
//	 By password=By.id("input-password");
	 
//	 getElement(emailId).sendKeys("naveenanimation20@gmail.com");
//	 getElement(password).sendKeys("naveen@123");

		//6.Generic functions: getElement() + senddKeys()
		
//		By emailId=By.id("input-email");
//		By password=By.id("input-password");
	
//		doSendKeys(emailId, "naveenanimation20@gmail.com");
//		doSendKeys(password, "naveen@123");
		 

	}

	
//	public static WebElement getElement(By locator) {
//	return driver.findElement(locator);
//}
//
//	
//	public static void doSendKeys(By locator,String value) {
//		getElement(locator).sendKeys(value);
//	}
}
