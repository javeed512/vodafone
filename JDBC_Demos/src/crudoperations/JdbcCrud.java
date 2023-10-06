package crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCrud {

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
			//String insertQuery ="insert into employee values(111,'aditya',80000)";
//String updateQuery ="update employee set ename='aditya kumar' , salary = 99000 where eid = 111";
		
			String deleteQuery = "delete from employee where eid = 111";
			int count =	stmt.executeUpdate(deleteQuery);
				
			System.out.println(count +" records affected..");
			
		} catch (SQLException e) {
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
