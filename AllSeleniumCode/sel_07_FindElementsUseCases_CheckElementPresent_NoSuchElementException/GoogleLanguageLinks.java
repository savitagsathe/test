package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {
static WebDriver driver;
	
	public static void main(String aregs[])
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
//		By langLinkXpath=By.xpath("//div[@id='SIvCob']/a");
//		doLinkClick(langLinkXpath,"मराठी");
//		
		By footers=By.xpath("//footer//a");
		doLinkClick(footers,"Contact Us");
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}
	
	//right now its not a generic code so create a utility for it
	public static void doLinkClick(By locator,String linkValue) {
		//in this code there are 2 hardcoded values i.e xpath and value of marathi.So we create a separate locator
		//List<WebElement> langLinks=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		//List<WebElement> langLinks=driver.findElements(locator);
		List<WebElement> linksList=getElements(locator);
		
		System.out.println("Links of language are "+linksList.size());
		
		for(WebElement e:linksList) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals("मराठी")) {
				e.click();//to click on the particular link
				break;
			}
		}
		
	}

}

//single slash(/) direct association and double slash for indirect association