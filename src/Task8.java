import java.util.Scanner;

public class Task8 {

    /**
     * Methhood checks recursively if it contains only digits.
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        double startTime = System.nanoTime();

        boolean result = isAllDigits(s, 0); // RUn hte function

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000;

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.printf("Time taken: %.4f milliseconds\n", duration);
    }

    /**
     * Recursively checks if the string consists only of digits.
     *
     * Time complexity: O(n), where n is the length of the string.
     * Space complexity: O(n), due to the recursive call stack.
     *
     */
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        return isAllDigits(s, index + 1);
    }
}
