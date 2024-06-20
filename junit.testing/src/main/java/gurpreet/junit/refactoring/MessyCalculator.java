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
    //one method to show the menu
    //We need one method to get the input
    //one method to add, another for substract.... 
    
    public static void main(String[] args) {
        start();
    }
    private static void add(double a, double b) {
         System.out.println("Result: " + a+b);
    }
     private static void multiply(double a, double b) {
         System.out.println("Result: " + a*b);
    }
     private static void subtract(double a, double b) {
         System.out.println("Result: " + (a - b));
    }
     private static void divide(double a, double b) {
        if (a != 0) {
                System.out.println("Result: " + a / b);
            } else {
                System.out.println("Error: Cannot divide by zero.");
            }
    }
    static void start() {
        double num1 = getUserInput("Simple Calculator\nEnter first number:");
        double num2 = getUserInput("Enter second number:");
        int choice = (int)(double)getUserInput("Select operation: 1. Add  2. Subtract  3. Multiply  4. Divide"); 
     
        switch (choice) {
        case 1:add(num1,num2);break;
        case 2:subtract(num1,num2);break;
        case 3:multiply(num1,num2);break;
        case 4:divide(num1,num2); break;
        default:System.out.println("Invalid choice. Please choose a valid operation."); 
        }
    }
    static double getUserInput (String output) {
        System.out.println(output);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}