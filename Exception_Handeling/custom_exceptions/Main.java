package Exception_Handeling.custom_exceptions;
public class Main {
    public static void main(String[] args) {
        try {
            AgeValidator.validate(17);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}