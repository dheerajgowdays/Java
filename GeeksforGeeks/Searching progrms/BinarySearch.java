import java.util.*;
class search{
    public int searching(int a[],int x){
        int l = a.length;
        int s =  0;
        int e = l-1;
        while (s <= e){
            int mid = (s + e)/2;
        if (a[mid] == x){
            return mid;
        }
        else if (a[mid]>x){
            e=mid-1;
        }
        else{
            s = mid+1;
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
        search b = new search();
        int index = b.searching(a,x);
        if (index == -1){
            System.out.println("Number is not found ");
        }
        else{
            System.out.println("Number is found at index:"+index);
        }
        s.close();
    }
}
