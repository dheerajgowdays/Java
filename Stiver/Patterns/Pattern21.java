import java.util.Scanner;

public class Pattern21 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n;k++){
                if(i==1 || i==n)
                    System.out.print("* ");
                else if(k==1 || k == n)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
        s.close();
    }
}
