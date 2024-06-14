package TestNG_02_Priority_DependsOn_InvocationCount;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	/*DependsOn means if you want to create dependency between 2 TC.
	 If we execute below TC it will execute on the basis of alphabetic order.
	 If we specify the dependency then if the login page test pass then homepage and search test will get pass .If the logintest fail then homepage and searchtest
	 will get failed.Testng will not execute these 2 TC .Here it will not consider the alphabetic oreder.It will always execute the logintest first bcoz these 2 having
	 dependency on it
	 -Now logintest i will deliberately fail.If your logintest itself fail do you really want to execute other TC. No there is no point to execute
	 -So here if logintest failed it will show arithmetix exception and for other2 it will show skip the TC.
	 
	 //TC should be always independent with each other,do not create the dependency by 2 TC.It upto you in practical according to industry standard
	   whenever you are writing the TC it should be independent with each other. do not create unnecessary dependency between TC otherwise you have to update at all the places.
	   
	   
	 Q.In which case you have to use dependency?
	 =>CRUD. create/retrieve and update
	 
	 practically it is not advisable to create so many dependency 
	 
	 */
	
	/*@Test
	public void loginTest()
	{
		System.out.println("login test");
		int i=9/0;         //deliberately making fail
	}

	@Test(dependsOnMethods="loginTest")
	public void homePageTest()
	{
		System.out.println("homepage test");
	}

	@Test(dependsOnMethods="loginTest")
	public void searchTest()
	{
		System.out.println("search test");
	}

	
	//CRUD
	//utility
	public void userCreate(String name,int age) {
		System.out.println(name+""+age);
	}
	public void updateUser(String name,int age) {
		System.out.println(name+""+age);
	}
	
	public void deleteUser(String name,int age) {
		System.out.println(name+""+age);
	}
	
	public void getUser(String name) {
		System.out.println(name);
	}
	
	//1st approach- create and update user by dependsOnMethod =>if user creation done then only update user we can do
	/*@Test
	public void createUserTest()
	{
		System.out.println("create user");
		userCreate("tom", 25);//if user creation done then only update user we can do
	}
	@Test(dependsOnMethods = "createUserTest")
	public void updateUserTest()
	{
		System.out.println("update user");
		updateUser("Tom", 30);
		
	}*/
	
	
	//2nd approach : you have to create the user and use utility to update user and not creating any dependency between those.Industry standard always prefer this TC should be independent on each other
	//It means i dont want to create the user unnecessary I just want to update the same user with different data.What if create user is not working so i cant update as well.
	//but when i use update independent i can create the user &will update it.
	/*@Test
	public void createUserTest()
	{
		System.out.println("create user");
		userCreate("tom", 25);//if user creation done then only update user we can do
	}
	@Test()
	public void updateUserTest()
	{
		System.out.println("update user");
		userCreate("peter", 21);
		updateUser("peter", 30);
}
//same way want to use delete user
	public void deleteteUserTest()
	{
		System.out.println("delete user");
		userCreate("lisa", 21);
}
*/
	
}
