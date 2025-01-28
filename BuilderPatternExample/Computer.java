package BuilderPatternExample;

import javafx.util.Builder;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;
    private boolean hasBluetooth;
    private boolean hasWifi;
    private Computer(Builder builder)
    {
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.storage=builder.storage;
        this.graphicsCard=builder.graphicsCard;
        this.hasBluetooth=builder.hasBluetooth;
        this.hasWifi=builder.hasWiFi;
    }
    public String getCPU(){return CPU;}
    public String getRAM(){ return RAM;}
    public String getStorage(){ return storage;}
    public String getGraphicsCard(){
        return graphicsCard;
    }
    public boolean hasBluetooth(){return hasBluetooth;}
    public boolean hasWifi(){return hasWifi;}
    @Override
    public String toString(){
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage +
                ", graphicsCard=" + graphicsCard + ", hasBluetooth=" + hasBluetooth +
                ", hasWiFi=" + hasWifi + "]";
    }
    public static class Builder{
        private final String CPU;
        private final String RAM;
        private String storage;
        private String graphicsCard;
        private boolean hasBluetooth;
        private boolean hasWiFi;
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Methods to set optional parameters
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }
        public Builder setWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        // Build method to create an instance of Computer
        public Computer build() {
            return new Computer(this);
        }
    }
}
