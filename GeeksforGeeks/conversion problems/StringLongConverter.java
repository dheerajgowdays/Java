import java.util.Scanner;
public class StringLongConverter {
    public static String longToString(long l){
        return String.valueOf(l);
    }
    public static long stringToLong(String s){
        return Long.parseLong(s);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose:");
        System.out.println("A -> String to Long");
        System.out.println("B -> Long to String");
        char choice = s.next().charAt(0);
        switch(choice){
            case 'a':
                System.out.print("Enter a String: ");
                String x = s.nextLine();
                System.out.println("Long:"+stringToLong(x));
                break;
            case 'b':
                System.out.print("Enter a Long: ");
                long y =s.nextLong();
                System.out.println("String:"+longToString(y));
                break;
            default:
                System.out.println("Enter a valid input");
        }
        s.close();
    }
}
