package TestNG_01_Annotations_SeleniumIntegration_BeforeTest_VS_BeforeClaa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	/* Design testcase : 
	 * 1.Global precondition :Whenever we write testcases 1st we write prcondition/global condition i.e browser should launch -- @Before
	   2.Pre condition : i.e browser should launch, search should be there --@Before 
	   3.test steps/test cases :  @Test
	   4.Actual results vs expected result -- use Assertion liberary
	   while designing the testcase you have take care of all these things
	   5.post steps/after test : Delete the cookies,close the browser,delete the user,any cleaning activity
	   
	   6.status --Passs/fail-- Execution testcases
	   while running the testcases  you have to write Pass/fail
	   
	   We can do this with the help of annotation.Every annotation should be associated with the method.
	   
	   -Testng never recommend that to repeat the precondition annotation i.e. except the Test annotation.E.g: you cannot write the multiple @BeforeMethod annotation even though 
	   its not giving error we should not write this ugly code.But we can write multiple Test annotation for multiple testcases.
	  
BS - connect with DB
BT - createuser
BC - launchBrowser


        BM - loginToApp
        homePageHeaderTest      ---T1
        AM---logout
        
        BM - loginToApp
        homePageTitleTest       ----T2
        AM---logout
        
        BM - loginToApp
        searchTest             ------T3
        AM---logout
        
AC--close browser
AT-- delete user
AS---dissconnectWithDB

How the preference work :
1.BeforeSiute : very very global precondition setup like connect with the database, server is up and running, profile should be uplooaded 1st
2.BeforeTest: create the user in databse
3.BeforeClass: launch the browser/any specific url you want to launch.
4.BeforeMethod :will start creating the pair with each and every test.  @Test annotaion.
 It will always pick the testcase by alphabetic order and capital letter will be given the first preference.
 i)BM-@test1-AM ii)BM-@test2-AM. Here it will create 3 pair other annotation will never create the pair.

Q.BeforeTest and Beforeclass both are precondition which one will execute first?
=>preference will always give to the before test annotation.Only the difference between beforeClass and BeforeTest is which one will execute first

Q.Tell me the sequence of TestNg annotation?
=>remember above sequence. Sortcut to remember before STC and after CTS

It really doesnt matter where you written the annotaion. You can write anywhere in the class.

E.g in AmmazonTest class

Q.Is it compulsary to write all the annotations?
=>No its not really mandatory .but what is the best practice to use annotation see in "AmmazonTest"
 */
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS - connect with DB");
		
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT - createuser");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC - launchBrowser");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM - loginToApp");
	}
	
	@Test
	public void homePageHeaderTest() {
		System.out.println("homePageHeaderTest");
	}
	
	@Test
	public void homePageTitleTest() {
		System.out.println("homePageTitleTest");
	}
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	
	
	@AfterMethod
	public void logout()
	{
		System.out.println("AM---logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC--close browser");
	}
	
	@AfterTest
	public void deleteUser()
	{
		System.out.println("AT-- delete user");
	}
	
	@AfterSuite
	public void dissconnectWithDB() {
		System.out.println("AS---dissconnectWithDB");
	}
	
	
}
