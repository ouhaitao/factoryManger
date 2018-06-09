package po;

//订单
public class Order {
	private Integer size;//纸杯容量
	private Integer productnum;//产品数量
	
	private Integer id;
//	private HashMap<String, Integeregereger> material;//key:原料 value:数量
	private Integer process;//订单流程，订单处于的工艺流程，{"0":"印刷","1":"模切","2":"成型","3":"包装"}
	private Integer state;//订单状态，未开始为-1，生产中为0，暂停为-2，质检为1
	private Integer rate;//订单已完成数量

	public Order() {
	}

	public Order(Integer size, Integer productnum,Integer process, Integer state, Integer rate) {
		this.size = size;
		this.productnum = productnum;
		this.process=process;
		this.state = state;
		this.rate = rate;
	}

	public Integer getProcess() {
		return process;
	}

	public void setProcess(Integer process) {
		this.process = process;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getProductNum() {
		return productnum;
	}

	public void setProductNum(Integer productNum) {
		this.productnum = productNum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	/**
	 * 判断该订单是否信息异常
	 * @return
	 */
	public boolean isError(){
		if (size<=0||productnum<=0||rate<0||rate>productnum||process<0||process>3||state<-2||state>1){
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Order{" +
				"size=" + size +
				", productNum=" + productnum +
				", id=" + id +
				", process=" + process +
				", state=" + state +
				", rate=" + rate +
				'}';
	}
}
