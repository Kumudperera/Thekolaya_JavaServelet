package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DBConnection;
import model.Employee;

public class EmployeeDAO {
	public static boolean addEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		Connection connection = DBConnection.getInstance().getConnection();
		String query = "INSERT INTO employee VALUES(?, ?, ?, ?)";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setInt(1, employee.getId());
		pst.setString(2, employee.getFirstName());
		pst.setString(3, employee.getLastName());
		pst.setString(4, employee.getPassword());
		return pst.executeUpdate() > 0;
	}
}
