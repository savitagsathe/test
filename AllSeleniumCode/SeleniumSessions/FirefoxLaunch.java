package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
public static void main(String args[]) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();//launch browser
	//FirefoxDriver: firefox on WINDOWS (1e9100f9-509a-4988-9af7-bce50b1dd221)
	driver.get("https://nsyteful.com/");//enter url
	//FirefoxDriver: firefox on WINDOWS (1e9100f9-509a-4988-9af7-bce50b1dd221)
	String title=driver.getTitle();//get the page title
	System.out.println("Title is :"+title);
	
	System.out.println("Current url is:"+driver.getCurrentUrl());//to get the current url
	
	
	driver.close();//close the browser
	
	driver=new FirefoxDriver();	//new session id will get generate	
	driver.get("https://nsyteful.com/");//new session id will get generate

	title=driver.getTitle();//new session id will get generate
	
    System.out.println("page title is:"+title);

	
	
	
}
}
