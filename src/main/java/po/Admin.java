package po;

//����Ա
public class Admin {

	private String username;
	private String password;
	//private AdminBehavior behavior;//����Ա����Ϊ
	private String role;//Ȩ��

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
