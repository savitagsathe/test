package TestNG_01_Annotations_SeleniumIntegration_BeforeTest_VS_BeforeClaa;

public class TestNGConcept1 {
	public static void main(String args[]) {
		/*
		 till now whatever code we are writing in the main method and executing it from the main method.
		 -src/main/java is for your utilites, for your logic
		 -Whenever you are writing the testcases in your framework that time you have to use src/test/java.
		 -In TestNG/Framework we never use Main method
		 
		 TESTNG: unit test framework to design the testcasesk(dev/automation QA)
		 TestNg is a unit Testing framework.specially designed for unit testing. Whenever developer writting a code
		 
		 -JUnit and TestNG both are the java specific unit testing framework.I cannot use testNG with C#,python,ruby
		 -for every programming language we have a specific framework. 
		 For example 
		 1)python: we use PyTest/UnitTest
		 2)PHP:PHPUnit
		 3)JavaScript:Mocha/Jasmine
		 4)C#:NUnit
		 
		 TesNg features:Library(jar):open source 
		 +selenium->UI automation
		 +Rest Assured->backEnd automation
		 +Appium->mobile automation
		 
		 1.multiple testcases
		 2.proiritize testcases
		 3.data provider+excel sheet
		 E.g: execute multiple testcase  .I want to do 10 registration you dont need to write different testcases for that one single testcase.provide the data through excel sheet.
		 4.HTML test result report
		 5.Custom report:Allure,Extent Report
		 6.dependency
		 7.test runner(testng.xml) E.g : Sanity, regression test runner
		 8.(multithreading)parallel execution-inbuilt threading
		 9.cross browser testing
		 10.logs
		 11.pre condition and post condition
		 
		 Installation:
		 1.add testNG lib. in pom.xml file-- to use testNG features
		 2.add testNg plugin in your eclipse--to run testcases->otherwise it will not give option "Run as TestNG"
		 3.
		
		 
		 
		 Q.can we perform  the testing using selenium?
		 =>selenium is not a testing tool.Selenium is just to simulate the things on the page you click on ,perform action , do a drag and drop or whatever you want to do
		 but end oof the day its your responsibility you have to test it .So to test it we will be using testng library for that.So thats why it can be integrated with selenium,
		 it can integraeted with your resAPI lets you are using restAssured,you can integrate with appium.
		 
		 -search google maven testNG dependency ->6.14.3 most stable version
		 -ctrl+shift+f for formatting
		 -it will give scope-test. means this tesng library you can use only for src/test/java.You cannot use under src/main/java.
		 That I dont want .I want to use this testng library under my main java.
		 also under my src test java also.So i dont want to use any scope dependency overhere just remove the scope
		 -refresh the project and check under the maven dependencies it got added and it means i can use all the testNG features now -> close it.
		 
		 TO ADD THE PLUGIN:
		 Go to Help->Install new software->you have to type url (search in google "testng eclipse url")->select https://github.com/cbeust/testng-eclipse->
		 scroll down ->we have to use (https://testng.org/testng-eclipse-update-site/6.14.3/)->copy and pate into the that url box ->next ->next->accept->install
		 
		 -In testNG we never use main method

		 
		 */
	}

}
