package com.bank;

import java.math.BigDecimal;

public final class SavingsAccount extends Account{

    public SavingsAccount(String accountNumber, String accountHolderName, BigDecimal balance) {
        super(accountNumber, accountHolderName, balance);
    }
    @Override
    public void applyInterest() {
        // Logic to apply interest (specific to SavingsAccount)
        System.out.println("Applying interest to Savings Account " + getAccountNumber());
    }
    @Override
    public void printAccountStatement() {
        // Logic to print account statement
        System.out.println("Printing account statement for Savings Account " + getAccountNumber());
    }
    @Override
    public void deposit(BigDecimal amount) {
        // Logic to deposit money
        System.out.println("Depositing " + amount + " to Savings Account " + getAccountNumber());
    }

    @Override
    public void withdraw(BigDecimal amount) {
        // Logic to withdraw money
        if (amount.compareTo(getBalance()) <= 0) {
            System.out.println("Withdrawing " + amount + " from Savings Account " + getAccountNumber());
        } else {
            System.out.println("Insufficient funds for withdrawal from Savings Account " + getAccountNumber());
        }
    }

    @Override
    public void transfer(Account targetAccount, BigDecimal amount) {
        // Logic to transfer money
        if (amount.compareTo(getBalance()) <= 0) {
            System.out.println("Transferring " + amount + " from Savings Account " + getAccountNumber() + " to account " + targetAccount.getAccountNumber());
        } else {
            System.out.println("Insufficient funds for transfer from Savings Account " + getAccountNumber());
        }
    }
    @Override
    public void closeAccount() {
        // Logic to close the account
        System.out.println("Closing Savings Account " + getAccountNumber());
    }
    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Balance: " + getBalance());
    }
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber='" + getAccountNumber() + '\'' +
                ", accountHolderName='" + getAccountHolderName() + '\'' +
                ", balance=" + getBalance() +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getAccountType() {
        return "Savings Account";
    }
    @Override
    public void setAccountType(String accountType) {
        // Logic to set account type
        System.out.println("Setting account type to " + accountType + " for account " + getAccountNumber());
    }
    @Override
    public void setAccountHolderName(String accountHolderName) {
        // Logic to set account holder name
        System.out.println("Setting account holder name to " + accountHolderName + " for account " + getAccountNumber());
    }
    @Override
    public void setBalance(BigDecimal balance) {
        // Logic to set balance
        System.out.println("Setting balance to " + balance + " for account " + getAccountNumber());
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        // Logic to set account number
        System.out.println("Setting account number to " + accountNumber + " for account " + getAccountNumber());
    }
    @Override
    public void checkMinimumBalance() {
        // Logic to check minimum balance (specific to CheckingAccount)
        System.out.println("Checking minimum balance for account " + getAccountNumber());
    }
    public void setAccountType() {
        // Logic to set account type
        System.out.println("Setting account type for account " + getAccountNumber());
    }
    public void setAccountHolderName() {
        // Logic to set account holder name
        System.out.println("Setting account holder name for account " + getAccountNumber());
    }
}
