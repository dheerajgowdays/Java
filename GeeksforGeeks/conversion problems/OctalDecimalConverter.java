import java.util.*;
public class OctalDecimalConverter  {
    public static String decimalToOctal(int n){
        return Integer.toOctalString(n);
    }
    public static int octalToDecimal(String s,int y){
        return Integer.parseInt(s,y);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose:");
        System.out.println("A -> Decimal to Octal");
        System.out.println("B -> Octal to Decimal");
        char choice = s.next().charAt(0);
        switch(choice){
            case 'a':
                System.out.print("Enter a Decimal: ");
                int n = s.nextInt();
                System.out.println("Octal:"+decimalToOctal(n));
                break;
            case 'b':
                System.out.print("Enter a Octal: ");
                String x = s.next();
                int y = 8;
                System.out.println("Decimal:"+octalToDecimal(x,y));
                break;
            default:
                System.out.println("Enter a valid input");
        }
        s.close();
    }
}

