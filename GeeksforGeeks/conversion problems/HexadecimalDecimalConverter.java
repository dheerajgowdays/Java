import java.util.*;
public class HexadecimalDecimalConverter {
    public static String decimalToHexadecimal(int n){
        return Integer.toHexString(n);
    }
    public static int hexadecimalToDecimal(String s,int y){
        return Integer.parseInt(s,y);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose:");
        System.out.println("A -> Decimal to Hexadecimal");
        System.out.println("B -> Hexadecimal to Decimal");
        char choice = s.next().charAt(0);
        switch(choice){
            case 'a':
                System.out.print("Enter a Decimal: ");
                int n = s.nextInt();
                System.out.println("Hexadecimal:"+decimalToHexadecimal(n));
                break;
            case 'b':
                System.out.print("Enter a Hexadecimal: ");
                String x = s.next();
                int y = 16;
                System.out.println("Decimal:"+hexadecimalToDecimal(x,y));
                break;
            default:
                System.out.println("Enter a valid input");
        }
        s.close();
    }
}

