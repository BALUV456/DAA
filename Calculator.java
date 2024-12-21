import java.util.Scanner;

public class Calculator {

    // Method to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");

        // Get user input for numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Get user choice for operation
        System.out.println("Choose an operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Perform the operation and display the result
        double result;
        switch (choice) {
            case 1:
                result = add(number1, number2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(number1, number2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(number1, number2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = divide(number1, number2);
                if (number2 != 0) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
        System.out.println("Thank you for using the Calculator!");
    }
}
