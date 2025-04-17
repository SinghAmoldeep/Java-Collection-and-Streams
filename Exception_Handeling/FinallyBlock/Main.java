package Exception_Handeling.FinallyBlock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x / y);
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
        finally {
            System.out.println("Operation Completed");
        }
    }
}