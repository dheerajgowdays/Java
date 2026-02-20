import java.util.Scanner;
class Solution {
    public boolean check(int[] nums) {
        int drop = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=nums[i-1]){
                
            }
            else{
                drop++;
            }
        }
        if(nums[0]<nums[nums.length-1]){
            drop++;
        }
        if(drop != 1){
            return false;
        }
        else{
            return true;
        }
    }
}
public class LeetSorting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        Solution obj = new Solution();
        System.out.println(obj.check(array));
        s.close();
    }
}
