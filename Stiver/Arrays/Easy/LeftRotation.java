import java.util.Scanner;

public class LeftRotation {
    public static void rotation(int array[]){
        int temp = array[0];
        for(int i=1;i<array.length;i++){
            array[i-1] = array[i];
        }
        array[(array.length)-1] = temp;
        for(int j=0;j<array.length;j++){
        System.out.print(+array[j]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements in an array: ");
            array[i] = s.nextInt();
        }
        rotation(array);
        s.close();
    }
}
