package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingBasedOnName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee("shiva", 405));
		arrayList.add(new Employee("gamesha", 101));
		arrayList.add(new Employee("paru", 701));
		

		Collections.sort(arrayList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		
		for(Employee e: arrayList)
			System.out.println(e.getName());
	}

}
