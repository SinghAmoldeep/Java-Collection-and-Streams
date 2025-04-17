package Exception_Handeling.UncheckedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x / y);
        }
        catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("error: enter a number!");
        }
    }
}