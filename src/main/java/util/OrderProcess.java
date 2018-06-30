package util;

public class OrderProcess {


    public static final int PRINTING = 0;
    public static final int CUT = 1;
    public static final int MOLDING = 2;
    public static final int PACKING = 3;

    public static String getProcess(int i) {
        switch (i) {
            case 0:
                return "PRINTING";
            case 1:
                return "CUT";
            case 2:
                return "MOLDING";
            case 3:
                return "PACKING";
            default:
                return "";
        }
    }
}
