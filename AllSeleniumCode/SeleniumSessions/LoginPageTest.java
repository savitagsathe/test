package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import sel20_javascript_executer.JavascriptUtil;

public class LoginPageTest {
	public static void main(String args[])
	{
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		System.out.println(br.getPageTitle());
		
		By emailId=By.id("input-email");
		By password=By.id("input-password");
		 
		ElementUtil elementUtil=new ElementUtil(driver);
		JavascriptUtil js=new JavascriptUtil(driver);
		js.flash(elementUtil.getElement(emailId));
		elementUtil.doSendKeys(emailId, "naveen@gmail.com");
		elementUtil.doSendKeys(password, "naveen@123");
		 		
		
	}

}
