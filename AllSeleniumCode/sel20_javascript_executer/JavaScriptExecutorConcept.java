package sel20_javascript_executer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://platform.easycrypto.co.za/login");
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
	    //driver.navigate().to("https://identity.openeasy.io/");
		//https://identity.openeasy.io/

		JavascriptUtil jsUtil=new JavascriptUtil(driver); // create object to call the methods of javascript utility
		
		/*DCX:
		 System.out.println(jsUtil.getTitleByJs());//get title by javascript
		System.out.println(jsUtil.getPageInnerText());
		if(jsUtil.getPageInnerText().contains("ACCESS IMPORTANT DOCUMENTS")) {
			System.out.println("pass");
		}
			
		=>real time usecase for getPageInnerText If manually someone is doing content text its to difficult to check so many content manually.
		  So with the help of this you caan verify important text/ header/label.If u want to print important headings easily u can write.This 
		  direct method id not available in selenium
		
		jsUtil.generateAlert("This is a DCX alert");//this is used when u want to generate custom alert/give demo to the client.not impotant usecase
		
		jsUtil.refreshBrowserByJs();*/
		//draw border for element :realtime  usecase->Whenever there is a test failure before taking the screenshot create a border and i can store that 
		//screenshot in my report/i can use that screenshot while logging the bugs. so u can generate the screenshot automaticall with the borders.
		//WebElement login=driver.findElement(By.xpath("//button[@id='SignIn']"));
		//jsUtil.drawBorder(login);
		
		//Flash:to check where exactly driver control is available
		//WebElement formHighlight=driver.findElement(By.xpath("//form[@id='loginForm']"));
       // jsUtil.flash(formHighlight);
        
		
        WebElement bestSeller=driver.findElement(By.linkText("Best Sellers"));
        jsUtil.clickElementByJS(bestSeller);
		/*CRM PRO:
		 System.out.println(jsUtil.gatePageInnerText());
		if(jsUtil.gatePageInnerText().contains("Clients are offered limited recourse facilities")) {
			System.out.println("pass");
		}
		
		jsUtil.generateAlert("This is CrmPro");
			jsUtil.refreshBrowserByJs();*/
			
			/*WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
			jsUtil.drawBorder(login);
			jsUtil.flash(login);*/
		
	
	}
	/*JavascriptExecuter is an interface which will help us to excute the javascript code on the browser.
	  Use: Sometimes when u launch the application there multiple things u cannot do with selenium. Eg : scrolling, u want to scroll up ,scroll down
	  you cannot do it with selenium bcoz selenium does not provide the method.means there is no direct method available for that. lets see u want to 
	  highlight the specific element I want to draw some border around that particular element. You can do multiple things using javascript executer
	   but u cannot derectly use it with selenium. So have to use interface provide by the javascript executer thrugh that u can convert the javascrpript 
	   code into the java. that javascript will be excuted on the browser 
	  E.g: 1)on browser console i write =>console.log("hi")
	  it will print the hi on the browser console. So this console.log("hi") this is a javascript method bcoz browser understand obly javascript 
	  2)generate alert
	  alert("hi this is my alert")    //javascript method
	  3)refresh page:	  history.go(0)
	  which method is used in javascript to refresh the page  =>history.go(0) is used 
	  Now create one by one javascript utility

	  
	 Q.What are the different ways of getting the title
	  1.with help of driver.getTitle()
	  2.With the help of document.title using javascript executer
	  
	  Q.What is the javascript method used for scroll into page
	  =>
	  
	  Q.What if u want to scroll at particular height?
	  =>
	  */
	

}
