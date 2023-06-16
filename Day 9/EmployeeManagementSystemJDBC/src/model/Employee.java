package model;

public class Employee {
	public int empCount = 0;
	private int employee_id;
	private String employee_name;
	private String designation;
	private double salary;

	public Employee() {

	}

	public Employee(int empId, String empName, String des, double sal) {
		this.employee_id = empId;
		this.employee_name = empName;
		this.designation = des;
		this.salary = sal;
	}

	public int getEmpId() {
		return employee_id;
	}

	public void setEmpId(int empId) {
		this.employee_id = empId;
	}

	public String getEmpName() {
		return employee_name;
	}

	public void setEmpName(String empName) {
		this.employee_name = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	@Override
	public String toString() {
		System.out.print("\nEmpId\tEmpName\tDesignation\tSalary");
		return "\n" + employee_id + "\t" + employee_name + "\t" + designation + "\t" + salary
				+ "\n";
	}

}
