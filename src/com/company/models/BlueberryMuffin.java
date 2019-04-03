package com.company.models;

import com.company.Utils;

import java.util.List;

public class BlueberryMuffin implements Cake {

    private final List<Pack> packs;

    public BlueberryMuffin(List<Pack> packs) {
        this.packs = packs;
    }
    @Override
    public String code() {
        return "MB11";
    }

    @Override
    public String name() {
        return "Blueberry Muffin";
    }

    @Override
    public float price(int number) {
        return new Utils().calculatePrice(number, packs);
    }
}
