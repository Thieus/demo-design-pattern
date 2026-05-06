package com.mla.designpattern.factory.gof;

public class PdfReport implements Report {
    @Override
    public void build() {
        System.out.println("Building a PDF Report...");
    }
}
