package com.patterns.basics.oop.encapsulation;

public class BankAccount {
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }

        this.accountHolder = accountHolder;
        this.balance = openingBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        validateAmount(amount);
        balance += amount;
    }

    public boolean withdraw(double amount) {
        validateAmount(amount);

        if (amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }
}
