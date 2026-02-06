import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                cnt++;
                if((n/i)!=i){
                    cnt++;
                }
            }
        }
        if(cnt == 2)
            System.out.println("The Entered Number is a Prime Number");
        else
            System.out.println("The Entered Number is not a Prime Number");
        s.close();
    }
}
