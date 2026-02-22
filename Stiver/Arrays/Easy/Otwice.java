import java.util.Scanner;

public class Otwice {
    static int twice(int array[]){
        int xor = 0;
        for(int i=0;i<array.length;i++){
            xor = xor^array[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size =  s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        System.out.println("The elemnt that is one is: "+twice(array));
        s.close();
    }
}
