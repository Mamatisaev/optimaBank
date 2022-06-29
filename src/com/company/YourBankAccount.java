package com.company;

public class YourBankAccount {

    private double amount;

    public YourBankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Your available balance is " + amount +
                " KGS right now.";
    }

    public void deposit(double sum) {
        this.amount += sum;
    }

    public void withdraw(int sum) {
        try {
            if (amount < sum) {
                throw new CustomerWithdrawalLimitException("Dear customer, you can not withdraw that much amount.\nSorry for the inconvenience!", getAmount());
            } else {
                System.out.println("Dear customer, your available balance is " + (int) amount + " KGS right now.");
                System.out.println("-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*");
                amount -= sum;
                System.out.println("Dear customer, your withdrawn amount is " + sum + " KGS.");
                System.out.println("-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*");
            }
        } catch (CustomerWithdrawalLimitException cash) {
            System.out.println(cash.getMessage());
            cash.getRemainingAmount();
            amount -= getAmount();
            System.exit(0);
        }
    }
}