package adminBehavior;

//�ʼ����Ա
public class CheckBehavior implements AdminBehavior{

	//�Ƿ��ʼ����
	private boolean isAgree;
	
	@Override
	public boolean behavior() {
		return isAgree;
	}

	public void setAgree(boolean isAgree) {
		this.isAgree = isAgree;
	}
}
