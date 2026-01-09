import java.util.Scanner;
class Complex{
    public String add(String a,String  b){
        String[] parts = a.split("\\+");
        int c = Integer.parseInt(parts[0]);
        String p = parts[1];
        String[] x =p.split("i");
        int d = Integer.parseInt(x[0]);

        String[] parts1 = b.split("\\+");
        int e = Integer.parseInt(parts1[0]);
        String l = parts1[1];
        String[] z =l.split("i");
        int f = Integer.parseInt(z[0]);
        return "Sum:" + (c+e) + "+" + (d+f) + "i";
    } 
}

public class problem6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Complex No 1: ");
        String a  = sc.nextLine();
        System.out.println("Complex No 2: ");
        String b = sc.nextLine();
        Complex c = new Complex();
        System.out.println(c.add(a, b));
        sc.close();
    }
    
}
