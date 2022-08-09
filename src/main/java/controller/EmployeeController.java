package controller;
import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import model.Employee;

public class EmployeeController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("employee.jsp");
		requestDispatcher.forward(req, resp);
		System.out.println("Servlet loaded !");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post request");
		int id = Integer.parseInt(req.getParameter("empId"));
		String firstName = req.getParameter("fname");
		String lastName = req.getParameter("lname");
		String password = req.getParameter("password");
		
		boolean added = false;
		
		try {
			added = EmployeeDAO.addEmployee(new Employee(
					id, 
					firstName, 
					lastName, 
					password
			));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		if(added) {
			System.out.println("Added");
		} else {
			System.out.println("Not added");
		}
		
//		System.out.println(firstName);
	}
}