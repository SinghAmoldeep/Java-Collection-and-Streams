package Exception_Handeling.BankTransactionSystem;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(double amount, double balance) {
        super("Insufficient Balance: " + (balance-amount));
    }
}