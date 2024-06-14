package sel8_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EasyDropDown {
	static WebDriver driver;
public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
    driver=new ChromeDriver();
   
	driver.get("https://platform.easycrypto.co.za/portfolio");
	//driver.manage().window().maximize();
	driver.findElement(By.name("userName")).sendKeys("amit_khandagale");
	driver.findElement(By.name("password")).sendKeys("Easy2022*");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(4000);
	
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-portfolio/div/div[2]/div[2]/div[2]/div/div/div/app-recent-transactions/div/div[8]/div]"))).click();
	driver.findElement(By.xpath("//div[@class='row r3']/div[text()=' See All ']")).click();
	//button[@class='dropdown-item transaction-history-text ng-star-inserted']
	
}
}
