package po;

//����
public class Order {
	private Integer size;//ֽ������
	private Integer productnum;//��Ʒ����
	
	private Integer id;
//	private HashMap<String, Integeregereger> material;//key:ԭ�� value:����
	private Integer process;//�������̣��������ڵĹ������̣�{"0":"ӡˢ","1":"ģ��","2":"����","3":"��װ"}
	private Integer state;//����״̬��δ��ʼΪ-1��������Ϊ0����ͣΪ-2���ʼ�Ϊ1
	private Integer rate;//�������������

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
	 * �жϸö����Ƿ���Ϣ�쳣
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
