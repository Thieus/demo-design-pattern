package com.mla.designpattern.abstract_factory;

public class PayPalRefundProcessor implements RefundProcessor {
    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund of $" + amount + " via PayPal.");
    }
}
