import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            rev = rev * 10 + digit;
        }
        if (y == rev )
            return true;
        else
            return false;
    }
}
public class Palandrome {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(x));
        s.close();
    }
}
