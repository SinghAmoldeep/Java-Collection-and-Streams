package Exception_Handeling.MultipleCatchBlocks;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i = sc.nextInt();

            int[] arr = new int[n];
            System.out.println(arr[i]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter a valid index");
        }
        catch (NullPointerException e) {
            System.out.println("Enter a valid input");
        }
    }
}