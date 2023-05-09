package Java8Pgms;

public class Employee {
	private int empId;
	private int deptId;
	private int salary;
	private String empName;
	private String status ="active";
	
	
	
	
	public Employee(int empId, int deptId, int salary, String empName, String status) {
		super();
		this.empId = empId;
		this.deptId = deptId;
		this.salary = salary;
		this.empName = empName;
		this.status = status;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptId=" + deptId + ", salary=" + salary + ", empName=" + empName
				+ ", status=" + status + "]";
	}
	
	
	
	
	

}
