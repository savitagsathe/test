package selenium21_SVGElement_shadowDOM_calederhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDomElement {
public static void main(String args[]) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://books-pwakit.appspot.com/");
	//driver.findElement(By.id("input")).sendKeys("savita"); //normal driver.findElement will not work for shadow elements. show noSuchEllementException
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	// xpath start with the shadow-rrot
	WebElement input=(WebElement)(js.executeScript("return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")"));
	input.sendKeys("savita");
	
	
	//right click on above the shadow-root element->copy jspth->console->paste->write above script
	
	//For svg we cannot use any csselecctor but for Shadow DOM element xpath will not work we have to querySelector.In webdriver IO there is driect method 
	//available for shadow element
	//Canvas we cannot automate
}
}
