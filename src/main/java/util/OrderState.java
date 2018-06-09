package util;

public class OrderState {

    /*
     * 订单正在哪一步
     */
    public static final int NOTSTART = -1;
    public static final int PRODUCE = 0;
    public static final int PAUSE = -2;
    public static final int QUALITY = 1;

    public static String getState(int i) {
        switch (i) {
            case -1:
                return "待生产";
            case 0:
                return "生产";
            case 1:
                return "质检中";
            case 2:
                return "暂停";
            default:
                return "";
        }
    }

}
