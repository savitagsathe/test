package TestNG_01_Annotations_SeleniumIntegration_BeforeTest_VS_BeforeClaa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestNG_02_Testcase.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest extends BaseTest{
	/*Best practice to use Annotaion :
	  In Amazon test do you really want to start the server,create the database and all these things? No bcoz all the things are already set for this right.
	 So I will directly start writting @BeforeTest annotation.Generally we use setUp and tearDown method. setup means precondition and tear down means post condition.
	 what exactly you want to clean up. 
	 -cut  from here and paste into BaseTest this setup and teardown method to avoid boiler code and use extends keyword for this class
	 */
	
	
	WebDriver driver;
	
	/*@BeforeTest
	public void setUp()//here browser will launch only once and execute all the testcase
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");//preconditions
		
	}*/
	
	@Test
	public void titleTest() { //always write test at the end of testcase name
	
		String title=driver.getTitle();
		Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
	}
	
	@Test
	public void searchTest() {
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
		//withot validation we cant do testing
	}
	
	@Test
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}
	
	/*@AfterTest
	public void tearDown() {
		driver.quit();
	}
*/
	
	
}
