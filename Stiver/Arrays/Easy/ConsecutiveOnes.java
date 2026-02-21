import java.util.Scanner;

public class ConsecutiveOnes {
    static void ones(int array[],int size){
        int cnt = 0;
        int maxi = 0;
        for(int i=0;i<size;i++){
            if(array[i] == 1){
                cnt++;
                maxi = Math.max(maxi, cnt);
            }
            else{
                cnt = 0;
            }
        }
        System.out.println("The consecutive ones in this array is:"+maxi);
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
        ones(array,size);
        s.close();
    }
}
