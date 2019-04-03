package com.company.models;

import com.company.Utils;

import java.util.List;

public class VegemiteScroll implements Cake {

    private final List<Pack> packs;

    public VegemiteScroll(List<Pack> packs) {
        this.packs = packs;
    }

    @Override
    public String code() {
        return "VS5";
    }

    @Override
    public String name() {
        return "Vegemite Scroll";
    }

    @Override
    public float price(int number) {
       return new Utils().calculatePrice(number, packs);
    }

}
