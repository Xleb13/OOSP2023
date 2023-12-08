package Pattern1.Factory;

import Pattern1.ReportType.Report;

public class Main {
    public static void main(String[] args) {
        ReportFactory textReportFactory = new Text();
        Report textReport = textReportFactory.createReport();
        textReport.generate();

        ReportFactory graphReportFactory = new Graph();
        Report graphReport = graphReportFactory.createReport();
        graphReport.generate();

        ReportFactory tableReportFactory = new Table();
        Report tableReport = tableReportFactory.createReport();
        tableReport.generate();
    }
}