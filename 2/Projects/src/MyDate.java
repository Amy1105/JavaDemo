import java.time.Year;

public class MyDate {

    public  MyDate(int y,int m,int d)
    {
        year=y;
        month=m;
        day=d;
    }
    public  MyDate(){
        year=2012;
        month=11;
        day=8;
    }
    private  int year;
    private  int month;
    private int day;

    public  int getYear(){
        return year;
    }

    public  int getMonth()
    {
        return  month;
    }

    public  int getDay()
    {
        return day;
    }

    public  String getDateString(){
        return year+"年"+month+"月"+day+"日";
    }
}
