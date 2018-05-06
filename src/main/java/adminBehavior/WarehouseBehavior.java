package adminBehavior;

import po.Warehouse;

public class WarehouseBehavior implements AdminBehavior{

	private Warehouse w;
	private int need;
	
	public WarehouseBehavior(Warehouse w,int need) {
		this.w=w;
		this.need=need;
	}
	
	@Override
	public boolean behavior() {
		int stock=w.getStock();
		if(stock>=need){
			w.setStock(stock-need);
			return true;
		}else
			return false;
	}
}
