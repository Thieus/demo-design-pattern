package com.mla.designpattern.adapter;

public class LegacyPaymentSystem {

    public void makePayment(int centsInUsd) {
        System.out.println("Processing legacy payment of " + centsInUsd + " cents USD.");
    }
}
