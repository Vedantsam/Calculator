import java.util.Scanner;

public class Calculator {

    // Addition method
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction method
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication method
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division method
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return Double.NaN;
        }
        return a / b;
    }

    // Display menu
    public static void displayMenu() {
        System.out.println("\n===== CALCULATOR MENU =====");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.println("===========================");
        System.out.print("Choose an operation (1-5): ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("Welcome to Java Console Calculator!");

        while (continueCalculating) {
            displayMenu();

            int choice = 0;

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input! Please enter a number between 1-5.");
                scanner.next(); // Clear invalid input
                continue;
            }

            if (choice == 5) {
                System.out.println("\nThank you for using the calculator. Goodbye!");
                continueCalculating = false;
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please select between 1-5.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = 0;
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
                continue;
            }

            System.out.print("Enter second number: ");
            double num2 = 0;
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
                continue;
            }

            double result = 0;
            String operation = "";

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    operation = "+";
                    break;
                case 2:
                    result = subtract(num1, num2);
                    operation = "-";
                    break;
                case 3:
                    result = multiply(num1, num2);
                    operation = "*";
                    break;
                case 4:
                    result = divide(num1, num2);
                    operation = "/";
                    if (Double.isNaN(result)) {
                        continue; // Skip displaying result if division by zero
                    }
                    break;
            }

            System.out.println("\nResult: " + num1 + " " + operation + " " + num2 + " = " + result);

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            String continueChoice = scanner.next().toLowerCase();

            if (!continueChoice.equals("y") && !continueChoice.equals("yes")) {
                System.out.println("\nThank you for using the calculator. Goodbye!");
                continueCalculating = false;
            }
        }

        scanner.close();
    }
}