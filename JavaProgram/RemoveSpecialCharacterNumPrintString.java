package test.JavaProgram;

public class RemoveSpecialCharacterNumPrintString {

	public static void main(String[] args) {
		//remove special character and number and print the string String str="Rajendra#$#automatomation$@%^123testing";
		String str="Rajendra#$#automatomation$@%^123testing";
		String result=str.replaceAll("[^a-zA-Z]","");
		System.out.println(result);
		
	}

}
