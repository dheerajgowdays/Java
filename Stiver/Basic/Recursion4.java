import java.util.Scanner;

public class Recursion4 {
    public static void r(int i,int a[],int n){
        if(i>=n/2)
            return;
        int temp=a[i];
        a[i] = a[n-i-1];
        a[n-i-1] = temp;
        r(i+1,a,n);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the Element: ");
            int e = s.nextInt();
            a[i] = e;
        }
        r(0,a,n);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        s.close();
    }
}
