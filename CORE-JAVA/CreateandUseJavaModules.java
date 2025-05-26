class Utils {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
public class CreateandUseJavaModules{
    public static void main(String[] args) {
        String message = Utils.greet("Java Modules");
        System.out.println(message);
    }
}

