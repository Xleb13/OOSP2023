package Pattern1.Factory;

import Pattern1.ReportType.Report;
import Pattern1.ReportType.TextReport;

public class Text implements ReportFactory {
    @Override
    public Report createReport(){
        return new TextReport();
    }
}
