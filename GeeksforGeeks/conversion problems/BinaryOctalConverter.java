import java.util.*;
public class BinaryOctalConverter  {
    public static String binaryToOctal(String n){
        int d = Integer.parseInt(n,2);
        return Integer.toOctalString(d);
    }
    public static String octalToBinary(String s,int y){
        int d = Integer.parseInt(s,y);
        return Integer.toBinaryString(d);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose:");
        System.out.println("A -> Binary to Octal");
        System.out.println("B -> Octal to Binary");
        char choice = s.next().charAt(0);
        switch(choice){
            case 'a':
                System.out.print("Enter a Binary: ");
                String n = s.next();
                System.out.println("Octal:"+binaryToOctal(n));
                break;
            case 'b':
                System.out.print("Enter a Octal: ");
                String x = s.next();
                int y = 8;
                System.out.println("Binary:"+octalToBinary(x,y));
                break;
            default:
                System.out.println("Enter a valid input");
        }
        s.close();
    }
}

