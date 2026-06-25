
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum+=(i*i);
        }
        System.out.println("The sum of square of n natural numbers is:"+sum);
    }
}
