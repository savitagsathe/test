package Sel10_Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://jqueryui.com/droppable/"); if write this url "Nosuchelement exception will come"
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceEle=driver.findElement(By.id("draggable"));
		WebElement targetEle=driver.findElement(By.id("droppable"));
		

		Actions act=new Actions(driver);
		act.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();//build and perform are not actions
		//act.dragAndDrop(sourceEle,targetEle).build().perform();//i havent written build.perform() so it was showing nothing
		
		//whenever we are using actions class at the end u have to use build() and perform(). when using these 3 actions u have to use build() and perform() compulsary.
		//act.dragAndDrop(sourceEle, targetEle).build().perform();//here we can use perform() directly. Build will collect all the actions together and perform will execute 
		//that actions in the given order. Build will not perform any action it will just collect all the actions. We can use only perform() for one single action.
		//If we writting only build it wont work.Best practice is always use build.perform() at the end.
		
		
		
		
	}
}
/*Selenium support drag and drop. It will drag and drop element to element.Drag and drop is a action .So are performing the clickand hold ->moveto Element ->drop it
  So we have to use actions class.In action class we have to pass the driver.In select classs we are passing Webelement.
  
  Q.Difference between build and perform?
  =>Build will collect all the actions together and perform will execute that actions in the given order.
  */
