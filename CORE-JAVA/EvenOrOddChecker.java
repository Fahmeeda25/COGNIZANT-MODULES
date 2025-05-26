import java.util.Scanner;

public class EvenOrOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an integer:");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + "is even.");
        } else{
            System.out.println(number + "is Odd.");
        }

        sc.close();
    }
}
