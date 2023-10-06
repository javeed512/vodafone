package preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSDemo {

	public static void main(String[] args) {

		Connection conn = DBUtil.getDBConnection();

		try {

			/*
			 * String query = "insert into employee(eid,ename,salary) values(?,?,?)"; //?
			 * --> positional parameters
			 * 
			 * PreparedStatement pstmt = conn.prepareStatement(query);
			 * 
			 * pstmt.setInt(1, 121); pstmt.setString(2,"tom"); pstmt.setDouble(3, 52000);
			 * 
			 * int count = pstmt.executeUpdate();
			 * System.out.println(count + " Record inserted..");
			 * 
			 */

			/*
			 * String update = "update employee set ename = ? ,salary = ? where eid = ?";
			 * 
			 * PreparedStatement pstmt = conn.prepareStatement(update);
			 * 
			 * pstmt.setString(1, "king khan"); pstmt.setDouble(2, 99999); pstmt.setInt(3,
			 * 101);
			 * 
			 * int count = pstmt.executeUpdate();
			 * 
			 * System.out.println(count + " Record updated..");
			 */
			
			/*
			 * String delete = "delete from employee where eid = ?"; PreparedStatement pstmt
			 * = conn.prepareStatement(delete);
			 * 
			 * pstmt.setInt(1, 121);
			 * 
			 * int count = pstmt.executeUpdate();
			 * 
			 * System.out.println(count +" records deleted");
			 */
			
			//String select = "select * from employee";
			
			String select = "select * from employee where salary > ?";
			
			PreparedStatement pstmt = conn.prepareStatement(select);
			
					pstmt.setDouble(1, 20000);
			
			ResultSet rs =	pstmt.executeQuery();
			
			while(rs.next()) {
				
	System.out.println(rs.getInt("eid")  +" "+ rs.getString("ename") +"  "+rs.getDouble("salary") );
							
						
						}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
