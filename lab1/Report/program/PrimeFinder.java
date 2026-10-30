import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFinder {

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N (find prime numbers up to N): ");
        int n = scanner.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        System.out.println("\nPrime numbers up to " + n + ":");
        System.out.println(primes);

        scanner.close();
    }
}
