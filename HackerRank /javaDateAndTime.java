import java.util.Locale;
import java.util.Calendar;
import java.util.Scanner;

class Result{
    public String findDay(int date,int month,int year){
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, date);
        String day = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        return day;
    }
}
public class javaDateAndTime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date: ");
        int date = sc.nextInt();
        System.out.print("Enter Month: ");
        int Month = sc.nextInt();
        System.out.println("Enter Year: ");
        int Year = sc.nextInt();
        Result s = new Result();
        System.out.println("Day: "+s.findDay(date,Month,Year));
    }
}