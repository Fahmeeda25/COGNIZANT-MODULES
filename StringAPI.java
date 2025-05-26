import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringAPI{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 55, 60);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even numbers from the list:");
        for (int num : evenNumbers) {
            System.out.println(num);
        }
    }
}
