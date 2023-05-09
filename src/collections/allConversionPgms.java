package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class allConversionPgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring and initializing Array
	      String[] cities={"Boston", "Dallas", "New York", "Chicago"};

	      //Converting Array to ArrayList using Arrays.asList()
	      ArrayList<String> list= new ArrayList<>(Arrays.asList(cities));
	      
	      // Add more elements to the converted list
	      list.add("San Francisco");
	      list.add("San jose");
	      
	      // Print arraylist elements using for-each loop
	      System.out.println("list to arrayList"); 
	      for(String s : list) {
	        System.out.println(s);      
	      }
	    
	      
	      //Converting list to array
	      String [] arr = list.toArray(new String[0]);
	      System.out.println("list to array"); 
	      for(String s :arr){
	    	  System.out.println(s); 
	      }
	      
	      //string to character array
	      String str = "GeeksForGeeks";
	        char[] ch = str.toCharArray();
	        System.out.println("string to charcter array"); 
	        for (char c : ch) {
	            System.out.println(c);
	        }
	        
	        //char array to string
	        
	        //using charArray
	        char[] cha = {'w', 'e', 'l', 'c', 'o', 'm', 'e', ' ' , 't', 'o', ' ', 'J', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};  
	      String string = new String(cha);  
	      System.out.println("using char array to string"+string);  
	      
	      //using value of
	      String s = string.valueOf(cha);  
	    //prints the string  
	      System.out.println("using value of"+s);  

	      
	}

}
