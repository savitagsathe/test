package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUpHandle {
   static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		//driver=new ChromeDriver();
		driver=new FirefoxDriver();//working for firefox and chrome
		String username="admin";
		String password="admin";
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.get("https://admin:admin@123@the-internet.herokuapp.com/basic_auth");//it will ask you again for username and password
		
		
/*
 The above url will show the pop up for username and password. first tell me can i inspect this text fields.I cannot right click on it and see there is inspect option.they are not 
 part of webpage .we cannot write by locator and this is not a pop up also. bcoz javascript pop up cannot have two text fields like this. so this is not pop up so you can switch overhere
 and entering the value. no this is not like that.So selenium saying that in this situation generally you will get a situation when you have webapplication where the login page is not ready
 so from the server side you are asking that please enter the username and password and browser will generate the pop up. This is a browser generated pop up. to handle it 
 Selenium says you have pass username and password along with your application url only 
 Eg: https://username:password@url 
 
 see even its not entering the username and password directly giving the 
 Basic Auth
Congratulations! You must have the proper credentials.

-This solution might not work for other browser.We cannot use it for facebook, google application only for certain application which is implemented like for that only we can 
use this
-The biggest problem is here if your username having @ then it will not work
https://admin:admin@123@the-internet.herokuapp.com/basic_auth
-it will ask you again for username and password 

Q.what is the solution for this?
=>always create the username and password like admin admin,test test .you can ask to your IT team that plz create the dummy  password without @ .That is the only solution
otherwise we cannot handle it.but,after selenium4 have you heard about CDP i.e. chrome dev protocols. With CDP you can handle this we will talk later.With we can handle it
But the problem with CDP is that it will work with chrome based browser only means chrome,opera and edge.It will not work for firefox.that is again a limitation but that is the rare case
application not having any login page,application giving the authentication pop up like that always pass the username and password like this.

Q.So can i use variable for username and paaword and then append to the URL?
=>yes we can


 */
	}

}
