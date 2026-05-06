package com.mla.designpattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class BlackFridayDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        System.out.println("Applying Black Friday discount (50%)");
        return originalPrice * 0.5;
    }
}
