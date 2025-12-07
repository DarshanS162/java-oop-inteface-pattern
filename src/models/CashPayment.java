package src.models;

import src.interfaces.DiscountPolicy;
import src.interfaces.Payment;
import src.interfaces.TransLogger;

public class CashPayment implements Payment,DiscountPolicy{
    private final double amount;
    private final double discountRate;
    private final TransLogger logger;

    public CashPayment(double amount, double discountRate, TransLogger logger) {
        this.amount = amount;
        this.discountRate = discountRate;
        this.logger = logger;
    }

     @Override
    public double newYearDiscount() {
        double discount  = amount * discountRate/100;
        return discount;
    }

    @Override
    public PaymentResult pay() {
        Payment.validateAmt(amount);
        double tax = calculateTax(amount, 50);
        double discount = newYearDiscount();
        double totalAmount = amount + tax - discount;
        printPaymentDetails(tax, discount, totalAmount);
        logger.log("cash payment of: " + amount + " is received.");
        return new PaymentResult(PaymentStatus.SUCCESS, "12344", "This is cash payment", totalAmount);
    }
    
}
