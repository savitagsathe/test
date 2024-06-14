package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAttribute {
	static WebDriver driver;
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/register");
		
		String atrrValue=driver.findElement(By.name("first_name")).getAttribute("type");
		System.out.println(atrrValue);
		
		
		
		//getAttribute method will return string
		//getAttribute is used if you want to check any attribute like class,name,type, placeholder but for that you have to give webelement
		
//		String disableVal=driver.findElement(By.name("submitButton")).getAttribute("disabled");
//		System.out.println(disableVal);
//		if(disableVal.equals("true")) {
//			System.out.println("Element is disabled");
//		}
		By submitBtn=By.id("submitButton");
		System.out.println(checkElementDisabled(submitBtn, "Disabled"));
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetAttributeValue(By locator,String attrName) {
	return getElement(locator).getAttribute(attrName);
	}
	
	public static boolean checkElementDisabled(By locator,String attrName) {
		String atrrValue=doGetAttributeValue(locator, attrName);
		if(atrrValue.equals("true")) {
			return true;
		}
		return false;
	}
	
	

}
