import java.util.Scanner;

public class Reverse {
    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            int last=n %10;
            rev = (rev * 10) + last;
            n = n/10;
        }
        return rev;
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = s.nextInt();
        System.out.println("Reverse Number is:"+reverse(n));
        s.close();
    }
}
