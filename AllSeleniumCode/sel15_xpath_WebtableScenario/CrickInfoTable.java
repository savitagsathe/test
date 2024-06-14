package sel15_xpath_WebtableScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrickInfoTable {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/new-zealand-in-bangladesh-2021-1272089/bangladesh-vs-new-zealand-5th-t20i-1272097/full-scorecard");
		
	}

}
