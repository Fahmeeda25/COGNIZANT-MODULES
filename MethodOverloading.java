public class MethodOverloading{
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
    static int add(int a, int b, int c) { return a + b + c; }

    public static void main(String[] args) {
        System.out.printf("Sum1: %d\nSum2: %.1f\nSum3: %d",
            add(3, 7), add(2.2, 3.8), add(1, 2, 4));
    }
}

