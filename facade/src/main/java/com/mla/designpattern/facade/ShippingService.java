package com.mla.designpattern.facade;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public void shipProduct(String productId) {
        System.out.println("Shipping product: " + productId);
    }
}
