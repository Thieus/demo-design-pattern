package com.mla.designpattern.prototype;

public class ContractTemplate implements DocumentPrototype {
    private String legalTerms;
    private String clientName;

    public ContractTemplate() {
        // Simulating heavy initialization (e.g. loading heavy text from a DB or file)
        System.out.println("Loading heavy legal terms for ContractTemplate...");
        this.legalTerms = "Standard Enterprise Terms & Conditions (Version 4.2)...";
    }

    // Copy constructor used for cloning
    private ContractTemplate(ContractTemplate source) {
        this.legalTerms = source.legalTerms;
        this.clientName = source.clientName;
    }

    @Override
    public DocumentPrototype cloneDocument() {
        return new ContractTemplate(this);
    }

    @Override
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void printDocument() {
        System.out.println("--- CONTRACT ---");
        System.out.println("Client: " + clientName);
        System.out.println("Terms: " + legalTerms);
        System.out.println("----------------");
    }
}
