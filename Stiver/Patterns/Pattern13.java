import java.util.Scanner;
class pattern{
    public void patt(int n){
        int x=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
public class Pattern13 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = s.nextInt();
        pattern obj = new pattern();
        obj.patt(n);
        s.close();
    }   
}
