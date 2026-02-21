import java.util.ArrayList;
import java.util.Scanner;

public class Union {
    static void union(int array1[],int array2[],int size1,int size2){
        int i=0;
        int j=0;
        ArrayList <Integer> list = new ArrayList<Integer>();
        while(i<size1 && j<size2){
            if(array1[i]<=array2[j]){
                if(list.size() == 0 || list.get(list.size()-1)!= array1[i]){
                    list.add(array1[i]);
                }
                i++;
            }
            else{
                if(list.size() == 0 || list.get(list.size()-1) != array2[j]){
                    list.add(array2[j]);
                }
                j++;
            }
        }
        while(i<size1){
            if(list.size() == 0 || list.get(list.size()-1)!= array1[i]){
                    list.add(array1[i]);
                }
                i++;
            }
        while (j<size2) {
            if(list.size() == 0 ||       list.get(list.size()-1) != array2[j]){
                    list.add(array2[j]);
                }
                j++;
        }
        System.out.println("Union of array1 and array2 is:"+list);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array 1:");
        int size1 = s.nextInt();
        System.out.print("Enter the size of an array 2: ");
        int size2 = s.nextInt();
        int array1[] = new int[size1];
        int array2[] = new int[size2];
        for(int i=0;i<size1;i++){
            System.out.print("Enter the elements of an array1: ");
            array1[i] = s.nextInt();
        }
        for(int i=0;i<size2;i++){
            System.out.print("Enter the elements of an array2: ");
            array2[i] = s.nextInt();
        }
        union(array1, array2, size1, size2);
        s.close();
    }
}
