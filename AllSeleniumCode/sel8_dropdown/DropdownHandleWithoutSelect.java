package sel8_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Without using select class we have to select the particular value from drop down
public class DropdownHandleWithoutSelect {
	static WebDriver driver;
	
	public static void main(String args[]) {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		/*
		 * //List<WebElement> country=driver.findElements(By.xpath(
		 * "//select[@id='Form_getForm_Country']/option")); for(WebElement e:country) {
		 * String text=e.getText(); if(text.equals("India")) { e.click(); break; } }
		 */
	
	//utility call
	By country=By.xpath("//select[@id='Form_getForm_Country']/option");	
	selectDropDownWithoutSelect(country,"India");
}
	
	//utility
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
		
	}
	public static void selectDropDownWithoutSelect(By locator,String value) {
		List<WebElement> country = getElements(locator);
		for(WebElement e:country) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}
}
