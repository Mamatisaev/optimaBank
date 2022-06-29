package com.company;

public class CustomerWithdrawalLimitException extends RuntimeException {
private final double remainingAmount;

    public CustomerWithdrawalLimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }
    public void getRemainingAmount() {
        System.out.println("-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*");
        System.out.println("Dear customer, your balance after withdrawal is " + (int) remainingAmount + " KGS.\n-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*\nPlease, try to withdraw " + (int) remainingAmount + " KGS only.\n-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*~*~*-*-*");
    }
}
