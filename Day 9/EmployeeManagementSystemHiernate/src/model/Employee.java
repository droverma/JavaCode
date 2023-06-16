package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {
	private static final long serialVersionUID = 8633415090390966715L;
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employee_id;
	@Column(name = "employee_name")
	private String employee_name;
	@Column(name = "designation")
	private String designation;
	@Column(name = "salary")
	private double salary;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "\nEmployee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", designation="
				+ designation + ", salary=" + salary + "]";
	}

	public Employee(int employee_id, String employee_name, String designation, Double salary) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.designation = designation;
		this.salary = salary;
	}

	public Employee(String employee_name, String designation, Double salary) {

		this.employee_name = employee_name;
		this.designation = designation;
		this.salary = salary;
	}

	public Employee() {
	}

}
