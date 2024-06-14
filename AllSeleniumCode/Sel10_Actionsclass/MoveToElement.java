package Sel10_Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {
	static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("http://mrbool.com/");
		//driver.get("https://www.spicejet.com/");
		
//		WebElement content=driver.findElement(By.className("menulink"));
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(content).build().perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("COURSES")).click();//On ui its capital letter for courses and in DOM its small which one we can use =>use On UI
		
//		By content=By.className("menulink");
//		By courses=By.linkText("COURSES");
//		By articles=By.linkText("ARTICLES");
	  
		//spicejet application
		//By addOns=By.xpath("//div[text()='Add-ons']");
		//By zeroCnacelation =By.xpath("//div[text()='Zero Cancellation']");
		
		//parentChildMenuHandle(addOns, zeroCnacelation);
		
		driver.get("https://dev.dcx10.com/login");//give the url where taht element is present otherwise it will give nosuchElementException
		/*
		 * WebElement easyAppDropDown=driver.findElement(By.id("easyAppsDropdown"));
		 * Actions act=new Actions(driver);
		 * act.moveToElement(easyAppDropDown).build().perform(); Thread.sleep(2000);
		 * driver.findElement(By.linkText("EasyEquities")).click();
		 * 
		 */		//utilities call
		By easyAppDropDown=By.id("easyAppsDropdown");
		By easyEquity=By.linkText("EasyEquities");
		
		By mrPhy=By.linkText("MrPhy");
		
		parentChildMenuHandle(easyAppDropDown, easyEquity);
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void parentChildMenuHandle(By parent,By child) {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(parent)).build().perform();
		getElement(child).click();
	}
	
	/*
	 * public static WebElement getElement(By locator) { return
	 * driver.findElement(locator); }
	 * 
	 * public static void parentChildMenuHandle(By parent,By child) throws
	 * InterruptedException { Actions act=new Actions(driver);
	 * act.moveToElement(getElement(parent)).build().perform(); Thread.sleep(2000);
	 * getElement(child).click();
	 * 
	 * }
	 * 
	 * 
	 * Q.If i write the code without build() and perform() will it work and will it throw any error if not work?
	 =>It will not mousehover and it will not give any error . we have write both build and perform for best practice. But if we write only perform it will work
	 bcoz its only one action.
	 
	 When we mouse hover selenium will immediately try to interact with the element it will not wait .So for that we have write thread.sleep() or any 
	 other wait.
	 
	 Q.driver.findElement(By.linkText("COURSES")).click();//On ui its capital letter for courses and in DOM its small which one we can use =>use On UI
		
	 */

}
