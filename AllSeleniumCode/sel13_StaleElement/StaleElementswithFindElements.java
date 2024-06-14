package sel13_StaleElement;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementswithFindElements {
public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	/* Application one : opencart
	 driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");//v1
     List<WebElement>footerList=driver.findElements(By.xpath("//footer//a"));//v1
     System.out.println(footerList.size());

     for(WebElement e: footerList) {//v1->v2->v3
	
	System.out.println(e.getText());
	e.click();
	Thread.sleep(1000);
	driver.navigate().back();
	
	//v2->v3-v4
	//update the link once again for next click
	footerList=driver.findElements(By.xpath("//footer//a"));//v2 list get reinitialized to v2
}

*/

	//not working for this application try for another application : freshworks

    driver.get("https://www.freshworks.com/");
    List<WebElement> footerList=driver.findElements(By.xpath("(//ul[@class='footer-nav'])[2]//a"));
    System.out.println(footerList.size());
    
    /*for(WebElement e: footerList)
    {
	System.out.println(e.getText());
	e.click();
	
	footerList=driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));
   }*/
	
	/*staleelement exception causes/usecases
	//1.Refresh 2.Back/Forward 3.Click on link--page get refresh-DOm is updated
	  ->we should always update the element to work it when we are using driver.findElemnt .When we use "By.id" concept not necessary to update
	   element it will work by using fluentWait
	 

          It wont work by for-each loop so try by the normal for loop
		  for(WebElement e: footerList) { System.out.println(e.getText()); e.click();
		  footerList=driver.findElements(By.xpath("//ul[@class='footer-nav'][1]//a"));
		 }
	*/
    
    
	for(int i=0;i<footerList.size();i++) {
		footerList.get(i).click();
		driver.navigate().back();
		footerList=driver.findElements(By.xpath("(//ul[@class='footer-nav'])[2]//a"));
		
	}
	
	
}

	




}




//DCX footer
	/*driver.get("https://platform.easycrypto.co.za/");
	Thread.sleep(2000);
	driver.findElement(By.id("user-identifier-input")).sendKeys("amit_khandagale");
	driver.findElement(By.id("Password")).sendKeys("Easy2023*");
	driver.findElement(By.id("SignIn")).click();
	
	List<WebElement> footerList=driver.findElements(By.xpath("//div[@class='d-flex w-100']//li"));
	System.out.println(footerList.size());
	
	for(int i=0;i<footerList.size();i++) {
		footerList.get(i).click();
		//driver.navigate().back();
		footerList=driver.findElements(By.xpath("//div[@class='d-flex w-100']//li"));*/
	