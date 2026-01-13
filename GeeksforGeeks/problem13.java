//Vowel or Consonant
import java.util.Scanner;
class CheckVowel {
    public void check(char c) {
        c = Character.toLowerCase(c);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}


public class problem13 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char a = s.next().charAt(0);
        CheckVowel obj = new CheckVowel();
        obj.check(a);
        s.close();
    }
}
