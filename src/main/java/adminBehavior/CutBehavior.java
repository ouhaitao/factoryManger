package adminBehavior;

//ģ�й���Ա
public class CutBehavior implements AdminBehavior{

	//��������
	private int schedule;
	
	@Override
	public boolean behavior() {
		//�����������,����true
		if(schedule==100)
			return true;
		return false;
	}
	
	public void setSchedule(int schedule) {
		this.schedule = schedule;
	}
}
