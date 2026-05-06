package com.mla.designpattern.abstract_factory;

import org.springframework.stereotype.Component;

@Component("stripeFactory")
public class StripeFactory implements PaymentGatewayFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new StripePaymentProcessor();
    }

    @Override
    public RefundProcessor createRefundProcessor() {
        return new StripeRefundProcessor();
    }
}
