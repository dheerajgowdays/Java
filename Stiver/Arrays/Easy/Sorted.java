import java.util.Scanner;

public class Sorted {
    public static void sorted(int array[]){
        for(int i=1;i<array.length;i++){
            if(array[i]>=array[i-1]){
                continue;
            }
            else{
                System.out.println("The array is not Sorted");
                break;
            }
        }
        System.out.println("The array is Sorted");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size = s.nextInt();
        int [] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        sorted(array);
        s.close();
    }
}
