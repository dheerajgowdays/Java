import java.util.ArrayList;
import java.util.Scanner;

public class Merge {
    public static void add(int array1[],int array2[],int size){
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(array1[i]);
        }
        for(int i=0;i<size;i++){
            list.add(array2[i]);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        int array1[] = new int[size];
        int array2[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array1:");
            array1[i] = s.nextInt();
        }
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array2:");
            array2[i] = s.nextInt();
        }
        add(array1,array2,size);
        s.close();
    }
}
