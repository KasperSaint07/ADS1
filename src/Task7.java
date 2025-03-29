import java.util.Scanner;

public class Task7 {

    /**
     * This method prints elements in reverse order using recursion.
     * Does not use arrays or any other data structures.
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");
        double startTime = System.nanoTime();

        printReverse(n, scanner); // Run the program, just reverse print.

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000; // ms
        System.out.printf("\nTime taken: %.4f milliseconds\n", duration);
    }

    /**
     * Recursively reads and prints elements in reverse order.
     *
     * Time complexity: O(n), where n is the number of elements.
     * Space complexity: O(n), due to recursion stack.
     *
     */
    public static void printReverse(int n, Scanner scanner) {
        if (n == 0) return;
        int value = scanner.nextInt();
        printReverse(n - 1, scanner);      // Go deeper
        System.out.print(value + " ");
    }
}
