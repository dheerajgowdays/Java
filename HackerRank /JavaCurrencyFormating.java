
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormating {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        Locale INDIA = new Locale("en","IN");
        NumberFormat in = NumberFormat.getCurrencyInstance(INDIA);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("Us: " + us.format(payment));
        System.out.println("India: "+ in.format(payment));
        System.out.println("China: "+ ch.format(payment));
        System.out.println("France: "+fr.format(payment));
    }
}
