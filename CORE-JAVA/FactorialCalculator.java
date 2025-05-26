import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  non-negative integer:");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not been defined for negative numbers.");
        }else{
            long fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("factorial of " + num + " is:" + fact);
        }

        sc.close();
    }
}
