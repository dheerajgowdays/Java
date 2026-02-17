import java.util.ArrayList;
import java.util.Scanner;

public class Common {
    public static void comm(int array1[],int array2[],int size){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(array1[i] == array2[j])
                    if(!list.contains(array1[i]))
                        list.add(array1[i]);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        int array1[] = new int[size];
        int array2[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array1:");
            array1[i] = s.nextInt();
        }
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array2:");
            array2[i] = s.nextInt();
        }
        comm(array1, array2, size);
        s.close();
    }
}
