package com.mla.designpattern.prototype;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TemplateRegistry {

    private final Map<String, DocumentPrototype> registry = new HashMap<>();

    @PostConstruct
    public void init() {
        // Heavy initializations happen here once.
        System.out.println("Initializing Template Registry...");
        registry.put("CONTRACT", new ContractTemplate());
        registry.put("INVOICE", new InvoiceTemplate());
        System.out.println("Template Registry initialized!");
    }

    public DocumentPrototype getDocument(String type) {
        DocumentPrototype prototype = registry.get(type.toUpperCase());
        if (prototype != null) {
            return prototype.cloneDocument();
        }
        throw new IllegalArgumentException("Unknown document type: " + type);
    }
}
