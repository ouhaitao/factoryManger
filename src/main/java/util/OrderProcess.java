package util;

public class OrderProcess {

    /*
     * ����������һ��
     */
    public static final int PRINTING = 0;//ӡˢ
    public static final int CUT = 1;//ģ��
    public static final int MOLDING = 2;//����
    public static final int PACKING = 3;//��װ

    public static String getProcess(int i) {
        switch (i) {
            case 0:
                return "ӡˢ";
            case 1:
                return "ģ��";
            case 2:
                return "����";
            case 3:
                return "��װ";
            default:
                return "";
        }
    }
}
