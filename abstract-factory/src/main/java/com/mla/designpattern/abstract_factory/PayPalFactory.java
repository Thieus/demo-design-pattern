package com.mla.designpattern.abstract_factory;

import org.springframework.stereotype.Component;

@Component("paypalFactory")
public class PayPalFactory implements PaymentGatewayFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new PayPalPaymentProcessor();
    }

    @Override
    public RefundProcessor createRefundProcessor() {
        return new PayPalRefundProcessor();
    }
}
