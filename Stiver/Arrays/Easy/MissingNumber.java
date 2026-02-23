import java.util.Scanner;

public class MissingNumber{
    static void missing(int array[]){
        int xor = 0;
        for(int i=0;i<array.length;i++){
            xor = xor ^i^ array[i];
        }
        System.out.println("The element that is missing is : "+(xor ^ array.length));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        missing(array);
        s.close();
    }
}
