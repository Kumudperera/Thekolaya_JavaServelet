package controller.supervisor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import helpers.Helper;
import model.Login;

public class SupervisorDashboardController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if (Login.isLoggedIn() && session.getAttribute("user_type").equals("supervisor")) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/supervisor/supervisorDashboard.html");
			System.out.println(requestDispatcher);
			requestDispatcher.forward(req, resp);
			System.out.println("Supervisor Servlet loaded !");
		}

	}

}
