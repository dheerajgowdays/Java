import java.util.*;

class Fibonacci {
    public void sum(int N) {
        int a = 0, b = 1;
        ArrayList<Integer> list = new ArrayList<>();

        // Generate Fibonacci till index 2N
        for (int i = 0; i <= 2 * N; i++) {
            list.add(a);
            int c = a + b;
            a = b;
            b = c;
        }

        int sum = 0;

        // Sum elements at even indexes
        for (int j = 0; j <= 2 * N; j++) {
            if (j % 2 == 0) {
                sum += list.get(j);
            }
        }

        System.out.println(sum);
    }
}

public class problem8 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("N Value: ");
        int n = s.nextInt();

        Fibonacci f = new Fibonacci();
        f.sum(n);

        s.close();
    }
}
