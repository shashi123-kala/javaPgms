package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class largestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]={10,50,40,15,30,11,20,100};
		List<Integer> list =Arrays.asList(a);
		Collections.sort(list);
		/*for(int i:list){
			System.out.println(i);
		}*/
		int element=list.get(a.length-3);
		System.out.println("second no is" +element);
		System.out.println(a.length);


		
		List<Integer> li =new ArrayList<>();
		li = Arrays.asList(a);
		Collections.sort(li);
		
		System.out.println(li);
		int num1 = li.get(a.length-1);
		int num2 = li.get(a.length-2);
		int num3 = li.get(a.length-3);
		int num4 = li.get(a.length-4);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		
		System.out.println("===========");
		for(int i =0 ; i<a.length ;i++) {
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
		
		
		String str1 = "one";
		String str2 = "two";

		str1 = str1 + str2;
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring(str2.length());

		System.out.println("a = " + str1);
		System.out.println("b = " + str2);
	}

}
