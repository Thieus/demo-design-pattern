package com.mla.designpattern.strategy;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CheckoutService {

    private final Map<String, DiscountStrategy> discountStrategies;

    // Spring will automatically inject all beans of type DiscountStrategy into this Map.
    // The key will be the bean name (e.g., "VIP", "BLACK_FRIDAY").
    public CheckoutService(Map<String, DiscountStrategy> discountStrategies) {
        this.discountStrategies = discountStrategies;
    }

    public double calculateTotal(double price, String discountCode) {
        // Fallback to REGULAR if the discount code is invalid or null
        DiscountStrategy strategy = discountStrategies.getOrDefault(discountCode, discountStrategies.get("REGULAR"));
        return strategy.applyDiscount(price);
    }
}
