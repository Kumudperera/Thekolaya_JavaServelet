package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import database.DBConnection;
import model.Login;
import model.User;

public class LoginDAO {
	public static User getUser(Login new_login) throws ClassNotFoundException, SQLException {
//		User new_user = new User();
//		Login new_login = new Login();
		User login_user = new User();
		Connection connection = DBConnection.getInstance().getConnection();
		String query = "SELECT * FROM user WHERE contact_number = ?";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setLong(1, new_login.getContact_number());
		
		ResultSet resultSet = pst.executeQuery();
		if(resultSet.next()) {
			login_user = new User(
					resultSet.getString(1),
					resultSet.getString(2),
					resultSet.getString(3),
					resultSet.getLong(4),
					resultSet.getString(5),
					resultSet.getString(6),
					resultSet.getInt(7),
					resultSet.getString(8),
					resultSet.getString(9),
					resultSet.getInt(10)
			);

		}
		return login_user;
	}
}
