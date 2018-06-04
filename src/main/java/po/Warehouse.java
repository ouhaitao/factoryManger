package po;

//仓库
public class Warehouse {

	private int id;
	private String materialType;//原料种类
	private int stock;//库存

	public Warehouse() {
	}

	public Warehouse(int id, String materialType, int stock) {
		this.id = id;
		this.materialType = materialType;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Warehouse{" +
				"id=" + id +
				", materialType='" + materialType + '\'' +
				", stock=" + stock +
				'}';
	}
}
