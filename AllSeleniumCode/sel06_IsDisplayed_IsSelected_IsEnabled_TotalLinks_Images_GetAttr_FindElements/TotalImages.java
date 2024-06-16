package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	/*Q.give me total no.of images /count of the images on the page
	 for each image print src and alt value
	=>
	
	Q.What is the difference between findElement and findElemnts?
	=>findElement is used for single web element and fineElements is used for multiple webelements.Whenever we want to interact with multiple web elements use fineElements.
	
	Q.Waht is the return type of fineElement and findElements method?
	=> return type of fineElement is WebElemnt and return type of findElements is List<WebElement>. Bracket means generics.
	
	Q.why its giving List<WebElement> not a static array bcoz images count is dynamic in nature today you are gtting 200 images tomorrow might be 800 images or nest you will get only 50 images
	so selenium guys given the List<WebElement> bcoz its a dynamic collection.The dynamic array not the static array.more and more images coming it will keep the storing images 
	in this particular list without any problem.otehrwise you will start giving ArrayIndexOutOfBoundException.thats why they are not returning the static array here.
	
	Q.List is a order base or non-order based collection?
	=>orderbased collection
	
	Q.which method i have to use to get the size of these imagaes?
	=>size();
		
	
	*/
	
	static WebDriver driver;
	
	public static void main(String aregs[])
	{
		/*WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		List<WebElement> imageList=driver.findElements(By.tagName("img"));//All elemnt store in the form of WebElement
//		System.out.println("Total imagaes"+imageList.size());//here we are getting 194 value we have to print src and alt value.its so dynamic count
//		
//		
//		for(int i=0;i<imageList.size();i++) {
//			String altValue=imageList.get(i).getAttribute("alt");//return type of get is WebElement
//			String srcValue=imageList.get(i).getAttribute("src");
//			
//			System.out.println(altValue+":"+ srcValue);
//			
//		}
		
		//total links on the page, and print its text and href value
		List<WebElement>linksList=driver.findElements(By.tagName("a"));
		System.out.println("total links:"+linksList.size());
		
		for(WebElement e:linksList) {
			String hrefVal=e.getAttribute("href");
			String text=e.getText();
			System.out.println(hrefVal+":" +text);
			//this is called web scrapping
		}*/
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement>linkLists=driver.findElements(By.tagName("a"));
		System.out.println("Total links: "+linkLists.size());
		for(WebElement e:linkLists) {e.getAttribute("href");
		String text=e.getText();
		System.out.println(href);
			
		}
			
	}
}
