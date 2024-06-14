package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	/**
	 this method is used to initialize the driver on the basis of given browser name
	 */
	
	public WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is:"+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
		}
		else {
			System.out.println("Please pass the right browser name :"+browserName);
		}
		return driver;
	}
	
	public void launchUrl(String url) {
		if(url==null||url.isEmpty()) {
			System.out.println("URL is incorrect");
			return;
		}
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		 driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	/*
	 * public WebDriver driver;
	 * 
	 *//**
		 * This method is used to init the driver on the basis of given browser name
		 * 
		 * @param browserName
		 * @return it return the driver
		 *//*
			 * public WebDriver initDriver(String browserName) {
			 * System.out.println("browser name is:"+browserName);
			 * if(browserName.equalsIgnoreCase("chrome")) {
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\chromedriver.exe"
			 * ); driver=new ChromeDriver(); } else
			 * if(browserName.equalsIgnoreCase("firefox")) {
			 * System.setProperty("webdriver.gecko.driver",
			 * "C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\geckodriver.exe"
			 * ); driver=new FirefoxDriver();
			 * 
			 * } else if (browserName.equalsIgnoreCase("safari")) { //for safari apple is a
			 * vendor and not providing any executable file .So internally it is maintained
			 * by selenium only.So no need to set property driver=new SafariDriver(); } else
			 * { System.out.println("plz pass the right browser......."+browserName); }
			 * return driver; }
			 * 
			 * public void launchUrl(String url) { if(url==null || url.isEmpty()) {
			 * System.out.println("Url is incorrect"); return; }
			 * 
			 * driver.get(url); } public String getPageTitle() { return driver.getTitle(); }
			 * 
			 * public String getPageurl() { return driver.getCurrentUrl(); }
			 * 
			 * public void closeBrowser() { driver.close(); }
			 * 
			 * public void quitBrowser() { driver.quit(); }
			 */
}
