import java.util.*;
class problem15 {
    public ArrayList<Integer> calc(int a) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= a; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }
}
