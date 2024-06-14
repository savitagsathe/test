package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
public WebElement getElement(By locator) {
	return driver.findElement(locator);
}
public void doSendKeys(By locator,String value) {
	getElement(locator).sendKeys(value);
}

public void doClick(By locator) {
	getElement(locator).click();
}

public String doGetText(By locator) {
	return getElement(locator).getText();
}

public boolean doIsDisplayed(By locator) {
	return getElement(locator).isDisplayed();
}
 public boolean doIsEnabled(By locator) {
	 return getElement(locator).isEnabled();
 }


public boolean doIsSelected(By locator) {
	return getElement(locator).isSelected();
}

//if isDisplayed method is not working then we can use this method
public boolean checkElementDisabled(By locator,String atrrName) {
	String atrrValue=getElement(locator).getAttribute(atrrName);
	if(atrrValue.equals("true")) {
		return true;
	}
	return false;
}

public String doGetAttributeValue(By locator,String attrName) {
	return getElement(locator).getAttribute(attrName);
	}
	
public List<WebElement> getElements(By locator) {
	return driver.findElements(locator);
	
}

public  void doLinkClick(By locator,String linkValue) {
	//in this code there are 2 hardcoded values i.e xpath and value of marathi.So we create a separate locator
	//List<WebElement> langLinks=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
	//List<WebElement> langLinks=driver.findElements(locator);
	List<WebElement> linksList=getElements(locator);
	
	System.out.println("Links of language are "+linksList.size());
	
	for(WebElement e:linksList) {
		String text=e.getText();
		System.out.println(text);
		
		if(text.equals("मराठी")) {
			e.click();//to click on the particular link
			break;
		}
	}
}

/***********************************Actions class Utils*****************************************/
public void parentChildMenuHandle(By parent,By child) throws InterruptedException {
	Actions act=new Actions(driver);
	act.moveToElement(getElement(parent)).build().perform();
	Thread.sleep(2000);
	//getElement(child).click();
	//we can call doclick method as well or getElement(child).click(). Either one of them
	doClick(child);
	
}


/**************************************Drop down utils********************************************/
 public  void doSelectByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public  boolean doSelectByVisibleText(By locator,String text) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
		return isDropDownValueSelected(select, text);
	}
	public  boolean doSelectByValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
		return isDropDownValueSelected(select, value);
	}
	
	//utility to select particular value from drop down and click on it
	   
		public void doSelectDropDown(By locator,String value) {
			Select select=new Select(getElement(locator));
			
			   List<WebElement>optionsList=select.getOptions();
			   iteraeDropDownAndSelect(countryList, value);
			   
			  /* System.out.println(countryList.size());
			   for(WebElement e:countryList) {
				   String text=e.getText();
				   System.out.println(text);
				   if(text.trim().equals(value)) {e.click();
				   break;
					   
				   }*/
			   }
			   
			   
	 //utility to select Dropdown without Select class->using xpath
				public void selectDropdownwithoutSelct(By locator,String value) {
					List<WebElement> optionsList=getelements(locator);
					iteraeDropDownAndSelect(optionsList, value);
					
					/*for(WebElement e:optionsList) {
						String text=e.getText();
						System.out.println(text);
						if(text.equals("value")){
						e.click();
						break;
						}
						
					}*/
					
					}
	//But in the above 2 utility we used common code from for loop.So we create private method to call internally to avoid repetative code
				private void iteraeDropDownAndSelect(List<WebElement> optionsList,String value) 
				{
					System.out.println(countryList.size());
					for(WebElement e:optionsList) {
						String text=e.getText();
						System.out.println(text);
						if(text.equals("value")){
						e.click();
						break;
						}
						
					}
				}
				
				}
					
				
	
	/*utility for to verify id correct value selected or not from drop down list
	When the value and  text attribute both are same then how to handle this=>using contains*/
	
 /*can i make this utility as private? 
 =>no bcoz if we want to selct the value which already there in the drop down by default */
public  boolean isDropDownValueSelected(Select select,String expValue) {
	//if(select.getFirstSelectedOption().getText().equals(expValue)) {
		if(select.getFirstSelectedOption().getText().contains(expValue)) {//if exact match is not happen for valeu and text
		System.out.println(expValue+": is selected");
		return true;
	}
	return false;
	
}

/*************************wait utils*******************************************/
//frameUtility
public  void waitForFrameUsingIDorName(String frameIdorName, int timeOut) {
	WebDriverWait wait=new WebDriverWait(driver, timeOut);
    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdorName));	
}

public  void waitForFrameUsingIndex(int frameIndex,int timeOut) {
	WebDriverWait wait=new WebDriverWait(driver, timeOut);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
}

public  void waitForFrameByLocator(By frameLocator,int timeOut) {
	WebDriverWait wait=new WebDriverWait(driver, timeOut);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));		
}

public  void waitForFrameUsingWebelemnt(WebElement frameElement, int timeOut) {
WebDriverWait wait=new WebDriverWait(driver, timeOut);
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
}

//Title Utility

public  String waitForTitleContains(String titleFraction,int timeOut) 
{
	WebDriverWait wait=new WebDriverWait(driver,timeOut);
	 if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
		 return driver.getTitle();
	 }
	return null;
	
}

public  String waitForTitleToBe(String titleFraction,int timeOut) 
{
	WebDriverWait wait=new WebDriverWait(driver,timeOut);
	 if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
		 return driver.getTitle();
	 }
	return null;
	
}

//Url Utility

public  Boolean waitForUrlContains(String urlFraction, int timeOut) {
    WebDriverWait wait=new WebDriverWait(driver,timeOut);		
	return wait.until(ExpectedConditions.urlContains(urlFraction));					
	}
	
	public  Boolean waitForUrlToBe(String urlValue, int timeOut) {
	    WebDriverWait wait=new WebDriverWait(driver,timeOut);		
		return wait.until(ExpectedConditions.urlToBe(urlValue));					
		}


public Alert waitForJSAlert(int timeOut) {
	WebDriverWait wait=new WebDriverWait(driver, 10);
	return wait.until(ExpectedConditions.alertIsPresent());
	
	
}
public void acceptAlert(int timeOut) {
	waitForJSAlert(timeOut).accept();
}

public void dismissAlert(int timeOut) {
	waitForJSAlert(timeOut).dismiss();;
}

public String alertGetText(int timeOut) {
	Alert alert=waitForJSAlert(timeOut);
	String text=alert.getText();
	alert.accept();
	return text;
	
}
/**
 * An expectation for checking that an element is present on the DOM of a page. This does notnecessarily mean that the element is visible.

 * @param locator
 * @param timeout
 * @return
 * 
 this utility will give assurenace element is present inside DOm ,not on the page .So we want such it should be present on the page also. 
 So for that we have to create another utitlity
 */
public  WebElement waitForElementPresent(By locator,int timeout) {
	WebDriverWait wait=new WebDriverWait(driver, timeout);//return type of WebDriverWait is WebElement
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
}
//overirde same method polling interval
public  WebElement waitForElementPresent(By locator,int timeout,int intervalTime) {
	WebDriverWait wait=new WebDriverWait(driver, timeout,intervalTime);
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
}

public  WebElement waitForElemntVisible(By locator,int timeOut) {
	WebDriverWait wait=new WebDriverWait(driver, timeOut);//return type of WebDriverWait is WebElement
	return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

}

/*What do you mean by visibility of element?
 =>An expectation for checking that an element is present on the DOM of a page and visible.
 Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.

Q.difference between ElementPresent and ElemntVisible. which one we can prefer at selenium point fo view?
=>we can prefer visibilityOfElementLocated.
ElementPresent will check element is visible on DOm and
 ElementVisible will check element is prsent on  DOm+page both.
 */

//utility for element clickable : If element is clickable then only click on it
public WebElement waitForElementToClickable(By locator,int timeOut) {
	WebDriverWait wait=new WebDriverWait(driver, timeOut);
	return wait.until(ExpectedConditions.elementToBeClickable(locator));
	
}

public void clickWhenReady(By locator,int timeOut) {
	waitForElementToClickable(locator, timeOut).click();
}

//WebElements wait utility
public  List<WebElement> waitForElementsPresent(By locator,int timeOut) {
	WebDriverWait wait=new WebDriverWait(driver, timeOut);
	return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	
}

public  List<String> getElementsTextList(By locator,int timeOut) {
	List<WebElement>eleList=waitForElementsPresent(locator, timeOut);
	List<String> eleValList=new ArrayList<String>();
	for(WebElement e:eleList) {
		eleValList.add(e.getText());
	}
	return eleValList;
}

//u just want to print on the console
public  void printElementsTextList(By locator,int timeOut) {
	List<WebElement>eleList=waitForElementsPresent(locator, timeOut);
	for(WebElement e:eleList) {
		System.out.println(e.getText());
	}
}

public List<WebElement> waitForElementsVisible(By locator,int timeOut) {
	WebDriverWait wait=new WebDriverWait(driver, timeOut);
	return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
}
}

