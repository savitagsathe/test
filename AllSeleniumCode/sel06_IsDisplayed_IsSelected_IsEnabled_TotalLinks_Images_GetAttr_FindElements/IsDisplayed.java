package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayed {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/register/");
		
		WebElement submit=driver.findElement(By.id("submitButton"));
		System.out.println(submit.isDisplayed());
		System.out.println(submit.isEnabled());
		
		
		WebElement agreecheck=driver.findElement(By.name("agreeTerms"));
		System.out.println(agreecheck.isSelected()());
		agreecheck.click();
		System.out.println(agreecheck.isSelected());
		System.out.println(submit.isEnabled());
		System.out.println(agreecheck.isDisplayed());
		
		
		
		
		/*BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.initDriver("chrome");
		br.launchUrl("https://classic.crmpro.com/register/");
		
//		boolean flag=driver.findElement(By.id("input-email")).isDisplayed();
//		System.out.println(flag);
//		
//		//creae the utility for isDisplayed() in ElementUtil class
//		
//	   driver.findElement(By.name("search")).isEnabled();
		WebElement submit=driver.findElement(By.id("submitButton"));
		System.out.println(submit.isDisplayed());
		System.out.println(submit.isEnabled());
		
		WebElement agreeCheck=driver.findElement(By.name("agreeTerms"));
		System.out.println(agreeCheck.isSelected());
		agreeCheck.click();
		System.out.println(agreeCheck.isSelected());
		System.out.println(submit.isEnabled());
		System.out.println(submit.isDisplayed());
		
		
		
		
		
		
		//isEnabled means it should be dispalyed and it should be enabled also.See there are some elements present on the page but you cannot perform any action
		//it will be disabled.So you cannot perform any action on that ,you cannot write anything or you cannot select it.bcoz they are disabled but they 
		//are displayed overhere.So whenever you want to display the element check isDisplayed and whenever you want to check enabled property you have check
		//isEnabled property overhere.isEnabled also give you a boolean.So i will create a separate function for isEnabled also in elemenUtil class
	   
		
		/*Q.What is the difference between isDisplayed,isEnabled and isSelected
		=>isSelected we use it for checkboxes.isEnabled we check that element is displayed but that enabled or disabled.
		The 3rd is isDisplayed to check  that element is there or not on the page.
		
		*/
	   
	}

}
