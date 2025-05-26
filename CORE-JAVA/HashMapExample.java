import java.util.HashMap;
import java.util.Scanner;
public class HashMapExample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();
        System.out.print("How many student entries do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter student ID for student " + i + ": ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter student name for ID " + id + ": ");
            String name = scanner.nextLine();
            studentMap.put(id, name);
        }
        System.out.print("\nEnter a student ID to search for: ");
        int searchId = scanner.nextInt();
        if (studentMap.containsKey(searchId)) {
            String foundName = studentMap.get(searchId);
            System.out.println("Student name for ID " + searchId + ": " + foundName);
        } else {
            System.out.println("No student found with ID " + searchId);
        }
    }
}
