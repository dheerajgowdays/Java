import java.util.Scanner;

public class Duplicate {
    public static int occurance(int array[]){
        int i=0;
        for(int j=1;j<array.length;j++){
            if(array[i] != array[j]){
                array[i+1] = array[j]; 
                i++;
            }
        }
        return i+1;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        System.out.println("The size of an unique array is "+occurance(array));
        s.close();
    }
}
