package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil { //factory design pattern

	public static Connection getDBConnection() { // factory method
		
Connection conn = null;
		
		try {
			//step1
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		  //step2
   conn =	DriverManager.getConnection("jdbc:mysql://localhost:3306/vodafone", "root", "admin");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}

}
