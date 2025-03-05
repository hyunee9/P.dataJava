package oop.inherit.practice;

public class ElectronicProduct {
    String productName;
    double price;
    String manufacturer;

    public ElectronicProduct(String manufacturer, double price, String productName) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.productName = productName;
    }

    public void displayInfo() {
        System.out.printf("%s, 가격: %.0f원, 제조사: %s\n"
                , this.productName, this.price, this.manufacturer);
    }

}
