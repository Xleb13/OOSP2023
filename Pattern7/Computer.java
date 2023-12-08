package Pattern7;

public class Computer {
    private String processor;
    private int ram;
    private int storage;
    private String graphicsCard;

    private Computer() {
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public static class ComputerBuilder {
        private Computer computer;

        public ComputerBuilder() {
            this.computer = new Computer();
        }

        public ComputerBuilder setProcessor(String processor) {
            computer.processor = processor;
            return this;
        }

        public ComputerBuilder setRam(int ram) {
            computer.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(int storage) {
            computer.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            computer.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return computer;
        }
    }
}