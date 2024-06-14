package testng_03_BaseTest_parameter_parallel_threadcount_dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TestNG_02_Testcase.BaseTest;

public class LoginNegativeTest extends BaseTest {
//how to write the dataprovider in TestNG. write extends BaseTest to execute the precondition
	
	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {      //this is staic -ve data is hardcoded taht is fine it will not change wil be same today,tomorow or later
			{"amit_khandagale1","Easy2023*"},
					{"amit_khandagale","Easy2023*"},
					{"","Easy2023*"},
					{"3434324@gmail.com","Easy2023*"},
					{" "," "}				
				
		};
	}
	
	@Test(dataProvider= "getLoginData")
	public void loginTest(String username,String password) {
		Assert.assertTrue(doLogin(username, password));//thuis is your test data not environment data
	}	
	public boolean doLogin(String username,String password) {
		driver.findElement(By.id("user-identifier-input")).clear();
		driver.findElement(By.id("user-identifier-input")).sendKeys(username);
		driver.findElement(By.id("Password")).clear();

		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("SignIn")).click();
		String error=driver.findElement(By.cssSelector("div.mt-1.validation-summary-errors")).getText();
		if(error.contains("Credentials supplied are invalid")){
			return true;
		}
		else
			return false;

	}
	
}
/*difference between test data and environment data?
 =>test data means username, password,nama ,number .Environment data means browser, url.Best practice is environment data should passs throgh TestNG parameter
 Test data should not pass through the testng parameter this is only only for environment specific/configuration data
 */
 