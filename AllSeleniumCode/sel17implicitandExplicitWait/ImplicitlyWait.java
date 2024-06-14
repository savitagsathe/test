package sel17implicitandExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Implicitly wait applied on webDriver ref
		//dynamic wait: only applicable for web elements i cannot handle non-webelements->alert,url,title
		//global wait----It will be applied on all the elements by default
		//timeout--10sec-->selenium is going to wait until 10sec,if the element is stil not present on the page, then selenium will throw exception: No such element
		//if element is found within 5seccs---rest of the 5sec will be ignored thts why its dynamic wait . but in static wait it still wait for 10 sec even element appear
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demoauto.xyz/signin");
		driver.manage().window().maximize();
		
		
		//Login : 10secs implicitly wait applied
		driver.findElement(By.id("email")).sendKeys("admin02mailinator.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//home page : 20secs implicitly wait applied
		driver.findElement(By.xpath("//span[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[@title='Add Lead']")).click();
		
		//Lead : 5secs implicitly wait applied

		driver.findElement(By.id("company_name")).sendKeys("IBM");
		
		//logout:
		//login page:10sec
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		


		/*here its a global wait so will get applied to all the element by default .here we equired wait for Lead element only then why we are 
		appyling unnecessary wait on all the elements.If write 1000 elements it will get applied to all 1000 elements. So it decrease the script 
		performnace.This is the major drawback of implicitly wait.
		
		can we override implicitly wait?
		=>yes, If we ovrride the wait every time we have to keep changing wait page by page . it will look ugly code.for every page unnecessary separate 
		wait we defined this is not the right approach.Here for logout we required 5sec wait so on login we set it 10sec so but current wait is 5sec 
		we set last for logout.
		So this is performance issue here :Here first time when load so emeil id required 10 sec but other element on the login page not 
		required any wait bcoz all the element get loaded when email is loaded its not like elements will get loaded one by one its global wait 
		So all the element will get loaded at a time .So unnecessary we are applying wait for eac and evry element .Whenever we write driver.findElement it will go and check
		implicitly wait and try chek for 10sec unnecessary.On homepage also it will wait 20sec unnecessary for every element whether it is 20 or 30 elements .
		
		Problems:
		1.Its bad approach to use implicitly wait
		2.unnecessary override
		3.non webelemnt cant handle by implicitly wait->title,url,alert
		4.If element not found within 10secs->after 10sec will throw exception "no such element" that is the threshold throw the exception cant wait ~ time.but here 
		for title we cant apply the implcitly wait for that we want wait 
		
		
		
		  
		 */
		
	}
	}



