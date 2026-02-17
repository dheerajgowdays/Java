import java.util.Scanner;

public class Sorting {
    public static void sorting(int array[],int size){
        for(int i=0;i<=size-1;i++){
            int j=i;
            while(j>0 && array[j-1]>array[j]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a size of an array: ");
        int size = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the Elements of an array: ");
            array[i] = s.nextInt();
        }
        sorting(array,size);
        s.close();
    }
    
}
