package util;

import java.sql.*;

public class DBConnection {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/hiltonHotel";
	public static final String user = "root";
	public static final String password = "root";
	java.sql.Connection con = null;
	Statement statement;

	public static Connection getCon() throws Exception {
		Class.forName(DRIVER);
		return DriverManager.getConnection(url, user, password);
	}
}
