import java.util.Scanner;

public class Task2 {

    /**
     * This method calculates its average,
     * prints the result and the time taken.
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        //Cycle to enter the array elements.
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        double startTime = System.nanoTime();

        double avg = findAverage(arr); // Run the functionn

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000;

        System.out.printf("Average: %.2f\n", avg);
        System.out.printf("Time taken: %.4f milliseconds\n", duration);
    }

    /**
     * This method calculates the average of elements in an integer array.
     *
     * Time complexity: O(n), where n is the size of the array.
     * The method iterates through each element once to calculate the sum.
     *
     * Space complexity: O(1), since only a constant amount of extra space is used.
     *
     * @param arr The array of integers
     * @return The average value of the array as a double
     */
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return (double) sum / arr.length;
    }
}
