package model.supervisor;

public class FertilizerRequests {
//	$query = "SELECT request.request_id, request.lid, DATE(request.request_date) 
//	AS request_date, user.name, fertilizer_request.amount 
//            FROM user 
//            INNER JOIN request 
//            ON user.user_id=request.lid 
//            INNER JOIN fertilizer_request 
//            ON fertilizer_request.request_id=request.request_id 
//            WHERE request.response_status='receive'";
	private String request_id;
	private String landowner_id;
	private String request_date;
	private String landowner_name;
	private int requested_amount;
	
	public FertilizerRequests() {
		
	}
	
	public FertilizerRequests(String request_id, String landower_id, String request_date, String landowner_name,
			int requested_amount) {
		this.request_id = request_id;
		this.landowner_id = landower_id;
		this.request_date = request_date;
		this.landowner_name = landowner_name;
		this.requested_amount = requested_amount;
	}
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	public String getLandower_id() {
		return landowner_id;
	}
	public void setLandower_id(String landower_id) {
		this.landowner_id = landower_id;
	}
	public String getRequest_date() {
		return request_date;
	}
	public void setRequest_date(String request_date) {
		this.request_date = request_date;
	}
	public String getLandowner_name() {
		return landowner_name;
	}
	public void setLandowner_name(String landowner_name) {
		this.landowner_name = landowner_name;
	}
	public int getRequested_amount() {
		return requested_amount;
	}
	public void setRequested_amount(int requested_amount) {
		this.requested_amount = requested_amount;
	}

	@Override
	public String toString() {
		return "FertilizerRequests [request_id=" + request_id + ", landowner_id=" + landowner_id + ", request_date="
				+ request_date + ", landowner_name=" + landowner_name + ", requested_amount=" + requested_amount + "]";
	}

	public String getLandowner_id() {
		return landowner_id;
	}

	public void setLandowner_id(String landowner_id) {
		this.landowner_id = landowner_id;
	}
	
}
