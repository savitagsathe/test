package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	static WebDriver driver;
	
	public static void main(String args[]) {
		String browser="firefox";
		if(browser.equals("chrome")) {
			//System.setProperty(	"webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\chromedriver.exe");
	         WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browser.equals("firefox")) {
				//System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\geckodriver.exe");
		  WebDriverManager.firefoxdriver().setup();
		  
			driver=new FirefoxDriver();
		}
	else if(browser.equals("safari")) {
		driver=new SafariDriver();
	}
	else {
		System.out.println("please pass the right browser....."+browser);
	}
	
		
		driver.get("http://dev.dcx10.com/portfolio");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
		
		
	/*static WebDriver driver;
	//this is static bcoz main method is also static you dont need to create object of you can directly use driver here.
	public static void main(String args[]) {
		String browser="chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		
		}
		else if (browser.equalsIgnoreCase("safari")) {
			//for safari apple is a vendor and not providing any executable file .So internally it is maintained by selenium only.So no need to set property
			driver=new SafariDriver();
		}
		else {
			System.out.println("plz pass the right browser"+browser);
		}
		
		
		driver.get("http://nsyteful.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		}

		
		*/
		
		
	
}
