package com.mla.designpattern.prototype;

public interface DocumentPrototype {
    DocumentPrototype cloneDocument();
    
    // Some common methods
    void setClientName(String clientName);
    void printDocument();
}
