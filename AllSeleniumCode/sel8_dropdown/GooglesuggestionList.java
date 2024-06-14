package sel8_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglesuggestionList {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("naveen automation labs");
	    Thread.sleep(2000);
	    
		/*
		 * List<WebElement> suggList=driver.findElements(By.xpath(
		 * "//ul[@role='listbox']//dic[@class='wM6w7d']//span"));
		 * System.out.println(suggList.size()); for(WebElement e:suggList) { String
		 * text=e.getText(); System.out.println(text);
		 * if(text.equals("naveen automationlabs youtube")) { e.click(); break; } }
		 */
	    By search=By.name("q");
	    By suggetionList=By.xpath("//ul[@role='listbox']//div[@class='wM6w7d']//span");
		googleSearchSelect(search, suggetionList, "selenium Webdriver", "selenium Webdriver download");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static void googleSearchSelect(By search, By suggestion,String searchKey, String value) throws InterruptedException {
		
		getElement(search).sendKeys(searchKey);
	    Thread.sleep(2000);
	    
	    List<WebElement> suggList=getElements(suggestion);
	    System.out.println(suggList.size());
	    
	    for(WebElement e:suggList) {
	    	String text=e.getText();
	    	System.out.println(text);
	    	if(text.equals("naveen automationlabs youtube")) {
	    		e.click();
	    		break;
	    	}
	    }
		
    	
    }

}

