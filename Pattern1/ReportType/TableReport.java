package Pattern1.ReportType;

public class TableReport implements Report {
    @Override
    public void generate() {
        System.out.println("Таблица");
    }
}
