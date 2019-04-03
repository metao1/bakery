package com.company.models;

public class Pack {

    private final int quantity;

    private final float price;

    public Pack(int quantity, float price) {
        this.quantity = quantity;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
