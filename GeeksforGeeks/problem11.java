import java.util.Scanner;

//Compound Interst
class CompoundInterst{
    public void CI(Double p , Double r, Double t){
        System.out.println("Compund Interst ="+p*Math.pow(1+(r/100),t));
    }
}

public class problem11 {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Principal Amoutnt: ");
        double p = s.nextDouble();
        System.out.print("Enter Rate Of Interst: ");
        double r = s.nextDouble();
        System.out.print("Enter Time Span: ");
        double t = s.nextDouble();
        CompoundInterst obj = new CompoundInterst();
        obj.CI(p,r,t);
        s.close();
    }
}
