import java.util.Scanner;
class TrianglePattern{
    public void pattern(int n){
        if(n<=0){
            System.out.println("Enter a positive number");return;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Problem19 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = s.nextInt();
        TrianglePattern obj = new TrianglePattern();
        obj.pattern(n);
        s.close();
    }
    
}
