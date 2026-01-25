import java.util.Scanner;

public class MirrorUpprTriangle{
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int g=1;g<=i;g++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int g=1;g<=n-(1*i-1);g++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n =s.nextInt();
        pattern(n);
        s.close();
    }
}
