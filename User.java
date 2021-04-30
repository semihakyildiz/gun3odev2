package gun3odev;

public class User {
	private int Id;
	private String UserName;
	private String email;
	private String password;

public User() {
		
	}
	
	public User(int id, String userName, String email, String password) {
		super();
		this.Id = id;
		this.UserName = userName;
		this.email = email;
		this.password = password;
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
