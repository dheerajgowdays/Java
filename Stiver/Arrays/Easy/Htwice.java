import java.util.Scanner;

public class Htwice{
    static void twice(int array[],int size){
        int maxi = array[0];
        for(int i=0;i<size;i++){
            maxi = Math.max(maxi, array[i]);
        }
        int hash[] = new int[maxi];
        for(int j=0;j<hash.length;j++){
            hash[array[j]]++;
        }
        for(int k=0;k<hash.length;k++){
            if(hash[array[k]]== 1){
                System.out.println("The single number is: "+array[k]);
            }
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        twice(array,size);
        s.close();
    }
}