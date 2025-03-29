import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {

    /**
     * This method returns the minimum element in an integer array.
     *
     * It uses a simple linear scan through the array.
     *
     * Time complexity: O(n), where n is the size of the array.
     * The method iterates through each element once to find the minimum.
     *
     * Space complexity: O(1), as it uses only a constant amount of extra memory.
     *
     * @param arr The array of integers
     * @return The minimum value found in the array
     */

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        // Cycle to enter array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = findMin(arr); // Run the function

        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Minimum value is: " + min);
        System.out.printf("Time taken: %.4f milliseconds\n", duration);

    }
    //Function that finds the minimum element in array. How?
    // The cycle just the loop goes through each element
    // and if the current one is less
    //than the minimum, then it equals it to the minimum.
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


}
