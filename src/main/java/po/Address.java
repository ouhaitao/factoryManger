package po;

public class Address {

	private int id;
	private String address;
	private String tel;

	public Address() {
	}
	
	public Address(String address, String tel) {
		this.address = address;
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
