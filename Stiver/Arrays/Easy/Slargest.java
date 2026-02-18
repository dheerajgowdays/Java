import java.util.Scanner;

public class Slargest {
    public static void slargest(int array[],int size){
        int Largest = array[0];
        int Slargest = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(array[i]>Largest){
                Slargest = Largest;
                Largest = array[i];
            }
            else if((array[i]<Largest) && (array[i]>Slargest)){
                Slargest = array[i];
            }
        }
        System.out.println("The second Largest element in the array is "+Slargest);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] =s.nextInt();
        }
        slargest(array, size);
        s.close();
    }
}
