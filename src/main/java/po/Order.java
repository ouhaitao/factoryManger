package po;

//����
public class Order {
	private int size;//ֽ������
	private int productNum;//��Ʒ����
	
	private int id;
//	private HashMap<String, Integer> material;//key:ԭ�� value:����
	private int process;//�������̣��������ڵĹ������̣�{"0":"ӡˢ","1":"ģ��","2":"����","3":"��װ"}
	private int state;//����״̬��δ��ʼΪ-1��������Ϊ0����ͣΪ-2���ʼ�Ϊ1
	private int rate;//�������������

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
