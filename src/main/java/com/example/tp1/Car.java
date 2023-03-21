package com.example.tp1;

public class Car {
    private String plateNumber;
    private String brand;
    private double Price;

    private boolean rent;
    public Car() {
    }
    public Car(String plateNumber, String brand, double Price) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.Price = Price;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String toString() {
        return "Car{" +
                "plateNumber='" + plateNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", Price='" + Price + '\'' +
                '}';
    }
}
