import java.util.Scanner;
class oddoreven{
    public void check(Integer a){
        if (a%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}
public class problem10{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = s.nextInt();
        oddoreven obj = new oddoreven();
        obj.check(a);
        s.close();
    }
}