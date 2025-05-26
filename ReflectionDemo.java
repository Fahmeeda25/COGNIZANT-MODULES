import java.lang.reflect.Method;
class ReflectionInjava{
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public int add(int a, int b) {
        return a + b;
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        // Load the class dynamically
        Class<?> cls = Class.forName("Sample");

        // Create an object of the loaded class
        Object obj = cls.getDeclaredConstructor().newInstance();

        // Get all declared methods
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Method: " + method.getName());

            // Print parameter types
            Class<?>[] params = method.getParameterTypes();
            for (Class<?> p : params) {
                System.out.println("  Param: " + p.getName());
            }

            // Invoke methods with sample arguments
            if (method.getName().equals("greet")) {
                method.invoke(obj, "World");
            } else if (method.getName().equals("add")) {
                Object result = method.invoke(obj, 10, 20);
                System.out.println("  Result: " + result);
            }
        }
    }
}

