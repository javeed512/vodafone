package com.ems.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ems.pojo.Employee;

public class EmployeeDAO { // model

	public int addEmployee(Employee emp) {

		Connection conn = DBUtil.getDBConnection();

		String query = "insert into employee(eid,ename,salary) values(?,?,?)";

		PreparedStatement pstmt;
		int count = 0;
		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getEname());
			pstmt.setDouble(3, emp.getSalary());

			count = pstmt.executeUpdate();
			System.out.println(count + " Record inserted..");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public List<Employee> getAllEmployees() {

		List<Employee> list = new ArrayList<Employee>();

		Connection conn = DBUtil.getDBConnection();

		String select = "select * from employee";

		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(select);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getInt("eid") + " " + rs.getString("ename") + "  " + rs.getDouble("salary"));

				Employee employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setSalary(rs.getDouble("salary"));

				list.add(employee);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

}
