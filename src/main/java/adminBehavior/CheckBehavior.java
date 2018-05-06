package adminBehavior;

//质检管理员
public class CheckBehavior implements AdminBehavior{

	//是否质检过关
	private boolean isAgree;
	
	@Override
	public boolean behavior() {
		return isAgree;
	}

	public void setAgree(boolean isAgree) {
		this.isAgree = isAgree;
	}
}
