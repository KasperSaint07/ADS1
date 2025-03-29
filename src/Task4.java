import java.util.Scanner;

public class Task4 {

    /**
     * This method calculates factorial using recursion,
     * and prints the result along with execution time.
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int n = scanner.nextInt();

        double startTime = System.nanoTime();

        long result = factorial(n); // Run the function

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000; // milliseconds

        System.out.println("Factorial of " + n + " is: " + result);
        System.out.printf("Time taken: %.4f milliseconds\n", duration);
    }
    /**
     * This methd calculates the factorial of a given number using recursion.
     *
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm calls itself n times.
     *
     * Space complexity: O(n) — each recursive call adds a frame to the call stack.
     *
//     * @param n The number to calculate factorial for.
//     * @return The factorial of the given number.
//     */
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
