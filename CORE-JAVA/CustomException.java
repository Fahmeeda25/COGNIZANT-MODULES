class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException{
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Age must be 18 or above.");
        else
            System.out.println("Access granted.");
    }

    public static void main(String[] args) {
        int userAge = 16; // You can replace with Scanner input

        try {
            checkAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
