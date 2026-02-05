import java.util.Scanner;
class Digit{
    public int count(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n=n/10;
        }
        return cnt;
    }
}

public class Count {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = s.nextInt();
        Digit obj= new Digit();
        System.out.println("Number of digits:"+obj.count(n));
        s.close();
    }
}
