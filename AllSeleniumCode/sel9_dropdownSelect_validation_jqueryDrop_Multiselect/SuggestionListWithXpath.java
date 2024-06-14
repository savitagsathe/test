package sel9_dropdownSelect_validation_jqueryDrop_Multiselect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionListWithXpath {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(), 'Casual Dresses > Printed ')]")).click();
}
}
