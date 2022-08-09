package dao.supervisor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;
import model.User;
import model.supervisor.FertilizerRequests;

public class SupervisorDAO {
	public static List<FertilizerRequests> getFertilizerRequests() throws ClassNotFoundException, SQLException {
		List<FertilizerRequests> requests = new ArrayList<>();
//		FertilizerRequests requests = new FertilizerRequests();
		Connection connection = DBConnection.getInstance().getConnection();
		String query = "SELECT request.request_id, request.lid, DATE(request.request_date) "
				+ "AS request_date, user.name, fertilizer_request.amount " + "FROM user " + "INNER JOIN request "
				+ "ON user.user_id=request.lid " + "INNER JOIN fertilizer_request "
				+ "ON fertilizer_request.request_id=request.request_id " + "WHERE request.response_status='receive'";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet resultSet = pst.executeQuery();
		while (resultSet.next()) {
			if (resultSet != null) {
				requests.add(new FertilizerRequests(resultSet.getString(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getString(4), resultSet.getInt(5)));
			}
		}

		return requests;
	}
}
