package collections;

import java.util.HashSet;

public class elementsExistInHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs = new HashSet<Integer>();
        // add elements to HashSet object
        hs.add(3);
        hs.add(17);
        hs.add(6);
        hs.add(9);
        hs.add(7);
        // check if HashSet contains element
        if (hs.contains(7)) {
            System.out.println("7 was found in the list");
        } else {
            System.out.println("7 was not found in the list");
        }

	}

}
