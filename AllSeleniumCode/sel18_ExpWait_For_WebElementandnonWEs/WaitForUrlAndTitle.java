package sel18_ExpWait_For_WebElementandnonWEs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrlAndTitle {
	static WebDriver driver;
	public static void main(String[] args) {
    
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		//driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		//driver.findElement(By.linkText("Register")).click();
		
		
		
		
		/*WebDriverWait wait=new WebDriverWait(driver,5);
		
		if(wait.until(ExpectedConditions.urlContains("route=account/register&language=en-gb"))) {
			System.out.println(driver.getCurrentUrl());
		}
		
		if(wait.until(ExpectedConditions.urlToBe("https://demo.opencart.com/index.php?route=account/register&language=en-gb"))) {
			System.out.println(driver.getCurrentUrl());
		}*/
		
		//if(waitForUrlContains("route=account/register",5)) {
		//	System.out.println("Registered url is correct");
		//}
		 
		 
		 //DCX-title wait
		 
		 driver.get("https://platform.easycrypto.co.za/");
		 /*WebDriverWait wait=new WebDriverWait(driver,5);
		 if(wait.until(ExpectedConditions.titleContains("Login | EasyID"))) {
			 System.out.println(driver.getTitle());
		 }
		 */
		 //call utility
		 String title=waitForTitleContains("Login", 5);
		System.out.println(title);
		
		driver.findElement(By.linkText("Get started")).click();
		
		  title=waitForTitleContains("Choose your login", 5);
		  System.out.println(title);

	}
	
	public static Boolean waitForUrlContains(String urlFraction, int timeOut) {
    WebDriverWait wait=new WebDriverWait(driver,timeOut);		
	return wait.until(ExpectedConditions.urlContains(urlFraction));					
	}
	
	public static Boolean waitForUrlToBe(String urlValue, int timeOut) {
	    WebDriverWait wait=new WebDriverWait(driver,timeOut);		
		return wait.until(ExpectedConditions.urlToBe(urlValue));					
		}
	
	//Title Utility
	public static String waitForTitleContains(String titleFraction,int timeOut) 
	{
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		 if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			 return driver.getTitle();
		 }
		return null;
		
	}
	
	public static String waitForTitleToBe(String titleFraction,int timeOut) 
	{
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		 if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			 return driver.getTitle();
		 }
		return null;
		
	}



}
