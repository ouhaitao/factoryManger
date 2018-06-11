package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static final String getDate(String format){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        Date date=new Date();
        return simpleDateFormat.format(date);
    }
}
