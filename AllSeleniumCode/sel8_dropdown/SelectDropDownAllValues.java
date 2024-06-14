package sel8_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownAllValues {
	static WebDriver driver;
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//WebElement country=driver.findElement(By.id("Form_getForm_Country"));
		//Select select=new Select(country);
		//I want to print all the values available in the country drop down and print all the values on console
		//List<WebElement> optionList=select.getOptions();//return type of getOptions is List<WebElement> bcoz these option is a webElement not the string
		//System.out.println("Total options: "+optionList.size());
		
		//typical for loop
		/*for(int i=0;i<optionList.size();i++) {
			String text=optionList.get(i).getText();
			System.out.println(text);//It will give select country also bcoz its actual text written in "option" as a drop down content.Its not placeholder
		}*/
		
		//for each loop
		//Q.I want to select particular value from the drop down without using select class selectBy Value how will I do this?
		//=>By using following code
		

		/*
		 * for(WebElement e:optionList) { String text=e.getText();
		 * System.out.println(text); if(text.equals("India")) { e.click(); break; } }
		 */
		
		
		//Utility call
		By country=By.id("Form_getForm_Country");
		doSelectDropDown(country, "India");
		
	
	}

	
	//utility
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropDown(By locator,String value) {
		Select select=new Select(getElement(locator));
		List<WebElement> optionList=select.getOptions();
		System.out.println("Total options: "+optionList.size());
		
		for(WebElement e:optionList) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals("India")) {
				e.click();
				break;
			}
		}
		
		
		
	}
}
/*Important interview questions

Q.Which one is faster for each or above 3 methods select class?
=>obviuosly selectByindex/selectByvalue is fatser than this bcoz this will keep iterating.This is just a hack means whenever these 3 are not available we can use this
.This will keep iterating till the expected value is not match.Once it is match then only it will click and print. So performancewise this is the slow than that 3 methods

*/