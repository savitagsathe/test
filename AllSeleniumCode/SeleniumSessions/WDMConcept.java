package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {
	public static void main(String args[]) {
		//to run the script start the server
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://dev.dcx10.com/portfolio");
//		System.out.println(driver.getTitle());
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://dev.dcx10.com/portfolio");
		System.out.println(driver.getTitle());
	}

}
