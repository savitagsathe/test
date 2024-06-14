package sel16_CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
	static WebDriver driver;
	public static void main(String args[]) {
    driver=new ChromeDriver();
		
		/*
	CSSselcor -its a locator, not a attribute
	CSS never starts with // 2forward slash
	
	1)id : #{id}
	E.g : #input-email
	
	2)class: .className
	E.g : .form-control
	
	3)combine id and name
	.form-control#input-email
	#input-email.form-control  //reverse
	
	4)If multiple classes are there 
	.c1.c1.c1
	 .form-control.private-form__contro.login-email
	 
	 5)when u want to include html tag
	 htmltag#id
	 E.g: input#username
	 	
	 htmltag.className
	 input.form-control private-form__control login-email

	6)If i dont have any tag 
	htmltag[atrr='value']
	input[value='Login']          ------CSS
	//input[@value='Login']        --------xpath have 2 forward slash and @ symbol
	  
    7)Use multiple properties=>OR doesnt work dont use and or anything just use [] bracket
    input[value='Login'][type='submit']
    By.cssSelector("input[value='Login'][type='submit']");
    
    8)Contains function in CSS
    input[id*='email']       --------for contains * used
    input[value*='Login'][type='submit']
    
    9)Starts with in CSS
    input[id^='input']       --------for starts-with ^ used
    
    10)Ends with in CSS : we dont have in xpath but have in CSS
    input[id$='email']       --------for ends-wit $ used
    
    11)forward travers in CSS(parent to child)
    2things to remember : space between parent and child(direct+indirect)
                          use > special character between parent and child(direct child)
                          
    CSS selector from div to its immediate child
    div.private-form__input-wrapper>input             ------https://app.hubspot.com/login
    
    form#hs-login>div          --------8 direct div's
    form#hs-login div          --------20 div's direct+indirect div's(giving space after login)
    div.private-form__input-wrapper>input#password
    
    Q.Tell 3 character sequence for conatins,starts with and ends with in CSS
    =>for contains * used  for starts-with ^ used for ends-with ^ used
    
    12)backward traverse in css(child to parent)
    =>not allowed in CSS. This is the major limitation of CSS
    
    13)Comma in CSS : not available i xpath
    We can collect multiple different tag together 
    
    input#input-email,input#input-password,button.btn.btn-primary
    
    If i want to check username,password, login and button should be there in tat case you can use this to check madatory fields instead of creating seprate four webelements
    this is only fpor checking counts we cannot use .clcik/sendkeys here
    
    int empEleCount=driver.findElements(By.cssSelector("input#input-email,input#input-password,button.btn.btn-primary")).size();
	if(empEleCount==3) {
		System.out.println("Mandatory fields are present on the page");
	}
	
	14)Siblings in CSS:
	Following-sinlings:yes       + used for following siblings
	preceding-sibling:No
	
	div.private-form__input-wrapper+div   
	
	15)text() in CSS
	=>We dont have text() in CSS that is the major disadvantage in CSS
	
	
	ul.footer-nav li a
	ul.footer-nav a   //space means give me all direct and indirect 
	
	16)nth-of-type: for indexing:
	ul.footer-nav li:nth-of-type(2) a          //we wont prefer it bcoz in xpath we have better option using indexing/position
    
    //sometimes we want to check first value of the column in that case this is very useful.If u have scenario like that but,its CSS index point of view
     footer ul.list-unstyled li:nth-of-type(2)
     
     Q.difference between XPAth and CSS
     
                                 xpath                               vs                             CSS
     1.syntax:                   complex                                                        simple
     2.Function                  better                                                         limited-only contains,starts with
     3.backward traversing       possible                                                       NA
     4.Performance               good                                                           good
     
     -if we consider absolute xpath it will be always slow than css bcoz it will traverse html-body-div and so on..
     traversing will take time but these days xpath engines are very fast , in css it will not traverse that's why css are slightly faster than xpath.
     In these days xpath is lacking performance wise we will not see.
     
     
    justify in interview performancewise which is good?
     =>both are performancewise actually good. you can create a matrix somthing like this to expalin
     IE:
     //500 locators-----xpath(it will take 1hr/60min appro. after executing script)
     //500 locators-----css(will take 50min ) that could be possibility
         
     Chrome:
     
     //500 locators-----xpath(it will take 50min appro.)
     //500 locators-----css(will take 55min ) 
     
     Safari:
     //500 locators-----xpath(it will take 50min appro.)
     //500 locators-----css(will take 60min ) 
      
      Only for experiment point of view : After executing couple of time i found this result sometimes css is better and sometimes xpath is better.
      depending on your browser/ application sometimes css will take little bit less time but its not like that its taking 30min/  more time
     
     5.Webtable:               Much better support backward/forward/left/right traverse             limted options: only forward
     6.Dynamic Atrribute :     good                                                                 good
     7.element text:           available here(find the header or other text)                        NA
     8.Different tag           NA :cant combine different tag                                      comma feature              
     
	*/
	By.cssSelector("#input-email");
	By.cssSelector(".form-control");
	
	
}
}