import java.util.Scanner;

public class MirrorLowerTriangle{
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int g=1;g<=n-i +1;g++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int x=1;x<=n;x++){
            for(int y=1;y<=n-x;y++){
                System.out.print(" ");
            }
            for(int z=1;z<=x;z++){
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
