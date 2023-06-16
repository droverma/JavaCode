package client;

import java.util.*;
import service.EmployeeService;
import model.Employee;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Employee> empList = new ArrayList<Employee>();

	void menu() {
		System.out.println("Menu:");
		System.out.println("1.Add Employee\n2.Update Employee\n3.Display Employee\n4.Delete Employee5\n5.Exit");
		System.out.println("Enter choice:(1-5)");
	}

	boolean find(int idNumber, EmployeeService e) {
		ArrayList<Employee> data = e.find(idNumber);
		System.out.print(data);
		if (!data.isEmpty())
			return true;
		return false;
	}

	void update(int id, EmployeeService e) {
		if (find(id, e)) {
			Employee record = new Employee();

			record.setEmpId(id);
			System.out.print("\nWhat is the new Employee Name ");
			String name = scan.next();
			record.setEmpName(name);

			System.out.print("What is the new Designation ? ");
			String des = scan.next();
			record.setDesignation(des);

			System.out.print("What is the new Salary ? ");
			double sal = scan.nextDouble();
			record.setSalary(sal);
			record.setEmpCount(record.empCount++);
			System.out.println("Record Updated Successfully");
			System.out.println("\nEmployee List:" + record.toString());
			e.update(record);
		} else {
			System.out.println("Record Not Found!!!");
		}
	}

	void delete(int id, EmployeeService e) {
		if (find(id, e)) {
			e.delete(id);
		} else {
			System.out.println("Record Not Found!!!");
		}
	}

	public static void main(String[] args) {
		Employee record = new Employee();
		Main main = new Main();
		EmployeeService emp = new EmployeeService();

		int option = 0;
		while (true) {
			main.menu();
			option = main.scan.nextInt();

			switch (option) {

			case 1:
				try {
					int empId = 0;

					System.out.print("What is the Employee Name ? ");
					String name = main.scan.next();

					System.out.print("What is the Designation ? ");
					String des = main.scan.next();

					System.out.print("What is the Salary ? ");
					double sal = main.scan.nextDouble();
					record.setEmpCount(record.empCount + 1);
					record = new Employee(empId, name, des, sal);
					emp.add(record);

				} catch (ArithmeticException e1) {
					System.out.println(e1);
				} catch (InputMismatchException e) {
					System.out.println("Input is't matching with data type");
				}

				break;
			case 2:
				System.out.print("What is the Employee id ? ");
				int updateEmpid = main.scan.nextInt();
				main.update(updateEmpid, emp);
				break;

			case 3:
				Employee rec = new Employee();
				ArrayList<Employee> e = emp.display(rec);
				System.out.print(e);
				break;

			case 4:
				System.out.print("What is the Employee id ? ");
				int ids = main.scan.nextInt();
				main.delete(ids, emp);
				break;

			case 5:
				System.out.println("\nThank you for using the program. Goodbye!\n");
				System.exit(0);
				break;

			default:
				System.out.println("\nInvalid input\n");
				break;
			}
		}
	}

}
