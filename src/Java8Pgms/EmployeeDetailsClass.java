package Java8Pgms;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDetailsClass {
	public static void main(String[] args) {
		
		List<EmployeeDetails> list = new ArrayList<EmployeeDetails>();
		list.add(new EmployeeDetails(111, "jiya", 32 , "female", "HR" , 2011, 25000000.0 ));		
		list.add(new EmployeeDetails(122, "paul", 25 , "male", "sales and marketting" , 2015, 2500000.0 ));
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
		list.add(new EmployeeDetails(277, "Anuj", 31 , "male", "Product Development" , 2016, 150.0 ));
		
		
		
		//find out count male and female
		Map<String, Long> noOfMaleAndFemale = list.stream().collect(Collectors.groupingBy(EmployeeDetails::getGender,Collectors.counting()));
		System.out.println("total count male and female " + noOfMaleAndFemale);
		
		
		
		//print name of all departments
		list.stream().map(EmployeeDetails::getDepartment).distinct().forEach(System.out::println);
		
		
		//average age of male and female
		Map<String, Double> avgMaleAndFemale = list.stream().collect(Collectors.groupingBy(EmployeeDetails::getGender, Collectors.averagingInt(EmployeeDetails::getAge)));
		System.out.println("average age of male and female" +avgMaleAndFemale);
		
		
		//Highest paid employee in the organiszation
//		 Optional<EmployeeDetails> highestpaidEmp = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
//		System.out.println(highestpaidEmp);
		
		
		//count the no of each employee in each department
		Map<String,Long>empCountByDepartment = list.stream().collect(Collectors.groupingBy(EmployeeDetails::getDepartment,Collectors.counting()));
		System.out.println("count the no of each employee in each department" +empCountByDepartment);		
		
		
		
		//get names of all employee who have joined in each department
		System.out.println("the names of all employee who have joined in each department");
		list.stream().filter(e -> e.getDateOfJoining()>2015).map(EmployeeDetails::getName).forEach(System.out::println);
		System.out.println("the names of all employee the second highest salary");
		list.stream().filter(e -> e.getSalary()>10000).map(EmployeeDetails::getName).forEach(System.out::println);
		
		
		//avg salary of each department
		Map<String, Double> avgSalaryOfdept = list.stream().collect(Collectors.groupingBy(EmployeeDetails::getDepartment,Collectors.averagingDouble(EmployeeDetails::getSalary)));
		System.out.println("avg salary of each dept"+avgSalaryOfdept);
		
		//get the younges male employee in the product development
		Optional<EmployeeDetails> youngestEmpInProductDevelopment = list.stream().filter(e -> e.getGender()=="male" && e.getDepartment()=="Product Development" ).min(Comparator.comparingInt(EmployeeDetails::getAge));
		EmployeeDetails det = youngestEmpInProductDevelopment.get();
		System.out.println("Id" + det.getId());
		System.out.println("name" + det.getName());
				
		
		
		//who has most experience in organization
		Optional<EmployeeDetails>seniorMostEmp = list.stream().sorted(Comparator.comparingInt(EmployeeDetails::getDateOfJoining)).findFirst();
		EmployeeDetails senior = seniorMostEmp.get();
		System.out.println("Id" + senior.getId());
		System.out.println("name"+ senior.getName());
		
		//print male and female employee are there in sales and marketting
		Map<String, Long> countmaleAndfemaleInMarketing = list.stream().filter(e->e.getDepartment()=="Sales and Marketing").collect(Collectors.groupingBy(EmployeeDetails::getGender,Collectors.counting()));
		System.out.println(countmaleAndfemaleInMarketing);
		
		
		
		//average salary of male and female employee
		Map<String, Double> avgalaryOfmaleAndFemale = list.stream().collect(Collectors.groupingBy(EmployeeDetails::getGender,Collectors.averagingDouble(EmployeeDetails::getSalary)));
		System.out.println(avgalaryOfmaleAndFemale);
		
		//List down the names of all employee in each dept
		//issue
		Map<String,List<EmployeeDetails>>empListByDept = list.stream().collect(Collectors.groupingBy(EmployeeDetails::getDepartment));
		//System.out.println(empListByDept);
		Set<java.util.Map.Entry<String, List<EmployeeDetails>>> s = empListByDept.entrySet();
		for(java.util.Map.Entry<String, List<EmployeeDetails>> e :s) {
			System.out.println("--------------------------------------------------------");
			System.out.println("Employee In"+e.getKey()+":");
			System.out.println("---------------------------------------------------------");
			System.out.println("Employee In"+e.getValue()+":");
			
		}
		
		//avg salary and total salary of whole orgnization
		DoubleSummaryStatistics empSalarystatistics = list.stream().collect(Collectors.summarizingDouble(EmployeeDetails::getSalary));
		System.out.println("avg salary = "+empSalarystatistics.getAverage());
		System.out.println("total salary = "+empSalarystatistics.getSum());
		
		//sepearte the employee who are younger or equal to 25 years from those employees who are older than 25 years
		Map<Boolean, List<EmployeeDetails>> partionByEmpAge = list.stream().collect(Collectors.partitioningBy(e-> e.getAge() > 25));
		Set<java.util.Map.Entry<Boolean, List<EmployeeDetails>>> entrySet = partionByEmpAge.entrySet();
		for(java.util.Map.Entry<Boolean , List<EmployeeDetails>> entry: entrySet) {
			System.out.println("---------------------------------------------------");
			if(entry.getKey())
				System.out.println("employee older than 25 years");
			else
				System.out.println("employee younger than or equla to 25 years");
			
			//who is the oldest employee in the organization and what is the age and which department belongs to
			Optional<EmployeeDetails>oldestEmployee = list.stream().max(Comparator.comparing(EmployeeDetails::getAge));
			EmployeeDetails emp = oldestEmployee.get();
			System.out.println("emp name" +emp.getName());
			System.out.println("age" +emp.getAge());
			System.out.println("department"+emp.getDepartment());
		}
		
		
		//sorting an ascending
List<EmployeeDetails> emp = list.stream().sorted(Comparator.comparing(EmployeeDetails::getName).thenComparing(e -> e.getAge())).collect(Collectors.toList());
for (EmployeeDetails e : emp) {
	System.out.println(e.getName() +" " + e.getAge() );
	
	//sorting name
	List < EmployeeDetails > employeesSortedList1 = list.stream()
            .sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println(employeesSortedList1);

        //ascending name
        List < EmployeeDetails > employeesSortedList2 = list.stream().sorted(Comparator.comparing(EmployeeDetails::getName)).collect(Collectors.toList()); //ascending order
        System.out.println("ascending order");
        for (EmployeeDetails es : employeesSortedList2) {
            System.out.println(es.getName());

		}
        
        
        //print 2nd highest salary
        Optional<EmployeeDetails> empDet = list.stream()
                .sorted(Comparator.comparingDouble(EmployeeDetails::getSalary).reversed()).skip(1).findFirst();

        System.out.println(empDet.get().getSalary());
        
        
}
		
		
	}

}
