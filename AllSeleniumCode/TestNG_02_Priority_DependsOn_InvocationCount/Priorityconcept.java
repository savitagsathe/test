package TestNG_02_Priority_DependsOn_InvocationCount;

import org.testng.annotations.Test;

public class Priorityconcept {
	/* As i told we can write the testcases without precondition
	  - without priority testcases will run alphabetical order
	  -when given priority it will execute according to priority
	  
	  Q. Can we have '0' priority?
	  =>yes we have it so it execute 0->1->2 and so on
	  
	  Q.Can we have a -ve priority?@Test(priority=-1) is this allowed?
	  =>yes we have -ve priority as well .So it will execute -1->0->1->2->3.... and so on
	  
	  Q.can we have 2 zero ppriority?out of these 2 which one will get execute 1st?
	   =>If the two tescases having the same priority then it will pick on the basis of alphabetical order.So output will be 0(a)->0(b)->1->2 and so on...
	   
	   Q.five testcases are there 3 dont have priority and 2 have some priority .So testNG will pick priority based TC or non-priority based TC?
	   =>It will pick non priority based TC in thats also it will pick alphabetical order.and then it will pick priority based testcases.
	   
	   Q. So we really think the 0 and -ve priority questions are necessary?
	   =>first of all we never use -ve and 0 priority. for experiment point of view its fine you can do it. You have to specify priority like 1,2,3 .Naver use -ve and 0 priority
	   .Then 2 TC having same priority these are only interview point of view but in real use form 1 ,2,3 and so on....
	   
	   Q.we really need to define the priority?
	   =>I never prefer to use priority but,there are some rules are defined for unit level TC writing will talk later.
	 */
	
	@Test
	public void a_test() {
		System.out.println("a test");
	}
	@Test
	public void b_test() {
		System.out.println("b test");
	}
	@Test
	public void c_test() {
		System.out.println("c test");
	}
	@Test(priority=1)
	public void d_test() {
		System.out.println("d test");
	}
	@Test(priority=2)
	public void e_test() {
		System.out.println("e test");
	}
	
	

}
