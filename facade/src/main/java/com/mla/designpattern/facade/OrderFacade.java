package com.mla.designpattern.facade;

import org.springframework.stereotype.Component;

@Component
public class OrderFacade {
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public OrderFacade(InventoryService inventoryService, PaymentService paymentService, ShippingService shippingService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.shippingService = shippingService;
    }

    public boolean placeOrder(String productId, String accountId, double amount) {
        if (inventoryService.checkInventory(productId)) {
            if (paymentService.processPayment(accountId, amount)) {
                shippingService.shipProduct(productId);
                System.out.println("Order placed successfully!");
                return true;
            }
        }
        System.out.println("Order failed.");
        return false;
    }
}
