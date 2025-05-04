package com.bank;

import java.math.BigDecimal;

public final class CheckingAccount extends Account{
    public CheckingAccount(String accountNumber, String accountHolderName, BigDecimal balance) {
        super(accountNumber, accountHolderName, balance);
    }
    @Override
    public void deposit(BigDecimal amount) {
        // Logic to deposit money
        System.out.println("Depositing " + amount + " to Checking Account " + getAccountNumber());
    }
    @Override
    public void withdraw(BigDecimal amount) {
        // Logic to withdraw money
        if (amount.compareTo(getBalance()) <= 0) {
            System.out.println("Withdrawing " + amount + " from Checking Account " + getAccountNumber());
        } else {
            System.out.println("Insufficient funds for withdrawal from Checking Account " + getAccountNumber());
        }
    }
    @Override
    public void transfer(Account targetAccount, BigDecimal amount) {
        // Logic to transfer money
        if (amount.compareTo(getBalance()) <= 0) {
            System.out.println("Transferring " + amount + " from Checking Account " + getAccountNumber() + " to account " + targetAccount.getAccountNumber());
        } else {
            System.out.println("Insufficient funds for transfer from Checking Account " + getAccountNumber());
        }
    }
    @Override
    public void closeAccount() {
        // Logic to close the account
        System.out.println("Closing Checking Account " + getAccountNumber());
    }
    @Override
    public void displayAccountInfo() {
        System.out.println("Checking Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Balance: " + getBalance());
    }
    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + getAccountNumber() + '\'' +
                ", accountHolderName='" + getAccountHolderName() + '\'' +
                ", balance=" + getBalance() +
                '}';
    }
    @Override
    public void printAccountStatement() {
        // Logic to print account statement
        System.out.println("Printing account statement for Checking Account " + getAccountNumber());
    }
    @Override
    public void applyInterest() {
        // Logic to apply interest (specific to CheckingAccount)
        System.out.println("Applying interest to Checking Account " + getAccountNumber());
    }
}
