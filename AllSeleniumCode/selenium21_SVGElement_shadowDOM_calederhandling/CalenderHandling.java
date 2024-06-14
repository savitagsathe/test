package selenium21_SVGElement_shadowDOM_calederhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {
	static WebDriver driver;
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		/*driver.findElement(By.id("datepicker")).click();
		
		//driver.findElement(By.xpath("//a[text()='12']")).click();
		selectDate("September 2023", "26");
		
	}
	
	public static void selectDate(String expectedMonthYear,String day) {
		if(Integer.parseInt(day)>31) {
			System.out.println("Wrong date passed....Please enter the correct day/date......");
			return;
		}
		if(expectedMonthYear.contains("February")&&Integer.parseInt(day)>29) {
			System.out.println("Wrong date passed....Please enter the correct day/date......");
			return;
		}
	
	
		String actualMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actualMonthYear);
		//String expectedMonthYear="September 2023";
				

		while(!actualMonthYear.equalsIgnoreCase(expectedMonthYear)) {
			//click on next
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		actualMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();

		}
		selectDay(day);
		
	}
	//current date
	public static void selectDay(String day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();  */
		
		driver.findElement(By.id("datepicker")).click();
		//driver.findElement(By.xpath("//a[text()='21']")).click();
		
		selectFutureDate("February 2023", "35");//for case sensitive we use equalIgnoreCase
	
	}

	//Generic function
	public static void selectFutureDate(String expMonthYear,String day) {
		if(Integer.parseInt(day)>31) {
			System.out.println("Wrong date passed .....plz pass the corect Day/Date");
			return;
		}
		if(expMonthYear.contains("February")&&Integer.parseInt(day)>29) {
			System.out.println("Wrong date passed .....plz pass the corect Day/Date");
			return;
		
		}
		
		String actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);//it will print current text of year and month from date pickedr not selected date
		//String expMonYear="November 2024";
		while(!actMonthYear.equalsIgnoreCase(expMonthYear)) {
			//click on next
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();

		}
		selectDay("5");
	}
	
	
	public static void selectDay(String day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}
	
}
