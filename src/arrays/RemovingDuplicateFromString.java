package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str="ganapathi";
		
		Set<Character> set= new HashSet<>();
		StringBuffer sf =new StringBuffer();
		for(int i=0; i<str.length(); i++){
			Character c = str.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				sf.append(c);
			}
		}
		System.out.println(sf.toString());
		
		
		
		String s = "ammaji";
		//List<String> l = new ArrayList<>();
		List<Character> dup =new ArrayList<>();
		for(int i=0; i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					dup.add(s.charAt(i));
				}
			}
		}
		
		System.out.println(dup);
		
		
		
		
		Set<Character> set1= new HashSet<>();
		for(int i=0; i<str.length(); i++){
			Character c = str.charAt(i);
			set1.add(c);
			
		}
		System.out.println(set1);
		
	}


}
