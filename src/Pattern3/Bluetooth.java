package Pattern3;

public class Bluetooth implements Wireless{
    @Override
    public void connect() {
        System.out.println("Bluetooth соединение подключено");
    }
    @Override
    public void disconnect() {
        System.out.println("Bluetooth соединение отключено");
    }
}
