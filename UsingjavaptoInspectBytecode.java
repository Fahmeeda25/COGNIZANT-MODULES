public class UsingjavaptoInspectBytecode{
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        UsingjavaptoInspectBytecode s = new UsingjavaptoInspectBytecode();
        System.out.println("Sum: " + s.add(5, 3));
    }
}
