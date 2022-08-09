package model;

public class Login {
	private Long contact_number;
	private String password;
	private static boolean isLoggedIn;
	
	public Login() {
		
	}

	public Login(Long contact_number) {
		this.contact_number = contact_number;
	}
	
	public Login(Long contact_number, String password) {
		this.contact_number = contact_number;
		this.password = password;
	}

	public Long getContact_number() {
		return contact_number;
	}

	public void setContact_number(Long contact_number) {
		this.contact_number = contact_number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static boolean isLoggedIn() {
		return isLoggedIn;
	}

	public static void setLoggedIn(boolean isLoggedIn) {
		Login.isLoggedIn = isLoggedIn;
	}

}
