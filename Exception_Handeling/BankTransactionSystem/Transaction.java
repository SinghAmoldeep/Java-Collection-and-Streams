package Exception_Handeling.BankTransactionSystem;

public class Transaction {
    public static void withdraw(double amount, double balance) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(amount, balance);
        }
        if (amount < 0){
            throw new IllegalArgumentException("Invalid amount");
        }
        amount -= balance;
    }
}