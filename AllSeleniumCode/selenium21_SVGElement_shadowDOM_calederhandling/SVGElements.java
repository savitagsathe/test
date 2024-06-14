package selenium21_SVGElement_shadowDOM_calederhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElements {
	public static void main(String args[]) throws InterruptedException {
				
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver=new ChromeDriver(co);//headless mode
		
		driver.get("https://emicalculator.net/");
		
		Thread.sleep(3000);
		String verticalXpath="//*[local-name()='svg']//*[name()='g' and  @class='highcharts-series-group']//*[name()='rect']";
		String toolTipXpath="//*[local-name()='svg']//*[name()='g' and contains(@class,'highcharts-tooltip')]//*[name()='text']";
		
		List<WebElement>barList=driver.findElements(By.xpath(verticalXpath));
		System.out.println(barList.size());
		Actions act=new Actions(driver);
		
	    for(WebElement e: barList) {
		act.moveToElement(e).perform();
		//Thread.sleep(5000);       // headless mode remove wait
		String text=driver.findElement(By.xpath(toolTipXpath)).getText();
		System.out.println(text);
		
		//SVG element in headless mode-using ChromeOptions
		
	
	}
	}

}


/*SVG element means we search icon on application taht is not the normal element that is a svg element and normal xpath will not work for it
 CSSSelector will not work for this svg elements.So create xpath for svg elements  
  //*[local-name()='svg']//*[name()='g']     ------------prefer this one .always start with loclaname ->name for svg elements
   
    2nd thing is using selectorHub tool 
     //*[name()='g' and contains(@fill-rule, 'evenodd')]   ------------this will get change anytime
   //*[local-name()='svg']//*[name()='g' and contains(@fill-rule, 'evenodd')]----------if multiple 'g elements' are present
 
  Q.Find out how many svg elements are present in this page?
 =>  //*[local-name()='svg']
 
 Q.automate the graph famous interview question.
 =>
 
 Q.How to recognize the tooltip on graph mousehiver bcoz the moment we mouse hover it will gone?
 =>Inspect on chrome->source->press function+f8->it will freeze the complete page->inspect particular element
 */
 