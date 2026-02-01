import java.util.Scanner;
class pattern{
    public void patt(int n){
        for(int i=n-1;i>=0;i--){
            for(char j='A';j<='A'+i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        }
    }
}
public class Pattern15 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = s.nextInt();
        pattern obj = new pattern();
        obj.patt(n);
        s.close();
    }
    
}
