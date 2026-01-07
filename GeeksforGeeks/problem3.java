package GeeksforGeeks;

import java.util.Scanner;

public class problem3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        int c = 0;
        c=a;
        a=b;
        b=c;
        System.out.println("Value A: "+a);
        System.out.println("Value B: "+b);
        sc.close();
    }
}
