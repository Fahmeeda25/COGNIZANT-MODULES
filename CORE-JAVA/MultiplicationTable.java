import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("enter a Number: ");
        for (int i = 1; i<= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
        sc.close();
    }
}
