package com.company;

public class Main {

    public static void main(String[] args) {
        YourBankAccount yourBankAccount = new YourBankAccount(0);
        System.out.println("Welcome to Optima Bank!");
        System.out.println("-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*");
        yourBankAccount.deposit(20000);
        while (true) {
            yourBankAccount.withdraw(6000);
        }
    }
}
