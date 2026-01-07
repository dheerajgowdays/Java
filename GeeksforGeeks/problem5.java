package GeeksforGeeks;

import java.util.Scanner;

class fact{
    static int factorial(int n){
        int r=1,i;
        for(i=0;i<=n;i++)
            r*=i;
        return r;
    }
}
public class problem5 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Factorial of A: "+ fact.factorial(a));
        sc.close();
    }
}
