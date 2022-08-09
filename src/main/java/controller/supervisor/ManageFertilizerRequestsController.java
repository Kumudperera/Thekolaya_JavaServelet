package controller.supervisor;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

//import org.json.JSONObject;
//
//import com.google.gson.Gson;

import dao.supervisor.SupervisorDAO;
import model.supervisor.FertilizerRequests;

public class ManageFertilizerRequestsController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		List<FertilizerRequests> requests = new ArrayList<>();
		try {
			requests = SupervisorDAO.getFertilizerRequests();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("error found");
		}
		System.out.println("heloo bokka");
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/supervisor/manageFertilizerRequests.html");
		requestDispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<FertilizerRequests> requests = new ArrayList<>();
		try {
			requests = SupervisorDAO.getFertilizerRequests();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("error found");
		}
		
		Gson gson = new Gson();
		String requestsJSON = gson.toJson(requests);
		System.out.println(requestsJSON);
		resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(requestsJSON);
	}
}
