package Java8Pgms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(105,5, 20000,"ganesha","active"));
		empList.add(new Employee(101,1, 10000,"shiva","inactive"));
		empList.add(new Employee(103,3, 30000,"paru","active"));
		empList.add(new Employee(104,3, 30000,"paru","inactive"));
		
		//print emp details based on deptid
		Map<Integer, List<Employee>>EmpList = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));
		EmpList.entrySet().forEach(
				entry ->{
					System.out.println(entry.getKey() + "---- "+ entry.getValue());
				});
		
		//print employee count working in each deptment
		Map<Integer,Long> employeeCountDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.counting()));
		employeeCountDept.entrySet().forEach(entry ->{
			System.out.println(" department id is " + entry.getKey() + "--" + entry.getValue());
		});
		
		
		//print employee active and inactive
		
		long activeEmpCount = empList.stream().filter(e -> "active".equals(e.getStatus())).count();
		long inactiveEmpCount = empList.stream().filter(e -> "inactive".equals(e.getStatus())).count();
		System.out.println(" active count"+ activeEmpCount);
		System.out.println("in active count"+ inactiveEmpCount);
		
		
		//max min salary from collection
		Optional<Employee>empMax= empList.stream().max(Comparator.comparing(Employee::getSalary));
		Optional<Employee>empMin= empList.stream().min(Comparator.comparing(Employee::getSalary));
		System.out.println(empMax);
		System.out.println(empMin);
		
		//print max salary of an employee from each departmentMap
		Map<Integer,Optional<Employee>> topSalaryDeptWise= empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,
				Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		topSalaryDeptWise.entrySet().forEach(entry ->{
			System.out.println("dept" +entry.getKey() + "top emp" + entry.getValue());
		});
		
		
		//sorting an single lists
//		List<String> fruits = new ArrayList<>();
//		fruits.add("apples");
//		fruits.add("mango");
//		fruits.add("pineapple");
//		fruits = fruits.stream().sorted(o1 , o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		
	}

}
