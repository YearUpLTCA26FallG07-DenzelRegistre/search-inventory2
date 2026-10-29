package com.pluralsight;

public class Items {
    private int upc;
    private String name;
    private double price;

    public Items(int upc, String name, double price) {
        this.upc = upc;
        this.name = name;
        this.price = price;
    }

    public int getUpc() {
        return upc;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
