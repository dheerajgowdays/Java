import java.util.Scanner;

public class pyramid {

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            int num = i;

            // increasing
            for (int g = 1; g <= i; g++) {
                System.out.print(num + " ");
                num++;
            }

            // decreasing
            num -= 2;
            for (int g = 1; g <= i - 1; g++) {
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = s.nextInt();
        pattern(n);
        s.close();
    }
}
