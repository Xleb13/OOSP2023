package Pattern3;

public class Zigbee implements Wireless{
    @Override
    public void connect() {
        System.out.println("Zigbee соединение подключено");
    }

    @Override
    public void disconnect() {
        System.out.println("Zigbee соединение отключено");
    }
}
