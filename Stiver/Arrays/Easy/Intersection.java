import java.util.ArrayList;
import java.util.Scanner;

public class Intersection {
    static void inter(int array1[],int array2[],int size1,int size2){
        int i=0;
        int j=0;
        ArrayList <Integer> list= new ArrayList<>(); 
        while(i<size1 && j<size2){
            if(array1[i] < array2[j]){
                i++;
            }
            else if(array2[j] < array1[i]){
                j++;
            }
            else{
                list.add(array1[i]);
                i++;
                j++;
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array1: ");
        int size1 = s.nextInt();
        System.out.print("Enter the size of an array2: ");
        int size2 = s.nextInt();
        int array1[] = new int[size1];
        int array2[] = new int[size2];
        for(int i=0;i<size1;i++){
            System.out.print("Enter the elements of an array1: ");
            array1[i] = s.nextInt();
        }
        System.out.println();
        for(int i=0;i<size2;i++){
            System.out.print("Enter the elements of an array2: ");
            array2[i] = s.nextInt();
        }
        inter(array1,array2,size1,size2);
        s.close();
    }
}
