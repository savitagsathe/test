package Sel12_FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel12_Frames {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		/*
		 * driver.get("http://www.londonfreelance.org/courses/frames/");
		 * //driver.switchTo().frame(2);//never use by index bcoz it will get change
		 * //driver.switchTo().frame("main");//frame by name.What id name/id is not
		 * available in that case 3rd option is available by using frame element
		 * 
		 * driver.switchTo().frame(driver.findElement(By.name("main")));
		 * 
		 * String header=driver.findElement(By.xpath("/html/body/h2")).getText();
		 * System.out.println(header);
		 * 
		 * //back to the main page and interact driver.switchTo().defaultContent();
		 */
		
		driver.get("https://platform.easycrypto.co.za/portfolio");
		driver.findElement(By.name("userName")).sendKeys("amit_khandagale");
		driver.findElement(By.name("password")).sendKeys("Easy2022*");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().frame("twitter-widget-0");
		driver.findElement(By.xpath("//span[text()='EasyCrypto']")).click();
		driver.switchTo().defaultContent();
		
	}

}
