package arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String duplicates[] =new String[] {"java","hibernate","java"};
		Set nonDuplicateset= new HashSet<>();
		Set duplicateset= new HashSet<>();
		for(String string:duplicates){
			if (!nonDuplicateset.contains(string)){
				nonDuplicateset.add(string);
			}
			else{
				duplicateset.add(string);
			}
		}
		System.out.println(duplicateset);
		

	}


}
