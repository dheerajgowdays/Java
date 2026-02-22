import java.util.Scanner;

public class Btwice{
    static int twice(int array[],int size){
        for(int i=0;i<size;i++){
            int cnt = 0;
            for(int j=0;j<size;j++){
                if(array[i]==array[j])
                    cnt++;
            }
            if (cnt==1){
                return array[i];
            }
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
        System.out.println(twice(array,size)); 
        s.close();
    }
}