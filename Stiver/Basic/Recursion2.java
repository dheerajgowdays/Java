import java.util.Scanner;

public class Recursion2 {
    public static void  f(int i,int sum){
        if (i<1){
            System.out.println("Sum:"+sum);
            return;
        }
        f(i-1, sum+i);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = s.nextInt();
        f(n,0);
        s.close();
    }
}
