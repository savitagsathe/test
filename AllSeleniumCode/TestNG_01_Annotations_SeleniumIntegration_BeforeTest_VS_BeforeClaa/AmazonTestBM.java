package TestNG_01_Annotations_SeleniumIntegration_BeforeTest_VS_BeforeClaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestBM {
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");//preconditions
		
	}
	/*
	  here browser will launch 3times and execute 3 testcases
	 
	 Q.very famous interview question @Bforetest or Beforemethod will prefer?
	 =>In beforetest it will launch browser only once and execute all the testcase.But in BeforeMethod it will launch browser 3times and execute 3 TC.
	 So which one we can prefer. Suppose you have 100 TC in Beforetest you are testing 100 TC on same browser,on the same session you are not alllow to close the browser
	 and allow to enter the url only once.This is the problem with the BeforeTest().Suppose you running the 10th TC might be your browser got crash, or application got crash
	 or the cookies are already there data is already deleted but its catched so it will be visible .Same thing we are doing in manual testing as well if there is some
	 discrepency in the data we close the browser ,clear the cache and relaunch the browser, enter the URL and login then we execute properly overthere.So then TC will 
	 run properly and that bug is not reproducible.So if we are executing the 100 TC back to back then might be your browser got crash, or application got crash,sometime page will get blank
	 and could be server is not responding in taht case.Then your browser will get closed so who will execute that 10 to 100TC.Do we have any mechanism here? In this case 
	 we dont have mechanism at runtime to execute other TC. So in this case what is the Test coverage we are getting? out of 100 only 4 TC get executed means only 4% test coverage we got
	 .It could be 100% also.In the morning you will get frustated only 4%coverage done entire time got lost.you have to start execution again and after 2hrs we have regression release
	 .This is the problem with @BeforeTest.
	 
	 II Scenario: 
	 @BeforeMethod
	 Here if browser got crash at 5th TC then WE will again launch the browser, enter the url and execute the TC. Same for others. Here how many TC could not get execute
	 .Only one that is 5th one bcoz its got crashed.Here we got Test coverage 99%. So the BeforMethod is better approch.There is a criteria for 
	 BeforeTest is used for sanity/smoke tescase execution where you are writting very highlevel tescases. Where you dont want to do many navigation or so many testcases you want to tes.
	 But BeforeMethod is used for Regression.means where you want to execute  400 or 500 TC .Every TC is important for me and for every TC I will launch the fresh browser and execute and close
	 .Same for 2nd and so on. The drawback of Beforemethod is time consuming but here we are not bothering about time bcoz this is not the production code.
	 So for what matters performance of the script or the execution time? Here execution coverage is important .It doesnt matters if its taking 15 ot 20 minutes taking extra
	 here we want 99% coverage.After implementing Docker and all we can improve the performance by parallel execution.Its upto you check your application If your application
	 crashed while execution or regression TC getting increased day by day .Ib that case you can use BeforeTest.This is very important so remember and justify answer.
	 
	 
	 -If I want to execute the testcases in specific order then we have specify the priority.Priority is a defined in testng. Its in the form of integer.
	 */
	
	
	
	@Test(priority=2)
	public void titleTest() { //always write test at the end of testcase name
	
		String title=driver.getTitle();
		Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
	}
	
	@Test(priority=3)
	public void searchTest() {
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
		//withot validation we cant do testing
	}
	
	@Test(priority=1)
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
