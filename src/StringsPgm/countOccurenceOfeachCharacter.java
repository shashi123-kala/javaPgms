package StringsPgm;

import java.util.HashMap;

public class countOccurenceOfeachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "SSDRRRTTYYTYTR";
	      HashMap <Character, Integer> hMap = new HashMap<>();
	      for (int i = str.length() - 1; i >= 0; i--) {
	         if (hMap.containsKey(str.charAt(i))) {
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++count);
	         } else {
	            hMap.put(str.charAt(i),1);
	         }
	      }
	      System.out.println(hMap);
	      
	      
	     //method 2
	      char array[] = str.toCharArray();
	      HashMap <Character, Integer> map = new HashMap<>();
	      for (char c : array) {
			if(!map.containsKey(c))
				map.put(c, 1);
			else {
				int value = map.get(c);
				map.put(c, value+1);
			}
		}
	      System.out.println(map);
	}

}
