package com.mla.designpattern.prototype;

public class InvoiceTemplate implements DocumentPrototype {
    private String taxConfiguration;
    private String clientName;

    public InvoiceTemplate() {
        // Simulating heavy initialization
        System.out.println("Loading complex tax configuration for InvoiceTemplate...");
        this.taxConfiguration = "Base Tax 20%, Eco Tax 2%, Corporate Fee...";
    }

    // Copy constructor used for cloning
    private InvoiceTemplate(InvoiceTemplate source) {
        this.taxConfiguration = source.taxConfiguration;
        this.clientName = source.clientName;
    }

    @Override
    public DocumentPrototype cloneDocument() {
        return new InvoiceTemplate(this);
    }

    @Override
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void printDocument() {
        System.out.println("--- INVOICE ---");
        System.out.println("Client: " + clientName);
        System.out.println("Taxes: " + taxConfiguration);
        System.out.println("---------------");
    }
}
