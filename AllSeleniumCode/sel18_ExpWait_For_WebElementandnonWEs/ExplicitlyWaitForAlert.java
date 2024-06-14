package sel18_ExpWait_For_WebElementandnonWEs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitForAlert {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();//it will give null pointer exception
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		//driver.switchTo().alert();
		
		/*WebDriverWait wait=new WebDriverWait(driver, 10);
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alert.getText());
		alert.accept();*/
		
		System.out.println(alertGetText(10));
		driver.switchTo().defaultContent();
			
		}
	
	public static Alert waitForJSAlert(int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.alertIsPresent());
		
		
	}
	public static void acceptAlert(int timeOut) {
		waitForJSAlert(timeOut).accept();
	}

	public static void dismissAlert(int timeOut) {
		waitForJSAlert(timeOut).dismiss();;
	}
	
	public static String alertGetText(int timeOut) {
		Alert alert=waitForJSAlert(timeOut);
		String text=alert.getText();
		alert.accept();
		return text;
		
	}
	
	public static void alertSendKeys(int timeOut,String value) {
		waitForJSAlert(timeOut).sendKeys(value);
	}
}
