import java.util.Scanner;

public class Largest {
    public static int[] sort(int array[],int size){
        for(int i=0;i<size;i++){
            int j=i;
            while(j>0 && array[j-1] >= array[j]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--; 
            }
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt(); 
        }
        sort(array,size);
        System.out.println("The Largest element of an array is: "+array[size-1]);
        s.close();
    }
}
