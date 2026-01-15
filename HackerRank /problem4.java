import java.util.*;

public class problem4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String b = Integer.toString(a);
        if(a == Integer.parseInt(b)){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
        s.close();
    }
    
}
