package Exception_Handeling.BankTransactionSystem;
public class Main {
    public static void main(String[] args) {
        try{
            Transaction.withdraw(10000, 1000);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}