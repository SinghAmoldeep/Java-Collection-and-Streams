package Exception_Handeling.ExceptionPropagation;

public class Main {
    public static void main(String[] args) {
        try {
            double badAmount = -5000;
            double rate = 4;
            int years = 2;

            double interest = Interest.calculateInterest(badAmount, rate, years);
            System.out.printf("Calculated interest: %.2f%n", interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());  // catching exception
        }
    }
}