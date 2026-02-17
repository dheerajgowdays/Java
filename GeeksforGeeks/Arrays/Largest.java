import java.util.Scanner;

public class Largest {
    public static int[] sorting(int array[],int size){
        for(int i=0;i<=size-1;i++){
            int j=i;
            while(j>0 && array[j-1]>array[j]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }
    public static void largest(int array[],int size){
        sorting(array, size);
        System.out.println("The largest element in the array is:"+array[size-1]);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter elements of an array: ");
            array[i] = s.nextInt();
        }  
        largest(array,size); 
        s.close();
    }
}
