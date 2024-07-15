
public class IdentifyCharNumInString {

	public static void main(String[] args) {
		//Code to identify characters and numbers in the String?
				//String str=”sadkjash2424egrg535”;
				
		String str = "sadkjash2424egrg535";
		        
		        StringBuilder characters = new StringBuilder();
		        StringBuilder numbers = new StringBuilder();
		        
		        // Iterate through each character in the string
		        for (char ch : str.toCharArray()) {//Converts this string to a new character array.
		            if (Character.isDigit(ch)) {
		                numbers.append(ch);
		            } else {
		                characters.append(ch);
		            }
		        }
		        
		        // Print the characters and numbers
		        System.out.println("Characters: "+ characters.toString());
		        System.out.println("Numbers: "+ numbers.toString());
		        
	}
}
