import java.util.Scanner;

public class Mergesort {
    public static void merge(int a[],int low,int mid,int high){
        int temp[] = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int k = 0;
        while((left <= mid)&&(right <= high)){
            if(a[left]<a[right]){
                temp[k++] = a[left];
                left++;
            }
            else{
                temp[k++]=a[right];
                right++;
            }
        }
        while(left<=mid){
            temp[k++] = a[left];
            left++;
        }
        while(right<=high){
            temp[k++]=a[right];
            right++;
        }
        for(int i=low;i<=high;i++){
            a[i] = temp[i-low];
        } 
    }
    public static void mergesort(int a[],int low,int high){
        if(low >= high)
            return;
        int mid = (low+high)/2;
        mergesort(a, low, mid);
        mergesort(a, mid+1, high);
        merge(a,low,mid,high);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter elments of array:");
            a[i] = sc.nextInt();
        }
        mergesort(a, 0, n-1);
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }
        System.out.println();
        sc.close();
    }
    
}