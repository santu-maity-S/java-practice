import java.util.Scanner;
import java.time.DayOfWeek;
import java.util.Calendar;

public class Santu10 {
    public String daysofweek (int day, int month, int year) {
        Calendar c=Calendar.getInstance();
        c.set(year, month-1, day); 
        String[] days=new String[] {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Satarday","Sunday"};
        int n;
        n=c.get(c.DAY_OF_WEEK);
        return(days[n-1]);



    } 
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str;
        System.out.println("ENTER THE DATE(DD:MM:YYYY)");
        str=in.nextLine();
        int day=Integer.parseInt(str.substring(0,2));
        int month=Integer.parseInt(str.substring(3,5));
        int year=Integer.parseInt(str.substring(6,10));
        Santu10 obj=new Santu10();
        System.out.println(obj.daysofweek(day, month, year));
        

    }

    

    
}