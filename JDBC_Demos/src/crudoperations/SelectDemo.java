package crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {

Connection conn = null;
		
		try {
			//step1
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		  //step2
   conn =	DriverManager.getConnection("jdbc:mysql://localhost:3306/vodafone", "root", "admin");
		

	//step3
			Statement stmt = conn.createStatement();
			
	//step4 
			String selectQuery = "select * from employee";
			
			ResultSet rs =	stmt.executeQuery(selectQuery);
			
			while(rs.next()) {
				
	System.out.println(rs.getInt("eid")  +" "+ rs.getString("ename") +"  "+rs.getDouble("salary") );
				
			
			}
			
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

	}

	}
}
