import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = getNonNegativeInteger(); // Get a valid non-negative integer from the user
        long factorial = calculateFactorial(number); // Compute the factorial
        System.out.println("The factorial of " + number + " is: " + factorial); // Display result
    }

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner input = new Scanner(System.in);
        int number;

        // Loop until the user enters a valid non-negative integer
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number >= 0) {
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid non-negative integer.");
                input.next(); // Consume invalid input
            }
        }

        input.close();
        return number;
    }

    // Method to calculate factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}