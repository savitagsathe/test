package TestNG_02_Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshworksTest extends BaseTest {
	@Test
	public void titleTest() { //always write test at the end of testcase name
	
		String title=driver.getTitle();
		Assert.assertEquals(title,"Freshworks | Modern and Easy Customer and Employee Experience Software");
	}
	
	
	
	@Test
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector("img.logo")).isDisplayed());
	}

}
