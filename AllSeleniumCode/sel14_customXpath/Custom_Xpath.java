package sel14_customXpath;

public class Custom_Xpath {
	/*1. Contains function: used for dynamic elements:dynamic attributes
	2.Syntax : //htmltag[contains(attribute name @id,'value')]
	
	when we using contains function we have to use , but in text function we are using =
	E.g: //input[contains(@id,'input-email')] but here if we write //input[contains(@id,'input')] It will give 2. If we write //input[contains(@id,'email')] will give 1
	
	Q.What is Dynamic element?
	=>after somedays UI dev changed the Id like 
	input -email
	login-email
	
	So before hyphen contents are getting changed but after hyphen contents are constant .So in this case we can use "Contains()"
	E.g: //input[contains(@name,'em')]
	
	With and without contains 2attribute combine
	syntax: //input[contains(@id,'value') and @name='email']
	//input[contains(@id,'email') and @name='email']
	 
	 Xpath on placeholder using contains:
	 //input[contains(@id,'email') and @name='email' and contains(@placeholder, 'Address')]
	 //input[contains(@id,'email') and @name='email' and contains(@placeholder, 'E-Mail')]      //give the exact placeholder value
	 
	 having both contains in a xpath:
	  //input[contains(@id,'email' ) and contains(@placeholder,'E-Mail ')]
	 
	 2)text(): used for links,labels,span,div,header. Here html tag doesnt matter it could be anything u can use.When no id,name  or nothing attribute available use text()
	 syntax : //html tag[text()='value']
	 E.g: //h3[text()='Set up your contact center in just a few hours']     //xpath where i want create basis of text on the application
	 //h3[text()='Import & Export']
	  //a[text()='Recurring payment']
	   
	   On your aplication there are 2 forgotton password links are there .then you have to use index/ position function.
	   you can use any of them but better to use positioning
	   (//a[text()='Forgotten Password'])[position()=2]     //position
	   (//a[text()='Forgotten Password'])[2]                //index
	   
	   3)Text() and contains together : suppose you want to find the text "Delight your"  in the overall page/at header then use this
	   //h2[contains(text(),'delight your')]     //https://www.freshworks.com/
	    
	4)contains with text and attribute E.g: link having attribute and text also
	//htmltag[contains(text(),value) and @attr='value']      //do not forgot to write @ for attribute
	 //URL : https://demo.opencart.com/ ->login
	E.g :   //a[contains(text(),'Login') and @class='dropdown-item']
	
	5)contains with attribute
	 //URL : https://demo.opencart.com/ ->login
	//a[contains(text(),'Login') and @class='dropdown-item' and contains(@href ,'account/login&language=en-gb')]
	
	6)text without contains and 2 attribute, with contains and  attribute
	//a[text()='Login'and @class='list-group-item' and contains(@href ,'account/login&language=en-gb')]
	 
	 We have OR operator as well but it will give all the matching value
	  
	 Q.diference between startWith and contains
	 =>start means it should start with exactly same contents but contains means in the string anywhere present
	 
	 ends with is not supporting now for many browsers stopped it so dont use it
	 
	 7)xpath with classes 
	By.xpath(" //input[@class='form-control private-form__control login-email']");//right one
	By.className("//input[@class='form-control private-form__control login-email']");//wrong one it has 3 classes required unique one. you cannot enter multiplre classes in th By.classname
	but in cssselector we can use
	By.className("login-email");//right one used unique class
	By.cssSelector(".form-control.private-form__control.login-email");//right start with . and replace all the spaces with dots
	
	Generally we dont prefer this xpath if we dont have any other attribute then we can use. Will ask in interview .In xpath and CSS we can take anything but in classname we cannot take multiple classes together.
	
	
	8)Parent,child and sibling concept:
	url:https://demo.opencart.com/index.php?route=account/login&language=en-gb
	i)Parent to direct child
	//div[@class='mb-3']/input[@name='email']  ------- (/forward slash)single slash will give u direct child
	 
	//div[@class='mb-3']//input[@name='email']  ------- double slash will give u direct+indirect child.
	 Here its giving the one of one bcoz it hsa only one child here
	 
	 I dont want to use single/double forward slash i want to use keyword
	 //div[@class='mb-3']/child::input[@name='email']
	   //div[@class='mb-3']//child::input[@name='email']    single/double forward slash both will work same we r specifying child
	 
     9)Child to parent : in xpath we can traverse by backward direction but in CSS we cant
     a)practically we dont use it but its interview question
      Q.from the specific element you have to goto the top of the element how will u go?
      =>using /..
     //input[@name='email']/../../../../../../../../../../../..     to its immdiate parent  
      
      but i dont want to use /..(//.. both are same) i want to use keyword here
      
     b) child to parent with keyword
      //input[@name='email']/../../../../../../../../../../../..                ---- not more readable
     //input[@name='email']/parent::div                  -----prefer this one
here both are going to the parent which one u can prefer second one is more redable but first going to its immediate parent but iam not sure it is div or anyother by looking at the code.
      
     c)one more parent with keyword
     //input[@name='email']/parent::div/parent::form  
      
       
      d)ancestor means give me all the grand div parents who are coming from the same hierarchy not only immediate parent div.you can give any tag.generally we dont use this
      //input[@name='email']/ancestor::div
      
	e)go to sibling : there are 2 types of sibling 1)preceding-sibling 2)following-sibling
	1)Preceding sibling : there is a keyword preceding-sibling => going backward to the sibling
	//input[@name='email']/preceding-sibling::label
	
	2)following-sibling
	//label[@for='input-email']/following-sibling::input
	 
	 usecase: I want want to verify the lable for this email input box so can use gettext and get the text for this
	 
	Q.you have to start with the lable and you have to goto the its input with its following sibling without using following/preceding sibling
	<div>
	<label>
	<input>
	</div>
	=>go to its parent->then jump to its input child
	//label[@for='input-email']/../input      
	//label[@for='input-email']/parent::div/child::input    using keyword
	
	10)Webtable handling: URL https://classic.crmpro.com/
	//a[text()='pqr test']/parent::td/preceding-sibling::td/input[@type='checkbox']   //here checking check box
	 This will work for all other element just need to change the "name"
	 
	 //now want to check particular person with name and which company working
	  //a[text()='pqr test']/parent::td/following-sibling::td/a[@context='company']
	
	*/

}
