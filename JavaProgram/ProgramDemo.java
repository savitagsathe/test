package JavaProgram;

import java.util.Scanner;

public class ProgramDemo {
	public static void main(String args[]) {
		/*
		1)user entered number is prime or not
		boolean flag=true;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		
		
		if(n<=2) {
			flag=false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%2==0) {
				flag=false;
			}
		}
		
		if(flag)
		
			System.out.println("number is prime");
		
		else 
			System.out.println("number is not prime");
			
			
			
			
			2)Reverse a given string
			
			String s="SAVITA";
			for(int i=1;i<=s.length();i++) {
				System.out.println(s.charAt(s.length()-i));
			}
			
			
			3)square pattern:
			
			**** 
            **** 
            **** 
            **** 

			
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		4)pattern 2:
		* 
        ** 
        *** 
        **** 
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	5)pattern 3:
	**** 
    *** 
    * 

	
 for(int i=3;i>=0;i--) {
	 for(int j=0;j<=i;j++)
	 {
		 System.out.print("*");
	 }
	 System.out.println(" ");

 }
		
		
6)Count no.of times letter 'A' has occurred in a given string

		int count=0;
		String s="savita";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='s') {
				count=count+1;//case sensitive
			}
		}
		System.out.println(count);
		
		
7)User entered number even or Odd

	Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		if(num%2==0) {
			System.out.println("number is even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		
8)Check whether the user entered number is armstrong or not  
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
int sum=0;
int rem;
int n=num;

while(num!=0) {
	rem=num%10;
	sum=sum+(rem*rem*rem);
	num=num/10;
}
		
	if(sum==n)	
		System.out.println(n+": is armstrong ");
	else
		System.out.println(n+": is not armstrong");
		
		
9)WAP to calculate sum of digits of the user entered number

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int sum=0,rem;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum of the given number digits:"+sum);
		
		
10)WAP to calculate the factorial of user entered number
		
		Scanner s=new Scanner(System.in);
		System.out.println("Eneter the number");
		int num=s.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

	10)WAP to calculate the divisors of number and print the sum of all its divisors.
	For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12.*/
	 int sum = 0,n=6;

     
     
     for(int i = 1; i <= n; i++) 
     {
          if(n%i==0)
          {
              sum=sum+i;
          }
     }
    System.out.println(sum);
}
}


