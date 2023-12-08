package Pattern4;

public class Ftp implements Status{
    @Override
    public void connected() {
        System.out.println("FTP подключен");
    }
    @Override
    public void disconnected() {
        System.out.println("FTP отключен");
    }
}
