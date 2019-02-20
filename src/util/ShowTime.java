package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowTime {
    private Date date;
    private SimpleDateFormat simpleDateFormat;


    public ShowTime(){
        date= new Date();
        simpleDateFormat=new SimpleDateFormat("现在时间是:yyyy-MM-dd hh:mm:ss");

    }
    public String  gettime(){
        return simpleDateFormat.format(date);
    }
}
