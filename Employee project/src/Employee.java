import java.util.Objects;
import java.util.Scanner;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	
	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empId = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empId;
	}

	public void setEmpid(int empid) {
		this.empId = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(empId), name, Double.valueOf(salary));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId ;
	}
	public static Scanner sc = new Scanner(System.in);
	
	public void acceptEmp() {
		System.out.print("Enter Employee id : ");
		empId = sc.nextInt();
		System.out.print("Enter Employee name : ");
		name = sc.next();
		System.out.print("Enter Employee salary : ");
		salary = sc.nextDouble();
	}
	
}
