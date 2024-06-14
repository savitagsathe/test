package sel9_dropdownSelect_validation_jqueryDrop_Multiselect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();//here if we write WebDriver drier whole and class level also declare then it will give Null pointer
	   
		//driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		//driver.findElement(By.id("justAnInputBox")).click();
		//List<WebElement>choiceList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		//By choices=By.xpath("//span[@class='comboTreeItemTitle']");
		//TC_01 single selection
		//selectChoice(choices,"choice 4");
		//TC_02 multi selection
		//selectChoice(choices, "choice 3", "choice 4","choice 5","choice 7");//if i write... in string parameter it will not give any eror but if we remove then it will give
		//this is the bad approach calling same function multiple times what if i have 10 or 100 choices to select
		//=>using  String dot parameters.Its not a normal variable its a array variable .Its very famous concept
      		
        //TC_03 All selection
		//selectChoice(choices,"ALL");
}

public static void selectChoice(By locator,String ...value) {
	List<WebElement> choiceList=driver.findElements(locator);
	if(!value[0].equalsIgnoreCase("ALL")) {
	for(int i=0;i<choiceList.size();i++) {
		String text=choiceList.get(i).getText();
		System.out.println(text);
		
//		if(text.equals("choice 5")) {
//			choiceList.get(i).click();
//			break;
//		}
		
		for(int j=0;j<value.length;j++) {
			if(text.equals(value[j])) {
				choiceList.get(i).click();
				break;
			}
		}
	}
}
	else {
		//select all choices:
		try {
			for(WebElement e: choiceList) {
				e.click();
			
		}
		}catch(Exception e) {
			System.out.println("All choices are selected.......");
		}
	}
	}



}
