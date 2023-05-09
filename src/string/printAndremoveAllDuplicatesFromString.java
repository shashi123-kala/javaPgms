package string;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class printAndremoveAllDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "aabbccdefatafaz";

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
		
		
		//method 2
		char [] array = string.toCharArray();
		Map<Character,Integer> map= new HashMap<>();
		String str = "";
		for(int i= 0; i<array.length;i++) {
			if(map.isEmpty()) {
				map.put(array[i],1);
			}
			else {
				if(map.containsKey(array[i])) {
					int k =map.get(array[i])+1;
					map.put(array[i],k);
				}
				else {
					map.put(array[i],1);
				}
			}
		}
		
		Set<Character>strSet = map.keySet();
		System.out.println(strSet);
		
	}

}
