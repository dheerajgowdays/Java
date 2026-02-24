import java.util.Scanner;

public class Brute {
    static int SubArraySum(int array[]){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += array[k];
                }
                maxi = Math.max(sum, maxi);
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
