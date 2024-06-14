import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TootltipDemo {

	public static void main(String[] args) {
		driver.get("https://www.google.com/");
		 
		
		WebElement serchlabEle=	driver.findElement(By.xpath("//a[@aria-label='Google apps']"));

		Actions action=new Actions(driver);
		action.moveToElement(serchlabEle).build().perform();
		Thread.sleep(2000);//if we haven't given thread.sleep it will not print the text

		String appTootltip=driver.findElement(By.xpath("//div[text()='Google apps']")).getText();
		System.out.println(appTootltip);

	}

}
