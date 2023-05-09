package StringsPgm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateFromString {

	public static void main(String[] args) {
		 String str = "beautiful beach";
	      char[] carray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[j] + " ");
	               break;
	            }
	         }
	      }
	      
	      
//	      Map<Character, Integer> map = new HashMap<>();
//	      for(int i = 0; i<carray.length; i++) {
//	    	  if(map.containsKey(carray[i]))
//	    		  map.put(carray[i], map.get(carray[i]) + 1 );
//	    		else
//	    			  map.put(carray[i], 1 ); 
//	      }
//	      Set<Character> s=  map.keySet();
//	      for(Character c: s) {
//	    	  System.out.println(c);
//	      }
	}

}
