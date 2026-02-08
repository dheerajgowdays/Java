import java.util.Scanner;

public class Recursion3 {
    public static int f(int n){
        if(n == 0)
            return 1;
        return n*f(n-1);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = s.nextInt();
        System.out.println("Factorial is: "+f(n));
        s.close();
    }
    
}
