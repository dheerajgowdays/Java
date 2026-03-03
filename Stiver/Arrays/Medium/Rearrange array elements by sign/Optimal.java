import java.util.ArrayList;
import java.util.Scanner;

public class Optimal {
    static void rearrange(int array[]){
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            list.add(0);
        }
        int pos = 0;
        int neg = 1;
        for(int i=0;i<array.length;i++){
            if(array[i]>=0){
                list.add(pos,array[i]);
                pos+=2;
            }
            else{
                list.add(neg,array[i]);
                neg+=2;
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an arrya: ");
        int size = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        rearrange(array);
        s.close();
    }
}
