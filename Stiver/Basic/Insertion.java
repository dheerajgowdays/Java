import java.util.Scanner;

public class Insertion {
    public static int[] sorting(int a[],int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && a[j-1]>a[j]){
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
            }
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter elements: ");
            a[i] = sc.nextInt();
        }
        sorting(a, n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
