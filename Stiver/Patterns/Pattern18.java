import java.util.*;
class Pattern18 {
    public static void pattern(int n) {
        for(int i=0;i<n;i++){
            for(char j=(char)('E'- i);j<='E';j++){
                System.out.print(j+" ");
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