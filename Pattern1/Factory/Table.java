package Pattern1.Factory;

import Pattern1.ReportType.Report;
import Pattern1.ReportType.TableReport;

public class Table implements ReportFactory{
    @Override
    public Report createReport(){
        return new TableReport();
    }
}
