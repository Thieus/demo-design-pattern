package com.mla.designpattern.factory.gof;

public class PdfReportGenerator extends ReportGenerator {
    @Override
    protected Report createReport() {
        return new PdfReport();
    }
}
