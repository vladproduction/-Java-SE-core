package com.vladproduction.assignment2;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("John", 1000);

        bankAccount.withdraw(500);
        bankAccount.deposit(5000);
        bankAccount.withdraw(2000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());

    }
}
