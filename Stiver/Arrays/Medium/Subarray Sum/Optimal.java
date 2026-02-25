import java.util.Scanner;

public class Optimal {
    static int SubArraySum(int array[]){
        int maxi = Integer.MIN_VALUE,sum =0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
            if(sum > maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum =0;
            } 
        }
        return maxi;
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
        System.out.println(SubArraySum(array));
        s.close();
    }
}
