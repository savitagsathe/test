package sel19_FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
				
		driver.get("https://www.freshworks.com/");
		By customers=By.linkText("Customers11");
		
		waitForElementPresenceWithFluentWait(customers, 10, 2000).click();
		
		/*Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.withMessage("Element is not found........")
				.pollingEvery(Duration.ofMillis(2000))
				.ignoring(StaleElementReferenceException.class);
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(customers)).click();*/
				
	}
	//utility
	public static WebElement waitForElementPresenceWithFluentWait(By locator,int timeOut,int pollingTime) {
		
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				//.withMessage("Element is not found........")//I dont want to write this message as hardcode .So creae error class
				.withMessage(Error.TIME_OUT_WEB_ELEMENT_MSG)//custom message
				.pollingEvery(Duration.ofMillis(pollingTime))
				.ignoring(StaleElementReferenceException.class,NoSuchElementException.class);//add one more exception comma seprated
		
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}

	/*Difference between fluentWait and WebDriverWait
	 
	 
	 
	 */
}
