// import java.sql.Date;
import java.util.Date;

public class A68_Date_Time {
    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        // is it safe to store the no. of millisecond in a variable of type long?
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}

