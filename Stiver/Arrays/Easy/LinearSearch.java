import java.util.Scanner;

public class LinearSearch {
    static void search(int array[],int key){
        boolean found = true;
        for(int i=0;i<array.length;i++){
            if(array[i]== key){
                System.out.println("Element is found at index: "+i);
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Element is not found in the array");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        System.out.print("Enter the number to be searched: ");
        int key = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<array.length;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        search(array,key);
        s.close();
    }
}
