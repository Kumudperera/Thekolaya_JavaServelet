package controller.supervisor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateTeaMeasureController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Update TeaMeasure controller called !");
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/supervisor/updateTeaMeasure.html");
		System.out.println(requestDispatcher);
		requestDispatcher.forward(req, resp);
	}
}
