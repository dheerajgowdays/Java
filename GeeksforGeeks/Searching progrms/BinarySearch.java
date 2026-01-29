import java.util.*;
class search{
    public int searching(int a[],int x){
        int len = a.length;
        int start =  0;
        int end = len-1;
        while (start <= end){
            int mid = (start + end)/2;
        if (a[mid] == x){
            return mid;
        }
        else if (a[mid]>x){
            end =mid-1;
        }
        else{
            start = mid+1;
        }
    }
    return -1;
    }
}
public class BinarySearch {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a[] = {3,4,7,8,9,12,17};
        System.out.print("Enter number to search:");
        int x = s.nextInt();
        search obj = new search();
        int index = obj.searching(a,x);
        if (index == -1){
            System.out.println("Number is not found");
        }
        else{
            System.out.println("Number is found at index:"+index);
        }
        s.close();
    }
}
