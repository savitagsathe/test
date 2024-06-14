package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcatorsConceptt {
	public static void main(String args[]) {
		
		BrowserUtil br=new BrowserUtil();
		
		WebDriver driver=br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		boolean flag=driver.findElement(By.id("input-email")).isDisplayed();
		System.out.println(flag);
		
		boolean flag1=driver.findElement(By.name("search")).isEnabled();
		System.out.println(flag1);
	}
	

}
