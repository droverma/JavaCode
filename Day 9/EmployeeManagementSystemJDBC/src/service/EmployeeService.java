package service;

import java.util.ArrayList;

import model.Employee;
import util.EmpDuo;

public class EmployeeService {
	EmpDuo emp = new EmpDuo();

	public void add(Employee e) {
		emp.insert(e);
	}

	public ArrayList<Employee> display(Employee e) {
		return emp.display();
	}

	public void update(Employee e) {
		emp.update(e);
	}

	public void delete(int id) {
		emp.delete(id);
	}

	public ArrayList<Employee> find(int id) {
		return emp.findRecord(id);
	}
}
