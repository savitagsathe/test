package TestNG_02_Priority_DependsOn_InvocationCount;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestEnableandDisable {
	/*
	 1.If u have 100TC and you want to execute only 10TC.So write for those 10TC as @Test(enabled=false).By default its true
	 2.Lets see you have 100 TC and this getUser is not working.I dont want to execute this its not ready /under development.So i will say dont participate in the execution
	 Mark it @Test(enabled=false). Do not coomment ,do not delete. Just mark it as @Test(enabled=false)
	 You can also directly write @Ignore to skip the TC /@Test(enabled=false). Both are doing same thing.
	 -If you really want to write some plane english description in that case you can write. you can write @Test(enabled=true, description="get user test for amazon app.....")
	 Its not cumpulsory its upto you write or not.Write only for true*/
	
	@Test
	public void createUserTest()
	{
		System.out.println("create user");
		
	}
	@Test
	public void updateUserTest()
	{
		System.out.println("update user");
		
}
	@Ignore
	@Test(enabled=true, description="get user test for amazon app.....")
	public void deleteteUserTest()
	{
		System.out.println("delete user");
		
}
	@Test(enabled=false)
	public void getUserTest()
	{
		System.out.println("get user");
		
}

}
