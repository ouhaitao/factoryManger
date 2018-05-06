package adminBehavior;

//模切管理员
public class CutBehavior implements AdminBehavior{

	//工作进度
	private int schedule;
	
	@Override
	public boolean behavior() {
		//工作进度完成,返回true
		if(schedule==100)
			return true;
		return false;
	}
	
	public void setSchedule(int schedule) {
		this.schedule = schedule;
	}
}
