package IntvwPgm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortArrayInDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[] = {30,20,10,50};
		int temp;
		
		for(int i=0; i<a.length;i++) {
			for(int j =i+1; j<a.length;j++) {
			if(a[i]>a[j]) {
				temp = a[i];
				a[i]= a[j];
				a[j] = temp;
				
			}
			}
		}
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		List<Integer> list = Arrays.asList(a);
		//sorting by desc
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
