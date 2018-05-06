package po;

import java.util.HashMap;

//����
public class Order {

	private Address address;//�û���ַ
	private int size;//ֽ������
	private int productNum;//��Ʒ����
	private String picture;//ͼƬ��ַ
	
	private int id;
	private String customerId;//�û�id
	private HashMap<String, Integer> material;//key:ԭ�� value:����
	
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
