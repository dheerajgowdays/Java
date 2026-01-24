import java.util.Scanner;

public class Problem20{
   public static void pattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=n-1;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
   }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = s.nextInt();
        pattern(n);
        s.close();
    }
}