package Sel05_DifferentLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	static WebDriver driver;
	
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//driver.get("https://demo.opencart.com/index.php?route=account/register");
		//driver.get("https://www.freshworks.com/");
		
		
		driver.get("https://platform.easycrypto.co.za/login");
		String text=driver.findElement(By.tagName("p")).getText();
		System.out.println(text);
		
		/*1.Id is a unique locator.
				//means whenever you are inspecting if id is available the same id will not be used for any other element.
				//Eg: If i go to registration page if one id is used for firstName same cannot be used for lastName.So ids are always a unique locator.
			driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium12345");
		-------------------------------------------------------------------------------------------------------------------------------*/
		
		/*2.Name: can be duplicate
				//its a not unique locator it can be duplicate but its a rare chance. Generally developer always follow a unique name for id and name .But still name can be duplicate
		        //if id is not available but name is available in that case we can use name.We can use id and name in combination.Lets i will use name for firstname and id for lastname.
				
				//Approach2 : when you want design the proper framework and library use this approach   
		
		
		By fn=By.name("firstname");//it was giving "no such element exception" bcoz url was till the login but this is on the register page.Changed url till register to work it
		By ln=By.id("input-lastname");
		
		//driver.findElement(fn).sendKeys("Savita");
		//use utility approach
		ElementUtil elementUtil=new ElementUtil(driver);
		elementUtil.doSendKeys(fn, "tom");
		elementUtil.doSendKeys(ln, "peter");
		
		if Id and name both are available we prefer id
		driver.findElement(By.name("firstname")).sendKeys("naveen");//when you are checking written script working or not use this to quick check
		it was giving "no such element exception" bcoz url was till the login but this is on the register page.Changed url till register to work it
		------------------------------------------------------------------------------------------------------------------------------*/
		
	/*  3. className: most of the times are duplicate attribute
	 
		//E.g: In register page of demo.opencart there is a same class for firstname and lastname.Classname is a css(Cascading style sheet) property.
		 Along with the html you have to provide some CSS it will provide some look and fill like color,height,width. See in the register page all the elements having 
		 same hieght,width ,border and color that means developer provided one CSS 
		 i.e. class="form-control" and attached to the input field.//this is a single class. whenever there is a space between classname then its a multiple classes bcoz clasname dont have space
		 class="btn btn-primary" //this is a double class. So particular element can have single or multiple class and that class attribute can duplicate
		 
		 Q.Is it a risky element/attribute?
		 =>yes of course .Whenever you are creating webelement with the help of classname  
		 you should use the className when you have unique className.Most of the times its a duplicate.
		E.g:
		driver.findElement(By.className("form-control")).sendKeys("savi");
		// here so many elements having the same classname "form-control" so instead of entering name into.
		//firstname field  its entering into the search bcoz its found first.It will start top to bottom.so dont use classname usually.
		 there are some usecases for classname we will see later
		  
		 ------------------------------------------------------------------------------------------------------------------------------*/
		
	/*  4.xpath: is a locator.Xpath is an address of the element inside the DOM
	 
		//xpath is not a attribute means its never used = to this like type="text" and class="".Class ,type,name is attribute and their value, but xpath not.
		
		Q.if there is a id and xpath which one you can prefer? 
		=>Id always bcoz dont create unnecessary complex thing if unique id available.
		
		Q.which one will take time id or xpath?
		=>Obviuosly xpath bcoz here star means find all the element present on the page so it will search over the DOm like sql query.
		//so id will take few seconds only .It will directly go there for that id.If xpath taking 3sec then id will take 0.3sec.
		 So its a bad approach if you are using unnecessary xpath if id is already available.
		 
		 You can quick validate your xpath just right click on element and copy .Press the ctrl+f on chrome and paste intpo search and validate its one of one or not
		
		E.g:
		driver.findElement(By.xpath("//*[@id='input-firstname']")).sendKeys("savi");//just right click and copy xpath for today
		-----------------------------------------------------------------------------------------------------------------------------*/
		
	/* 5.CssSelector: not a attribute---its a locator---its not a address of the element
		 
		CSS-Cascaded style sheet.Today just inspect->right click on the dom and copy Selector we will see later how to create the Cssselector
		 
		Q.Which is Easy Xpath or CssSeletor?
		=>CssSelector are easy as compared to xpath.
		
		Q.Which one you can prefer between CSS and xpath?
		=>in this days xpath also having better engine.both having its own advantages but xpath having more powerful features than CSS we will talk 
		about it later.
		
		Q.between id and cssselector which one prefer?
		=>id only
		E.g: driver.findElement(By.cssSelector("#input-firstname")).sendKeys("savita");
		-------------------------------------------------------------------------------------------------------------------------- */
		
	/*  6.linkText: only for links-->html tag:<a>---anchor tag
		
		all the links are associated with 'a' tag. whenever link is there href tag should be there.If href property is not there it looks 
	    link but that link will not be clickable .Its a broken link sometime.Every link having some text.If there is no anchor tag I cannot use the
		linktext tag.Sometimes it looks like button but internally its a link.The property of link is its always clickable.
		
		E.g:
		driver.findElement(By.linkText("Login")).click();
		-------------------------------------------------------------------------------------------------------------------------------*/
	
		
		/* 7.Partial LinkText only for links-->html tag:<a>---anchor tag-->not recommended
		 
		Having the same properties like linkText.Partial linkText means that partial part of the link you can pass.In this selenium wil check on the page from top to bottom 
		where is the text starting with "delivery" the moment it find it will click on that link.
		
		disadvantage: There 3 text written in the sequence Delivery Process, Delivery test and Delivery Information. I am using Delivery text and i want to click on 
		Delivery Information once we run the script it will click on the Delivery Process instead of Delivery Information bcoz it will found first.So its a risky appproach.
		So better to use linkText().
		
		Use: Partial link text help you in those cases where paragraph have written and this entire paragraph is behaving like a link.So to use the linktext you have to copy whole paragraph
		and paste into linktext it will look ugly.So we can use partaillinktext .In modern application there is no huge paragraph with link,but still if there any entire paragraph is 
		behaving like a link so you cannot use entire paragraph as linktext just pass the partial part in the element locator.
		
		Q.which one we will use Linktext/PartialLinkText ? 
		=>we always use Linktext.Partiallinktext is only long link text which is very rare case.they have given this option just remember this.
		
		E.g:
		driver.findElement(By.partialLinkText("Delivery")).click();
		  
		 ------------------------------------------------------------------------------------------------------------------------------ */
	

		/* 8.tagName:its a any html tag.you can pass any html tag
		 
		we can use tagname with getText ,total number of links,total number of images on the page.Its not the locator which is frequently used its having 
		its own purpose mostly used when we want the element together.Can we use input tag here we can but there is many duplicate input tags so there is no point
		to use the input tag it is always for unique tag like h2 headers. thats why the scenario and usecases are different for tagName.
		
		Eg:
		String header=driver.findElement(By.tagName("h2")).getText();//here we are not using click,sendkeys but we are using getText() 
		//return type of getText is a String .So we are storing into string value
		System.out.println(header);
		 */
		
		
		/* Q.What is Webdriver and How many locators are there in the selenium ? frequently asked questions
		 * =>There are 8 locators along with the name it should in your finger tip.id,name,class,css,xpath,linktext,partialLinkText and the tahgName
		 
		Q.Tell me the preference of the locator.What will you prefer?
		=>1)ID: first priority given to ID if Id is there forget about everything but,Id could be dynamic also.
		
		what do you mean by dynamic id?
		=>Suppose there is a id firstname_456 and you will use the by.id("firstname_456") once you run the will this works?=>no 
		next time when you run the script if you did the refresh id will get changed and script will not run.In that case to handle the dynamic id we have to use xpath and CSS 
		selector.But here we are talking about uinque and static id remember this thing.here you can directly use static means id is always constant means for every page refresh 
		id will remain the same.So the first preference will be given to the id.
		
		2)NAME: Second preference i will go with the name .
		
		3)XPATH AND CSS: then the 3rd is xpath and CSS with same preference .Both are the ssame level.
		
		4)CLASSNAME: But in the 4th ClassName i will go.
		
		Q.if id and linkText is available which one you will prefer ?
		=>Id is always unique ,Linktext may be duplicate its not always linktext will be unique.So i will prefer id but the problem with id is its available very rare in links.
		Hardly you will see the id for links very rare its available.99% id will not be available in that case you have to use exact text of the links available or any other 
		strategy like xpath&CSS. So there no comparison between id and linkText.If you still want to use that you cannot compare linkText with id, xpath or CSSSelector.
		people will generally ask regarding first 5 locator id,name,ClassName,xpath and CssSelector. LinkText and PartialLinkText are only for links do not compare with other locators
		
		Q.between linktext and partialLinkText which one you cane prefer?
		=>always go with the linktext .PartialLinktext will not be recommended.
		
		Q.Can we compare tagName with other locators?
		=>no bcoz its totally different concept.so not compare with any other locators.
		
		These are the differences you can tell with examples.		
		----------------------------------------------------------------------------------------------------------------------------------------------------------------*/

		/*We have created generiic function for sendKeys but we havent created it for click(). Otherwise we have to write same code again and again for click
		 
		 

	*/
		By customers=By.linkText("Customers");//if you write small letter it will not work
			
			By header=By.tagName("h2");
			String headerText=doGetText(header);
			System.out.println(headerText);
			
			doClick(customers);
		    
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	/*public static WebElement getElement(By locator){
		 return driver.findElement(locator);
		 }*/
	//dont you think its a right candidate for elementUtil.So move this to ElementUtil
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	//can we create the custom method for getText bcoz if there 100 elements then 
	public static String doGetText(By locator) {
		return getElement(locator).getText();
		
	}
	
	public static WebElement getText(By locator) {
		return getElement(locator).getText();
	}
    
}
