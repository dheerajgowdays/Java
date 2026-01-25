import java.util.Scanner;

public class SquarePattern {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n)
                    System.out.print("* ");
                else if(j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = s.nextInt();
        pattern(n);
        s.close();
    }
}
