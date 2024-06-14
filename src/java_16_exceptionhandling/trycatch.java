package java_16_exceptionhandling;

public class trycatch {
	public static void main(String args[]) {
		System.out.println("A");
		
		try{
			int i=9/0;//it will throw devide by zero exception and it will not execute further code after line 7 
		}
		catch (Exception e) {
			e.printStackTrace();//it will give info about what kind of exception is coming
		}
		
		//we have to handle it .So We have to write the code inside the try block which is giving exception.
		System.out.println("B");
	}

}
