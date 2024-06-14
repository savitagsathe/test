package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementPresent {
	static WebDriver driver;

	public static void main(String[] args) 
	{
		//interviewer is saying you are not allowed to use isDisplayed method what should you do?
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		By search=By.name("search");
		List<WebElement> searchList=driver.findElements(search);
		
		if(searchList.size()==1) {
			System.out.println("search field is present on the page");
		}else {
			System.out.println("not present............");
		}
		
		//System.out.println(checkElementDisplayed(search));
		By search1=By.name("search");
		By forgotPwdLink=By.linkText("Forgotten Password");
		
		System.out.println(checkElementDisplayed(search1));
		System.out.println(checkElementDisplayed(forgotPwdLink, 2));
		
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	//single occurence check 
	public static boolean checkElementDisplayed(By locator) {
		if(getElements(locator).size()==1)
		
			return true;
			return false;
		
	}
	
	//multi occurence check 
	public static boolean checkElementDisplayed(By locator,int elementOccurrence) {
		if(getElements(locator).size()==elementOccurrence)
		
			return true;
			return false;
		
	}

}
