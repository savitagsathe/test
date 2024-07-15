package JavaProgram;

import java.util.HashMap;
import java.util.Set;

public class DuplicateStringWordcount {

	public static void main(String[] args) {
		 // Input string
	     String input = "pythpn is not best language but java with selenium is a language taking interview of selenium";

	      Convert input string to lower case to make the comparison case-insensitive
	    // input = input.toLowerCase();

	     // Split the input string into words
	     String words[] = input.split("\\s+");
	      //For Q2.Java program to find duplicate words in a string array: String[] arr = {"India", "England", "China", "US", "UK", "India", "China"};
	     // use same code but use following array declaration and comment above code
	      //String[] words = {"India", "England", "China", "US", "UK", "India", "China"};

	  // Use a HashMap to count the occurrences of each word
	     HashMap<String, Integer> wordCount=new HashMap<String, Integer>();
	     
	     //to check each word in given array
	     for(String word:words) {
	    	 //if word is present
	    	 if(wordCount.containsKey(word)) {
	    		 wordCount.put(word,wordCount.get(word)+1);
	    	 }else {
	    		 wordCount.put(word, 1);
	    	 }
	    		 
	     }
	     
	     //extracting all the keys of map-wordcount
	     Set<String>wordsInString=wordCount.keySet();
	     
	  // Print the words that have a count greater than 1 (i.e., duplicates)
	     for(String word:wordsInString) {
	    	 
	    	 if(wordCount.get(word)>1) {
	    		 System.out.println(word+ ":" +wordCount.get(word));
	    	 }
	    	 
	     }
	     
		
	}	
		
		
		
		
		


	}


