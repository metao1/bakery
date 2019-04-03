package com.company.repository;

import com.company.models.Cake;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class CakeRepository {

    private Map<String, Cake> cakeMap = new HashMap<>();

    public void addCake(Cake cake) {
        cakeMap.put(cake.code(), cake);
    }

    public float getCost(String code, int quantity) {
        AtomicReference<Float> cost = new AtomicReference<>(0.0f);
        cakeMap.forEach((key, cake) -> {
            if (key.equals(code)) {
                float price = cake.price(quantity);
                cost.updateAndGet(v -> v + price);
            }
        });
        return cost.get();
    }

    public String showCakes(String code) {
        StringBuilder stringBuilder = new StringBuilder();
        cakeMap.forEach((key, cake) -> {
            if (key.equals(code)) {
                stringBuilder.append(cake.name()).append("\n");
            }
        });
        return stringBuilder.toString();
    }
}
