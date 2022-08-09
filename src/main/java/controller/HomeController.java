package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;

import helpers.Helper;

public class HomeController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.html");
//		requestDispatcher.forward(req, resp);
		System.out.println("Servlet loaded ! 1");

		RequestDispatcher requestDispatcher;
//		
		String action = Helper.getAction(req);
//
		switch (action) {
//		case "registration":
//			requestDispatcher = req.getRequestDispatcher("views/registration.jsp");
//			break;
//			View.go(req, resp, "views/home.jsp");	
//		case "login":
//			// ToDo
//			requestDispatcher = req.getRequestDispatcher("views/login.jsp");
//			break;
		case "home":
			requestDispatcher = req.getRequestDispatcher("views/home.html");
			requestDispatcher.forward(req, resp);
			System.out.println("Servlet loaded ! 2");
			break;
		}
//		requestDispatcher = req.getRequestDispatcher("views/home.html");
//		requestDispatcher.forward(req, resp);
	}
}
