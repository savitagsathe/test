package sel22_pagination_carouselhandling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarouselHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.noon.com/uae-en");
		Thread.sleep(9000);
		getCarouselItems("Recommended for you");
		
	}
		public static void getCarouselItems(String sectionName) {
		
	String xpath="//h3[text()='"+sectionName+"']//parent::div//following-sibling::div//div[@data-qa='product-name']";
	String nextXpath="//h3[text()='"+sectionName+"']//parent::div//following-sibling::div//div[contains(@class,'swiper-button-next')]";
	
	List<WebElement>recomList=driver.findElements(By.xpath(xpath));
		System.out.println(recomList.size());
		//List<String> prodList=new ArrayList<String>();//It will give duplicate elements so instead of AArayList we use Set to avoid duplicate.Set will always sort the date 
		//and treeset will sort in ascending order by default
		Set<String> prodList=new HashSet<String>();
		//there is requirement we have to print the data in a sorted order which collection i have to use?=>treeSet.It will maintaing the data with by default sorted out
		while(driver.findElement(By.xpath(nextXpath)).getAttribute("class").contains("swiper-button-disabled")) {
			//logic for next button
			for(WebElement e:recomList) {
				String text=e.getText();
				if(!text.isEmpty()) {
				prodList.add(text);
				}
			}
			//click on next:
			driver.findElement(By.xpath(nextXpath)).click();//sfter click on next DOM get updated So update the list to avoid staleElementException
			recomList=driver.findElements(By.xpath(xpath));
			
		}
		//traverse the prodList
		for(String e:prodList) {
			System.out.println(e);
		}
		
	}
	}

/*There is a text "Recommended for you"  and i have click on this 'Carousel' means there is a next arrow and  have to keep clicking on it.We dont know how 
many times we have to click.we have to keep clciking until last element come.Its common/famous scenario in eccommerce application*/
