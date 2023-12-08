package Pattern3;

import java.util.Scanner;

public class Connected {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WirelessManager wirelessManager = new WirelessManager(new Bluetooth());

        Wireless Zigbee = new Zigbee();
        wirelessManager = new WirelessManager(Zigbee);

        wirelessManager.getWireless().connect();

        Wireless Bluetooth = new Bluetooth();
        wirelessManager = new WirelessManager(Bluetooth);

        wirelessManager.getWireless().connect();
        wirelessManager.getWireless().disconnect();

    }
}
