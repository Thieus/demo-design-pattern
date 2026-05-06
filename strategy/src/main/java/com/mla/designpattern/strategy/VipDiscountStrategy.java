package com.mla.designpattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class VipDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        System.out.println("Applying VIP discount (20%)");
        return originalPrice * 0.8;
    }
}
