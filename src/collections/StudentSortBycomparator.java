package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSortBycomparator {

	private String name;

	
	public static Comparator<StudentSortBycomparator> getCompByName() {
		Comparator<StudentSortBycomparator> comp = new Comparator<StudentSortBycomparator>() {
			@Override
			public int compare(StudentSortBycomparator s1, StudentSortBycomparator s2) {
				return s1.name.compareTo(s2.name);
			}
		};
		return comp;
	}

	public StudentSortBycomparator(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	public static void main(String[] args) {
		StudentSortBycomparator[] studentArr = new StudentSortBycomparator[]{new StudentSortBycomparator("Mike"),new StudentSortBycomparator("Hector"), new StudentSortBycomparator("Reggie"),new StudentSortBycomparator("zark")};
		List<StudentSortBycomparator> students = new ArrayList<StudentSortBycomparator>(Arrays.asList(studentArr));
		Collections.sort(students, StudentSortBycomparator.getCompByName());
		
		for(StudentSortBycomparator student:students){
			System.out.println(student.getName());
		}
	}
}