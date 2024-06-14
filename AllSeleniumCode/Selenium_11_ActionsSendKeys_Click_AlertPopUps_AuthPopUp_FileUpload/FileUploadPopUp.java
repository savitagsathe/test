package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {
static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//type=file----is mandatory--should be in html DOM
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Admin\\Downloads");
		//autoit-windows-wont work on linux/docker
		//sikuli--image resolution--wont work on headless
		//robot--windows--wont work on linux/docker/headless
		
		
		
	}

}
/*
 
<input type="file"> input type =file attribute is compulsary in your DOM.otherwise it wont work
-99% this file type will be there if it is missing you have ask your developer add type="file" attribute.Selenium will automatically pick thus type=file
and attach the file.Otherwise you will stuck here.

        driver.findElement(By.name("upfile")).sendKeys("");
		//Q.Here what we can use sendkeys/click?
		=>We have to use sendkeys bcoz the moment you click on the button it will open the pop up and your script will fail.So using sendKeys we have to provide 
		the path of the file you want to choose C: or D:
		E.g:suppose i want to pass .png from my downoads we have pass that path here.you can upload any file .docx, excel,pdf ,image
		
		-This is the perfect solution for this. 
		-Now you have must heard third party tool like sikuly,Autoit, robot classes
		1)all these options are waste bcoz we have to use separate third party script and that scrpt will work for only windows.means it wont on linux machine
		-it wont work on your docker and these days everything is hosted on your docker and it willl not work on docker.bcoz docker is always linux based images
		-so autoit is the worst solution we are using it will never work on other laptop.It will work only in windows machine.
		
		2)Sikuli: Sikuli is again a 3rd party library its not a part of selenium.It will work on the image resolution but,image resolution can be different on my machine ,
		on other machine can be different.Sikuli will not work on the headless.So we dont prefer this solution.
		
		3)Robot class:Robot will work only for windows it will never work on docker,linux or any other headless mode.
		
		-we never use third party toll in real time application.Autoit in this days almost deprecated.just use robust solution that selenium is saying check the file type mandatory attributeand 
		pass the path. dont rely on 3rd party tool.This is for file upload pop up.
		
		Q.So people will ask you why don't you use Autoit?
		=>give the answer them bcoz it will not work on the linux/docker machine.Autoit is a 3rd party tool designed only for windows.On windows also
		most of the time it doesn't work and its having its own scripting language.So you have write script for that.Sikuli is always work on the image resolution it will not work 
		on the headless.for sikuli resolution should be perfect.You have to capture the screenshot everytime and then. Let's see the moment color is getting changed.instaed of this grey 
		color if change the color sikuli will not work.Sikuli will fail overthere and the Robot class is the worst solution.bcoz robot will work only for windows it will never work on docker,
		linux or any other headless mode.
		
		Q.how many pop up we have seen?
		=>1.JS pop/modal dialogue pop ups
		2.auth pop
		3.file upload
		4.frame is not a pop up its element we have to switch
		5.browser based pop up
		6.advertise based pop ups 
		browser and advertise based both pop ups are same for we are using window handler 
		
		Random pop up behaviour:
		Some random pop up is coming on prduction site .We dont know when it will come 10sec after one hour,2hour these kind of scenario are the blcking scenarion 
		I cannot handle it using selenium we have to use some external hack for that you have to keeep monitoring pop up is coming from server or not
		so certain scenario we never automate this is not a good candidate for automation.We dont automate such things bcoz you are not writting automation for 
		production site you are writing for DEV/QA site
		
*/