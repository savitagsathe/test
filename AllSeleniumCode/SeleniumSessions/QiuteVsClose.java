package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QiuteVsClose {
	public static void main(String args[]) {
		//The moment i run the code . this line will start the server.
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//launch browser.
		//FirefoxDriver: firefox on WINDOWS (1e9100f9-509a-4988-9af7-bce50b1dd221)
		driver.get("https://nsyteful.com/");//enter url
		//FirefoxDriver: firefox on WINDOWS (1e9100f9-509a-4988-9af7-bce50b1dd221)
		String title=driver.getTitle();//get the page title
		System.out.println("Title is :"+title);
		
		System.out.println("Current url is:"+driver.getCurrentUrl());//to get the current url
		//FirefoxDriver: firefox on WINDOWS (1e9100f9-509a-4988-9af7-bce50b1dd221)
		//driver.quit();//close the browser
		//FirefoxDriver: firefox on WINDOWS (1e9100f9-509a-4988-9af7-bce50b1dd221)	
		//till the line number 19 same session id will get generate then Q.1)what will be the output at line number 21 Q.2)what will be the session id  here same session i will get generate?
		
		//title=driver.getTitle();//session id will be null
		//Quit:Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?

        //System.out.println("page title is:"+title);
		
		
		driver.close();//close the browser
		
		
		//FirefoxDriver: firefox on WINDOWS (1e9100f9-509a-4988-9af7-bce50b1dd221)	
		//till the line number 28 same session id will get generate then Q.1)what will be the title after driver.close(); Q.2)what will be the session id 
		//here same session id will get generate in case of close?
		driver=new FirefoxDriver();	//new session id will get generate	
		//1.the we use Quit/close session id will get expired 2.new driver will get instantiate3.here new session id will get generate4.send the request to se
		driver.get("https://nsyteful.com/");//new session id will get generate

		title=driver.getTitle();//new session id will get generate
		
        System.out.println("page title is:"+title);
        //new session id will get generate.Title will get print.

		
		
		
	}

}


/*Case 1:
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();//launch browser
driver.get("https://nsyteful.com/");//enter url
FirefoxDriver: firefox on WINDOWS (0fcd52a4-5585-441c-a1e5-ddc256c56a39)

String title=driver.getTitle();//get the page title
FirefoxDriver: firefox on WINDOWS (0fcd52a4-5585-441c-a1e5-ddc256c56a39)
System.out.println("Title is :"+title);

System.out.println("Current url is:"+driver.getCurrentUrl());//to get the current url
driver.quit();//close the browser
FirefoxDriver: firefox on WINDOWS (0fcd52a4-5585-441c-a1e5-ddc256c56a39)

title=driver.getTitle();
System.out.println("page title is:"+title);
		
Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
=====================================================================================================================================
Case2:
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//launch browser
		driver.get("https://nsyteful.com/");//enter url
		
		String title=driver.getTitle();//get the page title
		System.out.println("Title is :"+title);
		
		System.out.println("Current url is:"+driver.getCurrentUrl());//to get the current url
		driver.close();//close the browser
		
		title=driver.getTitle();//same session will get generate
        System.out.println("page title is:"+title);
        //Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid Session id

		//The conclusion is session will be used from browser will be launch to the Quit/Close. The moment you use the quit/close the the browser your session id will be null/invalid
		//depend on what exactly you are using.
		//Q.How to fix this problem?
		=> we have to reinstantiate the driver. It means we have to launch the browser again.
		  
		  

*/