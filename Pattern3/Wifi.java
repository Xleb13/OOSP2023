package Pattern3;

public class Wifi implements Wireless {
    @Override
    public void connect() {
        System.out.println("Wi-fi соединение подключено");
    }
    @Override
    public void disconnect() {
        System.out.println("Wi-fi соединение отключено");
    }
}