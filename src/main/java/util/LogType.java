package util;

/**
 * Created by PC on 2018/6/5.
 * 日志类型
 */
public class LogType {
    public static int MATERIAL = 1;//原料管理（增加、退料、废料处理等）
    public static int RATE = 2;//生产进度
    public static int QUALITY = 3;//质检
    public static int REPAIR = 4;//维修
    public static int EXCEPTION = 5;//异常处理

    public static String getType(int i) {
        switch (i) {
            case 1:
                return "原料管理";
            case 2:
                return "更新进度";
            case 3:
                return "质检";
            case 4:
                return "故障报修";
            case 5:
                return "异常处理";
            default:
                return "";
        }
    }
}
