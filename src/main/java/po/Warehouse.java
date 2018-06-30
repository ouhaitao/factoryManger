package po;
public class Warehouse {

	private Integer id;
	private String materialtype;//原料类型
	private Integer stock;//库存

	public Warehouse() {
	}

	public Warehouse(Integer id, String materialType, Integer stock) {
		this.id = id;
		this.materialtype = materialType;
		this.stock = stock;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaterialType() {
		return materialtype;
	}

	public void setMaterialType(String materialType) {
		this.materialtype = materialType;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Warehouse{" +
				"id=" + id +
				", materialType='" + materialtype + '\'' +
				", stock=" + stock +
				'}';
	}
}
