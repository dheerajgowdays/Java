import java.util.Scanner;
class Sorting{
    public void qs(int a[],int low,int high){
        if(low<high){
            int povitindex = p(a,low,high);
            qs(a, low, povitindex-1);
            qs(a, povitindex+1, high); 
        }
    }
    private int p(int a[],int low,int high){
        int pivot = a[low];
        int i = low;
        int j = high;
        while(i<j){
            while(a[i]<=pivot && i<=high){
                i++;
            }
            while(a[j]>pivot && j>=low){
                j--;
            }
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[low] = a[j];
        a[j] = pivot;
        return j;
    }
}
public class Quicksort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<=n-1;i++){
            System.out.print("Enter elements of an array: ");
            a[i] = sc.nextInt();
        }
        Sorting obj = new Sorting();
        obj.qs(a, 0, n-1);
        for(int j=0;j<=n-1;j++){
            System.out.print(a[j]+" ");
        }
        System.out.println();
        sc.close();
    }
}
