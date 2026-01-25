import java.util.Scanner;
public class DecimalBinaryConverter {
    public static String decimalToBinary(int n){
        return Integer.toBinaryString(n);
    }
    public static int binaryToDecimal(String s,int y){
        return Integer.parseInt(s,y);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose:");
        System.out.println("A -> Decimal to Binary");
        System.out.println("B -> Binary to Decimal");
        char choice = s.next().charAt(0);
        switch(choice){
            case 'a':
                System.out.print("Enter a Decimal: ");
                int n = s.nextInt();
                System.out.println("Binary:"+decimalToBinary(n));
                break;
            case 'b':
                System.out.print("Enter a Binary: ");
                String x = s.next();
                System.out.print("Enter a radix: ");
                int y = s.nextInt();
                System.out.println("Decimal:"+binaryToDecimal(x,y));
                break;
            default:
                System.out.println("Enter a valid input");
        }
        s.close();
    }
}
