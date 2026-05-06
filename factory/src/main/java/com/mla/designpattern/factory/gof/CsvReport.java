package com.mla.designpattern.factory.gof;

public class CsvReport implements Report {
    @Override
    public void build() {
        System.out.println("Building a CSV Report...");
    }
}
