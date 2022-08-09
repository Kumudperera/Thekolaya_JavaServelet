package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import dao.RegistrationDAO;
import helpers.Helper;
import helpers.PasswordHash;
import model.Employee;
import model.Registration;

public class RegistrationController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher requestDispatcher;

		String action = Helper.getAction(req);

		switch (action) {
		case "registration":
			requestDispatcher = req.getRequestDispatcher("views/registration.html");
			System.out.println("Servlet loaded !");
			break;
		default:
			requestDispatcher = req.getRequestDispatcher("views/home.jsp");
			break;
		}
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Registration post controller called");
		String name = req.getParameter("name");
		Long contact_number = Long.parseLong(req.getParameter("contact_number"));
		String user_id = req.getParameter("user_id");
		String user_type = req.getParameter("user_type");
		String address = req.getParameter("address");
		String password = req.getParameter("password");
		String confirm_password = req.getParameter("confirm_password");
		String controller = "registration";

		boolean added = false;

//		try {
//			added = EmployeeDAO.addEmployee(new Employee(id, firstName, lastName, password));
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
		
		password = PasswordHash.doHashing(password);
		try {
			added = RegistrationDAO.userRegistration(new Registration(
					name,
					contact_number,
					user_type,
					user_id,
					address,
					password,
					confirm_password
			));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

		if (added) {
			resp.sendRedirect("/thekolaya/login");
			System.out.println("Added");
		} else {
			System.out.println("Not added");
		}
	}
}
