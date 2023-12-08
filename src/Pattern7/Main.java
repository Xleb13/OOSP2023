package Pattern7;

import Pattern7.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .setProcessor("Intel i7")
                .setRam(16)
                .setStorage(512)
                .setGraphicsCard("NVIDIA GeForce RTX 3080")
                .build();

        System.out.println("Процессор: " + computer.getProcessor());
        System.out.println("Оперативная память: " + computer.getRam() + " ГБ");
        System.out.println("Жесткий диск: " + computer.getStorage() + " ГБ");
        System.out.println("Графическая карта: " + computer.getGraphicsCard());
    }
}