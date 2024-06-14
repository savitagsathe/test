package TestNG_02_Priority_DependsOn_InvocationCount;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	/*If you want to execute one testcase 10 times. We use InvocationCount.
	 Invocation means execution count. In selenium we never use this but in API if we want ot create number fo users back to back. then we use this same if we want 
	 to get user back to back then we use. Specially in case of performance  testing where we want to call user back to back. Means 100 times Iam hiting the server back to back 
	 and want to monitor the result.In taht case we can simple use like this.
	 In selenium we dont have such perfect usecase.
	 
	 */
	
	@Test(invocationCount=10)
	public void createUserTest()
	{
		System.out.println("create user");
		
	}

}
