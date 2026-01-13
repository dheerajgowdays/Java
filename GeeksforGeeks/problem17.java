import java.util.Scanner;
class NeonNumber{
    public void check(Integer x){
        int result = x*x;
    }
}

public class problem17 {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number");
        int x = in.nextInt();
        NeonNumber n = new NeonNumber();
        n.check(x);
        in.close();
    }    
}
