package sel17implicitandExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
static WebDriver driver;
	public static void main(String[] args) {
		//WebDriverWait is a inbuil class in slenium We dont have any explicitly wait method/class in selenium like implicitly wait.
		/*Explicitly wait:
		 Is a cusotom wait.Can be applied for a specific element on the basis of some condition-u decide on which element u want
		 condition: isVisible,isPresent,isClickable
		 Its not a global wait
		 can be used for non web elements:alerts,url,titles
		 
		 
		 WebDriverWait
		
		
		
		*/
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoauto.xyz/signin");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("admin02@mailinator.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[@title='Add Lead']")).click();
		
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, 10); WebElement
		 * compName=wait.until(ExpectedConditions.presenceOfElementLocated(By.id(
		 * "company_name"))); compName.sendKeys("IBM"); //here out of 6 we applied for
		 * only one element which is necessary //If i want to apply for nother element
		 * as well WebElement
		 * vatNun=wait.until(ExpectedConditions.presenceOfElementLocated(By.id(
		 * "vat_number"))); compName.sendKeys("123456");
		 * 
		 * //if we want to apply for 10 or 50 elements so we cant write same line again
		 * and again.So create a generic function
		 */
		By comp=By.id("company_name");
		By vatNum=By.id("vat_number");
		//here we are not hitting any server By is just a variable.Whenever we write driver.findelement in that case we are hitting server
		
		waitForElementPresent(comp, 10,2000).sendKeys("IBM");	
		waitForElementPresent(vatNum, 10).sendKeys("12345");

		/*if i change company id it will throw the exception after 10sec and and will not execute vat number this is the property fo exception.
		//It will give the exception (no such element) along witha that it will give "tried for 10sec" with 500 miliseconds interval=>taht is pollling time
		//after executing the script selenium will check elemnt is present or not for .5sec and after .5 sec it will send the request to the server. Here 20 times
		it will send the request 
		
		Q.What is the default interval/polling time in selenium 
		=>500mlsecond/.5sec
		Q.can we customize the polling time?
		=>yes we can i want 2sec instead of .5sec
		*/
		
		
		}
	
	public static WebElement waitForElementPresent(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	//overirde same method
	public static WebElement waitForElementPresent(By locator,int timeout,int intervalTime) {
		WebDriverWait wait=new WebDriverWait(driver, timeout,intervalTime);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	//implicitly wait having same pooling time 0.5ms but we cant override in that

}
