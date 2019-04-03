package com.company.models;

import com.company.Utils;

import java.util.List;

public class Croissant implements Cake {

    private final List<Pack> packs;

    public Croissant(List<Pack> packs) {
        this.packs = packs;
    }

    @Override
    public String code() {
        return "CF";
    }

    @Override
    public String name() {
        return "Croissant";
    }

    @Override
    public float price(int number) {
        return new Utils().calculatePrice(number, packs);
    }

}
