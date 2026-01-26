//Neon Number

import java.util.Scanner;
class NeonNumber{
    public void check(Integer x){
        int result = x*x;
        String r = Integer.toString(result);
        int z=0;
        for(int i=0;i<r.length();i++){
            z += r.charAt(i)-'0';
        }
        if (x == z){
            System.out.println("Given number  "+x+" is Neon number");
        }
        else{
            System.out.println("Given number is not a Neon number");
        }
    }
}

public class problem17 {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x = in.nextInt();
        NeonNumber n = new NeonNumber();
        n.check(x);
        in.close();
    }    
}
