package Pattern1.Factory;

import Pattern1.ReportType.GraphReport;
import Pattern1.ReportType.Report;

public class Graph implements ReportFactory{
    @Override
    public Report createReport() {
        return new GraphReport();
    }
}
