package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Nonrepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabdccgebbd";
		//String s = "11110000116";
		
		List<Character> nondupChar =new ArrayList<>();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
		    boolean dupl = false;
		    for (int j = 0; j < s.length(); j++) {
		    	char c1= s.charAt(i);
		    	char c2 =s.charAt(j);
		        if (i != j && c1 == c2) {
		            dupl = true;
		            break;
		        }
		    }
		    if (! dupl) {
		    	Character c = s.charAt(i);
		    	System.out.println("printing non repeated"+s.charAt(i));    	//nondupChar.add(c);
		    	break;
		    }
		}
		
		///print non repeated elts
		        Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

		        for (int i = 0; i < s.length(); i++) {
		            if (m.containsKey(s.charAt(i))) {
		                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
		            } else {
		                m.put(s.charAt(i), 1);
		            }
		        }
		        for (Map.Entry<Character, Integer> hm : m.entrySet()) {
		            if (hm.getValue() == 1) {
		                System.out.println( hm.getKey());
		               // break;
		            }
		        }
	}

}
