import java.util.Scanner;

public class Better {
    static int SubArraySum(int array[]){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            int sum = 0;
            for(int j=i;j<array.length;j++){
                sum += array[j];
                maxi = Math.max(maxi, sum);
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
            System.out.print("Enter the elements of array: ");
            array[i] = s.nextInt();
        }
        System.out.println(SubArraySum(array));
        s.close();
    }
}
