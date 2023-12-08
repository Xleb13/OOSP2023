package Pattern4;

public class Smtp implements Status{
    @Override
    public void connected() {
        System.out.println("SMTP подключен");
    }
    @Override
    public void disconnected() {
        System.out.println("SMTP отключен");
    }
}
