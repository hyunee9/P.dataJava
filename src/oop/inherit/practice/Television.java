package oop.inherit.practice;

public class Television extends ElectronicProduct {

    private int screenSize;

    public Television(String manufacturer, double price, String productName, int screenSize) {
        super(manufacturer, price, productName);
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("\"Screen Size: %d inches\n", this.screenSize);
    }
}
