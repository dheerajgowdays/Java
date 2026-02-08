import java.util.Scanner;

public class Recursion5 {
    public static boolean f(int i,String str){
        if(i>=str.length()/2)
            return true;
        else if(str.charAt(i)!=str.charAt(str.length()-i-1))
            return false;
        return f(i+1,str);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = s.nextLine();
        System.out.println(f(0, str));
        s.close();
    }
}
