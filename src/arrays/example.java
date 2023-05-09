package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {90,100,50,7,150,10,10,30,50,13};
		
		Map<Integer, Integer> map  =new HashMap<>();
		for (int a: array) {
			if(map.containsKey(a)){	
				map.put(a, map.get(a)+1);
			}
			else {
				map.put(a,1);	
			}
		}
		System.out.println(map);
		
		Map<Integer,Integer> tree = new TreeMap<>(map);
		System.out.println("treemap" +tree);
		Set<Integer> s = new HashSet<>();
		for(Entry<Integer,Integer> m : map.entrySet()   ) {
			s.add(m.getKey());
		}
		System.out.println(s);
		
		Set<Integer> set =new HashSet<>();
		for(Integer i :s) {
			if(i%2!=0)
				set.add(i);
		}
		
		System.out.println(set);
		
	}

}
