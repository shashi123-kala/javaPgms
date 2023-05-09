package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class listToset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//list to set

		List<String> aList = Arrays.asList("Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks", "GFG");

   Set<String> hSet = new HashSet<String>();
   for (String x : aList)
       hSet.add(x);

   System.out.println("Created HashSet is");
   for (String x : hSet)
       System.out.println(x);

   // We can created TreeSet same way
   
   
   
   //set to list
   Set<String> s = new HashSet<String>();
   s.add("Geeks");
   s.add("for");

   int n = s.size();
   List<String> aList1 = new ArrayList<String>(n);
   for (String x : s)
       aList.add(x);

   System.out.println("Created ArrayList is");
   for (String x : aList1)
       System.out.println(x);
}
	

}
