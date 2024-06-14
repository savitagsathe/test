package sel20_javascript_executer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtil {
	WebDriver driver;

	public JavascriptUtil(WebDriver driver) {
		this.driver=driver;
	}

	//1.to get the title
	
	public String getTitleByJs() {
		JavascriptExecutor js=(JavascriptExecutor)driver;  //convert driver into javascriptExecuter interface
		return js.executeScript("return document.title;").toString();//convert javascript to java string 
	}
	//2.to get the element inner text
	/*practical usecase :
	 suppose in manual testing someone is doing content test so think there are so much amount of text.you can easily verify the header  by writting the validation
	 By using this u can easity verify any inportant text.labels on the webpage.Selenium does not provide this mechanism.GetText methos is there but for specific element
	 but i have to everything written in a driver then have to use for loop */
	
	public String getPageInnerText() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js.executeScript("return document.documentElement.innerText").toString();
	}
	
	//3.generate the pop up
	public void generateAlert(String message) {// u have to pass which message u want to print
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");//string concatenate appending the string
		
		/* this kind of alert deliberately we are not generating.But we can use this when want to give the demo to the client or you want 
		 debug some code whenever landing the from specific page of another application in the case i want to generate alert frome my side
		 u can use this method.You can ceate custorm alert from your side . This is not taht important usecase but if u have that requirenment then use it*/
	}
	
	//4.Refresh the Page. Q.can u exceute javascrippt for refresh the page
	public void refreshBrowserByJs() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	
	//5.Draw border for any specific element// not important for interview
	/*Real time usecase:
	  Whenever there is a test failure before taking the screenshot highlight with the red border.I can use that screenshot while generating the report
	  or while logging the bug*/
	public void drawBorder(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments(0).style.border='3px solid red'",element);
	}
	
	//6.Flash method : not important for interview point of view
	/*this is nice feature whenever you are giving the demo to the manager/client.When u run the script you will exactly get to know where exactly your driver is other
	 * u will not get where is the driver present*/
	public void flash(WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
			
		String bgcolor=element.getCssValue("backgroundcolor");
			for(int i=0;i<15;i++)
			{
				changeColor("rgb(0,200,0)",element);//1
				changeColor(bgcolor, element);//2
			}
		
	}
private void changeColor(String color, WebElement element) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);

		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {
			
		}
	}
	//for vertical scrolling  only

public void scrollPageDown() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHieght)");
	
}
public void scrollPageDown(String height) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,'"+height+"')");
	
}
public void scrollPageUp() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(document.body.scrollHieght,0)");
	
}
public void scrollIntoView(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments(0).scrollIntoView(true);",element);
	
}

/*Element not interactabel exception : element is present on the page but not interactable due to its inside DOM if your driver.findelemnt and actionclass 
  click not working in that case use javascript executor click.But u really prefer this in QA point of view bcoz we are actually cliking on the page 
  not inside the DOM.End user on amazon should not go inside any DOm they will prefer goto the site "best Seller" should be present on the page and they 
  should able to click on it.It is not reccomended for real time usecase.This is very last option we have to use if anything is not working
  waits,findelemnt and actionclass click not working in that case use
  If SendKeys is not working the we can the javascript sendKeys i.e .value in javascript, but this is also not reccomended to use.*/


public void clickElementByJS(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;

	js.executeScript("arguments(0).click();",element);
}


	

}
