package Java8Pgms;

public class EmployeeDetails {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int dateOfJoining;
	private double salary;
	public EmployeeDetails(int id, String name, int age, String gender, String department, int dateOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.dateOfJoining =  dateOfJoining;
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", dateOfJoining=" + dateOfJoining + ", salary=" + salary + "]";
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}



	public int getDateOfJoining() {
		return dateOfJoining;
	}



	public void setDateOfJoining(int dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	
	
	
	

}
