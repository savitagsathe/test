package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsAlertPopUpHandle {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		   WebDriverManager.chromedriver().setup();
	       driver=new ChromeDriver();
	       //driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	       driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	       Thread.sleep(5000);
	       
	       
	       //driver.findElement(By.name("proceed")).click();//org.openqa.selenium.NoAlertPresentException: i havent written .clcik()
	       Alert alert=driver.switchTo().alert();//alert will help me to switch to this active dialogue pop up.after switch it will give alert ref so i have to save in alert
	       // this is called 1.JS alert 2.Modal Dialog pop up
	      
	       String text= alert.getText();// it will capture the text from the modal pop up 
	       System.out.println(text);
	       
	      alert.sendKeys("This is my alert testing");
	      alert.accept();//click on ok
	      
	      Thread.sleep(2000);// it will wait till the pop up display otherwise pop up will gets hidden immediately
	      //alert.dismiss();// cancel the alert
	      
	      driver.switchTo().defaultContent();//when u accept/dissmiss the pop up again u have to come to main page
	      
	      
	       
		
  /*
   -Go to the inspect and on console type alert{'hi this is a javascript pop up} ->hit enter button.
   -javascript pop up means its coming bcoz of the javascript method i.e. alert method.It means the UI developer has 
   written a code in that way.Whenever you are clicking on that specific button the pop up is coming means after
    click on it they have called this particular method thats why the pop ups coming.
   -Go to https://mail.rediff.com/cgi-bin/login.cgi->click on sign in->click on login without entering anything. 
   It will show the pop up.So this kind of element we can't inspect .So how to handle this situation.
   -to get the alert i need to first click on sign in and click on this.We have to inspect the sign in button ,
   but we cannot inspect ok button and alert message bcoz 
   -they are not webElement.So we have to switch to the alert and capture the text and click on ok button
   -Dissmiss we can use when you want to check without entering the username and password will it showing the message 
   or not .To perform -ve testing
   -if in icici bank you are making payment and alert is saying are you sure want to proceed? So in that we use dismiss() to cancel it. 
   
   - once click on the ok button sometimes what will happen driver will get lost so for safer side we have to use 
   driver.switchto.defaultContent().It is always good practice to use this method whenever we are using accept()/Dissmiss() bcoz immediately after that your driver is lost and then you have to again come back to main page and you have 
    to proceed futher.So in this case you can use driver.switchTo().defaultContent();
    E.g:https://the-internet.herokuapp.com/javascript_alerts 
    1,2 and 3rd are the javascript pop up
    The 3rd one in that we have to enter value .This is the very rare scenario like on the UI in alert we have enter
     the text .So how we will do this
    =>so in this case we have another method that is called alert.sendkeys();
    
    did you notice one thing it is not entering the text overhere it is actually internally it is entering the text 
    but it is not visible here through selenium.So that is for on this application for your  practice point of view 
    just to make sure have you entered something. So here through selenium it wont be visible lets i am entering text
     "This is my alert testing" it will appear inside the result section.So henece proof we have entered the text.
    See manual operation is different manually if you try to enter it will be visible.through selenium it wont be visible here.but selenium internally actually doing it 
    but it is visible or not thats not a problem it is actually entering  the text.thats why the same text is visible under "result" section.
    - have you seen this kind of scenario in your application in your office where you have to enter the text inside the alert which is like a very rare case 
    -only one% chances are there you will see this kind of application,but these are the interview question actually. 
    They will ask you
    
    Q.Tell the four important methods of alert?
    =>4 important methods are 1)Sendkeys 2)getText, 3)Accept() and 4)dissmiss()
    
    -Authentication pop up are different that are not the javascript pop ups.
    
    -Lets take one another example for authentication pop up
    go back to the same application->https://the-internet.herokuapp.com/ ->click Basic auth(user and pass: admin)->
    it will show the username and password pop up
    -now tell me this is javascript pop up or not. This is not a javascript pop up bcoz javascript pop up will come 
    when we click on specific element. 
    -Here page itself could not be loaded first itself.So this is not a javascript pop up at all.
    This is username, password means this application is asking for the credentials
    -have you seen these  application specially  when you do a server login like there is  windows server 
    login /specific VM login that time you can see this kind of thing
    -or may be you have see when you set a modem locally or router you entered 192.161.1.1.0 and then you have to enter 
    the admin admin. 
    -So how will you handle that lets see iam passing username and passsword admin,admin click on sign in. 
    Then only it will allow you to login into the application.
    -But through selenium i cannot handle it with the webElemnt concept bcoz the pop up  is not a javascript pop up.
    It means i cannot switch to that particular pop up
    -that is authentication pop up which is asking the username and password .So how will you handle that.
    To handle it there is a hack.Its not a proper solution and it wont work on some other browsers as well and 
    thats a limitation actually.
    
 */
	}

}
