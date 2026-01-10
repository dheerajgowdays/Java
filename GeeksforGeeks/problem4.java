
import java.util.Scanner;

public class problem4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        String b = Integer.toBinaryString(a);
        System.out.println("Byte Value: "+b);
        sc.close();
    }
}
