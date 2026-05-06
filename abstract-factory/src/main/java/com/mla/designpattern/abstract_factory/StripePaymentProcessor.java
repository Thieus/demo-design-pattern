package com.mla.designpattern.abstract_factory;

public class StripePaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe.");
    }
}
