package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DBConnection;
import model.Employee;
import model.Registration;

public class RegistrationDAO {
	public static boolean addEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		Connection connection = DBConnection.getInstance().getConnection();
		String query = "INSERT INTO user VALUES(?, ?, ?, ?)";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1, employee.getId());
		pst.setString(2, employee.getFirstName());
		pst.setString(3, employee.getLastName());
		pst.setString(4, employee.getPassword());
		return pst.executeUpdate() > 0;
	}
	
	public static boolean userRegistration(Registration registrationUser) throws ClassNotFoundException, SQLException {
		Connection connection = DBConnection.getInstance().getConnection();
		String query = "INSERT INTO user_registration VALUES(?, ?, ?, ?, ?, ?)";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, registrationUser.getUser_id());
		pst.setString(2, registrationUser.getName());
		pst.setString(3, registrationUser.getAddress());
		pst.setLong(4, registrationUser.getMobile_number());
		pst.setString(5, registrationUser.getUser_type());
		pst.setString(6, registrationUser.getPassword());
		
		return pst.executeUpdate() > 0;
	}
}
