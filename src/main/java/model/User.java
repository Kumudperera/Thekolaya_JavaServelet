package model;

public class User {
	String user_id;
	String name;
	String address;
	Long contact_number;
	String user_type;
	String password;
	int verify;
	String profile_picture;
	String created_at;
	int is_deleted;
	
	public User() {
		
	}
	
	public User(String user_id, String name, String address, Long contact_number, String user_type, String password,
			int verify, String profile_picture, String created_at, int is_deleted) {
		this.user_id = user_id;
		this.name = name;
		this.address = address;
		this.contact_number = contact_number;
		this.user_type = user_type;
		this.password = password;
		this.verify = verify;
		this.profile_picture = profile_picture;
		this.created_at = created_at;
		this.is_deleted = is_deleted;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContact_number() {
		return contact_number;
	}

	public void setContact_number(Long contact_number) {
		this.contact_number = contact_number;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getVerify() {
		return verify;
	}

	public void setVerify(int verify) {
		this.verify = verify;
	}

	public String getProfile_picture() {
		return profile_picture;
	}

	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public int getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", address=" + address + ", contact_number="
				+ contact_number + ", user_type=" + user_type + ", password=" + password + ", verify=" + verify
				+ ", profile_picture=" + profile_picture + ", created_at=" + created_at + ", is_deleted=" + is_deleted
				+ "]";
	}
	
	
}
