import java.util.Scanner;

public class Recursion1 {
    public static void f(int i,int n){
        if(i>n){
            return;
        }
        f(i+1,n);
        System.out.println(i);
    }
    public static void main(String args[]){
        Scanner  s = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = s.nextInt();
        f(1,n);
        s.close();
    }
}
