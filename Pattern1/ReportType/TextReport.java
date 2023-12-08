package Pattern1.ReportType;

public class TextReport implements Report {
    @Override
    public void generate() {
        System.out.println("Текст");
    }
}
