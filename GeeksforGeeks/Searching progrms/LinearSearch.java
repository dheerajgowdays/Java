import java.util.Scanner;
class search{
    public int searching(int a[],int b){
        int n = a.length;
        for(int i=0;i<=n;i++){
            if (a[i] == b)
                return i;
        }
        return -1; 
    }
}
public class LinearSearch{
    public static void  main(String args[]){
        Scanner s = new Scanner(System.in);
        int a[] = {2,4,3,6,43,6,9,7};
        System.out.println("Enter a number to search:");
        int x = s.nextInt();
        search obj = new search();
        int index = obj.searching(a,x);
        if (index == -1)
            System.out.println("Element not found ");
        else
            System.out.println("Element found at index: "+index);
        s.close();
    }
}