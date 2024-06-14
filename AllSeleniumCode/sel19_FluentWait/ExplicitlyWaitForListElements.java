package sel19_FluentWait;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitForListElements {
        static WebDriver driver;
  
	public static void main(String[] args) {
        //If we want to wait for all the footer elements get loaded 
		
		WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		By footerList=By.xpath("//ul[@class='footer-nav']//a");
		
		//check all the footer elements present inside DOM
		/*WebDriverWait wait=new WebDriverWait(driver, 10);
		List<WebElement>footerElementList=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footerList));*/
		
		/*List<WebElement>footerElementList=waitForElementsPresent(footerList, 10);
		for(WebElement e:footerElementList) {
			System.out.println(e.getText());
		}*/
		printElementsTextList(footerList, 5);
		
	}
	public static List<WebElement> waitForElementsPresent(By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		
	}
	
	public static List<String> getElementsTextList(By locator,int timeOut) {
		List<WebElement>eleList=waitForElementsPresent(locator, timeOut);
		List<String> eleValList=new ArrayList<String>();
		for(WebElement e:eleList) {
			eleValList.add(e.getText());
		}
		return eleValList;
	}
	
	//u just want to print on the console
	public static void printElementsTextList(By locator,int timeOut) {
		List<WebElement>eleList=waitForElementsPresent(locator, timeOut);
		for(WebElement e:eleList) {
			System.out.println(e.getText());
		}
		
	}

}
