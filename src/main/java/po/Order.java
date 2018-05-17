package po;

//订单
public class Order {
	private int size;//纸杯容量
	private int productNum;//产品数量
	
	private int id;
//	private HashMap<String, Integer> material;//key:原料 value:数量
	private int process;//订单流程，订单处于的工艺流程，{"0":"印刷","1":"模切","2":"成型","3":"包装"}
	private int state;//订单状态，未开始为-1，生产中为0，暂停为-2，质检为1
	private int rate;//订单已完成数量

	public Order() {
	}

	public Order(int size, int productNum, int id,int process, int state, int rate) {
		this.size = size;
		this.productNum = productNum;
		this.process=process;
		this.id = id;
		this.state = state;
		this.rate = rate;
	}

	public int getProcess() {
		return process;
	}

	public void setProcess(int process) {
		this.process = process;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
}
