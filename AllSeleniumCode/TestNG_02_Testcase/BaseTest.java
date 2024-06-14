package TestNG_02_Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	
	@Parameters({"url","browser"})
	@BeforeTest
	public void setUp(String url,String browser) throws InterruptedException//here browser will launch only once and execute all the testcase
	{
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			
		default:
			System.out.println("Please pass the right browser.....");
			break;
		}
		
		//driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get(url);//preconditions
		Thread.sleep(3000);
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
