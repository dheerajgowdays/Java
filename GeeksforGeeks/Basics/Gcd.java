import java.util.Scanner;

public class Gcd {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number To find GCD");
        System.out.print("Number 1:");
        int a = s.nextInt();
        System.out.print("Number 2:");
        int b = s.nextInt();
        int gcd=0;
        for(int i=1;i<=Math.min(a, b);i++){
            if (a%i==0 && b%i==0){
                gcd =i;
            }
        }
        System.out.println("The GCD is:"+gcd);
        s.close();
    }
}
