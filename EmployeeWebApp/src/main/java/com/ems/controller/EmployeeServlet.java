package com.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.model.EmployeeDAO;
import com.ems.pojo.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter  out =	response.getWriter();
		
		response.setContentType("text/html");
		
		
		
	String id =	request.getParameter("eid");
	
	
	
	EmployeeDAO  dao = new EmployeeDAO();
	
		if(id != null) {
			
			int eid =Integer.parseInt(id);
			
			String ename = request.getParameter("ename");
			String sal = request.getParameter("salary");
			
				double salary =Double.parseDouble(sal);
			
			Employee emp = new Employee(eid, ename, salary);
			
			
			
	
		int count =	dao.addEmployee(emp);
		
		if(count > 0) {
		
		out.print("<h1 style='color:green'> Employee added successfully</h1>");
		}
		else {
			// throw EmployeeNotAddedException();
			out.print("Insert query faile , employee not added");
			
		}
		
		}
		
		else {
			
			List<Employee> list =	dao.getAllEmployees();
			
			out.print("<h1>Employees Details</h1>");
			
			for(Employee e1:list) {
				
				out.print(e1 +"<br/>");
				
			}
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
