package po;

import java.util.HashMap;

//订单
public class Order {

	private Address address;//用户地址
	private int size;//纸杯容量
	private int productNum;//产品数量
	private String picture;//图片地址
	
	private int id;
	private String customerId;//用户id
	private HashMap<String, Integer> material;//key:原料 value:数量
	
	public Order() {
	}
	
	public Order(String customerId, int productNum, int materialTypeNum, String picture, int size) {
		this.customerId = customerId;
		this.productNum = productNum;
		this.picture = picture;
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public HashMap<String, Integer> getMaterial() {
		return material;
	}

	public void setMaterial(HashMap<String, Integer> material) {
		this.material = material;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
