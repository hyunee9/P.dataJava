package oop.inherit.practice;

public class Smartphone extends ElectronicProduct {

    private int storageCapacity;

    public Smartphone(String manufacturer, double price, String productName, int storageCapacity) {
        super(manufacturer, price, productName);
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("저장용량: %d GB\n" + storageCapacity);

    }
}
