
import java.util.Scanner;

public class problem2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A:");
        int i = sc.nextInt();
        System.out.print("Enter B:");
        int j = sc.nextInt();
        System.out.println("Sum: "+(i+j));
        sc.close();
    }
}
