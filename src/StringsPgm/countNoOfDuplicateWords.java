package StringsPgm;

import java.util.HashMap;

public class countNoOfDuplicateWords {
	public static void main(String[] args) {
		String str = "god is great god is ganesha";
		String splitStr[] = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for(String s1: splitStr) {
		//	if(map.get(s1)!=null) {
				if(map.containsKey(s1)) {
				map.put(s1, map.get(s1) + 1);
				
			}
			else {
				map.put(s1, 1);
			}
		}
		
		System.out.println(map);
	}

}
