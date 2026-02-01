import java.util.Scanner;
class pattern{
    public void patt(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            } 
            for(int k=1;k<=2*i;k++){
                System.out.print("  ");
            }  
            for(int l=n;l>i;l--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            } 
            for(int k=1;k<=2*n-(2*i);k++){
                System.out.print("  ");
            }  
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class Pattern19{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=s.nextInt();
        pattern obj = new pattern();
        obj.patt(n);
        s.close();
    }
}