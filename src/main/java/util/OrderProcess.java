package util;

public class OrderProcess {

    /*
     * 订单正在哪一步
     */
    public static final int PRINTING = 0;//印刷
    public static final int CUT = 1;//模切
    public static final int MOLDING = 2;//成型
    public static final int PACKING = 3;//包装

    public static String getProcess(int i) {
        switch (i) {
            case 0:
                return "印刷";
            case 1:
                return "模切";
            case 2:
                return "成型";
            case 3:
                return "包装";
            default:
                return "";
        }
    }
}
