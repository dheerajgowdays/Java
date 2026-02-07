import java.util.Scanner;

public class Recursion2 {
    public static void f(int i,int n){
        int sum=0;
        if (i<1)
            return;
        f(i-1, n);
        sum += i; 
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = s.nextInt();
        f(n,n);
        s.close();
    }
}
