package Exception_Handeling.custom_exceptions;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Age must be 18 or above");
    }
}