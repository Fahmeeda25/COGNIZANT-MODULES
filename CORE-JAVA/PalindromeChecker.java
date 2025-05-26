import java.util.Scanner;
public class PalindromeChecker{
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine().replaceAll("[\\W_]", "").toLowerCase();
        System.out.println(s.equals(new StringBuilder(s).reverse().toString()) ? "Palindrome" : "Not a palindrome");
    }
}
