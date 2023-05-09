package Java8Pgms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import string.stringEx;

public class hello {

	public static void main(String[] args) {
		
		List<EmployeeDetails> list = new ArrayList<EmployeeDetails>();
		list.add(new EmployeeDetails(111, "jiya", 32 , "female", "HR" , 2011, 25000.0 ));		
		list.add(new EmployeeDetails(122, "paul", 25 , "male", "sales and marketting" , 2015, 13000.0 ));
		list.add(new EmployeeDetails(133, "martin", 29 , "male", "Infrastructure" , 2012, 18000.0 ));
		list.add(new EmployeeDetails(144, "murali", 28 , "male", "product devlopment" , 2014, 32500.0 ));
		list.add(new EmployeeDetails(155, "nima roy", 27 , "female", "HR" , 2013, 22700.0 ));
		list.add(new EmployeeDetails(166, "iqbal", 43 , "male", "Security and Transport" , 2016, 10500.0 ));
		list.add(new EmployeeDetails(177, "manu sharma", 35 , "male", "Account and Finance" , 2010, 27000.0 ));
		list.add(new EmployeeDetails(188, "wang li", 31 , "male", "Product devlopment" , 2015, 34500.0 ));
		list.add(new EmployeeDetails(199, "Amelia", 24 , "female", "Sales and Marketing" , 2016, 11500.0 ));
		list.add(new EmployeeDetails(200, "Jaden", 38 , "male", "Security and Transport" , 2015, 11000.0 ));
		list.add(new EmployeeDetails(211, "Jasna", 27 , "female", "Infrastructure" , 2014, 15700.0 ));
		list.add(new EmployeeDetails(222, "Nitin", 25 , "male", "Product Development" , 2016, 28200.0 ));
		list.add(new EmployeeDetails(233, "Jyothi", 27 , "female", "Accounts and finance" , 2013, 21300.0 ));
		list.add(new EmployeeDetails(244, "Nicolus", 24 , "male", "Sales and Marketing" , 2017, 10700.0 ));
		list.add(new EmployeeDetails(255, "Alia", 23 , "male", "Infrastructure" , 2018, 12700.0 ));
		list.add(new EmployeeDetails(266, "Sanvi", 26 , "female", "Product Development" , 2015, 28900.0 ));
		list.add(new EmployeeDetails(277, "Anuj", 31 , "male", "Product Development" , 2016, 11500.0 ));
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(105,5, 20000,"ganesha","active"));
		empList.add(new Employee(101,1, 10000,"shiva","inactive"));
		empList.add(new Employee(103,3, 30000,"paru","active"));
		empList.add(new Employee(104,3, 30000,"paru","inactive"));
		
		
		System.out.println("the names of all employee who have joined in each department");
		list.stream().filter(e -> e.getDateOfJoining()>2015).map(EmployeeDetails::getName).forEach(System.out::println);
		//System.out.println("the names of all employee the second highest salary");
		list.stream().filter(e -> e.getSalary()>10000).map(EmployeeDetails::getSalary).forEach(System.out::println);
		
		Map<String, Long> noOfMaleAndFemale = list.stream().collect(Collectors.groupingBy(EmployeeDetails::getGender,Collectors.counting()));
		System.out.println("total count male and female " + noOfMaleAndFemale);
		
		
	
		
		
	
	}
	

	
	

}
