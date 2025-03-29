import java.util.Scanner;

public class Task5 {

    /**
     * This method calculates the n-th Fibonacci number
     * using recursion, and prints the result with execution time.
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index n of Fibonacci number: ");
        int n = scanner.nextInt();

        double startTime = System.nanoTime();

        int result = fibonacci(n); //Run the function

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000; // milliseconds

        System.out.println("Fibonacci number F(" + n + ") is: " + result);
        System.out.printf("Time taken: %.4f milliseconds\n", duration);
    }

    /**
     * This method returns the n-th number in the Fibonacci sequence using recursion.
     *
     * Time complexity: O(2^n), because each call makes two recursive calls,
     * leading to an exponential number of calls.
     *
     * Space complexity: O(n) — due to the maximum depth of the recursion stack.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The n-th Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //?
}
