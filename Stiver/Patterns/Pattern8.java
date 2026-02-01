import java.util.Scanner;

public class Pattern8 {
    public static void pattern(int n){
        for(int a=n;a>=1;a--){
            for(int b=1;b<=n-a;b++){
                System.out.print(" ");
            }
            for(int c=1;c<=2*a-1;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = s.nextInt();
        pattern(n);
        s.close();
    }
}
