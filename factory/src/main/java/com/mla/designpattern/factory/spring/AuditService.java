package com.mla.designpattern.factory.spring;

import org.springframework.stereotype.Service;

@Service
public class AuditService {
    public void logAction(String action) {
        System.out.println("Audit log: " + action);
    }
}
