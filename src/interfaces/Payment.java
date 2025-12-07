package src.interfaces;

import src.models.PaymentResult;

public interface Payment {
    public PaymentResult pay();

    default double calculateTax(double amount,double taxRate){
        return amount * taxRate / 100;
    }

    default void printPaymentDetails(double tax, double discount, double finalAmount){
        System.out.println("discount Amount: " + discount);
        System.out.println("Tax : " + tax);
        System.out.println("Total Amount Paid: " + finalAmount);
    }

    static void validateAmt(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
    }
    
}