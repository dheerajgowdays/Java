//Simple Interst

import java.util.Scanner;
class SI{
    public void si(Integer p,Integer r,Integer t){
        int result = (p*r*t)/100;
        System.out.println("SI:"+result);
    }
}

public class problem7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Principal: ");
        int p = s.nextInt();
        System.out.print("Rate of Interest: ");
        int r = s.nextInt();
        System.out.print("Time: ");
        int t = s.nextInt();
        SI obj=new SI();
        obj.si(p,r,t);
        s.close();
    }
}
