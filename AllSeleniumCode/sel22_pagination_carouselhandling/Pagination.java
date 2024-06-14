package sel22_pagination_carouselhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {
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
     
	 List<WebElement> pages=driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));

	while(true) {
		int i=0; // this index not the page number .List will start from 0th index so we have to give 0 here.we have to iterate the list thats why started with 0
		if(driver.findElements(By.linkText("Test 65")).size()>0) {
			selectContact("Test 23");
			break;
		}
		else {
			//pagination logic: 1st page is not link by default its disply link starts from 2
			try {
			pages.get(i).click();//it will give indexOutOfBoundException due after 19(last page) also there is not that name found.We have to handle by try catch.
			}catch (Exception e) {
				System.out.println("Pagination is over.......and we didnt find any contact.....");
				break;
			}
			pages=driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));

/*2 important things here
  1.we have to update list overhere-DOM geting updated after click on 1st link .So we will get staleelementexception
  2.
	*/		
		}
			i++;
	}
}
public static void selectContact(String contactName) {
	String checkboxXpath="//a[text()='"+contactName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"; 
	// pqr test should be surronded with single quote bcoz want to append the contact name =>we have write like string concatenation '"+contactName+"'
	driver.findElement(By.xpath(checkboxXpath)).click();
	                                                                                                 


}
}


