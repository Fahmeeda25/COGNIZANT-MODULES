import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("\nSelect Operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = sc.nextInt();

        double result;
        switch (choice) {
            case 1 -> {
                result = num1 + num2;
                System.out.println("\nResult: " + num1 + " + " + num2 + " = " + result);
            }

            case 2 -> {
                result = num1 - num2;
                System.out.println("\nResult: " + num1 + " - " + num2 + " = " + result);
            }

            case 3 -> {
                result = num1 * num2;
                System.out.println("\nResult: " + num1 + " * " + num2 + " = " + result);
            }

            case 4 -> {
                if (num2 != 0) {
                    result = (double)num1 / num2;
                    System.out.println("\nResult: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("\nError! Division by zero.");
                }
            }

            default -> System.out.println("\nInvalid choice!");
        }

        sc.close();
    }
}
