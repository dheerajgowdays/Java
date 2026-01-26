//Leap Year

import java.util.Scanner;
class LeapYear{
    public void check(Integer x){
        if (x % 400 == 0 || (x % 4 == 0 && x % 100 != 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}

public class problem16 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int x = a.nextInt();
        LeapYear obj = new LeapYear();
        obj.check(x);
        a.close();
    }
}
