package sel17implicitandExplicitWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitNonWebElement {
//I want wait until the "My store title" appear on the page.
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		
		
		/*Can we handle javascript alerts,title and url with alert ?
		  =>not applicable
		  
		  Q.Do we really prefer using implicitly wait?
		  =>no we will not prefer,even selenium guys are also very soon going to deprecate it and we will have only explicitly wait
		  
		  
		  */
	}

}
