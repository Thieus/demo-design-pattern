package com.mla.designpattern.abstract_factory;

public interface PaymentGatewayFactory {
    PaymentProcessor createPaymentProcessor();
    RefundProcessor createRefundProcessor();
}
