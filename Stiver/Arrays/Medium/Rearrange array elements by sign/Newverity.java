import java.util.ArrayList;
import java.util.Scanner;

public class Newverity {
    public static void rearrange(int array[]){
        ArrayList <Integer> pos= new ArrayList<>();
        ArrayList <Integer> neg= new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]>=0){
                pos.add(array[i]);
            }
            else{
                neg.add(array[i]);
            }
        }
        if(pos.size() > neg.size()){
            for(int i=0;i<neg.size();i++){
                array[2*i] = pos.get(i);
                array[(2*i)+1] = neg.get(i);
            }
            int index = neg.size()*2;
            for(int j=neg.size();j<pos.size();j++){
                array[index] = pos.get(j);
                index++;
            }
        }
        else{
            for(int i=0;i<pos.size();i++){
                array[2*i] = pos.get(i);
                array[(2*i)+1] = neg.get(i);
            }
            int index = pos.size()*2;
            for(int j=pos.size();j<neg.size();j++){
                array[index] = neg.get(j);
                index++;
            }   
        }
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
        rearrange(array);
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        s.close();
    }
}