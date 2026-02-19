import java.util.Scanner;

public class RRotation {
    public static void reverse(int array[],int start,int end){
        while(start<=end){
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            start++;
            end--;
        }
    }
    public static void rotation(int array[],int k){
        int size = array.length;
        k=k%size;
        reverse(array,0,size-(k+1));
        reverse(array,size-k,size-1);
        reverse(array,0,size-1);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        System.out.print("Enter the rotation place:");
        int k = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        rotation(array, k);
        s.close();
    }
}
