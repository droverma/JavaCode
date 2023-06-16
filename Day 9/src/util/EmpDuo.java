package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Employee;

public class EmpDuo {
//	public Connection getCon() throws Exception {
//		Class.forName("com.mysql.jdbc.Driver");
//		return DriverManager.getConnection("jdbc:mysql://localhost:3306/hiltonHotel", "root", "root");
//	}

	public void insert(Employee e) {
		String v = e.getEmpId() + ", '" + e.getEmpName() + "', '" + e.getDesignation() + "', " + e.getSalary();
		String sql = "insert into employee values (" + v + ")";
		try (Connection conn = DBConnection.getCon()) {
			System.out.println(conn.createStatement().executeUpdate(sql) + " records inserted");
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}

	public void delete(int id) {
		String sql = "delete from employee where employee_id = " + id;
		try (Connection conn = DBConnection.getCon()) {
			System.out.println(conn.createStatement().executeUpdate(sql) + " records deleted");
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}

	public void update(Employee e) {
		String sql = "update employee set employee_name = '" + e.getEmpName() + "', designation= '" + e.getDesignation()
				+ "', salary=" + e.getSalary() + " where employee_id = " + e.getEmpId();
		try (Connection conn = DBConnection.getCon()) {
			System.out.println(conn.createStatement().executeUpdate(sql) + " records updated");
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}

	public ArrayList<Employee> findRecord(int id) {
		ArrayList<Employee> emps = new ArrayList<>();
		String sql = "select * from employee where employee_id =" + id;
		try (Connection conn = DBConnection.getCon()) {
			ResultSet rs = conn.createStatement().executeQuery(sql);
			while (rs.next())
				emps.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));

		} catch (Exception e1) {
			System.out.println(e1);
		}
		return emps;
	}

	public ArrayList<Employee> display() {
		ArrayList<Employee> emps = new ArrayList<>();
		try (Connection conn = DBConnection.getCon()) {
			ResultSet rs = conn.createStatement().executeQuery("Select * from employee");
			while (rs.next())
				emps.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
		} catch (Exception e1) {
			System.out.println(e1);
		}
		return emps;
	}

}
