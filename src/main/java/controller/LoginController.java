package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDAO;
import helpers.Helper;
import helpers.PasswordHash;
import model.Login;
import model.User;

public class LoginController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = null;
		
		String action = Helper.getAction(req);

//		switch (action) {
//		case "login":
			requestDispatcher = req.getRequestDispatcher("views/login.html");
			System.out.println("Servlet loaded !");
//			break;
//		default:
//			requestDispatcher = req.getRequestDispatcher("views/home.jsp");
//			break;
//		}
		requestDispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Login Post Controller called !");
		String function_name = req.getParameter("function_name");
		Long contact_number = Long.parseLong(req.getParameter("contact_number"));
		String buttonClicked = req.getParameter("login");
		
		Login new_login = new Login(contact_number);
		User login_user = new User();
		PrintWriter out = resp.getWriter();
		try {
			login_user = LoginDAO.getUser(new_login);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		if(buttonClicked != null) {
			function_name = "loginClicked";
		}
		switch (function_name) {
			case "checkUser":
				if(login_user.getVerify() == 1 && login_user.getIs_deleted() == 0) {
					out.print("Verified");
				} else if(login_user.getIs_deleted() == 1 && login_user.getVerify() == 0) {
					out.print("Deleted");
				} else if(login_user.getIs_deleted() == 0 && login_user.getVerify() == 0) {
					out.print("Registered");
				}
				break;
			case "loginClicked":
				System.out.println("Login button Clicked !");
				String password = req.getParameter("password");
				password = PasswordHash.doHashing(password);
//				System.out.println(password);
//				System.out.println(login_user.getPassword());
//				System.out.println(Helper.isPasswordCorrect(password, login_user.getPassword()));
				if(Helper.isPasswordCorrect(password, login_user.getPassword())) {
					System.out.println("true");
//					confirm the user and log into the user
					Login.setLoggedIn(true);
					String userType = login_user.getUser_type();
					userType = userType.toLowerCase();
					userType = userType.replace("_", "");
					
					HttpSession session = req.getSession();
					session.setAttribute("user_type", userType);
					
//					redirect to the logged in user
					String redirect = "/thekolaya/" + userType;
					resp.sendRedirect(redirect);
//					System.out.println("Supervisor");
				}
				break;
		}
	}
	
//	public static boolean isLoggedIn() {
//		
//	}
}
