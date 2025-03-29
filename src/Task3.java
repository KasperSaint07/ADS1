import java.util.Scanner;

public class Task3 {

    /**
     * This method takes an integer from the user checks if it is prime,
     * printing the result and time taken.
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for prime: ");
        int n = scanner.nextInt();

        double startTime = System.nanoTime();

        boolean result = isPrime(n, 2);

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000; // ms

        if (result)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Composite");

        System.out.printf("Time taken: %.4f milliseconds\n", duration);
    }

    /**
     * This method checks whether a number is prime using recursion.
     *
     * Time complexity: O(√n), where n is the number being checked.
     * The recursion checks all numbers from 2 up to sqrt(n), which is enough
     * to determine whether n is divisible by any smaller number.
     *
     * Space complexity: O(√n) due to recursive call stack.
     *
     * @param n the number to check
     * @param i the current divisor being tested
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return n == 2;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
}
