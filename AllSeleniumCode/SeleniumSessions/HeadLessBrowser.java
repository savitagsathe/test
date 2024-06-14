package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {
	public static void main(String args[])
	{ 
		//headless-browser option-->It will not launch the browser but block the visibility(display)
		//GhostDriver+Phantom-->headless-->interact page source of the application
		//HtmlUnitDriver-->headless-->interact page source of the application
		
		//Advantages:
		//Testing is happening behind the scene
		//faster than UI mode
		//headless is not reccommended for complex application
		//recommended for sanity testcases(15 - 20 testcase)
		//headless-non UI mode
		
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(co);
		driver.get("http://dev.dcx10.com/portfolio");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//driver.quit();
		
		
		
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions fo=new FirefoxOptions();
//		fo.addArguments("--incognito");
//		//fo.addArguments("--headless");
//		//compulsary to pass fo here otherwise it will  launch the browser
//		//WebDriver driver=new FirefoxDriver(fo);
//		
//		driver.get("https://nsyteful.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		//driver.quit();
	
	
	}

}
