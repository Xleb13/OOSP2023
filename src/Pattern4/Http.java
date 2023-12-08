package Pattern4;

public class Http implements Status{

    @Override
    public void connected() {
        System.out.println("HTTP подключен");
    }
    @Override
    public void disconnected() {
        System.out.println("HTTP отключен");
    }
}
