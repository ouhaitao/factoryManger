package util;

public class QualityState {

	/**
	 * NOCHECK 未质检
	 * CHECKING 质检中
	 * CHECKPASS 之间失败
	 * CHECKFAILED 质检合格
	 */
	public static final int NOCHECK=0;
	public static final int CHECKING=1;
	public static final int CHECKPASS=2;
	public static final int CHECKFAILED=3;
}
