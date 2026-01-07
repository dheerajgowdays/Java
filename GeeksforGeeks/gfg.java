package GeeksforGeeks;
import java.util.Scanner;
public class gfg {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  a Number Value:");
        int num = sc.nextInt();
        System.out.println("Enter a String Value:");
        String str = sc.next();
        System.out.println("Enter a Double Value:");
        Double d = sc.nextDouble();
        System.out.println("Double is: "+d);
        System.out.println("String is: "+str);
        System.out.println("Number is: "+num);
        sc.close();
    }
}
