package po;

//管理员
public class Admin {

	private String username;
	private String password;
	//private AdminBehavior behavior;//管理员的行为
	private String role;//权限

	public Admin() {
	}
	
/*	public Admin(AdminBehavior b) {
		behavior=b;
	}
	
	public boolean behavior(){
		return behavior.behavior();
	}*/
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
