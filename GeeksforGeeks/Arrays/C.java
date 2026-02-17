import java.util.ArrayList;
import java.util.Scanner;

public class C{
    public static void copy(int a[],int size){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(a[i]);
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(list);
    }
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of a an array: ");
            a[i] = s.nextInt();
        }
        copy(a,size);
        s.close();
    }
}