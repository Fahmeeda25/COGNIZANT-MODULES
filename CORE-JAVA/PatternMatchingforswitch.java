public class PatternMatchingforswitch{
    public static void checkType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer value: " + i);
            case String s  -> System.out.println("String value: " + s);
            case Double d  -> System.out.println("Double value: " + d);
            case null      -> System.out.println("The object is null.");
            default        -> System.out.println("Unknown type: " + obj);
        }
    }
    public static void main(String[] args) {
        checkType(100);
        checkType("Java");
        checkType(99.9);
        checkType(true);
        checkType(null);
    }
}
