package com.patterns.basics.oop.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Milind", 1_000.0);

        account.deposit(250.0);
        boolean withdrew = account.withdraw(400.0);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Withdrawal successful: " + withdrew);
        System.out.println("Current balance: " + account.getBalance());
    }
}
