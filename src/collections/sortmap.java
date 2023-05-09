package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> unsortedMap = new HashMap<>();
		
		unsortedMap.put("Apple", "Apple");
		unsortedMap.put("guava", "guava");
		unsortedMap.put("Banana", "Banana");
		
		for(Map.Entry<String, String>entry:unsortedMap.entrySet()){
			System.out.println("unsorted key value"+ entry.getKey());
		}
		Map<String,String> treeMap= new TreeMap<>(unsortedMap);
		for(Map.Entry<String, String>entry:treeMap.entrySet()){
			System.out.println("sorted key value"+ entry.getKey());
		}
		System.out.println("tree map" +treeMap);
		
		System.out.println("intger"+"==============================");
		//for integrt
		Map<Integer, String> unsortedIntMap = new HashMap<>();
		unsortedIntMap.put(20, "Apple");
		unsortedIntMap.put(10, "guava");
		unsortedIntMap.put(5, "Banana");
		
		for(Map.Entry<Integer, String>entry:unsortedIntMap.entrySet()){
			System.out.println("unsorted key value"+ entry.getKey());
		}
		Map<Integer,String> treeIntMap= new TreeMap<>(unsortedIntMap);
		for(Map.Entry<Integer, String>entry:treeIntMap.entrySet()){
			System.out.println("sorted key value"+ entry.getKey());
		}
	}


	}


