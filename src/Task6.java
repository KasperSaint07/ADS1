import java.util.Scanner;

public class Task6 {

    /**
     * This method takes base `a` and exponent `n`,
     * computes a^n recursively, and prints the result and time taken.
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base a: ");
        int a = scanner.nextInt();
        System.out.print("Enter exponent n: ");
        int n = scanner.nextInt();

        double startTime = System.nanoTime();

        long result = power(a, n); // Run the function 'a' - base, 'n' - exponent

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000; // milliseconds

        System.out.println(a + "^" + n + " = " + result);
        System.out.printf("Time taken: %.4f milliseconds\n", duration);
    }

    /**
     * Recursively calculates a^n.
     *
     * Time complexity: O(n), because it performs n recursive multiplications.
     * Space complexity: O(n), due to recursion stack depth.
     *
     * @param a the base number
     * @param n the exponent
     * @return a raised to the power of n
     */
    public static long power(int a, int n) {
        if (n == 0)
            return 1;
        return a * power(a, n - 1);
    }
}
