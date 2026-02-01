import java.util.Scanner;

public class Pattern17 {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            char c ='A';
            int breakp =((2*i)-1)/2;
            for(int k=1;k<=2*i-1;k++){
                System.out.print(c+" ");
                if(k<=breakp) c++;
                else c--;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = s.nextInt();
        pattern(n);
        s.close();
    }
    
}
