package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel11_ActionsClickSendkeys {
   static WebDriver driver;
	public static void main(String[] args) 
	{
		
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
       By name=By.id("Form_submitForm_Name_Holder");
       By email=By.id("Form_submitForm_Email");
       By privacyPolicy=By.id("Privacy Policy");
       
       Actions act=new Actions(driver);
       act.sendKeys(driver.findElement(name),"naveen").perform();
       act.sendKeys(driver.findElement(email),"naveen@gmail.com").perform();
       act.click(driver.findElement(privacyPolicy)).perform();
       //ElementNot InteractableException--Actions send keys
       
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionsSendKeys(By locator,String value) {
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();
		
	}

}
