
import java.util.Scanner;

public class OddorEven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        
        if(n%2 == 0 ){
            System.out.printf("The %d is even%n",n);
        }
        else{
            System.out.printf("The %d is odd%n",n);
        }
        sc.close();
    }
}