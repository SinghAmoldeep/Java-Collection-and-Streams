package com.advance.banking_transactions;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super("Insufficient Balance!!");
    }
}
