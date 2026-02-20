import java.util.Scanner;

public class Zeros {
    public static void zeros(int array[]){
        int j=0;
        for(int i=j+1;i<array.length;i++){
            if(array[i]!=0){
            int temp = array[j];
            array[j]=array[i];
            array[i]=temp;
            j++;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
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
        zeros(array);
        s.close();
    }   
}
