package TestNG_02_Priority_DependsOn_InvocationCount;

import org.testng.annotations.Test;

public class ExpectedExcetionConcept {
	String name="JAVA";
	/*
	 We are executing this code and we are getting arithmetic exception,ArrayIndexOutOfBoundException or any kind of exception. So here we know this is the expected
	 arithmetic exception os there so we can write expected Exception.
	 */
	
	//@Test(expectedExceptions = ArithmeticException.class)
	@Test(expectedExceptions = { NullPointerException.class,ArithmeticException.class})
	public void createUserTest()
	{
		System.out.println("create user");
		int i=9/0;  //Expected exception of type class java.lang.NullPointerException but got java.lang.ArithmeticException: / by zero.So we have to use 2 exception together
		
		ExpectedExcetionConcept obj=new ExpectedExcetionConcept();
		obj=null;
		System.out.println(obj.name);//NPE 
		
		/*real time usecase:
		 Whenever you are expecting your element should not be dispalyed means if u want to fail your testcase
		 For unit testing point of view developers are writting if there is no data available they are expecting null pointer/arithmetic excetion .So
		 they are deliberately failing the testcases.
		 1.But automation point of view we dont prefer this why bcoz if there is nothing 
		 available there should be bug E.g: why frgot password is not available
		 2.We have a 100 TC and we have demo in 1hr and some of the testcases are not working suddenly.What we can do?
		 =>simple write Exception.class all the testcases will get pass whether it isworking or not bcoz we want to send only green report to client.
		 But dont do this everytime its only for emergency.
		 
		 @Test(expectedExceptions =Exception.class)
	public void UserTest1()
	{
		System.out.println("create user");
		int i=9/0;
		
	}
		  */
		
	}
//here its giving arithmetic but we are writting NullPointerException it will pass/fail?
//	=> fail. Expected exception of type class java.lang.NullPointerException but got java.lang.ArithmeticException: / by zero
	@Test(expectedExceptions = NullPointerException.class)
	public void createUserTest1()
	{
		System.out.println("create user");
		int i=9/0;
		
	}
	

}
