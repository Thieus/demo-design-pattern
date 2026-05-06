package com.mla.designpattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class RegularDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        System.out.println("Applying regular pricing (no discount)");
        return originalPrice;
    }
}
