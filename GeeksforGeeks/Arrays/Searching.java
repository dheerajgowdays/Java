import java.util.Scanner;

public class Searching {
    public static void searched(int a[],int size,int key){
        for(int k=0;k<size;k++){
            if(a[k] == key){
                System.out.println(key+" is present in the array");
            }
        }
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
        System.out.print("Enter the number to be searched: ");
        int key = s.nextInt();
        searched(a,size, key);
        s.close();
    }
    
}