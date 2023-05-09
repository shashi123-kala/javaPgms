package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayContainsDuplicate2 {

	public static void main (String args[]){
		int dupList[] ={10,20,30,30,10,40,20,30,100,100,1,7};
		List<String> dup =new ArrayList<>();
		
		
		
		// 1. printing duplicates in int array
		for(int i=0; i< dupList.length;i++){
			for (int j=i+1 ; j < dupList.length;j++){
				if(dupList[i]==dupList[j]){
					String a= String.valueOf(dupList[i]);
					dup.add(a);
				}

			}
		}
		System.out.println("printing duplicates in integer array"+dup);
		
		Map<Integer,Integer> map = new HashMap<>();
		for(Integer i:dupList) {
			if(map.isEmpty())
				map.put(i, 1);
			else {
				if(map.containsKey(i)) {
					map.put(i, map.get(i)+1);
				}
				else {
					map.put(i, 1);
				}
			}
		}
		
		
		


		//printing duplicates in string array
				String[] my_array = {"shashi", "shashi", "ganesha", "shiva", "shiva", "ganesha", "gzw", "oiu","shashi"};
				List<String> dupInString =new ArrayList<>();
				for(int i = 0; i< my_array.length; i++) {
					for (int j=i+1; j<my_array.length;j++) {
						if( (my_array[i].equals(my_array[j])) && (i != j) )
		                {
		                    dupInString.add(my_array[j]);
		                }
					}
				}
				
				System.out.println("pring duplicates in string"+ dupInString);
				
				

				// duplicates and print in string array
				 String str = "shashi shashi kala amma appa kala";
				 String [] array = str.split(" ");
			      System.out.print("Duplicate Characters in above string are: ");
			      for (int i = 0; i < array.length; i++) {
			         for (int j = i + 1; j < array.length; j++) {
			            if (array[i].equals(array[j])) {
			               System.out.print(array[j] + " ");
			               break;
			            }
			         }
			      }
		
			      System.out.println("");
				
				
				//  printing non duplicate in integer array
			      List<String> nondup =new ArrayList<>();
				for (int i = 0; i < dupList.length; i++) {
				    boolean dupl = false;
				    for (int j = 0; j < dupList.length; j++) {
				        if (i != j && dupList[i] == dupList[j]) {
				            dupl = true;
				            break;
				        }
				    }
				    if (! dupl) {
				        nondup.add(String.valueOf(dupList[i]));
				    }
				}
				System.out.println("printing non repeated"+nondup);
				
				
				
			//  printing non duplicate in string array
			      List<String> nondupString =new ArrayList<>();
				for (int i = 0; i < my_array.length; i++) {
				    boolean dupl = false;
				    for (int j = 0; j < my_array.length; j++) {
				        if (i != j && my_array[i].equals( my_array[j])) {
				            dupl = true;
				            break;
				        }
				    }
				    if (! dupl) {
				    	nondupString.add(String.valueOf(my_array[i]));
				    }
				}
				System.out.println("printing non repeated in string array"+nondupString);
				
				

				// removing duplicates and print in integer array
				Set<Integer> nonduplicates = new HashSet<>();
				for(int i = 0; i < dupList.length; i++) {
					nonduplicates.add(dupList[i]);	
				}
				System.out.println("after removing duplicates in integer" +nonduplicates);
				
				
				
				//printing repeated character in a string"
				String s = "GanesehaG";
				String s1="1101110011";
				 
				char charArray[] = s.toCharArray();
				for (int i=0; i<s.length();i++) {
					for(int j=i+1; j<s.length();j++) {
						if(charArray[i]==charArray[j]) {
							System.out.println(charArray[i]);
						}
					}
				}
				
				
				List<Character> nondupChar =new ArrayList<>();
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
				    	nondupChar.add(c);
				    }
				}
				System.out.println("printing non repeated"+nondupChar);
				
				
				
				
	   }
		
	
	
	

}
