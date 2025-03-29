import java.util.Scanner;

public class Task9 {

    /**
     * This method alculates C(n, k) using recursion,
     * and prints the result with execution time.
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        double startTime = System.nanoTime();

        int result = binomial(n, k); //Run the programm

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000;

        System.out.println("C(" + n + ", " + k + ") = " + result);
        System.out.printf("Time taken: %.4f milliseconds\n", duration);
    }

    /**
     * Recursively calculates binomial coefficient C(n, k).
     *
     * Time complexity: O(2^n) — due to the binary recursion tree.
     * Space complexity: O(n) — max depth of recursion.
     *
     * @param n total elements
     * @param k selected elements
     * @return number of combinations C(n, k)
     */
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k); //algorithm
    }
}
