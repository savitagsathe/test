package sel8_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectHtmlTagDropDown {
	static WebDriver driver;
	public static void main(String args[]) {
		/*Select tag drop down means : 
		1.html tag=select : E.g: <select name="Country">
		2.use select class in selenium but that element should be select tag(under that option tag will be there) otherwise you cannot use that
		
		Q.Which one you can refer selectBYIndex or selectByVisibleText?
		=>selectByVisibleText is more preferable bcoz here exactly i know which value i want to select. Lets see india is available on 10th position and you are passing 10th index
		in selectByIndex. It will get selected without any problem .But what if tomorrow 2more countries got added so position of the india got shfted to 12 or any other index
		in that case instead of selecting the india it will select something else.so its not giving the desired output. So its always better to use "selectByVisibleText".
		its a case sensitive you have pass the exact value which are visible in the dropdown.
		
		Q.In which case we can use selectBYIndex?
		=>selectBYIndex generally we use for static dropdown E.g: month,year in that case if iam passing the 10 it always be october,if iam passing 1 it will always be jan
		in that case we can use selectByIndex without any problem. You can use the selectByVisibleText where the data is so dynamic.
		
		Q.Difference between select.selectByVisibleText and selectByValue ?
		=>selectByvalue value means it will work on attribute value E.g:<option value="India">India</option>
		visibleText means the text between the tag <>India<>
		
		-These 3 options selectByIndex(5),selectByVisibleText("India"),selectByValue("India") only for html "select" tag
		
		
		*/
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//WebElement country=driver.findElement(By.id("Form_getForm_Country"));
		
		//Select select=new Select(country);
		//select.selectByValue("India");
		//select.selectByIndex(5);//select by index
		//select.selectByVisibleText("India");
		//how to verify India got selected or not/Its india selected?Very important question for interview point of view=>there is one method getFirstSelectedOption()
		//return type of this method is 
		//String text=select.getFirstSelectedOption().getText();
		//System.out.println(text);
		//select.selectByValue("India");
		//selectByvalue value means it will work on attribute value E.g:<option value="India">India</option>
		
		
		/*What if there are 10 drop down are there bcoz this select class will work for only this country drop down
		 =>If there is another drop down then again i have to create one more select class.So for 10 drop down i have to create a 10 "Select" class*/
		
		//Utility call
		//By country=By.id("Form_getForm_Country");
		//doSelectByVisibleText(country, "India11");//If i pass India11 it will give nosuchElement Exception. Cannot locate element with text: India11
		//doSelectByIndex(country, 500);
		
		//utility call for value selected properly or not for drop down
		By country=By.id("Form_getForm_Country");
		doSelectByVisibleText(country, "India");
	}
//drop down utility for select class
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static boolean doSelectByVisibleText(By locator,String text) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
		return isDropDownValueSelected(select, text);
	}
	public static boolean doSelectByValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
		return isDropDownValueSelected(select, value);
	}
	//utility for to verify id correct value selected or not from drop down list
	//When the value and the visible text both are same then how to handle this=>using contains
	public static boolean isDropDownValueSelected(Select select,String expValue) {
		if(select.getFirstSelectedOption().getText().equals(expValue)) {
			System.out.println(expValue+": is selected");
			return true;
		}
		return false;
		
	}
}
