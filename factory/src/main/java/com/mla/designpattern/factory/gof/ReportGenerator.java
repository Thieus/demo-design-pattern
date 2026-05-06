package com.mla.designpattern.factory.gof;

public abstract class ReportGenerator {
    // The core business logic that relies on the Factory Method
    public void generateReport() {
        Report report = createReport();
        System.out.println("Starting report generation process...");
        report.build();
        System.out.println("Report generation complete.");
    }

    // The Factory Method
    protected abstract Report createReport();
}
