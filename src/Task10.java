import java.util.Scanner;

public class Task10 {

    /**
     * Method calculates GCD using recursion and Euclidean Algorithm.
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers (a and b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double startTime = System.nanoTime();

        int result = gcd(a, b); // Run the recursive function

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000;

        System.out.println("GCD: " + result);
        System.out.printf("Time taken: %.4f milliseconds\n", duration);
    }

    /**
     * Recursively calculates the GCD of two integers using Euclidean algorithm.
     *
     * Time complexity: O(log(min(a, b)))
     * Space complexity: O(log(min(a, b))) due to recursive call stack.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b); // recursion
    }
}
