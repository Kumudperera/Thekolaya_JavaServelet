package model;

public class Registration {
	private String name;
	private long mobile_number;
	private String user_type;
	private String user_id;
	private String address;
	private String password;
	private String confirm_password;
	
	public Registration() {
		
	}

	

	public Registration(String name, long mobile_number, String user_type, String user_id, String address,
			String password, String confirm_password) {
		this.name = name;
		this.mobile_number = mobile_number;
		this.user_type = user_type;
		this.user_id = user_id;
		this.address = address;
		this.password = password;
		this.confirm_password = confirm_password;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirm_password() {
		return confirm_password;
	}


	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	
	
	
}
