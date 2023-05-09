package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] duplicats = new String[]{"java", "Oracle","c","java"};
		List duplicatesList =Arrays.asList(duplicats);
		Set  duplicatesSet  = new HashSet<>(duplicatesList);
			
		if(duplicatesList.size()!= duplicatesSet.size()){
			System.out.println("the array contains duplicates");
		}
		else{
			System.out.println("the array does not contains duplicates");
		}


	}

}
