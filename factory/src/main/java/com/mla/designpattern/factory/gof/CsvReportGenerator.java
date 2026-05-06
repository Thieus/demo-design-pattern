package com.mla.designpattern.factory.gof;

public class CsvReportGenerator extends ReportGenerator {
    @Override
    protected Report createReport() {
        return new CsvReport();
    }
}
