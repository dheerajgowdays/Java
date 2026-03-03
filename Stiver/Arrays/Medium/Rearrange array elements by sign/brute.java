import java.util.ArrayList;
import java.util.Scanner;

public class brute {
    static void rearrange(int array[]){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]>=0){
                pos.add(array[i]);
            }
            else{
                neg.add(array[i]);
            }
        }
        for(int j=0;j<array.length/2;j++ ){
            array[2*j] = pos.get(j);
            array[(2*j)+1] = neg.get(j);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size  = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        rearrange(array);
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        s.close();
    }
}
