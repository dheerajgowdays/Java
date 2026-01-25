import java.util.Scanner;
public class StringDoubleConverter{
    public static String doubleToString(double l){
        return String.valueOf(l);
    }
    public static double stringToDouble(String s){
        double n = Double.parseDouble(s);
        return n;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose:");
        System.out.println("A -> String to Double");
        System.out.println("B -> Double to String");
        char choice = s.next().toLowerCase().charAt(0);
        switch(choice){
            case 'a':
                System.out.print("Enter a String: ");
                String x = s.next();
                System.out.println("Double:"+stringToDouble(x));
                break;
            case 'b':
                System.out.print("Enter a Double: ");
                Double y =s.nextDouble();
                System.out.println("String:"+doubleToString(y));
                break;
            default:
                System.out.println("Enter a valid input");
        }
        s.close();
    }
}
