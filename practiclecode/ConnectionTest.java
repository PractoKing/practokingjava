package practiclecode;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionTest {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		final String url = "jdbc:mysql://localhost:3306/school";
		final String user = "root";
		final String password = "root";
		
		Connection con = DriverManager.getConnection(url, user,
		password);
		
		if (con == null) {
		System.out.println("JDBC connection is not established");
		return;
		} else
		System.out.println("Congratulations," +
		" JDBC connection is established successfully.\n");
	
		con.close();
	}
}
