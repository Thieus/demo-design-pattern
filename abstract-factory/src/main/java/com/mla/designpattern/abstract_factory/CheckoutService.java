package com.mla.designpattern.abstract_factory;

import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    // This service accepts an abstract factory, guaranteeing that it will
    // always use compatible products (e.g. Stripe payment with Stripe refund).
    public void performCheckoutWithRefund(PaymentGatewayFactory gatewayFactory, double amount) {
        PaymentProcessor paymentProcessor = gatewayFactory.createPaymentProcessor();
        RefundProcessor refundProcessor = gatewayFactory.createRefundProcessor();

        paymentProcessor.processPayment(amount);
        
        // Simulating a rollback or refund right after
        System.out.println("Wait, rollback required...");
        refundProcessor.processRefund(amount);
    }
}
