package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrderOfelementsInArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
