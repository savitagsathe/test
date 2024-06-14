package sel18_ExpWait_For_WebElementandnonWEs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementClickWithWait {
    static WebDriver driver;
    
	public static void main(String[] args) {
    
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();//it will give null pointer exception
		driver=new ChromeDriver();
		
		/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		By signInLink=By.name("proceed");

		ElementUtil elementUtil=new ElementUtil(driver);
		elementUtil.clickWhenReady(signInLink, 5);*/
		
		
		driver.get("https://demoauto.xyz/signin");
		
		
		driver.findElement(By.id("email")).sendKeys("admin02mailinator.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		By leads=By.xpath("//span[text()='Leads']");
		By adddLeads=By.xpath("//a[@title='Add Lead']");
		By compName=By.id("company_name");
		
		ElementUtil elementUtil=new ElementUtil(driver);
		elementUtil.clickWhenReady(leads, 5);
		elementUtil.clickWhenReady(adddLeads, 5);
		elementUtil.waitForElemntVisible(compName, 5).sendKeys("IBM");
		


		
	}

}
