import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = s.nextInt();
        int cnt = 0;
        int sum = 0;
        int y = n;
        int x = n;
        while(n!=0){
            cnt++;
            n = n/10;
        }
        while(x!=0){
            int dg = x % 10;
            sum += Math.pow(dg, cnt) ;
            x=x/10;
        }
        if(y==sum)
            System.out.println("Entered number is a Armstrong Number");
        else
            System.out.println("Entered number is not a Armstrong Number");
            s.close();
    }
    
}
