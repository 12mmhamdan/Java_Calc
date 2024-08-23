import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("Welcome to the test calculator!");

        while (continueCalculating) {
            // Display the menu
            displayMenu();

            try {
                int choice = scan.nextInt();

                switch (choice) {
                    case 1: // Addition
                        int addNum1 = getUserInput(scan, "add");
                        int addNum2 = getUserInput(scan, "add");
                        System.out.println("The sum is: " + addNumber(addNum1, addNum2));
                        break;

                    case 2: // Subtraction
                        int subNum1 = getUserInput(scan, "subtract");
                        int subNum2 = getUserInput(scan, "subtract");
                        System.out.println("The difference is: " + subtractNumber(subNum1, subNum2));
                        break;

                    case 3: // Division
                        int divNum1 = getUserInput(scan, "divide");
                        int divNum2 = getUserInput(scan, "divide");
                        if (divNum2 != 0) {
                            System.out.println("The division result is: " + divideNumber(divNum1, divNum2));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;

                    case 4: // Multiplication
                        int mulNum1 = getUserInput(scan, "multiply");
                        int mulNum2 = getUserInput(scan, "multiply");
                        System.out.println("The product is: " + multiplyNumber(mulNum1, mulNum2));
                        break;

                    case 5: // Exit
                        continueCalculating = false;
                        System.out.println("Thank you for using my test calculator!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please select an option from 1 to 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number from 1 to 5.");
                scan.next();
            }
        }

        scan.close();
    }

    public static void displayMenu() {
        System.out.println("\nPlease choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Divide");
        System.out.println("4. Multiply");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static int getUserInput(Scanner scan, String operation) {
        System.out.println("Enter a number to " + operation + ":");
        while (!scan.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scan.next();
        }
        return scan.nextInt();
    }

    public static int addNumber(int a, int b) {
        return a + b;
    }

    public static int divideNumber(int a, int b) {
        return a / b;
    }

    public static int multiplyNumber(int a, int b) {
        return a * b;
    }

    public static int subtractNumber(int a, int b) {
        return a - b;
    }
}
