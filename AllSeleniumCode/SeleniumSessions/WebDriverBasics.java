package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
	public static void main(String args[])
	{
		 WebDriver driver;
	    //WebDriver driver=new WebDriver();//Cannot instantiate the type WebDriver
		//to launch the browser
	   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\FreeCRMTest\\driver1\\chromedriver.exe");
	    //driver=new ChromeDriver();
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\BallistixTest\\src\\main\\java\\driver\\geckodriver.exe");
	    driver = new FirefoxDriver();
		driver.get("https://nsyteful.com/");//if remove http it will give error "invalid url".If not write www it will work.for safer side we are writing but http shuold be there
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String title=driver.getTitle();
	    System.out.println("Page title:"+title);
	    
	    //verification/checkpoint:actual vs expected result
	    if(title.equals("Nsyteful")) {
	    	System.out.println("title is correct");
	    }
	    else
	    {
	    	System.out.println("Title is incorrect");
	    }
	    //Automation steps+verification point-->Automation test(Testing)
	    System.out.println(driver.getCurrentUrl());
	   // driver.quit();//close the browser
	    driver.close();//this method is also used to close the browser
	    
	
	}

}



//there are 2major difference between quite and close
//here 1)I am writting the script selenium with java(launch the browser,enter the url,quite the browser) then2)I have to start the server then server will process process the request
//3)server will launch the browser/interact with the browser. 
//the moment you write  driver=new ChromeDriver The request will be send to the server and one session id will get generated.lets say sid=123
//It means your session started now.when send the next request driver.get(url) the session id will remain same. that means same session id will be generated throughout entire session.
//the 3rd request we send the same session id will be generate.For all the time same session id will get generate.
//But when we use Quite what will be the session id.Same session id will get generate for the quite also.After the "driver.quite" if i write the "driver.getTitle" what will be the session 
//lets see practically.

//The same session id will be generated throughout the session.
