import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        System.out.print("how many student names do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter name " + i + ": ");
            String name = scanner.nextLine();
            studentNames.add(name);
        }
        System.out.println("\nList of student:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}

