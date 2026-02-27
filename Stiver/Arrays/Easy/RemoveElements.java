import java.util.Scanner;

public class RemoveElements {
    public static void remove(int nums[],int val) {
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = s.nextInt();
        System.out.println("Enter the value to be removed: ");
        int val = s.nextInt();
        int nums[]  = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the elements of an array: ");
            nums[i] = s.nextInt();
        }
        remove(nums, val);
        s.close();
    }
}
