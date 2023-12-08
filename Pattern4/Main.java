package Pattern4;

public class Main {
    public static void main(String[] args) {
        Http http = new Http();

        http.connected();

        Ftp ftp = new Ftp();
        ftp.connected();
        ftp.disconnected();

    }
}
