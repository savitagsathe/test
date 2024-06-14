package sel15_xpath_WebtableScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StringLocator {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//By email=By.id("input-email");
		//i dot want to use By locatorwant to use String locator strategy
		String email="input-email";
		By emailId=getBy("id",email);
		
}
	public static By getBy(String locatorType, String locatorValue) {
	System.out.println("type: "+locatorType+" and" +"value: "+locatorValue);
	By locator=null;
	
	switch (locatorType) {
	case "id":
		locator=By.id(locatorValue);
		break;
	case "name":
		locator=By.name(locatorValue);
		break;

	case "xpath":
		locator=By.xpath(locatorValue);
		break;

	case "css":
		locator=By.cssSelector(locatorValue);
		break;	

	case "classname":
		locator=By.className(locatorValue);
		break;

	case "linkText":
		locator=By.linkText(locatorValue);
		break;

	case "partialLinkText":
		locator=By.partialLinkText(locatorValue);
		break;

	case "tagName":
		locator=By.tagName(locatorValue);
		break;

		
	default:
		break;
	}
	}

	public static void getElement(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
