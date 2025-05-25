class Car {
    String make, model;
    int year;
    void displayDetails() {
        System.out.println("Make:" + make + ",model:" + model + ",year:" +year);
    }
}
public class ClassAndObjectCreation {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;

        Car car2 = new Car();
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2022;

        System.out.println("Car 1:");
        car1.displayDetails();

        System.out.println("\nCar 2:");
        car2.displayDetails();
    }
}

