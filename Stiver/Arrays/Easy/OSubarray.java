import java.util.Scanner;

public class OSubarray {
    static void subarray(int array[],int key){
        
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        System.out.print("Enter the key sum: ");
        int key = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        subarray(array,key);
        s.close();
    }
}
