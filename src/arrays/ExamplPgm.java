package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExamplPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 100);
		map.put(5, 500);
		map.put(3, 300);
		map.put(10, 200);
		map.put(8, 800);
		map.put(2, 240);
		
		List<Integer> list = new ArrayList<>();
		
		for(Entry<Integer,Integer> m : map.entrySet()) {
			list.add(m.getKey());			
		}
		
		System.out.println(list);	
		int i= 3;
		int j=4;
		swap(list,i,j);
		

	}
	
	public static <E> void swap(List<E> list, int i, int j) {
	    E e = list.get(i);
	    list.set(i, list.get(j));
	    
	    System.out.println("after swappling" +list);
	    list.set(j, e);
	}

}
