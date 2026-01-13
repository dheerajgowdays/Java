//Perimeter of an Rectangle

import java.util.Scanner;
class Perimeter{
    public void OptionA(Integer A , Integer B ,Integer C , Integer D){
        System.out.println("Perimeter of Rectangle is: "+(A+B+C+D));
    }
    public void OptionB(Integer A , Integer B){
        System.out.println("Perimeter of Rectangle is: "+((2*A)+(2*B)));
    }
}
public class problem12 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a option to slove Perimeter by which method 1] By A+B+C+D 2] By 2A+2B");
        int i = s.nextInt();
        Perimeter obj = new Perimeter();
        if(i == 1){
            System.out.print("Enter the Value of Side A:");
            int A = s.nextInt();
            System.out.print("Enter the Value of Side B:");
            int B = s.nextInt();
            System.out.print("Enter the Value of Side C:");
            int C = s.nextInt();
            System.out.print("Enter the Value of Side D:");
            int D = s.nextInt();
            obj.OptionA(A,B,C,D);
        }
        else if (i == 2){
            System.out.print("Enter the Value of Side A:");
            int A = s.nextInt();
            System.out.print("Enter the Value of Side B:");
            int B = s.nextInt();
            obj.OptionB(A,B);
        }
        else{
            System.out.println("You have Enter a WRONG option "+ i);
        }
        s.close();
    }
}
