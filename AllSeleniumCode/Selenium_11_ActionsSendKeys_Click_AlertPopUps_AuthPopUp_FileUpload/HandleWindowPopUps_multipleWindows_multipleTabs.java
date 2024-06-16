import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowPopUps_multipleWindows_multipleTabs {
	public static WebDriver driver;
	 public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 
		String parentWindowhandle= driver.getWindowHandle();
		System.out.println("Parent window handle is:"+parentWindowhandle);
		
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		
	Set<String>	handles=driver.getWindowHandles();

	for(String handle:handles) {
		System.out.println(handle);
		if(!handle.equals(parentWindowhandle)) {
		driver.switchTo().window(handle);
		driver.findElement(By.id("email")).sendKeys("savitas@gmail.com");
		//driver.close();
		}
	}
	driver.switchTo().window(parentWindowhandle);
	System.out.println("Parent window title:"+driver.getTitle());
}
