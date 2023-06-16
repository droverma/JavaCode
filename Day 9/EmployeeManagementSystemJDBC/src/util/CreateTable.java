package util;

import java.sql.*;
//import

public class CreateTable {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hiltonHotel", "root", "root");
			// here javadb is database name, root is username and password
			Statement stmt = con.createStatement();
			String tblsql = "create table employee(employee_id int primary key auto_increment, employee_name varchar(50),designation varchar(50), salary double)";
			boolean b = stmt.execute(tblsql);
			System.out.println(!b ? "Table created" : "Some problem");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
