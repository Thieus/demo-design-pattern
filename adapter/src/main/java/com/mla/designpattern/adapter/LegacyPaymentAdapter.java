package com.mla.designpattern.adapter;

import org.springframework.stereotype.Component;

@Component
public class LegacyPaymentAdapter implements ModernPaymentProcessor {
    private final LegacyPaymentSystem legacySystem;
    private static final double EUR_TO_USD_RATE = 1.10;

    public LegacyPaymentAdapter() {
        this.legacySystem = new LegacyPaymentSystem();
    }

    @Override
    public void process(double amountInEuros) {
        double amountInUsd = amountInEuros * EUR_TO_USD_RATE;
        int centsInUsd = (int) Math.round(amountInUsd * 100);
        System.out.println("Adapter: Converting " + amountInEuros + " EUR to " + centsInUsd + " USD Cents");
        legacySystem.makePayment(centsInUsd);
    }
}
