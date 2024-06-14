package sel13_StaleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath_1 {
	public static void main(String args[]) throws InterruptedException
	{
		//driver setup
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://platform.easycrypto.co.za/portfolio");
		
		Thread.sleep(2000);
		driver.findElement(By.id("user-identifier-input")).sendKeys("amit_khandagale");
		driver.findElement(By.id("Password")).sendKeys("Easy2023*");
		driver.findElement(By.id("SignIn")).click();
		
		//wait to load the modal pop up
		WebDriverWait wait = new WebDriverWait(driver,60);
		WebElement modalPopUp=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='close welcome-close pt-2 pr-3']//span")));
		Thread.sleep(1000);
		System.out.println("lacating to the modal pop up");
		driver.findElement(By.xpath("//button[@class='close welcome-close pt-2 pr-3']//span[text()='×']")).click();
		System.out.println("closed modal pop up");
		
		List<WebElement> headerMeu=driver.findElements(By.xpath("(//div[@class='container d-block']//li)"));
		System.out.println("headermenu count is : "+headerMeu.size());
		
		for(int i=0; i<=headerMeu.size();i++)
		{
			headerMeu.get(i).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			headerMeu=driver.findElements(By.xpath("(//div[@class='container d-block']//li)"));
			System.out.println(headerMeu);
			
		}
		
	

	}
	
	/*xpath : is not an attribute
	          is an address of the web element
	          2 type of xpath : i)absolute xpath =>never use 
	                            ii)Relative xpath(custom xpath)=>always prefer
	           
	          Formula : //html tag[@attrr='value']
	          E.g : //input[@name='email']
	                //input[@id='input-email']
	                //*[@id='input-email']          both are same xpath but when write * it will take time to serach on DOM so better use specific tag
	                
	          Multiple attribute :
	           Formula : //html tag[@attrr1='value' and @atrr2='value']
	           E.g: //input[@id='input-email' and @name='email']
	           
	           3 attribute:
	           //input[@id='input-email' and @name='email' and @type='text']
	           
	           //also right xpath but not recommended it without value.When u want to check the elemnt having attribute in that case use it
	           //input[@name='email' and @type='text' and @id]
	           //input[@name and @type='text' and @id]
	           //input[@name and @type and @id]
	           
	           Whenever there is no any id,name and i want to reach out to specific element from the same group then use indexing in this case
	           Whenever we are using indexing always use capture group concept means in a bracket capture all the element then use index.
	           E.g: there are 3 input tag i want to locate to 1st one 
	           
	           index in xpath:
	           (//input[@type='text'])[1]
	           By.xpath("(//input[@type='text'])[1]");
	           
	           position function in xpath: if dont want to use index use position
	           (//input[@type='text'])[position()=1]
	           
	           Capture all element and goto last element. There is no any first() it works pnly for last()
	            (//input[@class='form-control'])[last()]
	           
	           Want to lacate 2nd last element .Keep doing -1, -2 and so on
	            (//input[@class='form-control'])[last()-1]
	            
	            Starts-with :to get dynamic attribute
	            //input<input id=test_231>     //dynamic attribute means when refresh next time id(any attribute it may be) will get change as follow
	            //input<input id=test_563>
	            //input<input id=test_281>
	             
	             Here we cant use By.id bcoz id is dynamic in nature so we have to use xpath.I know test_ is the constant part and only dynamic part is number will get chnaged 
	             so in this case i will use "starts-with"
	             
	             //input[starts-with(@id , 'input')]
	            
	            
	            */
	           
	          
	        
}
