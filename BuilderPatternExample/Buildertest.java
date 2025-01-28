package BuilderPatternExample;

public class Buildertest {
    public static void main(String[] args) {
        Computer basicComp=new Computer.Builder("Intel i5","8 GB").build();
        System.out.println(basicComp);
        Computer gamingComputer = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA GTX 3080")
                .setBluetooth(true)
                .setWiFi(true)
                .build();
        System.out.println(gamingComputer);
        Computer workComputer = new Computer.Builder("AMD Ryzen 5", "16GB")
                .setStorage("512GB SSD")
                .setWiFi(true)
                .build();
        System.out.println(workComputer);

    }
}
