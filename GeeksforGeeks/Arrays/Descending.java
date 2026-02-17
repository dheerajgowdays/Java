import java.util.Scanner;

public class Descending {
    public static void sorting(int array[],int size){
        for(int i=0;i<size;i++){
            int j = i;
            while(j>0 && array[j-1] <= array[j]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = sc.nextInt();
        }
        sorting(array,size);
        sc.close();
    }
}
