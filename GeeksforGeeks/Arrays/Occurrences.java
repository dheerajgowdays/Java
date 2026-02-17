import java.util.ArrayList;
import java.util.Scanner;

public class Occurrences {
    public static void occur(int array[],int key,int size){
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            if(array[i] != key) {
                list.add(array[i]);
            } 
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        System.out.print("Enter the key: ");
        int key = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        occur(array,key,size);
        s.close();
    }
}
