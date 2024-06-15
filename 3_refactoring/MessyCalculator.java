import java.util.Scanner;

/* 

MessyCalculator is a basic calculator class which allows for adding, multiplying, dividing
or subtracting two numbers.

However, ALL the code has been implemented in a single `main` method.

Can you find a way to refactor this code so it works the same way, but makes use of smaller,
neater methods and simpler structures?

HINT: If you get stuck, you can look at the `MessyCalculatorPartialSolution.java` file for a hint.

 */

public class MessyCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        System.out.println("Simple Calculator");
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation: 1. Add  2. Subtract  3. Multiply  4. Divide");
        int choice = scanner.nextInt();

        if (choice == 1) {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (choice == 2) {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (choice == 3) {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (choice == 4) {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid choice. Please choose a valid operation.");
        }

        scanner.close();
    }
}