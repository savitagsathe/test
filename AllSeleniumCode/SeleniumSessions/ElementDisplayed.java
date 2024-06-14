package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		boolean flag=driver.findElement(By.id("input-email")).isDisplayed();
		System.out.println(flag);
        
		driver.findElement(By.name("search")).isEnabled();
		
	}

}
