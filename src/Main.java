import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Function & Recursion Lab ===");
            System.out.println("1. Find minimum in array");
            System.out.println("2. Find average");
            System.out.println("3. Check if number is prime");
            System.out.println("4. Find factorial (recursive)");
            System.out.println("5. Find nth Fibonacci (recursive)");
            System.out.println("6. Power a^n");
            System.out.println("7. Reverse array (recursive)");
            System.out.println("8. Check if string is digits only");
            System.out.println("9. Binomial coefficient C(n, k)");
            System.out.println("10. GCD using recursion");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Task1.run(); // Find minimum
                    break;
                case 2:
                    Task2.run(); // Average
                    break;
                case 3:
                   Task3.run(); // Prime
                    break;
                case 4:
                    Task4.run(); // Factorial
                    break;
                case 5:
                    Task5.run(); // Fibonacci
                    break;
                case 6:
                    Task6.run(); // Power
                    break;
                case 7:
                    Task7.run(); // Reverse
                    break;
                case 8:
                    //Task8.run(); // Check digits
                    break;
                case 9:
                    //Task9.run(); // Binomial coefficient
                    break;
                case 10:
                    //Task10.run(); // GCD
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);
    }
}
