package JavaProgram;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[])
	{
		/* 
		  /*==========PROGRAM 1 : WAP to compute quotient and reminder=============*/
		/*int dividend=30;
		int divisor=5;
		
		int quotient=dividend/divisor;
		System.out.println("quotient="+quotient);
		
		int reminder=dividend%divisor;
		System.out.println("Reminder is:"+reminder);
		
		
		for(int i=3;i>=0;i--)
		{
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		 
		 
		 
		
		
		
		/* Program2: find out given number is even/odd number
		//int num=10;//given number
		//number at runtime/user input
		Scanner s=new Scanner(System.in);//scanner to get the input from user through keyboard
		System.out.println("Enter the number");
		int num=s.nextInt();//return the user input as integer
		if(num % 2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("number is odd");
		}*/
		
		/*Program 3 : WAP to count no. of times letter A has occured in a given string
		
		int count=0;
		String s1="sathe";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a')
			{
				count=count+1;
			}
		}
		System.out.println("count of A is:"+count);  */
		
		
		/*PROGRAM4: WAP to palindrome number
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int n=num;//used at last time check
		int reverse=0,reminder;
		
		while(num>0)
		{
		  reminder=num%10;
		  reverse=reverse*10+reminder;
		  num=num/10;
		}
		if(reverse==n)
		{
			System.out.println("numer is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}*/
		
		/*PROGRAM5 : ARMSTRON NUMBER 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int n=num;
		int rem,sum=0;
		
		while(num!=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		
		if(sum==n)
		{
			System.out.println("number is armstrong");
		}
		 
		else
		{
			System.out.println("number is not armstrong");
		}*/
		
		/*PROGRAM6 : sum of digits 
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		int rem,sum=0;
		
		do
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		while(num!=0);
		System.out.println("sum of digit is:"+sum);*/
		
		/*PROGRAM7 : Factorial of number 
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number is:"+fact); */
		
		/*PROGRAM8 : largest number among three 
		int num1=10,num2=5,num3=100;
		if(num1>num2&&num1>num3)
		{
			System.out.println("num1 is greater");
		}
		else if(num2>num3)
		{
			System.out.println("num2 is greater");
		}
		else
		{
			System.out.println("num3 is greater");
		}*/
		
		/*PROGRAM9 : check whether an alphabet is vowel or consonent 
		char ch='a';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Alphabet is vowel");
		}
		else
		{
			System.out.println("entered alphabet is consonent");
		}*/
		
		/*PROGRAM10 : SWAP two numbers 
		int a=10,b=20,temp;
		System.out.println("a and b before swapping");
		System.out.println("a is:"+a);
     	System.out.println("b is:"+b);
		
     	
     	System.out.println("After swapping:");
		 temp=a;
		 a=b;
		 b=temp;
		 
		 System.out.println("a="+a);
		 System.out.println("b="+b);*/
		
		/*PROGRAM 11 : WAP to find ASCII value of a character
		char ch='a';
		int asciiNumber=(int)ch;
		System.out.println("Ascii value of a="+asciiNumber);*/
		
		/* Program12 : reverse given string
		  
			String s="Savita";
			for(int i=1;i<=s.length();i++)
			{
				System.out.print(s.charAt(s.length()-i));
			}*/
			
			
		
		/*PROGRAM 13 : WAP to check given string is palindrome or not*/
		String s="madam";
		String rev="";
		for(int i=1;i<=s.length();i++)
		{
			//System.out.print(s.charAt(s.length()-i));
			rev=rev+s.charAt(s.length()-i);//reverse the String
			
		}
		System.out.println(rev);
		
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Given string is palindrome");
			
		}else {
			System.out.println("Given string is not palindrome");
		}
	}
	
}


