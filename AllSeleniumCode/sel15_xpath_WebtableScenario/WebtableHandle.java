package sel15_xpath_WebtableScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableHandle {
	static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("batchautomation2");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		driver.findElement(By.xpath("//a[text()='pqr test']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		selectContact("pqr test");//contact name is the test data
		System.out.println(getCompanyName("pqr test"));
		
		selectContact("abc def");//contact name is the test data
		System.out.println(getCompanyName("abc def"));
		
		
	}
	
	public static void selectContact(String contactName) {
		String checkboxXpath="//a[text()='"+contactName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"; 
		// pqr test should be surronded with single quote bcoz want to append the contact name =>we have write like string concatenation '"+contactName+"'
		driver.findElement(By.xpath(checkboxXpath)).click();
		                                                                                                 
	}
	
	public static String getCompanyName(String contactName) {
		String companyNameXpath="//a[text()='pqr test']/parent::td/following-sibling::td/a[@context='company']";
		return driver.findElement(By.xpath(companyNameXpath)).getText();
		
		
	}
	
	//If there are same contact name how we can go to gthe 1st,nd or 3rd contact=>by using index/position functions
	//   (//a[text()='abc def'])[2]/parent::td/following-sibling::td/a[@context='company']
	

}
