import java.util.Scanner;

public class IntToChar {
    public static int charInt(char c){
        return (int)c;
    }
    public static char IntChar(int i){
        char c = (char)(i);
        return c;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose a]Int to Char b]Char to Int");
        char a =s.next().charAt(0);
        if (a == 'a'){
            System.out.print("Enter  a Number: ");
            int x = s.nextInt();
            System.out.println("Char "+IntChar(x));
        }
        else if (a == 'b'){
            System.out.print("Enter a character: ");
            char z = s.next().charAt(0);
            System.out.println("Int "+charInt(z));
        }
        else{
            System.out.println("Enter a valid choice !");
        }
        s.close();
    }
}
