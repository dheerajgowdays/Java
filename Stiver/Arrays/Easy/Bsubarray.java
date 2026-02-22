import java.util.Scanner;

public class Bsubarray {
    static void longsubarray(int array[],int key){
        int len = 0;
        for(int i=0;i<array.length;i++){
            int sum =0;
            for(int j=i;j<array.length;j++){
                sum += array[j]; 
                if(sum == key){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        System.out.println(len);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        System.out.println("Enter the sum of an sarray: ");
        int key = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        longsubarray(array,key);
        s.close();
    }
}
