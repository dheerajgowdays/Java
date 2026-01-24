import java.util.Scanner;
class greatest{
    public void largest(Integer a,Integer b, Integer c){
        if(a>b && a>c){
            System.out.println("Largest is: "+a);
        }
        else if(b>a && b>c){
            System.out.println("Largest is: "+b);
        }
        else{
            System.out.println("Largest is: "+c);
        }
    }
}

public class problem11 {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number A: ");
        int a = s.nextInt();
        System.out.println("Enter Number B: ");
        int b = s.nextInt();
        System.out.println("Enter Number C: ");
        int c = s.nextInt();
        greatest obj = new greatest();
        obj.largest(a,b,c);
        s.close();
    }
}
