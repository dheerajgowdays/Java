import java.util.HashMap;
import java.util.Scanner;

public class Better{
    static int Majority(int array[]){
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            map.put(array[i], map.getOrDefault(array[i],0)+1);
        }
        for(int i : map.keySet()){
            if( map.get(i) >(array.length/2))
                return i;
        }
    return -1;
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
        System.out.println(Majority(array));
        s.close();
    }    
}
