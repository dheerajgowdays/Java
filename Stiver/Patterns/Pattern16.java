import java.util.Scanner;

public class Pattern16 {
    public static void pattern(int n){
        for(int i=0;i<n;i++){
            char c = (char) ('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(c+" ");
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
