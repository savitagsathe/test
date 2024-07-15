import java.util.ArrayList;
import java.util.HashMap;

public class NonrepeatingElementsInAnArray {

	public static void main(String[] args) {
		
			 int[] arr = {12, 16, 12, 16, 3, 1, 3, 2};
			//create the hashmap to store the count of each element
			
			HashMap<Integer, Integer> elementCount=new HashMap<>();
			
			// Count the occurrences of each element
			for(int num:arr) {
				elementCount.put(num, elementCount.getOrDefault(num,0)+1);
			}
			// Create a list to store non-repeating elements
			ArrayList<Integer>nonReapitingElements=new ArrayList<Integer>();
			
			// Find the non-repeating elements
			for(int num:arr) {
				if(elementCount.get(num)==1) {
					nonReapitingElements.add(num);
				}
			}
			
			// Print the non-repeating elements
			System.out.println("non repeating elements are:"+nonReapitingElements);
			
			

	}

}
