package sel15_xpath_WebtableScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableTraverse {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]      //here only row number is getting changed and rest of the things are common
		
		/*
		 * String beforeXpath="//table[@id=\"customers\"]/tbody/tr["; String
		 * afterXpath="]/td[1]"; //excluded 2
		 * 
		 * int
		 * rowCount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size()
		 * ;
		 * 
		 * //for(int row=2;row<=7;row++)//hardcoded for(int row=2;row<=rowCount;row++)//
		 * now whatever row get added it will capture it { String
		 * compXpath=beforeXpath+row+afterXpath; //System.out.println(compXpath);
		 * //print the xpath String
		 * compText=driver.findElement(By.xpath(compXpath)).getText();
		 * System.out.println(compText); }
		 */
		
		//in the above for loop row count is static data we are not sure tomorrow it will increase or decrese so with the help of xpath we can get it dynamic
		
		//Q.Dont need to use any sibling concept .You have to find out the pattern from the table and break the pattern and traverse
        getTableData(1);
        getTableData(2);
        getTableData(3);
	}
	
	public static void getTableData(int coulmnNumber) {
		String beforeXpath="//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath="]/td["+coulmnNumber+"]";  
		
		int rowCount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		
		
		for(int row=2;row<=rowCount;row++)
		{
			String compXpath=beforeXpath+row+afterXpath;
			//System.out.println(compXpath);   //print the xpath
			String compText=driver.findElement(By.xpath(compXpath)).getText();
			System.out.println(compText);
		}
		
		//only explain this in interview .practically we dont use this for loop and all We can easiyly handle this sibling concept this is only for interview point of view
	}

}
