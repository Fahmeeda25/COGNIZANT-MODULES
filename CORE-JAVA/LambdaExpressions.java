import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class LambdaExpressions{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Zara");
        names.add("Alice");
        names.add("Mike");
        names.add("Bob");
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("sorted list of names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

