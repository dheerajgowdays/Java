import java.util.Scanner;

public class problem9 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Float Value A: ");
        float a = s.nextFloat();
        System.out.println("Enter Float Value B");
        float b = s.nextFloat();
        float result = a * b;
        System.out.println(result);
        s.close();
    }
}
