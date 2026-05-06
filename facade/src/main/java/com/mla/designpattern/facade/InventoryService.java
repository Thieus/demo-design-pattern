package com.mla.designpattern.facade;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    public boolean checkInventory(String productId) {
        System.out.println("Checking inventory for product: " + productId);
        return true;
    }
}
