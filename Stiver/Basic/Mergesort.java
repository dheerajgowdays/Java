import java.util.Scanner;

public class Mergesort {
    public static int[] mergesort(int a,int low,int high){
        if(low == high)
            return;
        int mid = (low+high)/2;
        mergesort(a, low, mid);
        mergesort(a, mid+1, high);
        merge(a,mid,low,high);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<=n-1;i++){
            System.out.println("Enter elments of array:");
            a[i] = sc.nextInt();
        }
        mergesort(a, 0, n-1);
        for(int j=0;j<=n-1;j++){
            System.out.println(a[j]+" ");
        }
    }
    
}
