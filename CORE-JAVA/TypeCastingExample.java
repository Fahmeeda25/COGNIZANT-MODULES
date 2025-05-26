public class TypeCastingExample{
    public static void main(String[] args){
        double myDouble = 45.67;
        int myIntFromDouble = (int) myDouble;
        int myInt = 25;
        double myDoubleFromInt = (double) myInt;
        System.out.println("Original double value:"+ myDouble);
        System.out.println("Double cast to int: "+ myIntFromDouble);
        System.out.println("original integer Value:" + myInt);
        System.out.println("Integer cast to Double:" + myDoubleFromInt);
    }
    
}
