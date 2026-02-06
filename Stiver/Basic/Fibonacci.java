import java.util.Scanner;

public class Fibonacci{
    static int fib(int n){
        if (n==0)
            return 0;
        else if(n==1)
            return 1;
        else{
            int x=0,a=0,b=1;
            for(int i=2;i<=n;i++){
                x = a+b;
                a=b;
                b=x;
            }
            return x;
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        System.out.println(fib(n));
        s.close();
    }
}