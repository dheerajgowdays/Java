import java.util.Scanner;
public class Ssmallest {
    public static void ssmallest(int array[],int size){
        int Smallest = array[0];
        int Ssmallest = Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(array[i]<Smallest){
                Ssmallest = Smallest;
                Smallest = array[i];
            }
            else if((array[i]<Smallest) && (array[i]<Ssmallest)){
                Ssmallest = array[i];
            }
        }
        System.out.println("The second Largest element in the array is "+Ssmallest);
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
        ssmallest(array, size);
        s.close();
    }
}

