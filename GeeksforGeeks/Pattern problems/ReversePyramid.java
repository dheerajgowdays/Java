import java.util.Scanner;

public class ReversePyramid {
    public static void pattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}
