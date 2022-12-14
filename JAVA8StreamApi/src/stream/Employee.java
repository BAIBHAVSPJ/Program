package stream;

public class Employee {
	int id;
	
	String name;
	
	int age;
	
	String gender;
	
	String department;
	
	int yearofjoining;
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearofjoining=" + yearofjoining + ", salary=" + salary + "]";
	}

	public Employee(int id, String name, int age, String gender, String department, int yearofjoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearofjoining = yearofjoining;
		this.salary = salary;
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

	public int getYearofjoining() {
		return yearofjoining;
	}

	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	double salary;

}
